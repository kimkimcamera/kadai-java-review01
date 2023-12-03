
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        double price = 3980;
        double taxRate = 0.1;
        double tax;
        tax = taxMethod(price, taxRate);
        double pay = price + tax;
        System.out.println((int)price + "円の商品の税込み価格は" + (int)pay + "円（消費税は" + (int)tax + "円）です。");
    }

    public static double taxMethod(double price, double taxRate) {
        double tax = taxRate * price;
        return tax;
    }}

