package com.ph.video.controller;

import com.ph.video.service.ConfigureService;
import com.ph.video.service.VideoService;
import com.ph.video.utils.VideoThumbnailThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JasonPhui
 * 2018/12/11
 */
@Controller
public class VideoIndexController {

    @Autowired
    private ConfigureService configureService;

    @Autowired
    private VideoService videoService;

    @Autowired
    private VideoThumbnailThread thread;

    @RequestMapping("/video/index")
    public String VideoIndex() {
        return "/video_index.html";
    }
}
