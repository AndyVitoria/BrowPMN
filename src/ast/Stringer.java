package ast;

/**
 *
 * @author jefferson
 */
public class Stringer extends Literal {
    private final String value;

    public Stringer(String value) {
        this.value = value;
    }

    public String stringer(){return value;}

    public String toString(){return value;}
    
}
