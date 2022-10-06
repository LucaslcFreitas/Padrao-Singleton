import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredenciaisTest {

    @Test
    public void deveRetornarNomeUsuario() {
        Credenciais.getInstance().setNome("Lucas Freitas");
        assertEquals("Lucas Freitas", Credenciais.getInstance().getNome());
    }

    @Test
    public void deveRetornarTokenUsuario() {
        Credenciais.getInstance().setToken("c13f3ab5c516eeb3df78010e9b41f03b");
        assertEquals("c13f3ab5c516eeb3df78010e9b41f03b", Credenciais.getInstance().getToken());
    }
}