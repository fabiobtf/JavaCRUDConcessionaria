package Repositorios;
import java.util.List;
import java.util.ArrayList;

import Entidades.Caminhao;


public class RepositorioCaminhao implements IRepositorioCaminhao{

    List<Caminhao> listaCaminhaos = new ArrayList<Caminhao>();
    

    @Override
    public boolean salvaCaminhao(Caminhao caminhao){
    
        try{
            listaCaminhaos.add(caminhao);
        } catch(Exception e){
            return false;
        }
        return false;
    }



    @Override
    public boolean deletarCaminhaoPorId(int id){

		for (Caminhao caminhao : listaCaminhaos) {
			if (caminhao.getId() == id) {
				listaCaminhaos.remove(caminhao);
			}
		}

		return false;
	}



    @Override
    public List<Caminhao> listarCaminhao(){
        return listaCaminhaos;
    }



    @Override
    public boolean alterarCaminhaoPorId(Caminhao caminhao){
        for (Caminhao caminhao1 : listaCaminhaos) {
			if (caminhao1.getId() == caminhao.getId()) {
				
				listaCaminhaos.remove(caminhao1);
				listaCaminhaos.add(caminhao);
			}
		}
        return false;
    }
}
