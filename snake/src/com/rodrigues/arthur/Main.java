package com.rodrigues.arthur;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            JanelaPrincipal programa = new JanelaPrincipal();
            programa.inicia();
        }
        catch (HeadlessException excecao) {
            imprMsgErroETermina("Programa terminado por  uma HeadLessExpetion no método main()", excecao);
        }
        catch (Exception excecao) {
            imprMsgErroETermina("Programa terminado por uma Generic Exception no  método main()", excecao);
        }
    }

    private static void imprMsgErroETermina(String mensagem, Exception ocorrencia) {
        System.out.println("Mensagem de erro:\t" + mensagem);
        System.out.println("Texto de exceção:\t" + ocorrencia.getMessage());
        System.exit(1);
    }
}
