import dao.StudentsDAO;
import models.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear instancia del DAO
        StudentsDAO studentsDAO = new StudentsDAO();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Menú principal
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Buscar un estudiante por nombre");
            System.out.println("3. Mostrar todos los estudiantes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    // Agregar un estudiante
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String name = scanner.nextLine();

                    System.out.print("Ingresa la edad del estudiante: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.print("Ingresa el email del estudiante: ");
                    String email = scanner.nextLine();

                    Student student = new Student(name, age, email);
                    studentsDAO.store(student);
                    System.out.println("Estudiante agregado con éxito.");
                    break;

                case 2:
                    // Buscar un estudiante por nombre
                    System.out.print("Ingresa el nombre del estudiante que quieres buscar: ");
                    String searchName = scanner.nextLine();
                    studentsDAO.findByname(searchName, null);
                    break;

                case 3:
                    // Mostrar todos los estudiantes
                    System.out.println("Lista de estudiantes:");
                    for (Student s : studentsDAO.getAllStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 4:
                    // Salir del programa
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
            }
        }

        scanner.close();
    }
}


