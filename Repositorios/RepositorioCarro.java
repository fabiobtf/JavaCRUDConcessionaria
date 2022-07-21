package Repositorios;
import java.util.List;
import java.util.ArrayList;

import Entidades.Carro;


public class RepositorioCarro implements IRepositorioCarro{

    List<Carro> listaCarros = new ArrayList<Carro>();
    

    @Override
    public boolean salvaCarro(Carro carro){
    
        try{
            listaCarros.add(carro);
        } catch(Exception e){
            return false;
        }
        return false;
    }



    @Override
    public boolean deletarCarroPorId(int id){

		for (Carro carro : listaCarros) {
			if (carro.getId() == id) {
				listaCarros.remove(carro);
			}
		}

		return false;
	}



    @Override
    public List<Carro> listarCarro(){
        return listaCarros;
    }



    @Override
    public boolean alterarCarroPorId(Carro carro){
        for (Carro carro1 : listaCarros) {
			if (carro1.getId() == carro.getId()) {
				
				listaCarros.remove(carro1);
				listaCarros.add(carro);
			}
		}
        return false;
    }
}
