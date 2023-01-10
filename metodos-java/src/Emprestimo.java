public class Emprestimo {


    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static Double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static Double getTaxaTresParcelas(){
        return 0.48;
    }

    public static void calcular(Double valor, int parcelas){

        Double valorFinal;

        if(parcelas == 2 ){
            valorFinal = valor +(valor*getTaxaDuasParcelas());
            System.out.println("Valor final com duas parcelas: R$" + valorFinal);

        }else if(parcelas == 3 ){
            valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final com três parcelas: R$" + valorFinal);
        }else{
            
            System.out.println("Valor de parcelas não é valido!");
            
            
        }

    }


}
