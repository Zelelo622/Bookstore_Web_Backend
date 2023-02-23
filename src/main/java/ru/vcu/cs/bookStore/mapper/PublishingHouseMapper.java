package ru.vcu.cs.bookStore.mapper;

import org.mapstruct.Mapper;
import ru.vcu.cs.bookStore.dto.PublishingHouseDto;
import ru.vcu.cs.bookStore.entity.PublishingHouse;

@Mapper(componentModel = "spring")
public interface PublishingHouseMapper {
    PublishingHouseDto toDto(PublishingHouse publishingHouse);

    PublishingHouse toEntity(PublishingHouseDto dto);
}

