package svg.element.shape;

import svg.element.BaseElement;


 public abstract class PathOp{
    protected char label;
    protected boolean absolute;

     public PathOp(String label) {
         super(label);
     }
}