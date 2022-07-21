package Repositorios;
import java.util.List;

import Entidades.Caminhao;


public interface IRepositorioCaminhao {
    
    public boolean salvaCaminhao(Caminhao caminhao);
    public boolean deletarCaminhaoPorId(int id);
    public List<Caminhao> listarCaminhao();
    public boolean alterarCaminhaoPorId(Caminhao caminhao);
}
