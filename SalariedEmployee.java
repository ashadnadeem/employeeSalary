/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 18660
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    SalariedEmployee(String name,String nic,double weeklysalay){
        super(name,nic);
        this.weeklySalary = weeklysalay;
    }
    public double Earnings(){
        return this.weeklySalary;
    }
    public void displayDetails(){
       super.displayDetails();
       System.out.print(" Earnings="+this.Earnings());
    }
    
}
