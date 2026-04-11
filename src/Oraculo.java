/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
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
        boolean levelCompleto = false;
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
                    levelCompleto = true;
                    
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
        
        return levelCompleto;
    }
    

    
 
    
    
    
    
    
}
