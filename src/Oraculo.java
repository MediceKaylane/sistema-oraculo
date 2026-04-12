/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Oraculo {
    Random random = new Random();
    
    public int tentativasLevel01 = 0;
    private String nome;
    private Guerreiro warrior;

    public Oraculo(String nome, Guerreiro warrior) {
        this.nome = nome;
        this.warrior = warrior;
    }
    

    
    public boolean loadLevel01 (){
        boolean level01Completo = false;
        int resposta = random.nextInt(99) + 1;
        System.out.println("numero sorteado:" + resposta);
        
        
        for(int i = 0; i < warrior.getVidaInicial() + 1; i++){
            
            if(warrior.getQntdVidas() == 0){                                          //Avisa que o jogador perdeu e encerra o programa caso as vidas
                InOut.MsgDeErro("Oráculo", "Suas vidas acabaram! Você perdeu!");        //tenham acabado
                System.exit(0);
            }
            
            //explicar para o usuario o jogo (a preencher)
            
            
            
            int respostaJogador = InOut.leInt(warrior.getNome() + ", " + "qual o seu palpite?");         //Recebe o palpite do jogador
                
                if(respostaJogador == resposta){                                                    //Se o jogador acertar, a Oráculo avisa o acerto
                    InOut.MsgSemIcone("Oráculo:", "Parabéns!\n Você completou o primeiro nível");
                    level01Completo = true;
                    
                    if(tentativasLevel01 == 0){              //Caso o jogador acerte na primeira tentativa, equipa o item definido
                        warrior.getbolsa(6); //id item supremo
                    }
                    
                    break;
                    
                } else{
                    
                    if(respostaJogador > resposta){                                                                 //Caso o jogador erre, da as dicas de
                        InOut.MsgDeAviso("Oráculo:", "Uma dica: o número secreto é menor que o seu palpite");       //maior ou menor do que o palpite
                    } 
                    else if(respostaJogador < resposta){
                        InOut.MsgDeAviso("Oráculo", "Uma dica: o número secreto é maior que o seu palpite");
                    }
                    
                  warrior.diminuirVida();                     //Guerreiro perde uma vida e tentativas do nível 1 aumenta
                  tentativasLevel01++;
                }
        }
        
        return level01Completo;
    }
    
    public boolean loadLevel02 () {
        
        boolean level02Completo = false;
        
        // Criando a tabela de pontuação
        Map<Character, Integer> tabelaPontuacao = new HashMap<>();

        // Adicionando as pontuações
        tabelaPontuacao.put('A', 10);
        tabelaPontuacao.put('B', 30);
        tabelaPontuacao.put('C', 30);
        tabelaPontuacao.put('D', 20);
        tabelaPontuacao.put('E', 10);
        tabelaPontuacao.put('F', 40);
        tabelaPontuacao.put('G', 20);
        tabelaPontuacao.put('H', 20);
        tabelaPontuacao.put('I', 40);
        tabelaPontuacao.put('J', 10);
        tabelaPontuacao.put('K', 80);
        tabelaPontuacao.put('L', 50);
        tabelaPontuacao.put('M', 10);
        tabelaPontuacao.put('N', 30);
        tabelaPontuacao.put('O', 10);
        tabelaPontuacao.put('P', 10);
        tabelaPontuacao.put('Q', 90);
        tabelaPontuacao.put('R', 10);
        tabelaPontuacao.put('S', 10);
        tabelaPontuacao.put('T', 10);
        tabelaPontuacao.put('U', 10);
        tabelaPontuacao.put('V', 80);
        tabelaPontuacao.put('W', 100);
        tabelaPontuacao.put('X', 70);
        tabelaPontuacao.put('Y', 100);
        tabelaPontuacao.put('Z', 50);

        
        
        return level02Completo;
        
    }
       
}
