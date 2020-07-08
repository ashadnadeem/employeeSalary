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
public class main {
    public static void main(String [] args){
        Employee [] employee = new Employee[3];
        employee[0] = new HourlyEmployee("Ashad","18660",23,12);
        employee[1] = new SalariedEmployee("Amsal","18655",12);
        employee[2] = new SalariedEmployee("NOKIA","18633",5);
        
        employee[0].displayDetails();
        System.out.println();
        employee[1].displayDetails();
        System.out.println();
        employee[2].displayDetails();
        System.out.println();
        
        
        
         
    }
}
