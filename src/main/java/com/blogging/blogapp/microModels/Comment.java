package com.blogging.blogapp.microModels;

import java.util.Date;

public class Comment {
    private long id;
    private long Blogging_Id;
    private String CommentValue;
    private Date CommentedOn;
    private Long CommentedBy;
    private long TotalReactedBy;
    private boolean isDeleted;
}
