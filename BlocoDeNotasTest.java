import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlocoDeNotasTest {


    private BlocoDeNotas bloco;

    @BeforeEach
    void setUp(){
        bloco = new BlocoDeNotas();
    }
    @Test
    void adicionarAnotacao() throws Exception {
        assertEquals(1, bloco.adicionarAnotacao("jogar bola").getId());
    }

    @org.junit.jupiter.api.Test
    void editarAnotacao() throws Exception {
        bloco.adicionarAnotacao("Viajar para Londres");
        bloco.editarAnotacao(1, "Viajar para EUA");
        assertEquals("Viajar para EUA", bloco.buscaAnotacao(1).getTexto());
    }

    @Test
    void buscaAnotacao() throws Exception {
        bloco.adicionarAnotacao("Viajar para Londres");
        assertEquals("Viajar para Londres",bloco.buscaAnotacao(1).getTexto());
    }

    @org.junit.jupiter.api.Test
    void recuperaTexto() {

    }

    @org.junit.jupiter.api.Test
    void listar() {
    }

    @org.junit.jupiter.api.Test
    void deletaAnotacao() {

    }
}