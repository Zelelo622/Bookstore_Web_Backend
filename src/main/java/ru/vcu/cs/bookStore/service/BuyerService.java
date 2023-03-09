package ru.vcu.cs.bookStore.service;

        import org.springframework.stereotype.Service;
        import ru.vcu.cs.bookStore.data.dto.BuyerDto;
        import ru.vcu.cs.bookStore.data.entity.Buyer;
        import ru.vcu.cs.bookStore.repository.BuyerRepository;

        import java.util.List;
        import java.util.stream.Collectors;

@Service
public class BuyerService {
    private final BuyerRepository repository;
    private final MappingUtils mapper;

    public BuyerService(BuyerRepository repository, MappingUtils mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<BuyerDto> getAll() {
        return repository.findAll().stream().map(mapper::mapToBuyerDto).collect(Collectors.toList());
    }

    public BuyerDto getById(Integer id) {
        return mapper.mapToBuyerDto(repository.findById(id).get());
    }

    public void addNewBuyer(BuyerDto buyer) {
        repository.save(mapper.mapToProductEntity(buyer));
    }

    public void deleteBuyer(Integer id) {
        repository.deleteById(id);
    }

    public void updateBuyer(BuyerDto buyer, Integer id) {
        Buyer oldBuyer = repository.findById(id).get();
        Buyer newBuyer = mapper.mapToProductEntity(buyer);
        newBuyer.setBuyer_id(oldBuyer.getBuyer_id());
        repository.save(newBuyer);
    }
}

