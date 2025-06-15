package com.sg.classroster.dao;

import java.util.List;

import com.sg.classroster.entities.Student;

public interface StudentDao {
    Student getStudentById(int id);
    List<Student> getAllStudents();
    Student addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(int id);
}