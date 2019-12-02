package com.example.demo.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
	// uwxabc5362@sandbox.com  111111
	
	
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016101000652671";   //你的沙箱APPID

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC2kakDVkFbdzFl+f5vMUyvwYhKoeLld3KjSeYZ2YvMyDlfvY7yJstcBsqATs+nPx3O4OWmNCBK3+oQUEDTrNZBzzz0YN4nvFV6VbDQFYnBFOZ2twOInbHxCLNKhmydIR7FCMD+l4cGVyBVadzOZSKkfpnrV5HLHuCoUKLFE1sC4uclQxIMVKLj039K+Ssr8MFtS4zMkb4CRKDQGElXVAijnrN3CCfqV/kk7Z38I2CMoD6mlr9dM1fkzO3w/tB4URbRwU29KCRriItewyt4OnHYppBgIvtkBQ34pmGYZv1PlA61qB+q/FLtc2TreEqQmj2H1xzE0mgMYRNDqe1DFFL7AgMBAAECggEBAJOaNhPdk5+YQRbaRAuvxvk9tavpMCEnLka4A1GY4X7hzgkKn1xFYxp23xdXIGluDPJqPyDdedIvL/SafZ7lWKACJZzKCDIGAPGUAAxrrWCuPhlyo2e7XtapmxLAlWWAFnlkN2xeI6tLm3eSzBMODzEArf5oYRXgU++gqcg9etJcNCGrI0HMNpreJW+kxvD8UL/zCxPctPeIXNiddgfrkxL8pnp7Gs2LJGdQE/tBfeiqqvfFTvEjTBwLXCEnaB4iycmtAoipcrJBS2N5YGo3bjYoG6Ss0WD86e08/mBxVS8Oa7X/daRwx60P/ToT76dK6yFN/GAnayxizJWgigvML+kCgYEA5Z4EjaqxgLMRNhu7zll/ud88Y8rhvTPrXDkWL/9TZVwTUE1QmIBkZGzsoIXIZ3y/hfO2qjZFsA3XLba7Trez+sO1MNYcG1gbcSpHKv8jEJliewX9HMTxaKUOdJo6z4eLmUJB9YUEMbWRnDGkwAakP4XGmteaYSyEx2lYwD4GLJcCgYEAy4vCqlVlifeRqhoK6dn6Pf2j4pAeNPndbHSE4Zrm8ZE6H4e7QUZaVD1Moap9irkXMvRNjDk+XZYw0Nm6A5GglXb9XHQdMgZWaQc0RK1emE4BZ3D6yU9ySqRveRYoZwEjnP67DU8qeBwY6SZvINQEKAM1gRmKKqN50xJN+CMBRT0CgYEAtpvs0x2k/M1sKrPzsC/NPG0lAdgfnvDjhPyBgLp2AG4xjfNu3Vl+fb+CkEbVEjhLuKQR6VwwH8tiDaD9ZaUDJbLvLl+ZCsYPTPhqkO9HW7QgdeZVXcPimW5rCKB/lPwfMUtYWYHnzACyRJ3WgEDH7xzczdgZlp5pGo3VX030axECgYAV9t7qwoxSdwSg9m53Da6TQeuNZz/bN5tNOMWeErkZGDLNdDggsxbMQFEkoOErNw3p0bMMjqDMOIjMALKx7+UEO/LbJyx/WW+5pa1eO9cZWFGOeAKX9pq+sz/UMS/q7ZSKPHKy3PgYPe/yONOFF1vbdX0wkTD3qOxcen0vaZeZgQKBgEThYbwkpmLuh/7ueyCvZkopxeK3IitwIL8nyabIIb1p3w4jCPDjMLcloU0dAU37DbufsoU47Y7BXo8G2+d3QWVU66MpzxURJ5SmDuj02qD/SidHlaXh/b9mivcd4bsBTciVOkbyeFcqU0zxtfBq+j8JEbdty55MHS1EaGo8WtzJ";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    public static String notify_url = "http://localhost:8080/myPay/toNotify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
//    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
    public static String return_url = "http://localhost:8080/myPay/succ";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
