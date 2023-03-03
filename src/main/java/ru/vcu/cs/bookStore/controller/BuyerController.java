package ru.vcu.cs.bookStore.controller;

import org.springframework.web.bind.annotation.*;
import ru.vcu.cs.bookStore.entity.Buyer;
import ru.vcu.cs.bookStore.service.BuyerService;

import java.util.List;

@RestController
public class BuyerController {
    private final BuyerService service;

    public BuyerController(BuyerService service) {
        this.service = service;
    }

    @GetMapping("/buyer")
    public List<Buyer> getAllBuyer() {
        return service.getAll();
    }

    @GetMapping("/buyer/{id}")
    public Buyer getBuyerById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/buyer/delete/{id}")
    public void deleteBuyer(@PathVariable Integer id) {
        service.deleteBuyer(id);
    }

    @PostMapping("/buyer/new")
    public void addBuyer(@RequestBody Buyer buyer) {
        service.addNewBuyer(buyer);
    }

    @PutMapping("/buyer/edit")
    public void editBuyer(@RequestBody Buyer buyer) {
        service.editBuyer(buyer);
    }
}
