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
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    HourlyEmployee(String name,String nic,double wage,double hours){
        super(name,nic);
        this.hours = hours;
        this.wage = wage;     
    }
    public double Earnings(){
        if (this.hours<40){
            return this.hours * this.wage;
        }
        else{
            return 40*this.wage + (this.hours-40)*this.wage*1.5;
        }
    }
    public void displayDetails(){
       super.displayDetails();
       System.out.print(" HourlyWage="+this.wage +",HoursWorked= " + this.hours +",Earnings= " + Earnings());
    }
}
