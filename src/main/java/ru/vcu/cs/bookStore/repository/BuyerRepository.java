package ru.vcu.cs.bookStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vcu.cs.bookStore.data.entity.Buyer;

import java.util.List;

@Repository
public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

        List<Buyer> findAll();
}
