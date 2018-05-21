/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaPadaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
public class Sistema {

    int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1 - Cliente"
            + "\n2 - Produtos"
            + "\n3 - Funcionário"
            + "\n4 - Entregas"
            + "\n5 - Sair"));
    
    while(menu != 5){
        switch(menu){
            
        }
}
}
