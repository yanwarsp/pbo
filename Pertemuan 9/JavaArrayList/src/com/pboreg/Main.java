package com.pboreg;

import java.util.ArrayList;

class DataMobil {
    private ArrayList<String> mobil = new ArrayList<String>();

    public void setMobil(String data) {
        this.mobil.add(data);
    }

    public void viewAll1() {
        System.out.println("List Mobil (For): ");
        for (int i = 0; i < mobil.size(); i++) {
            System.out.println("- " + mobil.get(i));
        }
    }

    public void viewAll2() {
        System.out.println("List Mobil (For Each): ");
        for (String data : mobil) {
            System.out.println("- " + data);
        }
    }

    public void cariData(String cari) {
        if (mobil.contains(cari)) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void gantiMobil(int index, String data) {
        this.mobil.set(index, data);
    }

    public void gantiMobil2(String dataAsli, String dataGanti) {
        System.out.println("Ganti");
        if (mobil.contains(dataAsli)) {
            System.out.println("Data ditemukan");
            int i = this.mobil.indexOf(dataAsli);
            this.mobil.set(i, dataGanti);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void hapusMobil(String dataAsli) {
        System.out.println("Hapus");
        if (mobil.contains(dataAsli)) {
            System.out.println("Data ditemukan");
            int i = this.mobil.indexOf(dataAsli);
            this.mobil.remove(dataAsli);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DataMobil dm = new DataMobil();
        dm.setMobil("Volvo");
        dm.setMobil("BMW");
        dm.setMobil("Opel");
        dm.viewAll1();
        dm.viewAll2();
        dm.cariData("Vol");
       // dm.gantiMobil(0, "Opel");
      //  dm.viewAll2();
        dm.gantiMobil2("BMW", "Mazda");
        dm.viewAll2();
        dm.hapusMobil("Mazda");
        dm.viewAll2();


    }
}
