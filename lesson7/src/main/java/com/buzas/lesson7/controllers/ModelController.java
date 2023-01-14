package com.buzas.lesson7.controllers;

import com.buzas.lesson7.models.testModels.TestModelDto;
import com.buzas.lesson7.models.testModels.TestModelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.lang.module.FindException;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ModelController {
    private final TestModelService service;

    @GetMapping("/")
    public List<TestModelDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TestModelDto findById(@PathVariable("id") Long id) {
        return service.findById(id).orElseThrow(() -> new FindException("No such entity with id " + id));
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteModel(id);
    }

    @PostMapping("/")
    public void addEntity(@RequestParam String firstName, @RequestParam String secondName) {
        TestModelDto dto = new TestModelDto();
        dto.setFirstName(firstName);
        dto.setSecondName(secondName);
        service.addModel(dto);
    }
}
