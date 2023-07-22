public class  clsejercicios{
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double circunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static double areaPiramideCuadrada(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double volumenPiramideCuadrada(double base, double altura) {
        return (base * altura) / 3;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double volumenPrismaRectangular(double areaBase, double altura) {
        return areaBase * altura;
    }

    public static double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public static double volumenCilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }
}