package Entidades;

public class Moto {
    private int id;
    private String modelo;
    private String cor;
    private String placa;
    private int kilometragem;
    private String historico;


    public Moto(){
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    

    public int getKilometragem(){
        return kilometragem;
    }
    public void setKilometragem(int kilomeragem){
        this.kilometragem = kilomeragem;
    }
    

    public String getHistorico(){
        return historico;
    }
    public void setHistorico(String historico){
        this.historico = historico;
    }
}
