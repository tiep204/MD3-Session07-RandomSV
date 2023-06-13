package ra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng người muốn in ra: ");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[20];
        students[0] = new Student(1, "Nguyen van a");
        students[1] = new Student(2, "Nguyen van b");
        students[2] = new Student(3, "Nguyen van c");
        students[3] = new Student(4, "Nguyen van q");
        students[4] = new Student(5, "Nguyen van ư");
        students[5] = new Student(6, "Nguyen van e");
        students[6] = new Student(7, "Nguyen van r");
        students[7] = new Student(8, "Nguyen van t");
        students[8] = new Student(9, "Nguyen van y");
        students[9] = new Student(10, "Nguyen van u");
        students[10] = new Student(11, "Nguyen van i");
        students[11] = new Student(12, "Nguyen van o");
        students[12] = new Student(13, "Nguyen van p");
        students[13] = new Student(14, "Nguyen van s");
        students[14] = new Student(15, "Nguyen van d");
        students[15] = new Student(16, "Nguyen van f");
        students[16] = new Student(17, "Nguyen van g");
        students[17] = new Student(18, "Nguyen van h");
        students[18] = new Student(19, "Nguyen van j");
        students[19] = new Student(20, "Nguyen van k");
        System.out.println(numStudents + " người mà bạn random ra được là: ");
        randomDisplay(students, numStudents);
    }

    public static void randomDisplay(Student[] students, int numStudents) {
        Random random = new Random();
        int[] indices = random.ints(0, students.length)
                .distinct()
                .limit(numStudents)
                .toArray();
        for (int i = 0; i < indices.length; i++) {
            Student student = students[indices[i]];
            student.display();
        }
    }
}
