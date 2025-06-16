/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

public class Theatre {
    
    public enum Status {NORMAL, BENEFICIAL}
    
    
    public int groupTicketOrder (int numTickets) throws IllegalArgumentException{
        if (numTickets < 0) throw new IllegalArgumentException();
        int discount = 0;
        if (numTickets >= 5 && numTickets < 10) 
            discount = 10;
        else if (numTickets > 10)
            discount = 20;
        
        return discount;
    }
    
    
    public double calculateTicketPrice (int age, boolean hasVoucher, Status status){
        double price = 1000;
        if (age <= 18) {
            price -= 400;

            if (status == Status.BENEFICIAL){
                price -= 100;
            }

        } else if (age > 18 && age <= 65) {
            
            if (status == Status.BENEFICIAL){
                price -= 200;
            }

        } else {
            price -= 300;
        }

        if (hasVoucher) {
            price *= 0.5;
        }
        return price;
    }
    
    
    
    
}
