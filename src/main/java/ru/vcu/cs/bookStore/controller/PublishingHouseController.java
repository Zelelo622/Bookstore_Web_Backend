package ru.vcu.cs.bookStore.controller;

import org.springframework.web.bind.annotation.*;
import ru.vcu.cs.bookStore.data.dto.PublishingHouseDto;
import ru.vcu.cs.bookStore.data.entity.PublishingHouse;
import ru.vcu.cs.bookStore.service.PublishingHouseService;

import java.util.List;

@RestController
public class PublishingHouseController {
    private final PublishingHouseService service;

    public PublishingHouseController(PublishingHouseService service) {
        this.service = service;
    }

    @GetMapping("/publishing_house")
    public List<PublishingHouseDto> getAllPublishingHouse() {
        return service.getAll();
    }

    @GetMapping("/publishing_house/{id}")
    public PublishingHouseDto getPublishingHouseById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/publishing_house/delete/{id}")
    public void deletePublishingHouse(@PathVariable Integer id) {
        service.deletePublishingHouse(id);
    }

    @PostMapping("/publishing_house/new")
    public void addPublishingHouse(@RequestBody PublishingHouseDto publishingHouse) {
        service.addNewPublishingHouse(publishingHouse);
    }

    @PutMapping("/publishing_house/edit")
    public void editPublishingHouse(@RequestBody PublishingHouseDto publishingHouse, @PathVariable Integer id) {
        service.updatePublishingHouse(publishingHouse, id);
    }
}
