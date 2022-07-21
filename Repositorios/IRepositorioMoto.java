package Repositorios;
import java.util.List;

import Entidades.Moto;


public interface IRepositorioMoto {
    
    public boolean salvaMoto(Moto moto);
    public boolean deletarMotoPorId(int id);
    public List<Moto> listarMoto();
    public boolean alterarMotoPorId(Moto moto);
}
