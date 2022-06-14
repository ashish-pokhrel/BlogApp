package com.blogging.blogapp.controllers;

import com.blogging.blogapp.microModels.User;
import com.blogging.blogapp.models.Blogging;
import com.blogging.blogapp.services.BloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/blogging")
public class BloggingController {

    @Autowired
    private BloggingService bloggingService;
    @GetMapping("/")
    public String getById() {
        return "";
    }
    @PostMapping("/save")
    public String save(@RequestBody  Blogging blogging) {
        blogging.setPostedOn(new Date());
        bloggingService.save(blogging);
        return "Saved Successfully";
    }

    @PutMapping("/edit")
    public String edit(@RequestBody  Blogging blogging) {
        bloggingService.save(blogging);
        return "Saved Successfully";
    }
    @GetMapping("/get/{id}")
    public Blogging getById(Long id) {
        return bloggingService.getById(id);
    }

    @GetMapping("/getUserDetails")
    public User getUserDetails()
    {
        return  bloggingService.getUserDetails();
    }
}
