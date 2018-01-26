package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {

    private Long codeClient;
    private String nomClient;
    private String adresseClient;
    private Collection<Compte> comptes;

    /**
     * @return the codeClient
     */
    public Long getCodeClient() {
        return codeClient;
    }

    /**
     * @param codeClient
     *            the codeClient to set
     */
    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    /**
     * @return the nomClient
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * @param nomClient
     *            the nomClient to set
     */
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    /**
     * @return the adresseClient
     */
    public String getAdresseClient() {
        return adresseClient;
    }

    /**
     * @param adresseClient
     *            the adresseClient to set
     */
    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    /**
     * @return the comptes
     */
    public Collection<Compte> getComptes() {
        return comptes;
    }

    /**
     * @param comptes
     *            the comptes to set
     */
    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    /**
     * @param nomClient
     * @param adresseClient
     */
    public Client(String nomClient, String adresseClient) {
        super();
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
    }

    /**
     * 
     */
    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

}
