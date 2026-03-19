package comparacio;


public class Cotxe implements Comparable<Cotxe>{

    String marca;
    String model;
    int anyFabricacio;


    public Cotxe(int anyFabricacio) {
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
