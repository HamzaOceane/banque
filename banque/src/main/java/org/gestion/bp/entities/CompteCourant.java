package org.gestion.bp.entities;

public class CompteCourant extends Compte {

    private double decouvert;

    /**
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * @param decouvert
     *            the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

}
