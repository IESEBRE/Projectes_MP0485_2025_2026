package comparacio;


public class Cotxe implements Comparable<Cotxe>{

    private String marca="";
    private String model="";
    private int anyFabricacio=1900;


    public Cotxe(int anyFabricacio) {
        this.anyFabricacio = anyFabricacio;

    }

    public Cotxe(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnyFabricacio() {
        return anyFabricacio;
    }

    public void setAnyFabricacio(int anyFabricacio) {
        this.anyFabricacio = anyFabricacio;
    }

    @Override
    public int compareTo(Cotxe o) {
        return this.anyFabricacio-o.anyFabricacio;
    }

    //Obligatori sobreescriure el mètode equals, per fer-lo consistent en compareTo
    @Override
    public boolean equals(Object obj) {
        Cotxe temp=(Cotxe) obj;
        return this.anyFabricacio==temp.anyFabricacio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cotxe{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anyFabricacio=").append(anyFabricacio);
        sb.append('}');
        return sb.toString();
    }
}
