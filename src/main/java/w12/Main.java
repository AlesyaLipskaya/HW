package w12;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Student
        Student student = new Student("John Doe", 20);

        // Сериализуем объект в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Объект успешно сериализован в файл student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализуем объект из файла
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Объект успешно десериализован из файла student.ser");
            System.out.println("Имя студента: " + deserializedStudent.getName());
            System.out.println("Возраст студента: " + deserializedStudent.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
