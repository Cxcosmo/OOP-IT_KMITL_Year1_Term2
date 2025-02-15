public class Fraction {
    public int topN ;
    public int btmN ;
    public String toFraction() {
        return topN + "/" + btmN ;
    }
    public String toFloat() {
        double x = (double)topN / btmN ;
        String str = Double.toString(x) ;
        return str ;
    }
    public void addFraction(Fraction f) {
        topN = btmN == f.btmN ? f.topN : topN * f.btmN + f.topN * btmN ;
        btmN = btmN == f.btmN ? btmN : btmN * f.btmN ;
    }
}
