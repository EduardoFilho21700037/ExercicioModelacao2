package pt.ulusofona.deisi.lp2.miniTeste2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static List<Character> getPersonagens(){
        List<Character> personagens = new ArrayList<>();
        Character personagem1 = new NonPlayableCharacter(1, "ULHT", 10);
        Character personagem2 = new PlayableCharacter(2, "21700037", "Eduardo");
        ((PlayableCharacter) personagem2).apanharItem(new Item(15));
        personagens.add(personagem1);
        personagens.add(personagem2);

        return personagens;
    }
    static PlayableCharacter personagemComMaisPontos(List<PlayableCharacter> personagens){
        PlayableCharacter personagemComMaisPontos = null;
        int valorMaisAlto = 0;
        for(PlayableCharacter personagem : personagens){
            int personagemPontos = personagem.calcularValorItens();
            if(personagemPontos > valorMaisAlto){
                valorMaisAlto = personagemPontos;
                personagemComMaisPontos = personagem;
            }
        }
        return personagemComMaisPontos;
    }
    static List<Character> personagensQueSePodemMover(List<Character> personagens, int k){
        List<Character> personagensQueSePodemMover = new ArrayList<>();
        for(Character personagem : personagens){
            if(personagem.podeMover(k)){
                personagensQueSePodemMover.add(personagem);
            }
        }
        return personagensQueSePodemMover;
    }

}
