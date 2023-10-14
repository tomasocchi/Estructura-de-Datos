/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntistas.dinamicas;
import java.util.Scanner; 
/**
 *
 * @author Tomas
 */
public class aaaa {
    public static void main(String[] args){
    int res; 
    res = mult(10); 
        System.out.println(res);
    }
    
    public static int mult(int n){
        int a,b,c,d, i, x; 
        a = 1;
        b =1;
        c = 1;
        d = 1; 
        i = 0; 
        while(i != n){
            x = d+2*c+3*b+4*a; 
            a = b; 
            b = c; 
            d = x; 
            i++; 
        }
        d = d % 1000000000;
        return d; 
    }
    
}
