/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class Item {
    
    private int idItem;
    private String tipoItem;
    private boolean equipado;

    public Item(int idItem, String tipoItem, boolean equipado) {
        this.idItem = idItem;
        this.tipoItem = tipoItem;
        this.equipado = equipado;
    }
    

    public void imprimirDados(){
        InOut.MsgDeInformacao("Dados do Item",  tipoItem + "\n" + equipado);    //Imprime os dados do item em uma janela com o InOut
    }
    
    public void equipar(){      //Equipa o item
        this.equipado = true;
        System.out.println("item e se esta equipado:" + tipoItem + equipado);
    }
    
}
