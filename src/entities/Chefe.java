/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wendel Muniz
 */
public class Chefe extends Funcionario{
   
	//CRIAR ARRAYLIST DE CFHEES TOTAIS
	
	
	private String funcao;
	public String idSubordinado;
      public String nomeFunc;
	private final String tipo = "CHEFE"; 
	public String TodosChefes;
	

	public Chefe(String id, String nome, String funcao ) {
            super(id, nome, funcao);
            this.funcao = funcao;
		this.TodosChefes = TodosChefes;
	}
        
        @Override
        public String getFuncao() {
            return funcao;
	}

        @Override
	public void setFuncao(String funcao) {
            this.funcao = funcao;
	}

        @Override
	public String getnomeFunc() {
		return nomeFunc;
	}

        @Override
	public void setnomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getIdSubordinado() {
		return idSubordinado;
	}

	public void setIdSubordinado(String idSubordinado) {
		this.idSubordinado = idSubordinado;
	}
        
	public String getTipo(){
            return tipo;
	}

	@Override
	public String toString() {
		return "Chefe [funcao=" + ", tipo=" + tipo + " nome=" +nome+"]";
	}

}
    
