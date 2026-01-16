public class Palmare extends PCPortatile{
    private boolean presenzaBT;
    private String espansioneMemoria;
    
    public Palmare(String processore, int ram, int memoria, String marca, String modello, String so, int peso,
            int altezza, int larghezza, int profondita, int dimVideo, boolean presenzaReteWireless, boolean presenzaBT,
            String espansioneMemoria) {
        super(processore, ram, memoria, marca, modello, so, peso, altezza, larghezza, profondita, dimVideo,
                presenzaReteWireless);
        this.presenzaBT = presenzaBT;
        this.espansioneMemoria = espansioneMemoria;
    }

    public boolean isPresenzaBT() {
        return presenzaBT;
    }

    public void setPresenzaBT(boolean presenzaBT) {
        this.presenzaBT = presenzaBT;
    }

    public String getEspansioneMemoria() {
        return espansioneMemoria;
    }

    public void setEspansioneMemoria(String espansioneMemoria) {
        this.espansioneMemoria = espansioneMemoria;
    }

    public String toString() {
        String s = "";

        s = super.toString();
        s += "\nPresente l'interfaccia di Bluetooth? " + presenzaBT + "\nTipo di espansione della memoria di massa: " + espansioneMemoria + "\n";

        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Palmare other = (Palmare) obj;
        if (presenzaBT != other.presenzaBT)
            return false;
        return true;
    }
}
