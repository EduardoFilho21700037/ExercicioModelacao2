package pt.ulusofona.deisi.lp2.miniTeste2;

import java.util.ArrayList;
import java.util.List;

public class PlayableCharacter extends Character {
    List<Item> itens = new ArrayList<>();
    String nomeDoControlador;

    public PlayableCharacter(int id, String nome, String nomeDoControlador){
        super(id, nome);
        this.nomeDoControlador = nomeDoControlador;

    }

    public void apanharItem(Item item){
        itens.add(item);
    }
    public List<Item> getItems(){
        return itens;
    }
    public int calcularValorItens(){
        int valorTotal = 0;
        for(Item item : itens){
            valorTotal += item.getValor();
        }
        return valorTotal;
    }
    public Item obterItemMaisValioso(){
        Item itemMaisValioso = null;
        int valorMaisAlto = 0;
        for(Item item : itens){
            if(item.getValor() > valorMaisAlto){
                valorMaisAlto = item.getValor();
                itemMaisValioso = item;
            }
        }
        return itemMaisValioso;
    }
    boolean podeMover(int d){
        int numItems = itens.size();
        if(numItems == 0){
            if(d <= 5){
                return true;
            }
        }else if(numItems <= 3){
            if(d <= 3){
                return true;
            }
        }else if(numItems <= 5) {
            if (d <= 1) {
                return true;
            }
        }
        return false;
    }

}
