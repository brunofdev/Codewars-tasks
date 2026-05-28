package br.com.brunofragadev.codewars_duplicate_encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {


    @Test
    void deveRetornarParentesesAbertoParaCaractereUnico(){
        assertEquals("(", DuplicateEncoder.encode("d"));
    }

    @Test
    void deveRetornarParentesesFechadoParaCaractereRepetido(){
        assertEquals("))", DuplicateEncoder.encode("dd"));
    }
    @Test
    void deveEncodificarStringMista(){
        assertEquals("))))", DuplicateEncoder.encode("abab"));
    }
    @Test
    void deveEncodificarStringMista2(){
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
    }
    @Test
    public void testDoCodeWars() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}