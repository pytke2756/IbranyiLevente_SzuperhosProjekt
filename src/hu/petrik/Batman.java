package hu.petrik;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyuKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos.mekkoraAzEreje() < this.lelemenyesseg){
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return String.format("Batman:\nLeleményesség: %d",this.lelemenyesseg);

    }
}
