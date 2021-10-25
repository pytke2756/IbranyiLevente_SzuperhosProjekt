package hu.petrik;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    private Random rnd = new Random();

    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if (this.mekkoraAzEreje() > 1000){
            return true;
        }
        return false;
    }

    @Override
    public void kutyuKeszit() {
        this.setSzuperero(rnd.nextDouble() * 10);
    }

    @Override
    public String toString() {
        String gyengeseg = this.isVanEGyengesege() ? "Van" : "Nincs";
        return String.format("Vasember:\nSzupererő: %f\n%s gyengesége",this.mekkoraAzEreje(), gyengeseg);
    }
}
