package com.ph.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoIndexController {

    @RequestMapping("/video/index")
    public String VideoIndex() {
        return "/index.html";
    }
}
