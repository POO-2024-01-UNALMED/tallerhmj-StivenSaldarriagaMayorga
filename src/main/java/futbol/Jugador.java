package futbol;

import futbol.Futbolista;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador(){
        super();
        this.dorsal = 7;
        this.golesMarcados = 289;
    }


    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Futbolista otroSocio) {
        return Integer.compare(Math.abs(this.getEdad() - otroSocio.getEdad()), 0);
    }

    @Override
    public String toString(){
        return "El futbolista " + getNombre() + " tiene "+ getEdad() + ", y  juega de " + getPosicion() +" con el dorsal "+ dorsal + ". Ha marcado " + golesMarcados;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
