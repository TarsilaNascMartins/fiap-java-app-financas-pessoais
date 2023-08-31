import java.util.Scanner;

public class Usuario {

    int id_usuario;
    String email, nome, cpf, senha;

    void cadatrarUsuario()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("****Tela de Cadastro****");
        System.out.println("Digite seu Nome:");
        nome = sc.nextLine();
        System.out.println("Digite seu email:");
        email = sc.nextLine();
        System.out.println("Digite sua senha");
        senha = sc.nextLine();
        System.out.println("Digite seu CPF:");
        cpf = sc.nextLine();

        System.out.println("Cadastro finalizado! Agora você pode usar nossa plataforma " + nome + "!");
        System.out.println("Seja bem-vindo(a)");

        salvarUsuario(cpf);

    }

    // retorna o cpf e cria o número de id
   String salvarUsuario(String cpf) {
        id_usuario++;
       System.out.println("ID usuario:"+id_usuario);
        return cpf;
    }



}
