/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wendel Muniz
 */
public class Subordinado extends Funcionario{
    
        private String funcao;
        private String nomeFunc;
        public String idChefe;
        private final String tipo = "SUBORDINADO"; 
        
        
	public Subordinado(String id, String nome, String funcao) {
            super(id, nome, funcao);
            this.funcao = funcao;
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

	public String getIdChefe() {
		return idChefe;
	}

	public void setIdChefe(String idChefe) {
		this.idChefe = idChefe;
	}
        
        public String getTipo(){
		return tipo;
	}

	@Override
	public String toString() {
		return "Subordinado [funcao=, idChefe=" + idChefe + ", tipo=" + tipo + " nome=" +nome+"]";
	}
   
   
}
