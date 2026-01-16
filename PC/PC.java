public class PC {
    protected String processore;
    protected int ram;
    protected int memoria;
    protected String marca;
    protected String modello;
    protected String so;

    public PC(String processore, int ram, int memoria, String marca, String modello, String so) {
        this.processore = processore;
        this.ram = ram;
        this.memoria = memoria;
        this.marca = marca;
        this.modello = modello;
        this.so = so;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
    
    public String toString() {
        return "Tipo di processore: " + processore + "\nDimensione della memoria RAM:" + ram + 
        "GB\nDimensione della memoria: " + memoria + "\nMarca: " + marca +
        "\nModello: " + modello + "\nSistema operativo: " + so + "\n";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PC other = (PC) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modello == null) {
            if (other.modello != null)
                return false;
        } else if (!modello.equals(other.modello))
            return false;
        if (so == null) {
            if (other.so != null)
                return false;
        } else if (!so.equals(other.so))
            return false;
        return true;
    }
}