
class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    String grade;


    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}


class Teacher extends Person {
    String subject;


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}


public class tc {
    public static void main(String[] args) {

        Teacher jagadeeshSir = new Teacher("Jagadeesh Sir", 29, "Computer Science");


        Student me = new Student("Venkata Vikas Bathula", 21, "Final Year B.Tech");


        System.out.println("Teacher Details:");
        jagadeeshSir.displayDetails();


        System.out.println("\nStudent Details:");
        me.displayDetails();
    }
}
