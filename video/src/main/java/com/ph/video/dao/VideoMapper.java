package com.ph.video.dao;

import com.ph.video.entity.Video;
import org.apache.ibatis.annotations.Param;

/**
 * @author JasonPhui
 * 2018/12/12
 */
public interface VideoMapper {

    Video getVideoById(@Param("id") int id);

    Video getVideoCategoryById(@Param("id") int id);

    Video getVideoVideoStateById(@Param("id") int id);
}
