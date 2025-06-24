package br.com.alura.minhasmusicas.modelos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinhasPreferidas {
    private static final Logger logger = LoggerFactory.getLogger(MinhasPreferidas.class);

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            logger.info("{} é considerado sucesso absoluto", audio.getTitulo());
        } else {
            logger.info("{} também é um dos que todo mundo está {}", audio.getTitulo(), "ouvindo");
        }
    }
}
