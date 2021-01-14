package value;

import gen.HaveFunParser;

import java.util.List;
import java.util.Set;

public class FunValue extends Value {

    private final String funId;
    private final Set<String> parameters;
    private final HaveFunParser.ComContext com;
    private final HaveFunParser.ExpContext ret;

    public FunValue(String funId, Set<String> param, HaveFunParser.ComContext com, HaveFunParser.ExpContext ret){
        this.funId = funId;
        this.parameters = param;
        this.com = com;
        this.ret = ret;
    }

    public String getName(){
        return funId;
    }

    public Integer getNumParam(){
        return parameters.size();
    }

    public Set<String> getParameters(){
        return parameters;
    }

    public HaveFunParser.ComContext getCom() {
        return com;
    }

    public HaveFunParser.ExpContext getRet() {
        return ret;
    }

    //equal-->same name, two function cannot have the same name!
    @Override
    public boolean equals(Object obj) {
        return obj instanceof FunValue && ((FunValue) obj).funId.equals(this.funId);
    }

    @Override
    public int hashCode() {
        return funId.hashCode();
    }
}
