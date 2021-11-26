public class squid {
    public static void main(String[] args) {
        products();
    }
    /**
     Estimates the number of two products where amount of both is 5000 units
     that must be replaced annually when one product have failure of 0.5 x 10&-7/hr and second have failure rate of 2.5  10&-7/hr
     and each connection of two products operates 350 days [...]

     Karol Gadziejewski
     Bartosz Kulling
     **/
    private static void products(){
        float a=5000;
        float b=5000;
        double firstFailRate = ((0.5*Math.pow(10,-7)*24)*350);
        double secondFailRate  = ((2.5*Math.pow(10,-7)*24)*350);
        System.out.println(Math.floor(a*firstFailRate));
        System.out.println(Math.floor(b*secondFailRate));
    }
}