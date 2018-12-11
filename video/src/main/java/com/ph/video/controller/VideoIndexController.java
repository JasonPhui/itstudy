package com.ph.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JasonPhui
 * 2018/12/11
 */
@Controller
public class VideoIndexController {

    @RequestMapping("/video/index")
    public String VideoIndex() {
        return "/index.html";
    }
}
