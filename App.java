import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Moto;
import Repositorios.RepositorioMoto;
import Entidades.Carro;
import Repositorios.RepositorioCarro;
import Entidades.Caminhao;
import Repositorios.RepositorioCaminhao;

public class App {
    static RepositorioMoto rpmt = new RepositorioMoto();
    static RepositorioCarro rpcr = new RepositorioCarro();
    static RepositorioCaminhao rpcm = new RepositorioCaminhao();
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        int ch2;
        int ch3;
        int ch4;
        int ch5;

        do{
            System.out.println("Bem Vindo ao Sistema de Estoque!!");
            System.out.println("");
            System.out.println("Selecione sua Opcao: ");
            System.out.println("1. Acicionar Veiculo: ");
            System.out.println("2. Lista do Estoque: ");
            System.out.println("3. Deletar Veiculo: ");
            System.out.println("4. Atualizar Veiculo: ");
            ch = s.nextInt();

            switch(ch){

                case 1:
                do{
                    System.out.println("");
                    System.out.println("Selecione sua Opcao: ");
                    System.out.println("1. Acicionar Moto: ");
                    System.out.println("2. Acicionar Carro: ");
                    System.out.println("3. Acicionar Caminhao: ");
                    ch2 = s.nextInt();
                    switch(ch2){
                        case 1:
                        popularArrayMoto();
                        break;
                        case 2:
                        popularArrayCarro();
                        break;
                        case 3:
                        popularArrayCaminhao();
                        break;
                    }
                break;
                }while(ch!=0);
				break;

				case 2:
                do{
                    System.out.println("");
                    System.out.println("Selecione sua Opcao:");
                    System.out.println("1. Lista Total de Motos: ");
                    System.out.println("2. Lista Total de Carros: ");
                    System.out.println("3. Lista Total de Caminhoes: ");
                    ch3 = s.nextInt();
                    switch(ch3){
                        case 1:
                        listarMotos();
                        break;
                        case 2:
                        listarCarros();
                        break;
                        case 3:
                        listarCaminhaos();
                        break;
                    }
                break;
                }while(ch!=0);
				break;

				case 3:
                do{
                    System.out.println("");
                    System.out.println("Selecione sua Opcao:");
                    System.out.println("1. Deletar Moto: ");
                    System.out.println("2. Deletar Carro: ");
                    System.out.println("3. Deletar Caminhao: ");
                    ch4 = s.nextInt();
                    switch(ch4){
                        case 1:
                        int c1;
                        System.out.println("Qual o ID do Veiculo?");
                        c1 = s.nextInt();
                        rpmt.deletarMotoPorId(c1);
                        break;
                        case 2:
                        int c2;
                        System.out.println("Qual o ID do Veiculo?");
                        c2 = s.nextInt();
                        rpcr.deletarCarroPorId(c2);
                        break;
                        case 3:
                        int c3;
                        System.out.println("Qual o ID do Veiculo?");
                        c3 = s.nextInt();
                        rpcm.deletarCaminhaoPorId(c3);
                        break;
                    }
                break;
                }while(ch4!=0);
                break;

				case 4:
                do{
                    System.out.println("");
                    System.out.println("Selecione sua Opcao: ");
                    System.out.println("1. Alterar Moto: ");
                    System.out.println("2. Alterar Carro: ");
                    System.out.println("3. Alterar Caminhao: ");
                    ch5 = s.nextInt();
                    switch(ch5){
                        case 1:
                        alterarMoto();
                        break;
                        case 2:
                        alterarCarro();
                        break;
                        case 3:
                        alterarCaminhao();
                        break;
                    }
                break;
                }while(ch5!=0);
				break;
			}
		}while(ch!=0);
	}


/* ---------- METODOS MOTO ---------- */
    public static void alterarMoto(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Moto moto = new Moto();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID que deseja Alterar?");
        Id = s.nextInt();
        moto.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        moto.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        moto.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        moto.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        moto.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        moto.setHistorico(Historico);

        salvo = rpmt.salvaMoto(moto);
        
        if (salvo){
            System.out.println(moto.getModelo()+"Salvo com Sucesso!");
        }
    }

    public static void popularArrayMoto(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Moto moto = new Moto();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID?");
        Id = s.nextInt();
        moto.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        moto.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        moto.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        moto.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        moto.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        moto.setHistorico(Historico);

        
		salvo = rpmt.salvaMoto(moto);
		if (salvo){
			System.out.println("Salvo com Sucesso!");
		}
    }

    public static void listarMotos(){
        List<Moto> listamt = new ArrayList<Moto>();


        System.out.println("---------------------------------------------------------");
		System.out.println("Temos as Seguintes Motos no Estoque:");

        listamt = rpmt.listarMoto();
        for (Moto moto:listamt){
            System.out.println("");
            System.out.println("Id: "+moto.getId());
            System.out.println("Modelo: "+moto.getModelo());
            System.out.println("Cor: "+moto.getCor());
            System.out.println("Placa: "+moto.getPlaca());
            System.out.println("Kilometragem: "+moto.getKilometragem());
            System.out.println("Historicos: "+moto.getHistorico());
            System.out.println("---------------------------------------------------------");
        }
    }


/* ---------- METODOS CARRO ---------- */
    public static void alterarCarro(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Carro carro = new Carro();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID que deseja Alterar?");
        Id = s.nextInt();
        carro.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        carro.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        carro.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        carro.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        carro.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        carro.setHistorico(Historico);

        salvo = rpcr.salvaCarro(carro);
        
        if (salvo){
            System.out.println(carro.getModelo()+"Salvo com Sucesso!");
        }
    }

    public static void popularArrayCarro(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Carro carro = new Carro();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID?");
        Id = s.nextInt();
        carro.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        carro.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        carro.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        carro.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        carro.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        carro.setHistorico(Historico);

        
		salvo = rpcr.salvaCarro(carro);
		if (salvo){
			System.out.println("Salvo com Sucesso!");
		}
    }

    public static void listarCarros(){
        List<Carro> listacr = new ArrayList<Carro>();


        System.out.println("---------------------------------------------------------");
		System.out.println("Temos os Seguintes Carros no Estoque:");

        listacr = rpcr.listarCarro();
        for (Carro carro:listacr){
            System.out.println("");
            System.out.println("Id: "+carro.getId());
            System.out.println("Modelo: "+carro.getModelo());
            System.out.println("Cor: "+carro.getCor());
            System.out.println("Placa: "+carro.getPlaca());
            System.out.println("Kilometragem: "+carro.getKilometragem());
            System.out.println("Historicos: "+carro.getHistorico());
            System.out.println("---------------------------------------------------------");
        }
    }


/* ---------- METODOS CAMINHAO ---------- */
    public static void alterarCaminhao(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Caminhao caminhao = new Caminhao();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID que deseja Alterar?");
        Id = s.nextInt();
        caminhao.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        caminhao.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        caminhao.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        caminhao.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        caminhao.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        caminhao.setHistorico(Historico);

        salvo = rpcm.salvaCaminhao(caminhao);
        
        if (salvo){
            System.out.println(caminhao.getModelo()+"Salvo com Sucesso!");
        }
    }  

    public static void popularArrayCaminhao(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Caminhao caminhao = new Caminhao();
        boolean salvo;
        int Id;
        String Modelo;
        String Cor;
        String Placa;
        int Kilometragem;
        String Historico;

        System.out.println("Qual o ID?");
        Id = s.nextInt();
        caminhao.setId(Id);

        System.out.println("Qual o Modelo?");
        Modelo = s1.nextLine();
        caminhao.setModelo(Modelo);

        System.out.println("Qual a Cor?");
        Cor = s1.nextLine();
        caminhao.setCor(Cor);

        System.out.println("Qual a Placa?");
        Placa = s1.nextLine();
        caminhao.setPlaca(Placa);

        System.out.println("Qual a Kilometragem?");
        Kilometragem = s.nextInt();
        caminhao.setKilometragem(Kilometragem);

        System.out.println("Qual o Historico de Batidas?");
        Historico = s1.nextLine();
        caminhao.setHistorico(Historico);

        
		salvo = rpcm.salvaCaminhao(caminhao);
		if (salvo){
			System.out.println("Salvo com Sucesso!");
		}
    }

    public static void listarCaminhaos(){
        List<Caminhao> listacm = new ArrayList<Caminhao>();


        System.out.println("---------------------------------------------------------");
		System.out.println("Temos os Seguintes Caminhoes no Estoque:");

        listacm = rpcm.listarCaminhao();
        for (Caminhao caminhao:listacm){
            System.out.println("");
            System.out.println("Id: "+caminhao.getId());
            System.out.println("Modelo: "+caminhao.getModelo());
            System.out.println("Cor: "+caminhao.getCor());
            System.out.println("Placa: "+caminhao.getPlaca());
            System.out.println("Kilometragem: "+caminhao.getKilometragem());
            System.out.println("Historicos: "+caminhao.getHistorico());
            System.out.println("---------------------------------------------------------");
        }
    }
}
