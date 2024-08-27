package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private final String posicion;

    protected Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    protected Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }


    public boolean equals (Futbolista f){
        if (!(f == null)){
            return true;
        }
        return (this.nombre.equals(f.nombre)) && (this.posicion.equals(f.posicion)) && (this.edad == f.edad);
    }
    public abstract boolean jugarConLasManos();


}
