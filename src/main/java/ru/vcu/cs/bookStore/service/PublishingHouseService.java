package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.data.dto.CategoryDto;
import ru.vcu.cs.bookStore.data.dto.PublishingHouseDto;
import ru.vcu.cs.bookStore.data.entity.Category;
import ru.vcu.cs.bookStore.data.entity.PublishingHouse;
import ru.vcu.cs.bookStore.repository.CategoryRepository;
import ru.vcu.cs.bookStore.repository.PublishingHouseRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublishingHouseService {
    private final PublishingHouseRepository repository;
    private final MappingUtils mapper;

    public PublishingHouseService(PublishingHouseRepository repository, MappingUtils mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<PublishingHouseDto> getAll() {
        return repository.findAll().stream().map(mapper::mapToPublishingHouseDto).collect(Collectors.toList());
    }

    public PublishingHouseDto getById(Integer id) {
        return mapper.mapToPublishingHouseDto(repository.findById(id).get());
    }

    public void addNewPublishingHouse(PublishingHouseDto publishingHouse) {
        repository.save(mapper.mapToPublishingHouseEntity(publishingHouse));
    }

    public void deletePublishingHouse(Integer id) {
        repository.deleteById(id);
    }

    public void updatePublishingHouse(PublishingHouseDto publishingHouse, Integer id) {
        PublishingHouse oldPublishingHouse = repository.findById(id).get();
        PublishingHouse newPublishingHouse = mapper.mapToPublishingHouseEntity(publishingHouse);
        newPublishingHouse.setPublishing_house_id(oldPublishingHouse.getPublishing_house_id());
        repository.save(newPublishingHouse);
    }
}
