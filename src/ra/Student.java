package ra;

public class Student {
    private int id;
    private String studentName;

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void display(){
        System.out.println(studentName);
    }
}
