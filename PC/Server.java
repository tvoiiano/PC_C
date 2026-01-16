public class Server extends PCFisso{
    private int numProcessori;
    private boolean presenzaRAID;
    
    public Server(String processore, int ram, int memoria, String marca, String modello, String so, String tipocase,
            int numProcessori, boolean presenzaRAID) {
        super(processore, ram, memoria, marca, modello, so, tipocase);
        this.numProcessori = numProcessori;
        this.presenzaRAID = presenzaRAID;
    }

    public int getNumProcessori() {
        return numProcessori;
    }

    public void setNumProcessori(int numProcessori) {
        this.numProcessori = numProcessori;
    }

    public boolean isPresenzaRAID() {
        return presenzaRAID;
    }

    public void setPresenzaRAID(boolean presenzaRAID) {
        this.presenzaRAID = presenzaRAID;
    }

    public String toString() {
        String s = ""; 
        
        s = super.toString();
        s += "Numero di processori: " + numProcessori + "\nPresente dischi di tipo RAID? " + presenzaRAID + "\n";
        
        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Server other = (Server) obj;
        if (numProcessori != other.numProcessori)
            return false;
        if (presenzaRAID != other.presenzaRAID)
            return false;
        return true;
    }
}
