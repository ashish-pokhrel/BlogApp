package com.blogging.blogapp.services;

import com.blogging.blogapp.microModels.User;
import com.blogging.blogapp.models.Blogging;
import com.blogging.blogapp.repositories.IBloggingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class BloggingService {
    @Autowired
    private IBloggingRepo bloggingRepo;

    @Autowired
    private RetriveData retriveData;


    public void save(Blogging blogging) {
        bloggingRepo.save(blogging);
    }

    public void edit(Blogging blogging) {
        bloggingRepo.save(blogging);
    }


    public Blogging getById(Long id) {
        var blog = bloggingRepo.findById(id);
        if (blog == null)
            return new Blogging();
        else
            return blog.get();
    }

    public User getUserDetails() {
        User user = retriveData.retriveDataFromCORS("get/3", HttpMethod.GET);
        return user;
    }
}
