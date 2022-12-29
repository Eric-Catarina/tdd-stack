package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(3, Calculator.add(2.0, 1.0));
    }

    @Test
    @DisplayName("Divide two number")
    void divide() {
        assertEquals(2, Calculator.divide(8.0, 4.0));
    }
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}

class StackTest{
    @Test
    @DisplayName("Is empty")
    void EstaVazia(){
        Pilha minhaPilha = new Pilha(10);
        assertTrue(minhaPilha.estaVazia());
    }
    @Test
    void TamanhoEhZero(){
        Pilha minhaPilha = new Pilha(10);
        assertEquals(0, minhaPilha.tamanho());
    }
    @Test
    @DisplayName("EmpilhaUm")
    void Empilha_Um_TamanhoUm(){
        Pilha minhaPilha = new Pilha(10);
        minhaPilha.empilha(17);
        assertEquals(1, minhaPilha.tamanho());
    }

    @Test
    void Empilha_Desempilha(){
        Pilha minhaPilha = new Pilha(10);
        minhaPilha.empilha(17);
        minhaPilha.desempilha();

        assertEquals(0, minhaPilha.tamanho());
    }

    @Test
    void desempilha(){
        Pilha minhaPilha = new Pilha(10);
        minhaPilha.empilha(10);
        minhaPilha.desempilha();
        assertEquals(0, minhaPilha.tamanho());
    }

    @Test
    void empilhaPilhaCheia(){
        Pilha minhaPilha = new Pilha(10);
        for (int i = 0; i < minhaPilha.tamanhoMaximo; i++) {
            minhaPilha.empilha(i);
        }
        try {
            minhaPilha.empilha(999);
            fail("Excecao nao foi lançada");
        }
        catch (DeuJebaException jebaException){
        }
    }
}