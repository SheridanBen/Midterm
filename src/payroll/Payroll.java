/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 * @author srinivsi
 */
public class Payroll 
{

   private double Salary;
   private double bonus;
   private String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
         /**The method for calculating salary including bonus.Bonus is 10% of salary 
      
    */ 
    public void Total(double total, double add)
    {
        if (total < 3000) {
            add = total*0.1;
            total = total+add;
        }
        System.out.println("New Salary Amount: " + total);
    }
        
     /**The getter for the Salary
     * @return the Salary
     */
        public double getSalary() 
        {
        return Salary;
        }

    /*The getter for bonus
     * @return the bonus*/
     
        public double getBonus() 
        {
            return bonus;
        }

    /**user is the read only field
     * @return the user
     */
    public String getEmp() {
        return emp;
    }
    
    
}
