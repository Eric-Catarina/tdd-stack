package org.example;

import java.util.LinkedList;

public class Pilha <Generico> {
    public Pilha(int tamMaximo){
        tamanhoMaximo = tamMaximo;
    }
    int tamanhoMaximo;
    LinkedList<Generico> conteudo = new LinkedList<Generico>();
    boolean estaVazia(){
        return conteudo.size() == 0;
    }
    int tamanho(){
        return conteudo.size();
    }
    void empilha(Generico elemento){
        if (tamanho() < tamanhoMaximo){
            conteudo.add(elemento);
        }
        else{
            throw new DeuJebaException();
        }
    }

    public Generico desempilha() {
        if (tamanho()>=1){
            return conteudo.remove(this.tamanho()-1);
        }
        else{
         throw new DeuJebaException();
        }
    }
}
