class GFG {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(11, 16);
        Complex c3 = Complex.add(c1, c2);
        c1.show();
        c2.show();
        c3.show();
    }
}

class Complex {

    private int real, imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void show() {
        System.out.println(real + " + i" + imag);
    }

    public static Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
}