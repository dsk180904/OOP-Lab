class Number {
    private double number;
    public Number(double number) {
        this.number = number;
    }
    public boolean isZero() {
        return number == 0;
    }
    public boolean isPositive() {
        return number > 0;
    }
    public boolean isNegative() {
        return number < 0;
    }
    public boolean isOdd() {
        return number % 2 != 0;
    }
    public boolean isEven() {
        return number % 2 == 0;
    }
    public boolean isPrime() {
        if (number <= 1 || number != (int) number) {
            return false;
        }
        int num = (int) number;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public boolean isArmstrong() {
        if (number != (int) number){
            return false;
        } 
        int num = (int) number;
        int original = num, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == original;
    }
}
public class Exercise5{
    public static void main(String[] args) {
        Number myNumber = new Number(153);
        System.out.println("The number is Zero: " + myNumber.isZero());
        System.out.println("The number is Positive: " + myNumber.isPositive());
        System.out.println("The number is Negative: " + myNumber.isNegative());
        System.out.println("The number is Odd: " + myNumber.isOdd());
        System.out.println("The number is Even: " + myNumber.isEven());
        System.out.println("The number is Prime: " + myNumber.isPrime());
        System.out.println("The number is Armstrong: " + myNumber.isArmstrong());
    }
}