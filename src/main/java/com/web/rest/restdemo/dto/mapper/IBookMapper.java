package com.web.rest.restdemo.dto.mapper;

import com.web.rest.restdemo.domain.Book;
import com.web.rest.restdemo.dto.BookRequestDto;
import com.web.rest.restdemo.dto.BookResponseDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

@Mapper
public interface IBookMapper {

    IBookMapper INSTANCE = Mappers.getMapper(IBookMapper.class);


    @Mapping(target = "id", ignore = true)
    Book toBook(BookRequestDto car);

    @Mapping(target = "date", ignore = true)
    BookResponseDto toBookResponseDto(Book car);


    @AfterMapping // or @BeforeMapping
    default void calculateDate(Book order, @MappingTarget BookResponseDto dto) {
        dto.setDate(LocalDateTime.now());
    }
}
