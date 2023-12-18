
package teszt;


public class Bal extends Helyszin implements Masikirany{

    @Override
    public String leiras(){
         return "Ez a bal!!Menj nyugat vagy keletre!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public String gomb() {
       return "nyugat!!";
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String gomb1() {
        return "kelet!!";
    }
    
}
