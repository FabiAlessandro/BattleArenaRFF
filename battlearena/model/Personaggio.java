package battlearena.model;

import java.util.ArrayList;

public class Personaggio implements PersonaggioInt{

    private static final int MAX_HP = 100;
    private static final int MIN_HP = 0;
    private String nome;
    private int hp;
    private TipoPersonaggio tipo;
    private ArrayList<Mossa> mosse;
    private String path;

    public Personaggio(String nome,TipoPersonaggio tipo,String path){
        this.nome = nome;
        this.tipo = tipo;
        this.path = path;
        hp = MAX_HP;
        mosse = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getHpMax() {
        return MAX_HP;
    }

    @Override
    public void subisciDanno(int danno) {
        hp =- danno;
    }

    @Override
    public boolean isVivo() {
        return hp>MIN_HP;
    }

    @Override
    public TipoPersonaggio getTipo() {
        return tipo;
    }

    @Override
    public Mossa[] getMosseDisponibili() {
        return mosse.toArray(new Mossa[]{});
    }

    @Override
    public String getPercorsoImmagine() {
        return path;
    }
}
