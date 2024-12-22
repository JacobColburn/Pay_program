PayProgram
A simple Java application to calculate gross pay, deductions, and net pay for employees based on their hours worked and rate of pay.

Features
Calculates gross pay, including overtime pay for hours worked beyond 40.
Computes deductions for federal tax, state tax, Medicare, Social Security, and unemployment insurance.
Displays detailed information about gross pay, total deductions, and net pay.

How to Use

Prerequisites
Java Development Kit (JDK) installed on your system.
Basic understanding of how to run Java programs.

Running the Program
Download the Code: Save the provided PayProgram.java file to your computer.
Compile the Program: Open your terminal or command prompt, navigate to the directory containing the file, and run.

Input Requirements
Enter the employee's name.
Provide the hourly rate of pay.
Input the number of hours worked.

Example Input/Output

Input:
Enter Employee's Name: John Doe  
Enter rate of pay: 20  
Enter number of hours worked: 45  
Output:
Employee Name: John Doe  
Hours Worked: 45.0 hours  
Rate of Pay: $20.0  
Total amount of deductions: $110.25  
Gross Pay: $950.0  
Net Pay: $839.75  

Program Details
Deductions
The program uses the following constants for deduction calculations:
Federal Tax: 15%
State Tax: 3.07%
Medicare: 1.45%
Social Security: 6.2%
Unemployment Insurance: 0.07%
Overtime Pay
Overtime is calculated at 1.5 times the hourly rate for hours worked beyond 40.

License
This project is open-source and free to use for educational or personal purposes.PayProgram
