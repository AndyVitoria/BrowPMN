package ast;

/**
 *
 * @author jefferson
 */
public class Op {

    public static Long ipow(long base, long power) {
        assert(power >= 0);
        long acc = 1;
        for (int i = 0; i < power; i++) acc = acc * base;
        return acc;
    }
    
}