package AtividEbac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AlunoMarcos
 */

public class Colaboradores {

    public static void main(String args[]) {
        NomesDosColaboradores();
        MasculinoFeminino();
    }

    private static void MasculinoFeminino() {
        System.out.println("**MasculinoFeminino**");
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas Silva-M");
        nomes.add("Andressa Gomes-F");
        nomes.add("Bruno Santos-M");
        nomes.add("Beatriz Santos-F");

        System.out.println("Nomes:" + nomes);

        // Separando os nomes por gênero
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String nome : nomes) {
            char genero = nome.charAt(nome.length() - 1); // Última letra indica o gênero
            if (genero == 'M') {
                masculinos.add(nome);
            } else if (genero == 'F') {
                femininos.add(nome);
            }
        }

        System.out.println("Masculinos: " + masculinos);
        System.out.println("Femininos: " + femininos);
        System.out.println("");



    }


    private static void NomesDosColaboradores() {
        System.out.println("**Nomes Dos Colaboradores**");
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas Silva");
        nomes.add("Andressa Gomes");
        nomes.add("Bruno Santos");
        nomes.add("Beatriz Santos");

        System.out.println("Nomes:" + nomes);

        // Ordem alfabética
        Collections.sort(nomes);
        System.out.println("Ordem alfabética:" + nomes);
    }
}