/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

/**
 *
 * @author vinczeffy.gergely
 */
public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a kezdés!Menj balra!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Bal();
    }

    @Override
    public String gomb() {
        return "menj balra!";
    }
    
}
