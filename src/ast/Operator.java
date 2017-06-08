package ast;

/**
 *
 * @author jefferson
 */
public abstract class Operator extends Applicable {

    protected final String opName;
    
    public Operator(String opName) {
        this.opName = opName;
    }

    @Override
    public String toString() {
        return opName;
    }
}
