package formbarang;

public class barang {
    public String kd, nm;
    public int jml;
    public double hrg, ttl, ub, uk;
    
    public void setKD(String val){
        kd = val;
    }
        
    public String getKD(){
        return kd;
    }
    
    public void setSeleksiKD(){
        if (kd.equalsIgnoreCase("B001")){
            nm = "Pensil";
            hrg = 3000;
        }
        else if (kd.equalsIgnoreCase("B002")){
            nm = "Buku";
            hrg = 5000;
        }
        else if (kd.equalsIgnoreCase("B003")){
            nm = "Penggaris";
            hrg = 1000;
        }
        else if (kd.equalsIgnoreCase("B004")){
            nm = "Penghapus";
            hrg = 500;
        }else {
            nm = "";
            hrg = 0;
        }
    }
    
    public void setNm(String val){
        nm = val;
    }
    
    public String getNm(){
        return nm;
    }
    
    public void setHrg(double val){
        hrg = val;
    }
    
    public double getHrg(){
        return hrg;
    }
    
    public void setJml(int val){
        jml = val;
    }
    
    public int getJml(){
        return jml;
    }
    
    public double getTot(){
        ttl = hrg * jml;
        return ttl;        
    }
    
    public void setUb(double val){
        ub = val;
    }
    
    public double getUb(){
        return ub;
    }
    
    public double getUk(){
        return (ub-ttl);
    }
}