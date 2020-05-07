package svg.element.shape.path;

public class Close extends PathOp {
    protected String label = "Close";
    protected boolean absolute;

    public Close(String label) {
        super(label);
    }

}