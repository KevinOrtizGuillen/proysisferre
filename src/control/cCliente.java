/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.mCliente;


/**
 *
 * @author Ortiz
 */
public class cCliente {
    cConexion con=new cConexion();
    Connection cn;
    public int totaldeResgistros=0;
    String sql="";
    //
    public DefaultTableModel buscaCliente(mCliente dato){
    DefaultTableModel modelo;    
    String[] titulos={"id_clien","dni_clien","nombr_clien","apell_clien","email_clien","telef_clien"};
    String[] registro=new String[titulos.length];
    modelo=new DefaultTableModel(null,titulos);
      try {
          sql="execute BUSCAR_CLIENTE ?,?";//DNI,NOMBRE
          cn=con.Conectar();
          PreparedStatement pst=cn.prepareStatement(sql);
          pst.setString(1,dato.getDni_clien());
          pst.setString(2, dato.getNombr_clien());
          ResultSet rs=pst.executeQuery(); 
          while(rs.next()){ 
            registro[0]=rs.getString("id_clien");
            registro[1]=rs.getString("dni_clien");
            registro[2]=rs.getString("nombr_clien");
            registro[3]=rs.getString("apell_clien");
            registro[4]=rs.getString("email_clien");
            registro[5]=rs.getString("telef_clien");            
            totaldeResgistros++;
            modelo.addRow(registro);
          }
          cn=con.Desconectar();        
                
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      }  
  return modelo;
  }
}
