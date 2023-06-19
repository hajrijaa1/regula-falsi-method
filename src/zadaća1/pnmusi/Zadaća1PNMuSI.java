/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaća1.pnmusi;
import java.awt.font.NumericShaper.Range;
import java.util.*;
import java.util.stream.IntStream;
import java.lang.Object;
/**
 *
 * @author Korisnik
 */
public class Zadaća1PNMuSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Regula_falsi(float f, float a, float b, int max_br_iter, float tacnost);
        
       
        System.out.println("Unesite jednačinu: " + f);
       // f = f.replace("sqrt", Math.sqrt()).replace("e", Math.E).replace("pi", Math.PI);
        
        float a0=a;
        System.out.println("Unesite lijevu granicu intervala: " + a0);
        float b0 = b;
        System.out.println("Unesite desnu granicu intervala: " + b0);
        
        float tacnost;
        System.out.println("Unesite tacnost: " + tacnost);
        
        int max_br_iter;
        System.out.println("Unesite maksimalno iteracija: " + max_br_iter);
         if(max_br_iter == 0){
            max_br_iter = 300;
        }
         
        float funkcija_a = Float.parseFloat(f).replace("x", (a));
        float funkcija_b = Float.parseFloat(f).replace("x", (b));
        
        if(funkcija_a * funkcija_b < 0){
            System.out.println("U ovom intervalu se nalazi rješenje jednačine!");
            System.out.println("Iteracija" +" " + "a" + " " + "b" + " " + "x");
            
        }
        
    }
    
    
    void Regula_falsi(float f, float a, float b, int max_br_iter, float tacnost){
        //IntStream n = IntStream.range(1, max_br_iter+1);
        String aa = Float.toString(a);
        String new_a = aa.replace("x", "a");
        String bb = Float.toString(b);
        String new_b = bb.replace("x", "b");
        
        float b0 = Float.parseFloat(new_b);
        float a0 = Float.parseFloat(new_a);
        String ff = Float.toString(f);
        float x;
        x = b - (((b-a)/(b0-a0))*b0);
        String fun_x = ff.replace("x", "x");
        float funkcija_x = Float.parseFloat(fun_x);
       
       float prvo_x = x;
       int n = 0;
        if(n >= 1 && n<= max_br_iter + 1){
            if(n > 1){
                float tren__tacnost = Math.abs(x-prvo_x);
            }
        }else{
            String r_br = Integer.toString(n);
            System.out.println(n + ". iteracija" + " " + new_a + " " +a0 + " " + new_b + " " + b0 + " " + x);
        }
       
       if(n > 1){
           float funkcija = Float.parseFloat(fun_x);
           if(Math.abs(x-prvo_x) <= tacnost || funkcija == 0){
               System.out.println("Nemoguće izvršiti funkciju.");
           }
       }
       
       if(b0 * funkcija_x < 0){
           a = x;
       }else if(a0 * funkcija_x < 0){
           b = x;
       }
    }
    
    
}
