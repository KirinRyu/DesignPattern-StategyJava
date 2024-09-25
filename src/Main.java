public class Main {
    private static double p1;
    private static double p2;

    public static void main(String[] args) {
        ICalcMedia calcMedia = new Geometrica();
        Disciplina disciplina = new Disciplina(calcMedia);

        disciplina.setP1(10); p1 = disciplina.getP1();
        disciplina.setP2(2); p2 = disciplina.getP2();
        disciplina.CalcularMedia();

        System.out.printf("\nA sua média é %.2f e a sua situação é %s \n\n", disciplina.getMedia(), disciplina.getSituacao());
    }
}