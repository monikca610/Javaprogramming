 Employee Salary Calculation using Lambda Expression:

 // Java program using Lambda Expression to calculate employee bonus

interface BonusCalculator {
    double calculateBonus(double salary);
}

public class Main {
    public static void main(String[] args) {

        double salary = 50000;

        // Lambda expression: 10% bonus
        BonusCalculator bonus = (s) -> s * 0.10;

        double employeeBonus = bonus.calculateBonus(salary);

        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Bonus: " + employeeBonus);
    }
}

OUTPUT:
<img width="174" height="49" alt="Screenshot 2026-08-13 112534" src="https://github.com/user-attachments/assets/5fb3b67a-b795-4731-8c8f-8bdab5ff7805" />
