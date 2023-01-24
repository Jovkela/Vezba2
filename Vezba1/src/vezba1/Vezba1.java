/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba1;

/**
 *
 * @author Korisnik
 */
public class Vezba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Osoba osoba1; //definicija objekata Osoba 1 i Osoba  2
      Osoba osoba2;
      //inicijalizacija osoba 1 i osoba2
      osoba1=new Osoba("Marko",17);
      osoba2=new Osoba("Zika", 18);
      osoba2. god=osoba2. god +1;
      System.out.println (osoba1.ime+" Ima " + osoba1.god+" godina");
      System.out.println ("sin 30 iznosi " + osoba1.sin(3.14/6));
      
             
    }
    
}
