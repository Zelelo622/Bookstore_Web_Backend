package ru.vcu.cs.bookStore.dto;

import lombok.Data;

@Data
public class BuyerDto {
    private Integer buyer_id;
    private String first_name;
    private String second_name;
    private String email;
    private String phone;
}
