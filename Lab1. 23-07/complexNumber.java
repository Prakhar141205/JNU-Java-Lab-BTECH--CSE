class complexNumber {

    public class Complex {
    
        int real;
        int imag;

        public Complex(int real, int imag){
            this.real = real;
            this.imag = imag;
        
        } 

        void add(Complex z1) {
            int r = z1.real + this.real;
            int i = z1.imag + this.imag;
            if (i < 0){
                System.out.println(r + " - i*" + i);
            }
            else {
                System.out.println(r + " + i*" + i);
            }
        }

        void subtract(Complex z1) {
            int r = z1.real - this.real;
            int i = z1.imag - this.imag;

            if (i < 0){
                System.out.println(r + " - i*" + i);
            }
            else {
                System.out.println(r + " + i*" + i);
            }
        }

        void multiply(Complex z1){
            int r = z1.real * this.real + (-1 * z1.imag*this.imag) ;
            int i = z1.real * this.imag + this.real * z1.imag  ;

            if (i < 0){
                System.out.println(r + " - i*" + i);
            }
            else {
                System.out.println(r + " + i*" + i);
            }

        }

        void division(Complex z1){
            int r = (z1.real * this.real + (z1.imag*this.imag)) / (this.real * this.real + this.imag * this.imag) ;

            int i = (this.real * z1.imag - z1.real * this.imag) / (this.real * this.real + this.imag * this.imag)   ;
            
            if (i < 0){
                System.out.println(r + " - i*" + i);
            }
            else {
                System.out.println(r + " + i*" + i);
            }

        }

    }
    public void main() {
        Complex z1 = new Complex(8, 4);
       
        Complex z2 = new Complex(16, 8);

        z1.division(z2);
        

    }
}