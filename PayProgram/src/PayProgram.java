//Pay Program
//Jacob Colburn
//CPT307
//Professor Bhatt
//09MAY23

// Import Scanner
import java.util.Scanner;
// Main 
public class PayProgram {

public static void main(String[] args) {

 // Scanner Input
Scanner input = new Scanner(System.in);
    //Variables
    final double FEDERAL_TAX = 15;
    final double STATE_TAX = 3.07;
    final double MEDICARE = 1.45;
    final double SOCIAL_SECURITY = 6.2;
    final double UNEMPLOYMENT_INSURANCE = .07;
    String employee_name;
    double rate_of_pay, hours_worked;
    double gross_pay, total_deductions, net_pay;
    double federal_tax, state_tax, medicare, social_security, unempl_insurance;
        
    // User Input
    System.out.print("Enter Employees Name: ");
    employee_name = input.nextLine();
    System.out.print("Enter rate of pay: ");
    rate_of_pay = input.nextDouble();
    System.out.print("Enter number of hours worked: ");
    hours_worked = input.nextDouble();
    double overtime = hours_worked - 40;
    
    // Processing section - Gross Pay
    if(hours_worked <= 40)
    gross_pay = hours_worked * rate_of_pay;
    else
    gross_pay = ((hours_worked - 40) * (rate_of_pay * 1.5) + (40 * rate_of_pay));
    
    // Deductions
    federal_tax = FEDERAL_TAX * (gross_pay/100);
    state_tax = STATE_TAX * (gross_pay/100);
    medicare = MEDICARE * (gross_pay/100);
    social_security = SOCIAL_SECURITY * (gross_pay/100);
    unempl_insurance = UNEMPLOYMENT_INSURANCE * (gross_pay/100);
    total_deductions = federal_tax + state_tax + medicare + social_security + unempl_insurance;
    net_pay = gross_pay - total_deductions;
    
    // Display Information
    System.out.println("-----------------------------");
    System.out.println("Employee Name: " + employee_name);
    System.out.println("Hours Worked: " + hours_worked + " hours");
    System.out.println("Rate of Pay: $" + rate_of_pay);
    System.out.println("Total amount of deductions: $" + total_deductions);
    System.out.println("Gross Pay: $" + gross_pay);


System.out.println("Net Pay: $" + net_pay);
 }
}