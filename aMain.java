import static java.lang.Double.NaN;

public class Main {
    double a,b;

    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Main(double a){
        this.a = a;
    }

    public double add() {
        return Math.round((a + b)*100)/100d;
    }

    public double substract() {
        return Math.round((a - b)*100)/100d;
    }

    public double multiply() {
        return Math.round((a * b)*100)/100d;
    }

    public double divide() {
        if(b!=0) {
            return Math.round((a / b) * 100) / 100d;
        }
        else{
            return NaN;
        }
    }

    public double square(){
        return Math.pow(a,2);
    }

    public double root(){
        if(a<0){
            return NaN;
        }
        else {
            return Math.round(Math.sqrt(a) * 100) / 100d;
        }
    }
}