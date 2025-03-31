public class Krug extends GeometrijskiLik{

    private double radijus;

    public Krug(String naziv, double radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    public double getRadijus() {
        return radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }

    @Override
    public double povrsina() {
        return 0;
    }

    @Override
    public double opseg() {
        return 0;
    }
}
