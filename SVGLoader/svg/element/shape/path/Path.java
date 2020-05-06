package svg.element.shape.path;

import svg.element.Element;
import svg.element.shape.Shapes;
import svg.element.shape.path.PathOp;

public class Path extends Shapes {
    private PathOp pathOp;


    public Path(String label) {
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