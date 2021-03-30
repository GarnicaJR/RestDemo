package com.web.rest.restdemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter @Setter
public class BookResponseDto {

    private String name;
    private String description;
    private LocalDateTime date;


    public String getName() {
        return name;
    }
}
