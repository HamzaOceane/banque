package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Compte implements Serializable {

    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private Client client;
    private Employe employe;
    private Collection<Operation> operations;

    /**
     * @return the codeCompte
     */
    public String getCodeCompte() {
        return codeCompte;
    }

    /**
     * @param codeCompte
     *            the codeCompte to set
     */
    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation
     *            the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde
     *            the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client
     *            the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the employe
     */
    public Employe getEmploye() {
        return employe;
    }

    /**
     * @param employe
     *            the employe to set
     */
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    /**
     * @return the operations
     */
    public Collection<Operation> getOperations() {
        return operations;
    }

    /**
     * @param operations
     *            the operations to set
     */
    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }

    /**
     * 
     */
    public Compte() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param codeCompte
     * @param dateCreation
     * @param solde
     */
    public Compte(String codeCompte, Date dateCreation, double solde) {
        super();
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

}
