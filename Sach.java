
package Thuvien;

public class Sach {
    private String masach;
    private String ngaynhap;
    private int dongia;
    private int soluong;
    private String nxb;

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public Sach(String masach, String ngaynhap, int dongia, int soluong, String nxb) {
        this.masach = masach;
        this.ngaynhap = ngaynhap;
        this.dongia = dongia;
        this.soluong = soluong;
        this.nxb = nxb;
    }
    
        public Sach() {
        this.masach = "";
        this.ngaynhap = "";
        this.dongia = 0;
        this.soluong = 0;
        this.nxb = "";
    }
        
    @Override
        public String toString(){
            String st="";
            st+=this.masach+"\t\t";
            st+=this.ngaynhap+"\t\t";
            st+=this.dongia+"\t\t";
            st+=this.soluong+"\t\t";
            st+=this.nxb+"\t\t";
            
            return st;
        }
    
    
}
