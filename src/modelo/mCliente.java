/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ortiz
 */
public class mCliente {
    private int id_client;
    private String dni_clien;
    private String nombr_clien;
    private String apell_clien;
    private String email_clien;
    private String telef_clien;
    public  mCliente(){
        
    }
    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    /**
     * @return the dni_clien
     */
    public String getDni_clien() {
        return dni_clien;
    }

    /**
     * @param dni_clien the dni_clien to set
     */
    public void setDni_clien(String dni_clien) {
        this.dni_clien = dni_clien;
    }

    /**
     * @return the nombr_clien
     */
    public String getNombr_clien() {
        return nombr_clien;
    }

    /**
     * @param nombr_clien the nombr_clien to set
     */
    public void setNombr_clien(String nombr_clien) {
        this.nombr_clien = nombr_clien;
    }

    /**
     * @return the apell_clien
     */
    public String getApell_clien() {
        return apell_clien;
    }

    /**
     * @param apell_clien the apell_clien to set
     */
    public void setApell_clien(String apell_clien) {
        this.apell_clien = apell_clien;
    }

    /**
     * @return the email_clien
     */
    public String getEmail_clien() {
        return email_clien;
    }

    /**
     * @param email_clien the email_clien to set
     */
    public void setEmail_clien(String email_clien) {
        this.email_clien = email_clien;
    }

    /**
     * @return the telef_clien
     */
    public String getTelef_clien() {
        return telef_clien;
    }

    /**
     * @param telef_clien the telef_clien to set
     */
    public void setTelef_clien(String telef_clien) {
        this.telef_clien = telef_clien;
    }
}
