public class coupon {
    private String name;
    private double price;
    private String coupon;
    public  Product (String name,double price,String coupon){
        this.name=name;
        this.price=price;
        this.coupon=coupon;
    }
    public String getName(){
        return name;
    }
  
    public double getPrice(){
        return price;
    }
      public String getCoupon(){
        return coupon;
    }
    class Validator {
        public static String validCoupon(Product p) throws InvalidCouponException {
 String coupon = p.getCoupon();
 if(coupon == null){
    throw new InvalidCouponException("Coupon is null");
 }
           
        }
    }
}
