package ru.vcu.cs.bookStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vcu.cs.bookStore.data.entity.PublishingHouse;

import java.util.List;


@Repository
public interface PublishingHouseRepository extends CrudRepository<PublishingHouse, Integer> {
    List<PublishingHouse> findAll();
}
