package pr7;

import java.util.ArrayList;
import java.util.List;

class CompositeGraphic implements Graphic {

    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }
}