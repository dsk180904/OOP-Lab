class Student {
    private String regNo;
    private String name;
    private int age;

    public Student(String regNo, String name, int age) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student {
    private int semester;
    private double fees;
    private static int ugCount = 0;

    public UGStudent(String regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public int getSemester() {
        return semester;
    }

    public double getFees() {
        return fees;
    }

    public static int getUGCount(){
        return ugCount;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PGStudent extends Student {
    private int semester;
    private double fees;
    private static int pgCount = 0;

    public PGStudent(String regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public int getSemester() {
        return semester;
    }

    public double getFees() {
        return fees;
    }

    public static int getPGCount(){
        return pgCount;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        UGStudent ug1 = new UGStudent("UG001", "Alice", 18, 1, 50000);
        UGStudent ug2 = new UGStudent("UG002", "Bob", 19, 2, 52000);
        PGStudent pg1 = new PGStudent("PG001", "Charlie", 23, 1, 70000);
        PGStudent pg2 = new PGStudent("PG002", "David", 24, 2, 72000);

        System.out.println("UG Students:");
        ug1.displayDetails();
        System.out.println();
        ug2.displayDetails();
        System.out.println();

        System.out.println("PG Students:");
        pg1.displayDetails();
        System.out.println();
        pg2.displayDetails();
        System.out.println();

        System.out.println("Total UG Admissions: " + UGStudent.getUGCount());
        System.out.println("Total PG Admissions: " + PGStudent.getPGCount());
    }
}
