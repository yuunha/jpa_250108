package com.ll.jpa.domain.post.post.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Post {
    //long : null 안됨
    //Long : null 가능
    //jpa 특성상, null 가능해야함

    @Id //primary_key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Column(length = 100)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;

}
