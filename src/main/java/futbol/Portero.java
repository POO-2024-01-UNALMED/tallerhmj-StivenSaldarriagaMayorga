package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "futbol.Portero");
        this.dorsal = dorsal;
        this.golesRecibidos = golesRecibidos;
    }


    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Futbolista otroSocio) {
        Portero otroPortero = (Portero) otroSocio;
        return Integer.compare(Math.abs(this.golesRecibidos - ((Portero) otroSocio).golesRecibidos), 0);
    }
    @Override
    public String toString(){
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
                " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

}
