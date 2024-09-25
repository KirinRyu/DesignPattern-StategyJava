public class Geometrica implements ICalcMedia{
    @Override
    public double calculaMedia(double a, double b) {
        return Math.sqrt(a*b);
    }

    @Override
    public String situacao(double media) {
        return media > 7 ? "Aprovado" : "Reprovado";
    }
}
