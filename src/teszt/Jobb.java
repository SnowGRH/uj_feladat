
package teszt;

public class Jobb extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a jobb!!Menj Délre vagy Északra!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Del();
    }

    @Override
    public String gomb() {
       return "Dél!!";
    }
    
}
