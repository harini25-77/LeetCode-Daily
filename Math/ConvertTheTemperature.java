class Solution {
    public double[] convertTemperature(double celsius) {
        double k= celsius+273.15;
        double f= celsius * 1.80 + 32.00;
        double[] t= new double[2];
        t[0]=k;
        t[1]=f;
        return t;
    }
}
