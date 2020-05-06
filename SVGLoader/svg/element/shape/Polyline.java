package svg.element.shape;

import svg.element.Element;

public class Polyline extends Shapes {
    public Polyline(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        return false;
    }
}
