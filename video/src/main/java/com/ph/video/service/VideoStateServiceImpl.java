package com.ph.video.service;

import com.ph.video.dao.VideoStateMapper;
import com.ph.video.entity.VideoState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JasonPhui
 * 2018/12/15
 */
@Service
public class VideoStateServiceImpl implements VideoStateService{

    @Autowired
    private VideoStateMapper videoStateMapper;

    @Override
    public VideoState getVideoStateByOrder(int order) {
        return videoStateMapper.getVideoStateByOrder(order);
    }
}
