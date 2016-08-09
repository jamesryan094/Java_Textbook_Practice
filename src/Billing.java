/**
 * Created by james on 4/08/2016.
 * 1: price
 * 2: price * quantity
 * 3: price * quantity - coupon
 * *=.08
 */
public class Billing {
    public static void main(String[] args){
        double one=computeBill(15.50);
        double two=computeBill(15.50, 5);
        double three=computeBill(15.50, 5, 10.00);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
    private static double computeBill(double price){
        return price*1.08;
    }
    private static double computeBill(double price, int quantity){
        return (price*quantity)*1.08;
    }
    private static double computeBill(double price, int quantity, double coupon){
        return (price*quantity-coupon)*1.08;
    }


}
