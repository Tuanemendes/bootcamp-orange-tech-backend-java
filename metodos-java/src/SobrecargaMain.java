public class SobrecargaMain {
    public static void main(String[] args) {
        

        Quadrilatero.area(5);
        Quadrilatero.area(2, 8);
        Quadrilatero.area(5, 2, 3);

        System.out.println("Metodos com retornos");
        double areaQuadrado = QuadrilateroRetorno.area(7);
        System.out.println("Área do quadrado: " + areaQuadrado);
        double areaRetangulo = QuadrilateroRetorno.area(6, 5);
        System.out.println("Área do retangulo: " + areaRetangulo);
        double areaTrapezio = QuadrilateroRetorno.area(5, 6, 2);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
