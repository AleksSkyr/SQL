package com.example.Hw.repository;

import com.example.Hw.model.Faculty;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    public interface FacultyRepository extends JpaRepository<Faculty, Long> {
        Collection<Faculty> findFacultiesByColor (String color);

        Collection<Faculty>  findAllBy ();
    }
