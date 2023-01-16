package com.buzas.lesson7.models.testModels;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestModelService {
    private final TestModelMapper mapper;
    private final TestModelRepository repo;

    public List<TestModelDto> findAll() {
        return repo.findAll().stream().map(mapper::map).collect(Collectors.toList());
    }

    public Optional<TestModelDto> findById(Long id) {
        return repo.findById(id).map(mapper::map);
    }

    public void addModel(TestModelDto dto) {
        repo.addTestModel(dto.getFirstName(), dto.getSecondName());
    }

    public void deleteModel(Long id) {
        repo.deleteById(id);
    }
}
