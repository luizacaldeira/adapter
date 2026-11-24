import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarClassificacaoA() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("A");

        assertEquals("A", cliente.getClassificacao());
    }

    @Test
    void deveRetornarClassificacaoB() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("B");

        assertEquals("B", cliente.getClassificacao());
    }

    @Test
    void deveRetornarClassificacaoC() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("C");

        assertEquals("C", cliente.getClassificacao());
    }

    @Test
    void deveRetornarClassificacaoD() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("D");

        assertEquals("D", cliente.getClassificacao());
    }

    @Test
    void deveRetornarScoreClasseA() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("A");

        assertEquals(90.0f, cliente.getScore(), 0.01f);
    }

    @Test
    void deveRetornarScoreClasseD() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("D");

        assertEquals(0.0f, cliente.getScore(), 0.01f);
    }

}