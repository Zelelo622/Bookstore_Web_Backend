package ru.vcu.cs.bookStore.dto;

import lombok.Data;

@Data
public class BookDto {

    private Integer book_id;
    private String title;
    private String author;
    private Integer year_publication;
    private Integer quantity;
    private Integer price;
    private Integer retail_margin;
    private Float demand_rating;
    private Integer number_pages;
}
