package com.blogging.blogapp.services;

import com.blogging.blogapp.microModels.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RetriveData {
    @Value("${domain.user}")
    private String userDomain;

    @Autowired
    private RestTemplate restTemplate;

    public User retriveDataFromCORS(String path, HttpMethod methodType) {
        HttpHeaders headers = new HttpHeaders();
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJub3JtYWw0QG1pdS5lZHUiLCJyb2xlcyI6Ik5vcm1hbCIsImlkIjoxMiwidXNlck5hbWUiOiJub3JtYWw0QG1pdS5lZHUiLCJleHAiOjE2NTUwNzkxNjYsImlhdCI6MTY1NTA2MTE2Nn0.wEFlBQcsyJxx9tP4dtucENCPg8bjjC9_2fjK2MjvA-hjG4MvwyknpkB5FR1BTZn6gog9TVwEIWDOeIn2vWr-hw";
        headers.add("Authorization", "Bearer " + token);
        HttpEntity request = new HttpEntity(headers);

        var result = restTemplate.exchange(userDomain + path, methodType, request, User.class).getBody();
        return result;
    }


}
