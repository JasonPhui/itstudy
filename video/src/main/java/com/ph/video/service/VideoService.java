package com.ph.video.service;

import com.ph.video.dao.CategoryMapper;
import com.ph.video.dao.VideoMapper;
import com.ph.video.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

/**
 * @author JasonPhui
 * 2018/12/12
 */
@Service
public class VideoService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private VideoMapper videoMapper;

    public void test() {
        System.out.println(videoMapper.getVideoCategoryById(1).getCategory().getName());
        Set<Video> set = categoryMapper.getAllCategory().get(0).getVideos();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Video video = (Video)it.next();
            System.out.println(video.getName());
        }

    }
}
