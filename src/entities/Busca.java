/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import cadastro_func.tela_cadastro;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *
 * @author 
 */
public class Busca extends tela_cadastro{
    
    public String y, x;

    public void buscar(JComboBox<String> jRbuscar, JComboBox<String> jRnome, JTextArea jBuscados, JComboBox<String> jChefeIme){
        
        String habilitacao =(String) jRbuscar.getSelectedItem();
        String selNome = (String) jRnome.getSelectedItem(); 
        String selChefe = (String) jChefeIme.getSelectedItem();

        for(Chefe item:listaChefe){
            if(item.getNome().equals(selNome)){
                y = item.getNome();
                x = item.getTipo();
            }
        }

        for(Subordinado item:listaSubordinado){
            if(item.getNome().equals(selNome)){
                y = item.getNome();
                x = item.getTipo();
            }
        }    

        if(habilitacao.equals("Chefe")){
            
    

            if(selNome.equals("Jener de Souza Novais")){
                listaChefe.forEach(item -> {
                        jBuscados.append(null);
                }); 
          }

            else if(y.equals(selNome) && x.equals("SUBORDINADO")){
                listaSubordinado.forEach(item -> {
                    if(item.getNome().equals(y)){
                        jBuscados.append(item.getIdChefe()+"\n");
                    }
                });
                listaChefe.forEach(item -> {
                    if(item.getNome().equals(selChefe) && item.getNome()!=(selNome)){
                        jBuscados.append(item.getIdSubordinado()+"\n");
                    }
                });
                
            }
             
            else if(y.equals(selNome) && x.equals("CHEFE")){


            // aparecer o nome dos chefes do funcionario selecionado
                listaChefe.forEach(item -> {
                    if(item.getNome().equals(y)){
                        jBuscados.append(item.getIdSubordinado()+"\n");
                    }
                });

                listaChefe.forEach(item -> {
                    if(item.getNome().equals(selChefe)){
                        jBuscados.append(item.getIdSubordinado()+"\n");
                    }
                });
                listaChefe.forEach(item -> {
                    if(item.getIdSubordinado().equals(selChefe) && item.getNome() == selChefe){
                        jBuscados.append(item.getIdSubordinado()+"\n");
                    }
                });
            

        
            }

        }else if(habilitacao.equals("Subordinado")){
            listaSubordinado.forEach(item -> {
                if(item.getIdChefe().equals(selNome)){
                    jBuscados.append(item.getNome()+"\n");
                }
            });
            listaChefe.forEach(item -> {
                if(item.getIdSubordinado().equals(selNome)){
                    jBuscados.append(item.getNome()+"\n");
                }
            });
        }
    }   
}
