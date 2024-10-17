package controler;

import view.FramePrincipal;

import javax.swing.*;

public class Controler {
    private FramePrincipal frame;
    private String operacao = "";
    private boolean primeiroValor = true;
    public void start(){
        frame = new FramePrincipal();
        setarBotoesFuncoes();
        setarBotoesNumeros();
    }

    private void setarBotoesFuncoes(){
        JButton botaoIgual = frame.getBotaoIgual();
        JButton botaoMais = frame.getBotaoMais();
        JButton botaoMenos = frame.getBotaoMenos();
        JButton botaoMul = frame.getBotaoMul();
        JButton botaoDiv = frame.getBotaoDiv();
        JButton botaoLimpar = frame.getBotaoLimpar();

        botaoMais.addActionListener(e -> {
            if(operacao.isEmpty()){// Se a string da operação for vazia
                operacao = "0 + ";// troca o valor da string para o valor ao lado
                frame.atualizarLabel(operacao);//atualiza no visor da calculadora a operação
            }else{
                if(primeiroValor){// se o usuário ainda não apertou a operação, continua pegando números. Caso tenha apertado o botão ele não deixa mais
                    operacao += " + "; // concatena a string com o valor ao lado
                    frame.atualizarLabel(operacao); // atualiza no visor da calculadora a operação
                    primeiroValor = false; // troca o estado para falso para o usuário inserir o segundo número
                }
            }
        });

        botaoMenos.addActionListener(e -> {
        	if(operacao.isEmpty()){// Se a string da operação for vazia
                operacao = "0 - ";// troca o valor da string para o valor ao lado
                frame.atualizarLabel(operacao);//atualiza no visor da calculadora a operação
            }else{
                if(primeiroValor){// se o usuário ainda não apertou a operação, continua pegando números. Caso tenha apertado o botão ele não deixa mais
                    operacao += " - "; // concatena a string com o valor ao lado
                    frame.atualizarLabel(operacao); // atualiza no visor da calculadora a operação
                    primeiroValor = false; // troca o estado para falso para o usuário inserir o segundo número
                }
            }
        });

        botaoMul.addActionListener(e -> {
        	if(operacao.isEmpty()){// Se a string da operação for vazia
                operacao = "0 * ";// troca o valor da string para o valor ao lado
                frame.atualizarLabel(operacao);//atualiza no visor da calculadora a operação
            }else{
                if(primeiroValor){// se o usuário ainda não apertou a operação, continua pegando números. Caso tenha apertado o botão ele não deixa mais
                    operacao += " * "; // concatena a string com o valor ao lado
                    frame.atualizarLabel(operacao); // atualiza no visor da calculadora a operação
                    primeiroValor = false; // troca o estado para falso para o usuário inserir o segundo número
                }
            }
        });

        botaoDiv.addActionListener(e -> {
        	if(operacao.isEmpty()){// Se a string da operação for vazia
                operacao = "0 / ";// troca o valor da string para o valor ao lado
                frame.atualizarLabel(operacao);//atualiza no visor da calculadora a operação
            }else{
                if(primeiroValor){// se o usuário ainda não apertou a operação, continua pegando números. Caso tenha apertado o botão ele não deixa mais
                    operacao += " / "; // concatena a string com o valor ao lado
                    frame.atualizarLabel(operacao); // atualiza no visor da calculadora a operação
                    primeiroValor = false; // troca o estado para falso para o usuário inserir o segundo número
                }
            }
        });

        botaoIgual.addActionListener(e -> {
            frame.fazerConta(operacao); // manda a operação para ser calculada
            primeiroValor = true; // coloca a boolean como verdadeira para deixar o usuário selecionar uma operação novamente
            operacao = ""; // limpa a operação
        });

        botaoLimpar.addActionListener(e ->{
            operacao = ""; // limpa a operação
            frame.atualizarLabel(operacao);// atualiza no visor da calculadora a operação, neste caso ele limpa a tela como a operação sempre vai ser nula
        });

    }
    private void setarBotoesNumeros(){
        JButton botao0 = frame.getBotao0();
        JButton botao1 = frame.getBotao1();
        JButton botao2 = frame.getBotao2();
        JButton botao3 = frame.getBotao3();
        JButton botao4 = frame.getBotao4();
        JButton botao5 = frame.getBotao5();
        JButton botao6 = frame.getBotao6();
        JButton botao7 = frame.getBotao7();
        JButton botao8 = frame.getBotao8();
        JButton botao9 = frame.getBotao9();

        botao0.addActionListener(e -> {
            operacao += "0";
            frame.atualizarLabel(operacao);
        });
        botao1.addActionListener(e -> {
            operacao += "1";
            frame.atualizarLabel(operacao);
        });
        botao2.addActionListener(e -> {
            operacao += "2";
            frame.atualizarLabel(operacao);
        });
        botao3.addActionListener(e -> {
            operacao += "3";
            frame.atualizarLabel(operacao);
        });
        botao4.addActionListener(e -> {
            operacao += "4";
            frame.atualizarLabel(operacao);
        });
        botao5.addActionListener(e -> {
            operacao += "5";
            frame.atualizarLabel(operacao);
        });
        botao6.addActionListener(e -> {
            operacao += "6";
            frame.atualizarLabel(operacao);
        });
        botao7.addActionListener(e -> {
            operacao += "7";
            frame.atualizarLabel(operacao);
        });
        botao8.addActionListener(e -> {
            operacao += "8";
            frame.atualizarLabel(operacao);
        });
        botao9.addActionListener(e -> {
            operacao += "9";
            frame.atualizarLabel(operacao);
        });

    }
}
