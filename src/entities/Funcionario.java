/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wendel Muniz
 */
public abstract class Funcionario {

	  public String nome;
	  public String nomeFunc;
        public String Habilitacao;
        public String funcao;

	public Funcionario(String nomeFunc, String nome, String funcao) {
            this.nomeFunc = nomeFunc;
            this.nome = nome;
            this.funcao = funcao;
	}
          
        public Funcionario() {
     
	}

        public void setnomeFunc(String nomeFunc) {
            this.nomeFunc = nomeFunc;
        }
        
	public String getnomeFunc() {
            return nomeFunc;
	}
        
        public String getFuncao() {
            return funcao;
	}

	public void setFuncao(String funcao) {
            this.funcao = funcao;
	}

	public String getNome() {
            return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String habilitacao() {
            if (this instanceof Chefe) {
		return "Chefe";
	}
	else if (this instanceof Subordinado) {
            return "Subordinado";
	}
	return Habilitacao;
    }

}