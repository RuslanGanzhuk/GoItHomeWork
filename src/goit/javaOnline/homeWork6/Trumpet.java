package goit.javaOnline.homeWork6;

public class Trumpet extends MusicalInstrument {

    private String name = "trumpet";
    private Integer quantity;

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
