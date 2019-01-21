package pt.ulusofona.deisi.lp2.miniTeste2;

public class NonPlayableCharacter extends Character {

    int raio;

    public NonPlayableCharacter(int id, String nome, int raio){
        super(id, nome);
        this.raio = raio;
    }

    boolean podeMover(int d){
        if(d <= raio){

            return true;
        }
        return false;
    }
}
