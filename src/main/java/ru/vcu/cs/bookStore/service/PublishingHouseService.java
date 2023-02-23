package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.dto.PublishingHouseDto;
import ru.vcu.cs.bookStore.entity.PublishingHouse;
import ru.vcu.cs.bookStore.mapper.PublishingHouseMapper;
import ru.vcu.cs.bookStore.repository.PublishingHouseRepository;

import java.util.List;

@Service
public class PublishingHouseService {
    private final PublishingHouseRepository repository;
    private final PublishingHouseMapper mapper;

    public PublishingHouseService(PublishingHouseRepository repository, PublishingHouseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private PublishingHouse findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getPublishing_house_id().equals(id)).toList().get(0);
    }

    public void deletePublishingHouse(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewPublishingHouse(PublishingHouseDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<PublishingHouse> getAll() {
        return repository.findAll();
    }

    public PublishingHouseDto getById(Integer id) {
        return mapper.toDto(findById(id));
    }

    public void editPublishingHouse(PublishingHouseDto dto) {
        PublishingHouse publishingHouse = new PublishingHouse();
        publishingHouse.setPublishing_house_id(dto.getPublishing_house_id());
        publishingHouse.setName(dto.getName());
        repository.save(publishingHouse);
    }
}
