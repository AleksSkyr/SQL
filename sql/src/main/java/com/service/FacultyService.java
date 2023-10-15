package com.example.Hw.service;

import com.example.Hw.model.Faculty;
import com.example.Hw.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class FacultyService {
    private final FacultyRepository repository;
    public FacultyService(FacultyRepository repository) {
        this.repository = repository;
    }

    public Faculty add(Faculty faculty) {
        return repository.save(faculty);
    }

    public Faculty get(long id) {
        return repository.findById(id).orElse(null);
    }

    public Faculty remove(long id) {
        var facultyTemporary = repository.findById(id).orElse(null);
        if (facultyTemporary != null) {
            repository.delete(facultyTemporary);
        }
        return facultyTemporary;
    }

    public Faculty update(Faculty faculty) {
        var facultyTemporary = repository.findById(faculty.getId()).orElse(null);
        if (facultyTemporary != null) {
            repository.save(faculty);;
        }
        return faculty;
    }

    public Collection<Faculty> filterByColor(String color) {
        return  repository.findFacultiesByColor(color);
    }

    public Collection<Faculty> returnAll() {
        return repository.findAllBy();
    }
}