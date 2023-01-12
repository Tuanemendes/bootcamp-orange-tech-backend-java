package upcast;

public class Principal {
        public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendendor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast "deve ser evitado"
        //Vendedor vendedor1 = (Vendedor) new Funcionario();
        //Gerente gerente1= new Funcionario();
    }
}
