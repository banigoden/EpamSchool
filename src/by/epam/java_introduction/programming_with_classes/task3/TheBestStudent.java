package by.epam.java_introduction.programming_with_classes.task3;

public class TheBestStudent {
    public static void printTheBestStudent(Student[] students) {

//        Arrays.stream(students)
//                .filter(i -> Arrays.stream(i.getGrades()).filter(j -> j >= 9))
//                .forEach(System.out::println);
        for (int i = 0; i < students.length; i++) {
            boolean isTrue = true;
            for (int j = 0; j < students[i].getGrades().length; j++) {
                if (students[i].getGrades()[j] < 9) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                System.out.println(" The best student is: " + students[i].getSurname() + " from group " + students[i].getGroup());
            }
        }
    }
}
