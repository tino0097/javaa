
package Thuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySach {
    ArrayList<Sachgiaokhoa> listsgk=new ArrayList();
    ArrayList<Sachthamkhao> liststk=new ArrayList();
    Scanner sc=new Scanner(System.in);
    
       public Sachgiaokhoa sgk1(){
       String masach=sc.nextLine();
       String ngaynhap=sc.nextLine();
       int dongia=sc.nextInt();
       sc.nextLine();
       int soluong=sc.nextInt();
       sc.nextLine();
       String nxb=sc.nextLine();
       String tt=sc.nextLine();
       
       Sachgiaokhoa sgk=new Sachgiaokhoa(tt,masach, ngaynhap,dongia,soluong,nxb);
      // listsgk.add(sgk);
      return sgk;
       }
       public void nhap(){
          String traloi;
           do{
            this.listsgk.add(this.sgk1());
            System.out.println("BAN CO MUON NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
       }
       public void xuatsgk(){
        System.out.println("MASACH\t\tNGAYNHAP\t\tDONGIA\t\tSOLUONG\t\tNHASANXUAT\t\tTINHTRANG");
        for(int i=0;i<listsgk.size();i++){
            System.out.println(listsgk.get(i).toString());
        }
    }
       public void sachthamkhao(){
       String traloi;
       do{
       String masach=sc.nextLine();
       String ngaynhap=sc.nextLine();
       int dongia=sc.nextInt();
       int soluong=sc.nextInt();
       sc.nextLine();
       String nxb=sc.nextLine();
       int thue=sc.nextInt();
       
       Sachthamkhao stk=new Sachthamkhao(thue,masach, ngaynhap,dongia,soluong,nxb);
       liststk.add(stk);
            System.out.println("BAN CO MUON NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
}
    
    
   public void xuatstk(){
        System.out.println("MASACH\t\tNGAYNHAP\t\tDONGIA\t\tSOLUONG\t\tNHASANXUAT\t\tTHUE");
        for(int i=0;i<liststk.size();i++){
            System.out.println(liststk.get(i).toString());
        }
    }
    
    public double thanhtiensgk(){
        double d=0;
        double c=0;
        System.out.println("THANH TIEN: ");
        for(int i=0;i<listsgk.size();i++){
        if("moi".equals(listsgk.get(i).getTt()))
        {
           
            int a= listsgk.get(i).getSoluong()*listsgk.get(i).getDongia();
            c=c+a;
        }
        else if("cu".equals(listsgk.get(i).getTt()))
        {
            int b= ((listsgk.get(i).getSoluong()*listsgk.get(i).getDongia()*50));
            int e=100;
             d+=(double)b/e;
        }
        else
               return 0;
        }
        return d+c;
}
    public double thanhtientk(){
        int b=0;
        System.out.println("THANH TIEN");
        for(int i=0;i<liststk.size();i++){
            int a=(liststk.get(i).getSoluong()*liststk.get(i).getDongia()+liststk.get(i).getThue());
               b+=a;
        }
        return b;
    }
        public double trungbinhcongdongiastk(){
            int c=0;
            double d = 0;
        System.out.println("THANH TIEN");
        for(int i=0;i<liststk.size();i++){
            int b=(liststk.get(i).getSoluong()*liststk.get(i).getDongia()+liststk.get(i).getThue());
            c+=b; 
            d=(double)c/liststk.size();
        }
        return d;
        
    }
        
        
    
    
    
}
