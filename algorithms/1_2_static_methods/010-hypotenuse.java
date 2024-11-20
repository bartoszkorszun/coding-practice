class ALG {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java ALG <double> <double>");
            return;
        }   
        if (args[0].indexOf('.') == -1 || args[1].indexOf('.') == -1) {
            System.out.println("Please enter a double value.");
            return;
        }

        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            System.out.println(hypotenuse(x, y));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a double value.");
        }
    }   
    
    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
