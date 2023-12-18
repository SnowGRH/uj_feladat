
package teszt;

public class Del extends Helyszin{

    @Override
    public String leiras(){
        return "Ez a Dél!Menj tovább";
    }

    @Override
    public Helyszin egyikIrany() {
        return this;
    }

    @Override
    public String gomb() {
       return "ismeretlen!!";
    }
    
}
