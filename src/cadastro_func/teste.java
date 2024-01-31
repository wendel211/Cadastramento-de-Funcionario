///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package cadastro_func;
//
//
///*
// * @author Wendel Muniz
// */
//import java.util.ArrayList;
//import java.util.List;
//
//import entities.Subordinado;
//import entities.Chefe;
//import entities.Funcionario;
//
//
//
//public class teste {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//
//		int countChefe = 1;
//		int counSubordinado = 0;
//		List<Chefe> listaChefe = new ArrayList<>();
//		List<Subordinado> listaSubordinado = new ArrayList<>();
//
//		// chefe = id | nome | funcao | tipo
//
//
//	
//
//		// Chefe f1 = new Chefe(countChefe, "Paulo", "Tecnico");
//		// countChefe++;
//		// Chefe f2 = new Chefe(countChefe, "Paulo02", "Tecnico");
//		// countChefe++;
//		
//
//		// Criar os subordinados instanciados a partir da classe subordinado com o usuario definindo o nome e a funcao
//
//		Subordinado s1 = new Subordinado(counSubordinado, "Bruno", "Professor");
//		counSubordinado++;
//		Subordinado s2 = new Subordinado(counSubordinado, "Wendel", "Tecnico");
//		counSubordinado++;
//		Subordinado s3 = new Subordinado(counSubordinado, "Marcos", "Professor");
//		counSubordinado++;
//		Subordinado s4 = new Subordinado(counSubordinado, "Kaio", "Tecnico");
//		counSubordinado++;
//		Subordinado s5 = new Subordinado(counSubordinado, "Shazam", "Professor");
//		counSubordinado++;
//
//
//		// Definir o chefe de cada subordinado
//
//		s1.setIdChefe(1);
//		s2.setIdChefe(1);
//		s3.setIdChefe(2);
//		s4.setIdChefe(2);
//		s5.setIdChefe(3);
//
//		
//
//		// Adicionar os chefes e subordinados nas listas
//
//		// listaChefe.add(f1);
//		// listaChefe.add(f2);
//            listaSubordinado.add(s1);
//            listaSubordinado.add(s2);
//            listaSubordinado.add(s3);
//            listaSubordinado.add(s4);
//            listaSubordinado.add(s5);
//	
//
//		// Imprimir os subordinados de cada chefe
//
//		imprimirSubordinadosDoChefe(1,  listaSubordinado);
//		imprimirSubordinadosDoChefe(2,  listaSubordinado);
//		imprimirSubordinadosDoChefe(3,  listaSubordinado);
//
//	}
//public static void imprimirSubordinadosDoChefe(int idChefe, List<Subordinado>  listaSubordinado) {
//	System.out.println("Imprimir subordinado do chefe N°" + idChefe);
//	listaSubordinado.forEach(item -> {
//		if(item.getIdChefe() != null && item.getIdChefe() == idChefe) {
//			System.out.println(item);
//
//		}			
//	});
//}
//}
//
//
//
//	
//	// Metodo para imprimir os subordinados de cada chefe
//
//
//
//
//// public static void imprimirSubordinadosDoChefe(int idChefe, List<Funcionario> listaFuncionarios) {
//// 	System.out.println("Imprimir 02 subordinado do chefe N°" + idChefe);
//// 	listaFuncionarios.forEach(item -> {
//// 		if(item.getIdChefe() != null && item.getIdChefe() == idChefe) {
//// 			System.out.println(item);
//
//// 		}			
//// 	});
//// }
//// }
//
//
