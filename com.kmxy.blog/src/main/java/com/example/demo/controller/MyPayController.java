package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.example.demo.config.AlipayConfig;
import com.example.demo.mapper.PayMapper;
import com.example.demo.model.Pay;

@Controller
@RequestMapping("/myPay")
public class MyPayController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MyPayController.class);
	@Autowired()
	PayMapper payMapper;
	@RequestMapping("index")
	public String toPay() {
		LOG.info("转到支付页面");
		return "index";
	}
	
	@RequestMapping("toNotify")
	public String toNotify() {
		return "notify";
	}
	
	@RequestMapping("succ")
	public String succ() {
		return "succ";
	}
	
	@RequestMapping("pay")
	public void pay(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(request.getParameter("tradeNo").getBytes("UTF-8"),"UTF-8");
        //付款金额，必填
        String total_amount = new String(request.getParameter("amount").getBytes("UTF-8"),"UTF-8");
        //订单名称，必填
        String subject = new String(request.getParameter("name").getBytes("UTF-8"),"UTF-8");
        //商品描述，可空
        String body = new String(request.getParameter("kind").getBytes("UTF-8"),"UTF-8");
          
        Pay pay = new Pay();
        pay.setTradeNo(out_trade_no);
        pay.setAmount(total_amount);
        pay.setName(subject);
        pay.setKind(body);
        payMapper.save(pay);
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

            
        //请求
        String form="";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=" + AlipayConfig.CHARSET);
        response.getWriter().write(form);//直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
	}
	
}
