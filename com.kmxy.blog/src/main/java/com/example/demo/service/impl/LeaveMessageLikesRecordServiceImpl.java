package com.example.demo.service.impl;

import com.example.demo.mapper.LeaveMessageLikesRecordMapper;
import com.example.demo.model.LeaveMessageLikesRecord;
import com.example.demo.service.LeaveMessageLikesRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Describe:
 */
@Service
public class LeaveMessageLikesRecordServiceImpl implements LeaveMessageLikesRecordService {

    @Autowired
    LeaveMessageLikesRecordMapper leaveMessageLikesRecordMapper;


    @Override
    public boolean isLiked(String pageName, int pId, int likeId) {

        return leaveMessageLikesRecordMapper.isLiked(pageName, pId, likeId) != null;
    }

    @Override
    public void insertLeaveMessageLikesRecord(LeaveMessageLikesRecord leaveMessageLikesRecord) {
        leaveMessageLikesRecordMapper.insertLeaveMessageLikesRecord(leaveMessageLikesRecord);
    }
}
