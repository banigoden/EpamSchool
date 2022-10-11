package by.epam.java_introduction.programming_with_classes.task3;

/*
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

import java.util.Arrays;

public class Student {
    private String surname;
    private int group;
    private int[] grades;

    public Student(String surname, int group, int[] grades) {
        this.surname = surname;
        this.group = group;
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {
        Student [] students = new Student[10];

        students[0] = new Student("Бандурин", 13, new int[]{6, 2, 8, 7, 9});
        students[1] = new Student("Швидченко", 12, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Козлов", 13, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Эльвир ", 16, new int[]{9 ,9 ,10, 10, 9});
        students[4] = new Student("Зайцев", 17, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Политов", 13, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Сидоров", 10, new int[]{10, 10, 10, 10, 10});
        students[7] = new Student("Романов", 5, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Волков", 7, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Хамлов", 9, new int[]{10, 9, 9, 10, 9});

        TheBestStudent.printTheBestStudent(students);
    }
}
