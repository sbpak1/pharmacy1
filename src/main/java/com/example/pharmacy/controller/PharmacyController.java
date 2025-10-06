package com.example.pharmacy.controller;

import com.example.pharmacy.entity.PharmacyEntity;
import com.example.pharmacy.repository.PharmacyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
public class PharmacyController {

    private final PharmacyRepository repository;

    public PharmacyController(PharmacyRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public PharmacyEntity save(@RequestBody PharmacyEntity pharmacy) {
        return repository.save(pharmacy);
    }

    @GetMapping
    public List<PharmacyEntity> findAll() {
        return repository.findAll();
    }
}
