package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.entity.PublishingHouse;
import ru.vcu.cs.bookStore.repository.PublishingHouseRepository;

import java.util.List;

@Service
public class PublishingHouseService {
    private final PublishingHouseRepository repository;

    public PublishingHouseService(PublishingHouseRepository repository) {
        this.repository = repository;
    }

    private PublishingHouse findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getPublishing_house_id().equals(id)).toList().get(0);
    }

    public void deletePublishingHouse(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewPublishingHouse(PublishingHouse publishingHouse) {
        repository.save(publishingHouse);
    }

    public List<PublishingHouse> getAll() {
        return repository.findAll();
    }

    public PublishingHouse getById(Integer id) {
        return findById(id);
    }

    public void editPublishingHouse(PublishingHouse publishingHouse) {
        repository.save(publishingHouse);
    }
}
