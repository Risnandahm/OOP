Package Hewan;

public class Hewan {
    String id;
    String pemilik;
    boolean statusPenitipan;
    
    void info(String id, String pemilik){
        this.id = id;
        this.pemilik = pemilik;
        System.out.println("Info Hewan : \n"+"ID : "+id+"\n"+"Pemilik : "+pemilik);
    }
    
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        System.out.println("Status Hewan : ");
        return true;       
    }
    
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Anjing anjing = new Anjing(true);
        Ikan ikan = new Ikan(false);
        
        hewan.info("18090127", "Faqih Zada I");
        hewan.status(true);
        System.out.println("Status Suntik Rabies : "+anjing.statusSuntikRabies);
        System.out.println("Status Ganti Air : "+ikan.statusGantiAir);
    }
    
}