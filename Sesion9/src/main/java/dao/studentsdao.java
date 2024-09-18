package dao;

import interfaces.Sesion9;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsDAO implements Sesion9 {
    // Simulamos una base de datos con una lista
    private List<Student> studentsDatabase = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        Student student = (Student) object;
        try {
            studentsDatabase.add(student);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error al almacenar el estudiante", e);
        }
    }

    @Override
    public void findByname(String name, Student[] students) {
        for (Student student : studentsDatabase) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
            }
        }
    }

    // Método para obtener todos los estudiantes
    public List<Student> getAllStudents() {
        return studentsDatabase;
    }
}

