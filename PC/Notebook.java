public class Notebook extends PCPortatile {
    private boolean presenzaWebcam;
    private int risoluzione;
    
    public Notebook(String processore, int ram, int memoria, String marca, String modello, String so, int peso,
            int altezza, int larghezza, int profondita, int dimVideo, boolean presenzaReteWireless,
            boolean presenzaWebcam, int risoluzione) {
        super(processore, ram, memoria, marca, modello, so, peso, altezza, larghezza, profondita, dimVideo,
                presenzaReteWireless);
        this.presenzaWebcam = presenzaWebcam;
        if(presenzaWebcam) {
            this.risoluzione = risoluzione;
        }
    }

    public Notebook(String processore, int ram, int memoria, String marca, String modello, String so, int peso,
            int altezza, int larghezza, int profondita, int dimVideo, boolean presenzaReteWireless,
            boolean presenzaWebcam) {
        super(processore, ram, memoria, marca, modello, so, peso, altezza, larghezza, profondita, dimVideo,
                presenzaReteWireless);
        this.presenzaWebcam = presenzaWebcam;
    }

    public boolean isPresenzaWebcam() {
        return presenzaWebcam;
    }

    public void setPresenzaWebcam(boolean presenzaWebcam) {
        this.presenzaWebcam = presenzaWebcam;
        if(!presenzaWebcam) {
            this.risoluzione = 0;
        }
    }

    public int getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(int risoluzione) {
        this.risoluzione = risoluzione;
    }

    public String toString() {
        String s = "";

        s = super.toString();
        s += "\nPresente webcam? " + presenzaWebcam + "\n";
        if(presenzaWebcam) {
            s += "Risoluzione (in MP): " + risoluzione + "\n";
        }
        
        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (presenzaWebcam != other.presenzaWebcam)
            return false;
        return true;
    }
}
