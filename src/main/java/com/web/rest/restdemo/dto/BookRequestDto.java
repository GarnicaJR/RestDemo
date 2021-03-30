package com.web.rest.restdemo.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class BookRequestDto {


    @NotNull
    private String name;
    @NotNull
    private String description;

}
