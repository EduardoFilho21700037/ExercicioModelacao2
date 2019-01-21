import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos=new ArrayList<>();

        alunos.add(new Aluno("Bruno", 9, "Portuguesa"));
        alunos.add(new Aluno("Pierre", 13, "Francesa"));
        alunos.add(new Aluno("Rute", 12, "Portuguesa"));
        alunos.add(new Aluno("Pedro", 19, "Portuguesa"));
        alunos.add(new Aluno("Joana", 8, "Portuguesa"));
        alunos.add(new Aluno("Juan", 12, "Espanhola"));
        alunos.add(new Aluno("Javier", 12, "Espanhola"));

        //Exercícios de programação funcional:

        //1) Quantos alunos estão aprovados?

        long nrAlunos = alunos.stream()

                .filter((a) -> a.estaAprovado())
                .collect(counting());

        System.out.println("Alunos aprovados = "+nrAlunos);

        System.out.println("--------------------------------");

        //2) Quantos alunos de nacionalidade portuguesa estão aprovados?

         nrAlunos = alunos.stream()
                .filter((a)->a.estaAprovado())
                .filter((a)->a.getNacionalidade().equals("Portuguesa"))
                .collect(counting());
        System.out.println("Alunos portugueses aprovados : "+nrAlunos);

        System.out.println("--------------------------------");

        //3) Quais os nomes e notas finais dos alunos aprovados?

        alunos.stream()
               .filter((a)->a.estaAprovado())
                .forEach((a)-> System.out.println("Nome:"+a.getNome()+"__Nota:"+a.getNota()));

        System.out.println("--------------------------------");

        //4) Quantas notas diferentes existem?

        long notasDif = alunos.stream()
                .map((a)->a.getNota())
                .distinct()
                .collect(counting());
        System.out.println("Nr. de notras diferentes:"+notasDif);

        System.out.println("--------------------------------");

        //4.1) Quais são as notas distintas?

        alunos.stream()
                .map((a)->a.getNota())
                .distinct()
                .forEach((n)-> System.out.println(n));

        System.out.println("--------------------------------");

        //5) Quais os nomes e notas finais dos alunos aprovados, ordenados por nota (crescente)?

        alunos.stream()
                .filter((a)->a.estaAprovado())
                .sorted((a1, a2)->a1.getNota() - a2.getNota())
                .forEach((a)-> System.out.println("Nome="+a.getNome()+"--Nota="+a.getNota()));

        System.out.println("--------------------------------");

        //5.1) Quais os nomes e notas finais dos alunos aprovados, ordenados por nota
        //(decrescente)?

        alunos.stream()
                .filter((a)->a.estaAprovado())
                .sorted((a1,a2)->a2.getNota()-a1.getNota())
                .forEach((a)-> System.out.println("Nome="+a.getNome()+"--Nota="+a.getNota()));

        System.out.println("--------------------------------");

        //6) Quais os nomes e notas finais dos alunos reprovados, ordenados por nome
        //(crescente)?

        alunos.stream()
                .filter((a)-> !a.estaAprovado())
                .sorted((a1,a2)->a1.getNota()-a2.getNota())
                .forEach((a)-> System.out.println("Nome="+a.getNome()+"--Nota="+a.getNota()));

        System.out.println("--------------------------------");

        //7) Qual é a nota mais alta?

        int notaMax = alunos.stream()
                .map((a)->a.getNota())
                .max((n1,n2)->n1 - n2)
                .get();

        System.out.println("Nota mais alta:"+notaMax);

        System.out.println("--------------------------------");

        //8) Obter 1 lista com os alunos aprovados.

       //versao feia

        List<Aluno> alunosAprovados = new ArrayList<>();

        alunos.stream()
                .filter((a)->a.estaAprovado())
                .forEach((a)->alunosAprovados.add(a));

        System.out.println("Lista alunos aprovados:"+alunosAprovados);

        //versao bela

        List<Aluno> alunosAprovados2 = new ArrayList<>();

        alunos.stream()
                .filter((a)->a.estaAprovado())
                .collect(Collectors.toList());

        System.out.println("--------------------------------");

        //9) Qual é a média das notas?

        double media = alunos.stream()
                .mapToInt((a)->a.getNota())
                .average()
                .getAsDouble();
        System.out.println("A média é:"+media);

        System.out.println("--------------------------------");

        //10) Qual é a média de notas dos alunos aprovados?

        double mediaAprovados = alunos.stream()

                .filter((a)->a.estaAprovado())
                .mapToInt((a)->a.getNota())
                .average()
                .getAsDouble();
        System.out.println("Média aprovados:"+mediaAprovados);






    }
}
