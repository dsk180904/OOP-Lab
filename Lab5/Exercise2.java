import java.util.Scanner;

class Employee{
    String Name;
    String City;
    double BS;
    int DA;
    int HRA;

    void getdata(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name = scan.nextLine();
        System.out.print("Enter City: ");
        City = scan.nextLine();
        System.out.print("Enter Basic Salary: ");
        BS = scan.nextDouble();
        System.out.print("Enter Dearness Allowance(DA%): ");
        DA = scan.nextInt();
        System.out.print("Enter House Rent Allowance(HRA%): ");
        HRA = scan.nextInt();
        scan.close();
    }

    double calculate(){
        double TS = (BS + (BS*DA/100) + (BS*HRA/100));
        return TS;
    }

    void display(double TS){
        System.out.println("Name: " + Name);
        System.out.println("City: " + City);
        System.out.println("Basic Salary: " + BS);
        System.out.println("DA(%): " + DA + "%");
        System.out.println("HRA(%): " + HRA +"%");
        System.out.println("Total Salary: " + TS); 
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata();
        emp.calculate();
        emp.display(emp.calculate());
    }
}
