package ru.pushkarev.MySpringBoot2Dbase.dao;

import ru.pushkarev.MySpringBoot2Dbase.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
