import java.util.*;

//Classe Principal
public class Principal_Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Pessoa primeiraPessoa = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		primeiraPessoa.nome = in.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		primeiraPessoa.sobrenome = in.nextLine();	
		
		System.out.println("Digite seu ano de Nascimento; ");
		primeiraPessoa.anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual");
		primeiraPessoa.anoAtual = in.nextInt();

		System.out.println("Digite sua altura: ");
                primeiraPessoa.altura = in.nextDouble();
		
		System.out.println("-----------------------");
		
	
		System.out.println("Seu nome é " + primeiraPessoa.apresentaNome());
		System.out.println("Sua idade é " + primeiraPessoa.calculaIdade());
		System.out.println("E sua altura é " + primeiraPessoa.apresentaAltura());		

		System.out.println("-----------------------");
	}

}

public class Pessoa {

        String nome;
        String sobrenome;
        int anoAtual;
        int anoNasc;
        double altura;

        String apresentaNome(){

                return nome + " " + sobrenome;

        }

        int calculaIdade() {

                return anoAtual - anoNasc;

        }

        double apresentaAltura() {

                return altura;

        }

}

