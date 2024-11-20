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
            System.out.println(abs(x));   
        } catch (NumberFormatException e) {
            System.out.println("Please enter a double value.");
        }
    }
    
    private static double abs(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}
