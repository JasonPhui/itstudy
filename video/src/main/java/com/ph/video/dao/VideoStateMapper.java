package com.ph.video.dao;

import com.ph.video.entity.VideoState;
import org.apache.ibatis.annotations.Param;

/**
 * @author JasonPhui
 * 2018/12/12
 */
public interface VideoStateMapper {

    /**
     * 根据状态码来获取状态对象
     * @param order 状态码
     * @return 状态对象
     */
    VideoState getVideoStateByOrder(@Param("order") int order);
}
