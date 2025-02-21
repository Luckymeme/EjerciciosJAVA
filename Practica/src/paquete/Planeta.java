package paquete;

public class Planeta {
    private String nombre;
    private int masa;
    private String color;


    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return nombre;
    }

    public void setmasa(int masa){
        this.masa = masa;
    }
    public int getmasa(){
        return masa;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public String getcolor(){
        return color;
    }
    public Planeta(String nombre, int masa, String color){
        setnombre(nombre);
        setmasa(masa);
        setcolor(color);
    }

}
