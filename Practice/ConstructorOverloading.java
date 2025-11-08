class Student {
    String name;
    int age;

    Student() {
        name = "unknown";
        age = 0;
    }

    Student(String n) {
        name = n;
        age = 20;
    }

    Student(String n, int age) {
        name = n;
        age = age;
    }

    void show() {
        System.out.println(name +"-"+age);
    }
}

public class ConstructorOverloading {
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Shubh");
    Student s3 = new Student("Shubh" , 20);

    s1.show();
    s2.show();
    s3.show();
}
}

// java ConstructorOverloading.java