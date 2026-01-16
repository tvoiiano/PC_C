public class PCPortatile extends PC {
    protected int peso;
    protected int altezza;
    protected int larghezza;
    protected int profondita;
    protected int dimVideo;
    protected boolean presenzaReteWireless;
    
    public PCPortatile(String processore, int ram, int memoria, String marca, String modello, String so, int peso,
            int altezza, int larghezza, int profondita, int dimVideo, boolean presenzaReteWireless) {
        super(processore, ram, memoria, marca, modello, so);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimVideo = dimVideo;
        this.presenzaReteWireless = presenzaReteWireless;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getProfondita() {
        return profondita;
    }

    public void setProfondita(int profondita) {
        this.profondita = profondita;
    }

    public int getDimVideo() {
        return dimVideo;
    }

    public void setDimVideo(int dimVideo) {
        this.dimVideo = dimVideo;
    }

    public boolean isPresenzaReteWireless() {
        return presenzaReteWireless;
    }

    public void setPresenzaReteWireless(boolean presenzaReteWireless) {
        this.presenzaReteWireless = presenzaReteWireless;
    }

    public String toString() {
        String s = "";

        s = super.toString();
        s += "\nPeso: " + peso + "\nAltezza: " + altezza + "\nLarghezza: " + larghezza + "\nProfondità: " + 
        profondita + "\nDimesione del video (in pollici): " + dimVideo + "\nPresente l'interfaccia di rete wireless? " + 
        presenzaReteWireless + "\n";
        
        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PCPortatile other = (PCPortatile) obj;
        if (peso != other.peso)
            return false;
        if (altezza != other.altezza)
            return false;
        if (larghezza != other.larghezza)
            return false;
        if (profondita != other.profondita)
            return false;
        return true;
    }

    public boolean isPortatile() {
        return true;
    }
}