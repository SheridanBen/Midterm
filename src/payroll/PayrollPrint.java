/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
    Payroll payment = new Payroll(0.0, "");
/* here assumed that 50 employee accounts can be created
 for the given bank */
    Payroll ac[]=new Payroll[50];
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the employee name:");
    String emp = sc.nextLine();
    System.out.println("Please enter the salary: salary <=3000");
    double Salary = sc.nextDouble();
    System.out.println("The bonus is: ");         
    double bonus = sc.nextDouble();
    payment.Total(Salary,bonus);
}

}
