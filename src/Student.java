public class Student {
    String name;
    int age;
    String className;
    double avgScore;

public Student(String name, int age, String className, double avgScore){
    this.name = name;
    this.age = age;
    this.className = className;
    this.avgScore = avgScore;
}
public void display() {
    System.out.println(
            "Ten: " + name + ", Tuoi: " + age + ", Lop: " + className + ", Diem TB: " + avgScore
    );
}
}
