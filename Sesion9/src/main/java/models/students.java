package models;

import java.util.Objects;

public class students {
    private String name;
    private int  age;
    private String email;

    public students(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public students() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        students students = (students) o;
        return age == students.age && Objects.equals(name, students.name) && Objects.equals(email, students.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    public void add(students student) {
    }
}
