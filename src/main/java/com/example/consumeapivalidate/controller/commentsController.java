package com.example.consumeapivalidate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class commentsController {

    private StringBuilder stringBuilder = new StringBuilder();
//    private String uri = "https://jsonplaceholder.typicode.com/";

    @GetMapping("/comments")
    public List<Object> getComments(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/1/comments";
        Object[] comments = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(comments);
    }
}
