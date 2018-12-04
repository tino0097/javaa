
package Thuvien;

public class Sachgiaokhoa extends Sach {
    private String tt;

    public Sachgiaokhoa(String tt,String masach, String ngaynhap, int dongia, int soluong, String nxb) {
        super(masach,  ngaynhap,  dongia,  soluong, nxb);
        this.tt = tt;
    }
    public Sachgiaokhoa() {
        super();
        this.tt = "";
    }
    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
    
    @Override
        public String toString(){
            String st="";
            st+=super.toString();
            st+=this.tt+"\t\t";
            
            return st;
        }
}
