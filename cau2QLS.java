import java.util.*;

class Sach {
    private String tacgia;
    private String tensach;
    private String nxb;
    private String namxb;
    private boolean status;

    public Sach() {

    }

    public Sach(Sach a) {
        this.tacgia = a.getTacgia();
        this.tensach = a.getName();
        this.nxb = a.getNxb();
        this.namxb = a.getNamxb();
        this.status = a.checkBook();
    }

    public Sach(String tacgia, String tensach, String nxb, String namxb, boolean status) {
        this.tacgia = tacgia;
        this.tensach = tensach;
        this.nxb = nxb;
        this.namxb = namxb;
        this.status = status;
    }

    public String getTacgia() {
        return tacgia;
    }

    public String getName() {
        return this.tensach;
    }

    public boolean checkBook() {
        return status;
    }

    public String getNxb() {
        return this.nxb;
    }

    public String getNamxb() {
        return this.namxb;
    }

    public void giveBack() {
        this.status = true;
    }

    public void borrowBook() {
        this.status = false;
    }

    public void ShowBook() {
        System.out.println("Ten sach: " + this.tensach);
        System.out.println("Ten tac gia: " + this.tacgia);
        System.out.println("Nha xuat ban: " + this.nxb);
        System.out.println("Nam xuat ban: " + this.namxb);
        System.out.println("trang thai: " + this.status);
    }

    public void Show() {
        System.out.println("Ten sach: " + this.tensach);
        System.out.println("Ten tac gia: " + this.tacgia);
        System.out.println("Nha xuat ban: " + this.nxb);
        System.out.println("Nam xuat ban: " + this.namxb);
    }
}

class Ban_Doc {
    private String name;
    private String address;
    private Sach[] s;

    public Ban_Doc() {

    }

    public Ban_Doc(String name, String address, Sach[] s) {
        this.name = name;
        this.address = address;
        this.s = s;
    }

    public void show() {
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                s[i].Show();
                if (i != s.length - 1) {
                    System.out.println("----------------------------");
                }
            }
        } else {
            System.out.println("Sach da duoc tra het");
        }
    }

    public void ShowTT() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("----Thong tin sach muon----");
        this.show();
    }

    public void borrow(Sach[] libary) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < libary.length; j++) {
                if ((libary[j].getName()).equals((s[i].getName()))) {
                    libary[j].borrowBook();
                    s[i].borrowBook();
                }
            }
        }
    }

    public void giveBack(Sach[] libary) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < libary.length; j++) {
                if ((libary[j].getName()).equals((s[i].getName()))) {
                    libary[j].giveBack();
                    s[i].giveBack();
                }
            }
        }
        this.s = null;
    }
}

public class cau2QLS {
    static Sach[] Muon(Sach[] libary) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so sach muon muon: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("nhap ten sach muon muon: ");
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.nextLine();
        }
        // Sach[] ls = new Sach[3];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < libary.length; j++) {
                if ((libary[j].getName()).equals(s[i]) && libary[j].checkBook() == true) {
                    // ls[count] = new Sach(libary[j]);
                    count++;
                }
            }
        }
        Sach[] ls = new Sach[count];
        count = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = 0; j < libary.length; j++) {
                if ((libary[j].getName()).equals(s[i]) && libary[j].checkBook() == true) {
                    ls[count] = new Sach(libary[j]);
                    count++;
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        Sach[] libary = new Sach[7];
        libary[0] = new Sach("a", "ab", "b", "2010", true);
        libary[1] = new Sach("a", "abc", "b", "2020", true);
        libary[2] = new Sach("b", "ad", "b", "2022", true);
        libary[3] = new Sach("b", "abd", "b", "2019", true);
        libary[4] = new Sach("b", "abe", "b", "2019", true);
        libary[5] = new Sach("b", "bbd", "b", "2019", false);
        libary[6] = new Sach("d", "bbd", "e", "2020", true);
        String name = "Duong Van Quang";
        String address = "Bac Ninh";
        Sach[] s = Muon(libary);
        // System.out.println(s.length);
        // for (int i = 0; i < s.length; i++) {
        // s[i].ShowBook();
        // }
        Ban_Doc a = new Ban_Doc(name, address, s);
        a.borrow(libary);
        System.out.println("\n-------------Thong tin muon sach---------------");
        a.ShowTT();
        a.giveBack(libary);
        System.out.println("\n-------------Thong tin tra sach---------------");
        a.ShowTT();
    }
}
