
package teszt;


public class Bal extends Helyszin{

    @Override
    public String leiras(){
         return "Ez a jobb!!Menj nyugat vagy keletre!";
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
