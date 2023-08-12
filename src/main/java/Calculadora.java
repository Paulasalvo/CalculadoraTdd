public class Calculadora {

    public Calculadora(){

    }

    public double sumar(double a, double b){
        return a+b;
    }

    public double restar(double a, double b){
        return a-b;
    }

    public double multiplicar(double a, double b){
        return a*b;
    }

    public Double dividir( double a, double b){
            Double result = a / b;
            if(result.isInfinite()){
                return null;
            }
            return result;
    }
}
