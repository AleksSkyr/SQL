package com.example.Hw.repository;

import com.example.Hw.model.Student;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface StudentRepository extends JpaRepository<Student,Long> {
        Collection<Student> findAllByAge(int age);

        Collection<Student>  findAllBy ();

}
