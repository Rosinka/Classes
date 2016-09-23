/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

/**
 *
 * @author rosinka
 */
public class Class1 {
    
    public static void main(String[] args) {
        int b = 3;
        b++;
 
        System.out.println(b);
    
        boolean bulf = true;
        System.out.println(!bulf);
         
        c(b, bulf);
        String strb = "!";
        System.out.println(log(strb, b));
    }
    
    public static void c(int b, boolean bulf) {
        
        System.out.println(b + " " + bulf);
            
    }
    
    public static int log(String str, int numer) {
        System.out.println(str);
        return numer + 3;
    }
}
