package estrutura;

public class Principal {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Fiat");
        carro1.setCapacidadeTanque(47);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.89));

        Carro carro2 = new Carro("Vermelho","Gol", 45);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.69));


    }

}
