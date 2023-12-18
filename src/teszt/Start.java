/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

/**
 *
 * @author vinczeffy.gergely
 */
public class Start extends Helyszin{
   
    @Override
    public String leiras(){
        return "Ez a start! Menj tovább?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String gomb() {
       return "tovább!!";
    }
}
