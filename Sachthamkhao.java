
package Thuvien;

public class Sachthamkhao extends Sach{
    private int thue;

    public Sachthamkhao(int thue,String masach, String ngaynhap, int dongia, int soluong, String nxb) {
        super(masach,  ngaynhap,  dongia,  soluong, nxb);
        this.thue = thue;
    }
    public Sachthamkhao() {
        super();
        this.thue = 0;
    }


    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }
    
    @Override
        public String toString(){
            String st="";
            st+=super.toString();
            st+=this.thue+"\t\t";
            return st;
        }    
    
}
