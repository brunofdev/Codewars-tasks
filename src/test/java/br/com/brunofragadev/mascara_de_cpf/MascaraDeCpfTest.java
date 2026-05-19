package br.com.brunofragadev.mascara_de_cpf;

import br.com.brunofragadev.duplicate_encoder.DuplicateEncoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MascaraDeCpfTest {

    @Test
    void testMascaraDeCpfQuandoRecebe11Digitos(){
        assertEquals("02X.XXX.XXX-95", MascaraDeCpf.mascararCpf("02370945095"));
    }

    @Test
    void testMascaraDeCpf(){
        assertEquals("02X.XXX.XXX-95", MascaraDeCpf.mascararCpf("02370945095"));
    }
    @Test
    void deveLancarExcecaoQuandoStringVirComMaisDe11Numeros(){
        assertThrows(RuntimeException.class, () -> MascaraDeCpf.mascararCpf("0237094502222295"));
    }
    @Test
    void deveLancarExcecaoQuandoStringVierComLetras(){
        assertThrows(RuntimeException.class, () -> MascaraDeCpf.mascararCpf("023C709D450-95"));
    }
}