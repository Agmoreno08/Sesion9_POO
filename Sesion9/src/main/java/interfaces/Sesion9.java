package interfaces;

import models.Student;

public interface Sesion9 {
    boolean store(Object object);

    void findByname(String name, Student[] students);
}
