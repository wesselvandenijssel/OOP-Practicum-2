public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    // Constructor with parameters
    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    // Default constructor
    public Zwembad() {
        // Default values or you can leave it empty
    }

    // Getter methods
    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    // Setter methods
    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    // Method to calculate and return the inhoud (volume) of the zwembad
    public double inhoud() {
        return breedte * lengte * diepte;
    }

    // toString method to display the details of the zwembad
    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}
