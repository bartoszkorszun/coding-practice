class ALG {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java ALG <double>");
            return;
        }   
        if (args[0].indexOf('.') == -1) {
            System.out.println("Please enter a double value.");
            return;
        }

        try {
            double x = Double.parseDouble(args[0]);
            System.out.println(sqrt(x));   
        } catch (NumberFormatException e) {
            System.out.println("Please enter a double value.");
        }
    }   
    
    private static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }
}
