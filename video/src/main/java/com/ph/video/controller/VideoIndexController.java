package com.ph.video.controller;

import com.ph.video.service.VideoService;
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
    private VideoService videoService;

    @RequestMapping("/video/index")
    public String VideoIndex() {
        videoService.test();
        return "/index.html";
    }
}
