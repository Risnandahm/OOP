package Hewan;

public class Anjing extends Hewan{
    boolean statusSuntikRabies;
    
    public Anjing(boolean statusSuntikRabies){
        this.statusSuntikRabies = statusSuntikRabies;
    }
    
    @Override
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        return true;
    }
    
}