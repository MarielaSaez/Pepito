package colecciones;
public class Auto {
    private String marca, color;
    private Integer modelo;

    public Auto(String marca, String color, int modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getModelo() {
        return modelo;
    }
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + '}';
    }

   

    
    
}
