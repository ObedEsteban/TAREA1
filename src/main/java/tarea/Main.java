package tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Área de un círculo");
        System.out.println("2. Circunferencia de un círculo");
        System.out.println("3. Volumen de un cubo");
        System.out.println("4. Área de una pirámide cuadrada");
        System.out.println("5. Volumen de una pirámide cuadrada");
        System.out.println("6. Área de un triángulo");
        System.out.println("7. Volumen de un prisma rectangular");
        System.out.println("8. Área de un paralelogramo");
        System.out.println("9. Volumen de un cilindro");
        System.out.println("10. Área de una esfera");

        System.out.println("Seleccione el número de la opción que desee calcular:");
        int opcion = scanner.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                resultado = clsejercicios.areaCirculo(radioCirculo);
                System.out.println("Área del círculo: " + resultado);
                break;

            case 2:
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo2 = scanner.nextDouble();
                resultado = clsejercicios.circunferenciaCirculo(radioCirculo2);
                System.out.println("Circunferencia del círculo: " + resultado);
                break;

            case 3:
                System.out.println("Ingrese la longitud del lado del cubo:");
                double ladoCubo = scanner.nextDouble();
                resultado = clsejercicios.volumenCubo(ladoCubo);
                System.out.println("Volumen del cubo: " + resultado);
                break;

            case 4:
                System.out.println("Ingrese la longitud de la base de la pirámide cuadrada:");
                double basePiramide = scanner.nextDouble();
                System.out.println("Ingrese la altura de la pirámide cuadrada:");
                double alturaPiramide = scanner.nextDouble();
                resultado = clsejercicios.areaPiramideCuadrada(basePiramide, alturaPiramide);
                System.out.println("Área de la pirámide cuadrada: " + resultado);
                break;

            case 5:
                System.out.println("Ingrese la longitud de la base de la pirámide cuadrada:");
                double basePiramide2 = scanner.nextDouble();
                System.out.println("Ingrese la altura de la pirámide cuadrada:");
                double alturaPiramide2 = scanner.nextDouble();
                resultado = clsejercicios.volumenPiramideCuadrada(basePiramide2, alturaPiramide2);
                System.out.println("Volumen de la pirámide cuadrada: " + resultado);
                break;

            case 6:
                System.out.println("Ingrese la longitud de la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                resultado = clsejercicios.areaTriangulo(baseTriangulo, alturaTriangulo);
                System.out.println("Área del triángulo: " + resultado);
                break;

            case 7:
                System.out.println("Ingrese el área de la base del prisma rectangular:");
                double areaBasePrisma = scanner.nextDouble();
                System.out.println("Ingrese la altura del prisma rectangular:");
                double alturaPrisma = scanner.nextDouble();
                resultado = clsejercicios.volumenPrismaRectangular(areaBasePrisma, alturaPrisma);
                System.out.println("Volumen del prisma rectangular: " + resultado);
                break;

            case 8:
                System.out.println("Ingrese la longitud de la base del paralelogramo:");
                double baseParalelogramo = scanner.nextDouble();
                System.out.println("Ingrese la altura del paralelogramo:");
                double alturaParalelogramo = scanner.nextDouble();
                resultado = clsejercicios.areaParalelogramo(baseParalelogramo, alturaParalelogramo);
                System.out.println("Área del paralelogramo: " + resultado);
                break;

            case 9:
                System.out.println("Ingrese el radio de la base circular del cilindro:");
                double radioCilindro = scanner.nextDouble();
                System.out.println("Ingrese la altura del cilindro:");
                double alturaCilindro = scanner.nextDouble();
                resultado = clsejercicios.volumenCilindro(radioCilindro, alturaCilindro);
                System.out.println("Volumen del cilindro: " + resultado);
                break;

            case 10:
                System.out.println("Ingrese el radio de la esfera:");
                double radioEsfera = scanner.nextDouble();
                resultado = clsejercicios.areaEsfera(radioEsfera);
                System.out.println("Área de la esfera: " + resultado);
                break;

            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}