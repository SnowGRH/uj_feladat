/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

/**
 *
 * @author vinczeffy.gergely
 */
public class Nyugat extends Helyszin implements Masikirany {

        @Override
    public String leiras() {
        return "ez a  Nyugat! menj ny1 vagy ny2";
    }

    @Override
    public Helyszin egyikIrany() {
        return this;
    }

    @Override
    public String gomb() {
        return "ny1";
    }

    @Override
    public Helyszin masikIrany() {
        return this;
    }

    @Override
    public String gomb1() {
        return "ny1";
    }
    
}
