package ru.vcu.cs.bookStore.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private Integer year_publication;

    @NotNull
    private Integer quantity;

    @NotNull
    private Integer price;

    @NotNull
    private Integer retail_margin;

    private Float demand_rating;

    @NotNull
    private Integer number_pages;

    @NotNull
    @ManyToOne
    private Category category;

    @ManyToOne
    @NotNull
    private PublishingHouse publishing_house;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer id) {
        this.book_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear_publication() {
        return year_publication;
    }

    public void setYear_publication(Integer year_publication) {
        this.year_publication = year_publication;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRetail_margin() {
        return retail_margin;
    }

    public void setRetail_margin(Integer retail_margin) {
        this.retail_margin = retail_margin;
    }

    public Float getDemand_rating(Float demandRating) {
        return demand_rating;
    }

    public void setDemand_rating(Float demand_rating) {
        this.demand_rating = demand_rating;
    }

    public Integer getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(Integer number_pages) {
        this.number_pages = number_pages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category_id) {
        this.category = category_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year_publication=" + year_publication +
                ", quantity=" + quantity +
                ", price=" + price +
                ", retail_margin=" + retail_margin +
                ", demand_rating=" + demand_rating +
                ", number_pages=" + number_pages +
                ", category=" + category +
                ", publishing_house=" + publishing_house +
                '}';
    }

    public PublishingHouse getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(PublishingHouse publishing_house_id) {
        this.publishing_house = publishing_house_id;
    }
}
