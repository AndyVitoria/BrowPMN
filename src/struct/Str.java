package struct;

import java.util.Map;

/**
 * Created by andre on 28/06/17.
 */
public class Str extends Type {
    public String string;

    public Str(String string) {
        this.string = string;
    }

    @Override
    public String toString(){
        return string;
    }

    @Override
    public String getName() {
        return "";
    }
}
