public class PCFisso extends PC{
    protected String tipocase;

    public PCFisso(String processore, int ram, int memoria, String marca, String modello, String so, String tipocase) {
        super(processore, ram, memoria, marca, modello, so);
        this.tipocase = tipocase;
    }

    public String getTipocase() {
        return tipocase;
    }

    public void setTipocase(String tipocase) {
        this.tipocase = tipocase;
    }

    public String toString() {
        String s = "";

        s = super.toString();
        s += "Tipo di case: " + tipocase + "\n";
        
        return s;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PCFisso other = (PCFisso) obj;
        if (tipocase == null) {
            if (other.tipocase != null)
                return false;
        } else if (!tipocase.equals(other.tipocase))
            return false;
        return true;
    }
}
