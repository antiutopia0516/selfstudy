package advance.exception.homework2;

public class OverdraftException extends Exception{

    double deficit;

    public double getDeficit(){
        return deficit;
    }

    public OverdraftException(){

    }

    public OverdraftException(String s, double d){
        super(s);
    }
}
