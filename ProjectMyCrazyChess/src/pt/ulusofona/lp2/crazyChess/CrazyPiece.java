package pt.ulusofona.lp2.crazyChess;

public class CrazyPiece {
    int id;
    int tipoId;
    int teamId;
    String alcunha;

    CrazyPiece(int id, int tipoId, int teamId, String alcunha){
                this.id=id;
                this.tipoId=tipoId;
                this.teamId=teamId;
                this.alcunha=alcunha;
    }
}
