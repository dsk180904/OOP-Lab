class Complex{
    int real;
    int imaginary;
    
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    Complex add(int realPart) {
        return new Complex(this.real + realPart, this.imaginary);
    }

     Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
}

    public class Exercise4{
        public static void main(String[] args) {
            Complex c1 = new Complex(3, 4);
            Complex c2 = new Complex(1, 2);
            System.out.print("First Complex Number: ");
            c1.display();
            System.out.print("Second Complex Number: ");
            c2.display();
            Complex sum1 = c1.add(5);
            System.out.print("Sum of first complex number and integer: ");
            sum1.display();
            Complex sum2 = c1.add(c2);
            System.out.print("Sum of first and second complex numbers: ");
            sum2.display();
        }

    }
    
