package goit.javaOnline.homeWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicalShop {

    MusicalInstrument musicalInstrument = new MusicalInstrument();

   // private int numberOfGuitar;

    private List<MusicalInstrument> instruments = new ArrayList<>();

    public void createListInstrumentts(int numberOfGuitar){

        for (int i = 0; i < numberOfGuitar; i++ ){
            instruments.add(new Guitar(musicalInstrument.getName(),musicalInstrument.getQuantity()));

        }
    }

}
