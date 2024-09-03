package ru.yandex.practicum.catsgram.model;

import lombok.Data;

@Data
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;

    // Геттеры, сеттеры, методы toString, equals и hashCode
}