import greenfoot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Ludek extends Actor
{
    private String odpowiedz = " ";
    private short flaga = 0;
    //perform always check, whether the actor has been clicked, prevent from error with try-catch block
    public void act() {
        if(Greenfoot.mousePressed(this)){
            try{
                try{
                    getWorld().showText(pytaj(JOptionPane.showInputDialog("Jaką frazę chcesz sprawdzić?")), 300,200);
                }catch(StringIndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(null, "Wpisz jakieś dane! Potrzebuję danych, danych, danych");
                }
            } catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Nie mam danych do testowania!");
            }
        }
    }    

    public String pytaj(String odpowiedz){
        //String preperation
        odpowiedz = odpowiedz.replaceAll(" ", "");
        odpowiedz = odpowiedz.toLowerCase();
        //check, whether the given string is a palindrome, if not, break check loop
        for(int i = 0; i < (odpowiedz.length()/2)+1; i++)
            if(odpowiedz.charAt(i) != odpowiedz.charAt(odpowiedz.length()-(i+1))){
                flaga = 1;
                break;
        }
        //return the result to the main method
        if(flaga == 1)
        {
            flaga = 0;
            return "To nie jest palindrom!";
        }
        else
        {
            flaga = 0;
            return "To jest palindrom!";
        }

    } 
}