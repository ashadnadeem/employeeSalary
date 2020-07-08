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
abstract public class Employee {
    protected String name;
    protected String NIC;
    
    public Employee(String name,  String NIC){
        this.name = name;
        this.NIC = NIC;
    }
    public double Earnings(){
        return 0;
    }
    public void displayDetails(){
        System.out.print("Name="+this.name +",NIC= " + this.NIC +" ");
    }
}
