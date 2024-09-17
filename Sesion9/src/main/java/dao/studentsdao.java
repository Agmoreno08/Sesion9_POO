package dao;

import interfaces.Sesion9;
import models.students;

public class studentsdao implements Sesion9 {
        @Override
        public boolean store(Object object) {
            students student = (students) object;
            try {
                student.add(student);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void findByname(String name, students[] students) {
            for (students _ : students){
                
            }

        }
}

