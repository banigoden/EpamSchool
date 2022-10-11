package by.epam.java_introduction.algorithmization.task34;

public class Fraction {
    int numer;
    int denom;
    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public String toString(){
        return String.format("%d/%d", numer, denom);
    }

}
