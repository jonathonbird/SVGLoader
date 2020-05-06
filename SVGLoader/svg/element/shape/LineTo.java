package svg.element.shape;

import svg.element.Element;

public class LineTo extends PathOp{
    private double x1;
    private double y1;

    protected char label = "LineTo";
    protected boolean absolute;
}