package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.data.dto.BuyerDto;
import ru.vcu.cs.bookStore.data.dto.CategoryDto;
import ru.vcu.cs.bookStore.data.dto.PublishingHouseDto;
import ru.vcu.cs.bookStore.data.entity.Buyer;
import ru.vcu.cs.bookStore.data.entity.Category;
import ru.vcu.cs.bookStore.data.entity.PublishingHouse;

@Service
public class MappingUtils {

    public BuyerDto mapToBuyerDto(Buyer entity) {
        BuyerDto dto = new BuyerDto();
        dto.setFirst_name(entity.getFirst_name());
        dto.setSecond_name(entity.getSecond_name());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        return dto;
    }

    public Buyer mapToBuyerEntity(BuyerDto dto) {
        Buyer entity = new Buyer();
        entity.setFirst_name(dto.getFirst_name());
        entity.setSecond_name(dto.getSecond_name());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        return entity;
    }

    public CategoryDto mapToCategoryDto(Category entity) {
        CategoryDto dto = new CategoryDto();
        dto.setName(entity.getName());
        return dto;
    }

    public Category mapToCategoryEntity(CategoryDto dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        return entity;
    }

    public PublishingHouseDto mapToPublishingHouseDto(PublishingHouse entity) {
        PublishingHouseDto dto = new PublishingHouseDto();
        dto.setName(entity.getName());
        return dto;
    }

    public PublishingHouse mapToPublishingHouseEntity(PublishingHouseDto dto) {
        PublishingHouse entity = new PublishingHouse();
        entity.setName(dto.getName());
        return entity;
    }
}
