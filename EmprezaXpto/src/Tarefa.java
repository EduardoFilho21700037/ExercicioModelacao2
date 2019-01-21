public class Tarefa {
    String descricao;
    String mes;
    int duracao;

    Tarefa(String descricao){
        this.descricao=descricao;
    }
    String getMes(){
        return mes;
    }

    int getDuracao(){
        return duracao;
    }
    void setMes(String mes){
        this.mes = mes;
    }

    void setDuracao(int duracao){
        this.duracao=duracao;
    }

}
