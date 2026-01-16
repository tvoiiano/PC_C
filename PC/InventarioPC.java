import java.util.ArrayList;

public class InventarioPC {
    ArrayList<PC> inventario;

    public InventarioPC() {
        inventario = new ArrayList<>();
    }

    public ArrayList<PC> getInventario() {
        return inventario;
    }

    public void aggiungiPC(PC pc) {
        inventario.add(pc);
    }

    public boolean rimuoviPC(PC pc) {
        if(inventario.contains(pc)) {
            inventario.remove(pc);
            return true;
        }
        return false;
    }

    public ArrayList<PC> cercaPerMarca(String marca) {
        ArrayList<PC> lista = new ArrayList<>();

        for(PC x: inventario) {
            if(x.getMarca().equals(marca)) {
                lista.add(x);
            }
        }
        return lista;
    }

    public ArrayList<PC> cercaPerSistemaOperativo(String so) {
        ArrayList<PC> lista = new ArrayList<>();

        for(PC x: inventario) {
            if(x.getSo().equals(so)) {
                lista.add(x);
            }
        }
        return lista;
    }

    public PC trovaPCConPiuRAM() {
        if(inventario.isEmpty()) {
            return null;
        }
        
        PC pc = inventario.get(0);

        for(PC x: inventario) {
            if(x.getRam()>= pc.getRam()) {
                pc = x;
            }
        }
        return pc;
    }

    public double calcolaMediaRAM() {
        if(inventario.isEmpty()) {
            return 0;
        }

        double somma = 0;
        int i = 0;

        for(PC x: inventario) {
            somma += x.getRam();
            i++;
        }

        return somma/i;
    }

    public int contaPortatiliConWifi() {
        int i = 0;    
    
        for(PC x: inventario) {
            if(x instanceof PCPortatile) {
                if(((PCPortatile)x).isPresenzaReteWireless()) {
                    i++;
                }
            }
        }

        return i;
    }

    public int contaServerConRaid() {
        int i = 0;

        for(PC x: inventario) {
            if(x instanceof Server) {
                if(((Server)x).isPresenzaRAID()) {
                    i++;
                }
            }
        }

        return i;
    }

    public Notebook trovaNotebookPiuLeggero() {
        Notebook n = null;

        for(PC x: inventario) {
            if(x instanceof Notebook) {
                n = (Notebook)x;
                break;
            }
        }

        if(n == null) {
            return null;
        }

        for(PC x: inventario) {
            if(x instanceof Notebook) {
                if(((Notebook)x).getPeso() <= n.getPeso()) {
                    n = (Notebook)x;
                }
            }
        }

        return n;
    }

    public ArrayList<PC> cercaPortatili(double pesoMassimo, boolean richiedeWifi) {
        ArrayList<PC> lista = new ArrayList<>();

        for(PC x: inventario) {
            if(x instanceof PCPortatile) {
                if(((PCPortatile)x).getPeso() <= pesoMassimo) {
                    if(richiedeWifi == true ) {
                        if(((PCPortatile)x).isPresenzaReteWireless() == true) {
                            lista.add(x);
                        }
                    }
                    else {
                        lista.add(x);
                    }
                }
            }
        }

        return lista;
    }
}
