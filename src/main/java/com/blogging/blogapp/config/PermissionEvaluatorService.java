package com.blogging.blogapp.config;

import com.blogging.blogapp.services.RetriveData;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PermissionEvaluatorService implements PermissionEvaluator {

    private RetriveData retriveData;

    public PermissionEvaluatorService(RetriveData retriveData) {
        this.retriveData = retriveData;
    }

    @Override
    public boolean hasPermission(Authentication auth, Object targetDomainObject, Object permission) {
        if ((auth == null) || (targetDomainObject == null) || !(permission instanceof String)) {
            return false;
        }
        String[] targetType = targetDomainObject.toString().replace('[', ' ').replace(']', ' ').trim().split(",");
        String userName = auth.getName();
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        return false;
    }
}