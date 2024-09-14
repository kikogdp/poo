package org.example;

import java.sql.SQLOutput;

public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página URL");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba da página de internet");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página de internet");
    }
}
