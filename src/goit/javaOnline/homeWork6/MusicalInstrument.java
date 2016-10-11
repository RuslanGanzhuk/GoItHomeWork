package goit.javaOnline.homeWork6;

public class MusicalInstrument {

    private String name;
    private Integer quantity;

    public MusicalInstrument(String name, Integer quantity){

        this.name = name;
        this.quantity = quantity;
    }

    public MusicalInstrument(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
