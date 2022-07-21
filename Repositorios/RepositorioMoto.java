package Repositorios;
import java.util.List;
import java.util.ArrayList;

import Entidades.Moto;


public class RepositorioMoto implements IRepositorioMoto{

    List<Moto> listaMotos = new ArrayList<Moto>();
    

    @Override
    public boolean salvaMoto(Moto moto){
    
        try{
            listaMotos.add(moto);
        } catch(Exception e){
            return false;
        }
        return false;
    }



    @Override
    public boolean deletarMotoPorId(int id){

		for (Moto moto : listaMotos) {
			if (moto.getId() == id) {
				listaMotos.remove(moto);
			}
		}

		return false;
	}



    @Override
    public List<Moto> listarMoto(){
        return listaMotos;
    }



    @Override
    public boolean alterarMotoPorId(Moto moto){
        for (Moto moto1 : listaMotos) {
			if (moto1.getId() == moto.getId()) {
				
				listaMotos.remove(moto1);
				listaMotos.add(moto);
			}
		}
        return false;
    }
}
