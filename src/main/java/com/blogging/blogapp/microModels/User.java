package com.blogging.blogapp.microModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long Id;

    private String UserName;

    private String Password;

    private boolean isActive;

    private String Role;
}
