public class Mensagem {
   
    public static void enviarMensagem(int hora){

      if( hora >=5  && hora <= 12){
        messagemBomDia();
      }else if(hora>= 13 && hora<=17){
        messagemBoaTarde();
      }else{
        messagemBoaNoite();
      }

    }

    public static void messagemBomDia(){
        System.out.println("Bom dia!");
    }
    public static void messagemBoaTarde(){
        System.out.println("Boa Tarde!");
    }
    public static void messagemBoaNoite(){
        System.out.println("Boa Noite!");
    }


}
