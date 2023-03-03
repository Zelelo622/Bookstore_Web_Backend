package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.entity.Buyer;
import ru.vcu.cs.bookStore.repository.BuyerRepository;

import java.util.List;

@Service
public class BuyerService {
    private final BuyerRepository repository;

    public BuyerService(BuyerRepository repository) {
        this.repository = repository;
    }

    private Buyer findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getBuyer_id().equals(id)).toList().get(0);
    }

    public void deleteBuyer(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewBuyer(Buyer buyer) {
        repository.save(buyer);
    }

    public List<Buyer> getAll() {
        return repository.findAll();
    }

    public Buyer getById(Integer id) {
        return findById(id);
    }

    public void editBuyer(Buyer buyer) {
        repository.save(buyer);
    }
}
