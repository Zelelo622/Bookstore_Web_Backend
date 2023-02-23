package ru.vcu.cs.bookStore.mapper;

import org.mapstruct.Mapper;
import ru.vcu.cs.bookStore.dto.BuyerDto;
import ru.vcu.cs.bookStore.entity.Buyer;

@Mapper(componentModel = "spring")
public interface BuyerMapper {
    BuyerDto toDto(Buyer buyer);

    Buyer toEntity(BuyerDto dto);
}
