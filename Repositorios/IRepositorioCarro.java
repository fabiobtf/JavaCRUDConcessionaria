package Repositorios;
import java.util.List;

import Entidades.Carro;


public interface IRepositorioCarro {
    
    public boolean salvaCarro(Carro carro);
    public boolean deletarCarroPorId(int id);
    public List<Carro> listarCarro();
    public boolean alterarCarroPorId(Carro carro);
}
