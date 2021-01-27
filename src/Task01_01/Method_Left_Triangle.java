package Task01_01;

public class Method_Left_Triangle {
    private double step = 0.1;

    public double integrate(TaskIntegrate x, double a, double b){
        double result = 0.0;
        double n = ((b - a) / step);
        for(int i = 0; i < n; i++){
            result = result + x.getDouble(a + step * (i + step));
        }
        return result * step;
    }
}
