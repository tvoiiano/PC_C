public class TestPC {
    public static void main(String[] args) {
        PC pc1 = new PC("gyat", 128, 1000, "gyatter", "gyatting", "Windows");
        PC pc2 = new PC("gyat", 128, 1000, "gyatter", "gyatting", "Windows");
        PCFisso pcf1 = new PCFisso("gyat", 128, 1000, "gyatter", "gyatting", "Windows", "grande");
        Desktop d1 = new Desktop("gyat", 128, 1000, "gyatter", "gyatting", "Windows", "grande", "idk", "yeah");
        Server s1 = new Server("gyat", 128, 1000, "gyatter", "gyatting", "Windows", "grande", 8, false);
        PCPortatile pcp1 = new PCPortatile("gyat", 128, 1000, "gyatter", "gyatting", "Windows", 10, 10, 10, 10, 15, true);
        Notebook n1 = new Notebook("gyat", 128, 1000, "gyatter", "gyatting", "Windows", 10, 10, 10, 10, 15, true, true);
        Notebook n2 = new Notebook("gyat", 128, 1000, "gyatter", "gyatting", "Windows", 10, 10, 10, 10, 15, true, true);
        Palmare p1 = new Palmare("gyat", 128, 1000, "gyatter", "gyatting", "Windows", 10, 10, 10, 10, 15, true, false, "SuckDick");

        System.out.println(pc1);

        System.out.println("--------------------------------\n");

        InventarioPC inventario = new InventarioPC();

        inventario.aggiungiPC(pc1);
        inventario.aggiungiPC(pc2);
        inventario.aggiungiPC(pcf1);
        inventario.aggiungiPC(d1);
        inventario.aggiungiPC(s1);
        inventario.aggiungiPC(pcp1);
        inventario.aggiungiPC(n1);
        inventario.aggiungiPC(n2);
        inventario.aggiungiPC(p1);

        if(inventario.rimuoviPC(pc2)) {
            System.out.println("PC è stato rimosso.\n");
        }
        else {
            System.out.println("PC NON è stato rimosso.\n");
        }

        System.out.println("--------------------------------\n");

        int i = 1;
        for(PC x: inventario.cercaPerMarca("gyatter")) {
            System.out.println(i + ") " + x + "\n");
            i++;
        }

        System.out.println("--------------------------------\n");

        i = 1;
        for(PC x: inventario.cercaPerSistemaOperativo("Windows")) {
            System.out.println(i + ") " + x + "\n");
            i++;
        }

        System.out.println("--------------------------------\n");

        System.out.println(inventario.trovaPCConPiuRAM());

        System.out.println("--------------------------------\n");

        System.out.println(inventario.calcolaMediaRAM());

        System.out.println("--------------------------------\n");

        System.out.println(inventario.contaPortatiliConWifi());

        System.out.println("--------------------------------\n");

        System.out.println(inventario.contaServerConRaid());

        System.out.println("--------------------------------\n");

        System.out.println(inventario.trovaNotebookPiuLeggero());

        System.out.println("--------------------------------\n");

        i = 1;
        for(PC x: inventario.cercaPortatili(12, true)) {
            System.out.println(i + ") " + x);
            i++;
        }
    }
}
