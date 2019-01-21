package pt.ulusofona.deisi.lp2.miniTeste2;

abstract class Character {

    int id;
    String nome;

    public Character(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    abstract boolean podeMover(int d);


    
}
