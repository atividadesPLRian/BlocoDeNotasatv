import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnotacaoTest {

    private Anotacao anotacao;

    @BeforeEach
    void setUp() throws Exception {
        anotacao = new Anotacao(1, "Treinar na academia");
    }
    @Test
    void getTexto() {
        assertEquals("Treinar na academia", anotacao.getTexto());
    }

    @Test
    void getId() {
        assertEquals(1, anotacao.getId());
    }


    @Test
    void setTexto() {
        anotacao.setTexto("Jogar bola");
        assertEquals("Jogar bola", anotacao.getTexto());
    }

    @Test
    void getDeletado() {
        assertFalse(anotacao.getDeletado());
    }

    @Test
    void setDeletado() {
        anotacao.setDeletado();
        assertTrue(anotacao.getDeletado());
    }

    @Test
    void contemTexto() {
        String valorTest = "Treinar";
        assertTrue(anotacao.contemTexto(valorTest));
    }
}