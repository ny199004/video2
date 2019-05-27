package com.ny.video_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public  String m1(){
        return "你好吗";
    }



    @GetMapping("/test1")
    public Map<String,Object> m2(){
        Map<String, Object> map = new HashMap<>();
        map.put("a", 12);
        map.put("b", "cccccc");
        map.put("c", new Date());
        map.put("d", 1.111111111111);
        return map;
    }

}
