
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int price = 3980;
        int taxRate = 10;
        int tax;
        tax = taxMethod(price, taxRate);
        int pay = price + tax;
        System.out.println(price + "円の商品の税込み価格は" + pay + "円（消費税は" + tax + "円）です。");
    }

    public static int taxMethod(int price, int taxRate) {
        int tax = price / taxRate;
        return tax;
    }}

