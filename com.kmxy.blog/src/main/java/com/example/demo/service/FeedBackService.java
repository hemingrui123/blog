package com.example.demo.service;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.FeedBack;

import net.sf.json.JSONObject;

/**
 * 
 * Describe:反馈业务操作
 */
public interface FeedBackService {

    /**
     * 保存反馈信息
     * @param feedBack
     * @return
     */
    @Transactional
    JSONObject submitFeedback(FeedBack feedBack);

    /**
     * 获得所有的反馈
     * @return
     */
    JSONObject getAllFeedback(int rows, int pageNum);

}
