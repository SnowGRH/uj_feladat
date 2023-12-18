
package teszt;


public class Bal extends Helyszin{

    @Override
    public String leiras(){
        return "Ez a bal!!";
    }

    @Override
    public Helyszin egyikIrany() {
        return this;
    }

    @Override
    public String gomb() {
       return "tovább!!";
    }
    
}
