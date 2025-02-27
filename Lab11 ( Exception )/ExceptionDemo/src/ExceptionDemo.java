public class ExceptionDemo {
    public static void main(String args[]) {
        double a, b, c, x1 = 0, x2 = 0;
        try {
            a = Double.parseDouble(args[0]) ;
            b = Double.parseDouble(args[1]) ;
            c = Double.parseDouble(args[2]) ;
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) ;
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) ;
        }catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
            return ;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter 3 numbers as a, b, and c respectively");
            return ;
        }
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
