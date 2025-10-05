import entities.Caminhao;
import entities.Carro;
import entities.Moto;
import entities.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro addcarro = new Carro();
        Moto addmoto = new Moto();
        Caminhao addcaminhao = new Caminhao();
        List<Veiculo> veiculos = new ArrayList<>();

        String parar = "";

        while(!parar.equalsIgnoreCase("não")){
            System.out.println("Qual tipo de veículo deseja cadastrar (carro/moto/caminhão):");
            String tipo = sc.nextLine();
            if(tipo.equalsIgnoreCase("carro")){
                System.out.println("Digite a placa do veículo:");
                String placaCarro = sc.nextLine();
                System.out.println("Digite a marca do veículo:");
                String marcaCarro = sc.nextLine();
                System.out.println("Digite o preço do veículo:");
                int precoCarro = sc.nextInt();
                System.out.println("Digite o número de portas do veículo:");
                int portasCarro = sc.nextInt();
                sc.nextLine();

                addcarro.setPlaca(placaCarro);
                addcarro.setMarca(marcaCarro);
                addcarro.setPreco(precoCarro);
                addcarro.setNumPortas(portasCarro);
                veiculos.add(addcarro);

                System.out.println("");
                System.out.println("Deseja adicionar outro veículo (sim/não)?");
                parar = sc.nextLine();
                System.out.println("");
            }
            else if(tipo.equalsIgnoreCase("moto")){
                System.out.println("Digite a placa do veículo:");
                String placaMoto = sc.nextLine();
                System.out.println("Digite a marca do veículo:");
                String marcaMoto = sc.nextLine();
                System.out.println("Digite o preço do veículo:");
                int precoMoto = sc.nextInt();
                System.out.println("Digite o número de cilindradas do veículo:");
                int cilindradasMoto = sc.nextInt();
                sc.nextLine();

                addmoto.setPlaca(placaMoto);
                addmoto.setMarca(marcaMoto);
                addmoto.setPreco(precoMoto);
                addmoto.setCilindradas(cilindradasMoto);
                veiculos.add(addmoto);

                System.out.println("");
                System.out.println("Deseja adicionar outro veículo (sim/não)?");
                parar = sc.nextLine();
                System.out.println("");
            }
            else if(tipo.equalsIgnoreCase("caminhão")){
                System.out.println("Digite a placa do veículo:");
                String placaCaminhao = sc.nextLine();
                System.out.println("Digite a marca do veículo:");
                String marcaCaminhao = sc.nextLine();
                System.out.println("Digite o preço do veículo:");
                int precoCaminhao = sc.nextInt();
                System.out.println("Digite a capacidade de carga do veículo em quilos:");
                double cargaCaminhao = sc.nextDouble();
                sc.nextLine();

                addcaminhao.setPlaca(placaCaminhao);
                addcaminhao.setMarca(marcaCaminhao);
                addcaminhao.setPreco(precoCaminhao);
                addcaminhao.setCapacidadeCarga(cargaCaminhao);
                veiculos.add(addcaminhao);

                System.out.println("");
                System.out.println("Deseja adicionar outro veículo (sim/não)?");
                parar = sc.nextLine();
                System.out.println("");
            }
            else {
                System.out.println("Digite um resposta válida");
                System.out.println("");
            }
        }

        System.out.println("Informações dos veículos registrados:");
        System.out.println("");
        for (Veiculo i : veiculos){
            i.mostrarDados();
            System.out.println("");
        }
        System.out.println("Programa encerrado.");
        sc.close();
        }
    }
