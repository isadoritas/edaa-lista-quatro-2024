import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

  public static void main(String[] args) {
    int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
      32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
      25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
      33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
      66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
      49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
      77, 32, 41, 66, 33, 70, 84, 125, 600,
      38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
      1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
      86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
      77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
      97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };
      
      BuscaSequencial busca = new BuscaSequencial();
      int chave_um = 77;
      int chave_dois = 600;
      int chave_tres = 56;
      int chave_quatro = 65;

      int indice_um = busca.buscarNumero(listaNumeros, chave_um);
      int indice_dois = busca.buscarNumero(listaNumeros, chave_dois);
      int indice_tres = busca.buscarNumero(listaNumeros, chave_tres);
      int indice_quatro = busca.buscarNumero(listaNumeros, chave_quatro);

      List<Integer> todasOcorrencias = busca.buscarOcorrencia(listaNumeros, chave_quatro);

      Pessoa vinicius = new Pessoa("Vinícius", 41);
      Pessoa daniela = new Pessoa("Daniela", 44);
      Pessoa ana = new Pessoa("Ana", 18);
      Pessoa carla = new Pessoa("Carla", 20);
      Pessoa daniel = new Pessoa("Daniel Paiva", 31);
      Pessoa felipe = new Pessoa("Felipe", 24);
      Pessoa patricia = new Pessoa("Patricia", 23);
      Pessoa rafael = new Pessoa("Rafael", 20);
      Pessoa pedro = new Pessoa("Pedro", 22);
      Pessoa marcela = new Pessoa("Marcela", 24);
      Pessoa amanda = new Pessoa("Amanda", 100);
      Pessoa[] listaPessoas = { vinicius, daniela,
      ana, carla,
      daniel, felipe,
      pedro, patricia,
      rafael, marcela, amanda };

      int[] listaNumerosDois = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
        75, 76, 77, 78, 79, 80, 81,
        82, 83, 84, 85, 86, 87, 88, 89,
        90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

      
      
        System.out.println("--------ATIVIDADE 4 ESTRUTURA DE DADOS E ANÁLISE DE ALGORITIMOS----------");


      System.out.println(("A chave " + chave_um + " foi encontrada no indice " + indice_um));
      System.out.println(("A chave " + chave_dois+ " foi encontrada no indice " + indice_dois));
      System.out.println(("A chave " + chave_tres+ " foi encontrada no indice " + indice_tres));
      System.out.println(("A chave " + chave_quatro + " foi encontrada no indice " + indice_quatro));
      System.out.println(("A chave " + chave_quatro + " foi encontrada nos indices " + todasOcorrencias.stream().map(String::valueOf).collect(Collectors.joining(", "))));
      
      System.out.println("--------------------------------");

      List<Integer> idades = new ArrayList<>();
      for(Pessoa pessoa : listaPessoas) {
        if(pessoa.getIdade() == 100) {
          System.out.println(pessoa.getNome() + " tem 100 anos");
        }
      }

      System.out.println("--------------------------------");

      System.out.println("Pessoas com mais de 30 anos:");
      for(Pessoa pessoa : listaPessoas) {
        if(pessoa.getIdade() > 30) {
          System.out.println(pessoa.getNome());
        }
      }

      System.out.println("--------------------------------");

      for(Pessoa pessoa : listaPessoas) {
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + " anos");
      }

      BuscaBinaria buscaBin = new BuscaBinaria();

      System.out.println("--------------------------------");


      int numero = buscaBin.buscaBinariaAlternativa(listaNumerosDois, 99);
      if (numero == -1) {
        System.out.println("A chave 99 não foi encontrada no array.");
      } else {
        System.out.println("O 99 tem o indice " + numero);
      }

      int numeroDois = buscaBin.buscaBinariaAlternativa(listaNumerosDois, 81);
      if (numeroDois == -1) {
        System.out.println("A chave 81 não foi encontrada no array.");
      } else {
        System.out.println("O 81 tem o indice " + numeroDois);
      }
  }
}
