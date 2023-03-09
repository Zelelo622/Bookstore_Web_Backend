package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.data.dto.BuyerDto;
import ru.vcu.cs.bookStore.data.entity.Buyer;

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

    public Buyer mapToProductEntity(BuyerDto dto) {
        Buyer entity = new Buyer();
        entity.setFirst_name(dto.getFirst_name());
        entity.setSecond_name(dto.getSecond_name());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        return entity;
    }
}
