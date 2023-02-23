package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.dto.BuyerDto;
import ru.vcu.cs.bookStore.entity.Buyer;
import ru.vcu.cs.bookStore.mapper.BuyerMapper;
import ru.vcu.cs.bookStore.repository.BuyerRepository;

import java.util.List;

@Service
public class BuyerService {
    private final BuyerRepository repository;
    private final BuyerMapper mapper;

    public BuyerService(BuyerRepository repository, BuyerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private Buyer findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getId().equals(id)).toList().get(0);
    }

    public void deleteBuyer(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewBuyer(BuyerDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<Buyer> getAll() {
        return repository.findAll();
    }

    public BuyerDto getById(Integer id) {
        return mapper.toDto(findById(id));
    }

    public void editBuyer(BuyerDto dto) {
        Buyer buyer = new Buyer();
        buyer.setId(dto.getId());
        buyer.setFirst_name(dto.getFirst_name());
        buyer.setSecond_name(dto.getSecond_name());
        buyer.setEmail(dto.getEmail());
        buyer.setPhone(dto.getPhone());
        repository.save(buyer);
    }
}
