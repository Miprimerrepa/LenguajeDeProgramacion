public class Triangulo {
    /// ATRIBUTOS
    public double perimetro;
    public double ladoA;
    public double ladoB;
    public double ladoC;



    /// METODOS -> FUNCIONES-> POLIMORFISMO
    public double SacarPerimetro(){
        return perimetro = ladoA + ladoB + ladoC;
    }

    public double SacarPerimetro(double _ladoA, double _ladoB, double _ladoC){
        ladoA = _ladoA;
        ladoB = _ladoB;
        ladoC = _ladoC;

        return perimetro = ladoA + ladoB + ladoC;
    }

    /// METODOS PROCEDIMIENTO

    public void _Perimetro(double _ladoA,double _ladoB, double _ladoC){
        double ladoAA = _ladoA;
        double ladoBB = _ladoB;
        double ladoCC = _ladoC;

        perimetro = ladoAA + ladoBB + ladoCC;
        System.out.println(perimetro);
    }
}