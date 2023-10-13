package com.example.consumeapivalidate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class postsController {

    private RestTemplate restTemplate = new RestTemplate();
    private String url = "https://jsonplaceholder.typicode.com/posts";
    @GetMapping("/posts")
    public List<Object> getPosts(){
        Object[] posts = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(posts);
    }
}
