package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.logging.Logger;


import java.util.logging.Logger;

public class Principal {
    private static final Logger log = Logger.getLogger(Principal.class.getName());


    public static void main(String[] args) {


        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        log.info("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        log.info("Duração para assister lost: " + lost.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        log.info("Tempo Total" + calculadora.getTempoTotal());

    }

}