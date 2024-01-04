package JavaSecond_Term;
import java.util.Arrays;
public class order {

        public String name;
        public String customerNumber;
        public int[] items;
        public double[] prices;

        public order(String name, String customerNumber, int[] items, double[] prices) {
            this.name = name;
            this.customerNumber = customerNumber;
            this.items = items;
            this.prices = prices;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return customerNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.customerNumber = customerNumber;
        }

        public int[] getItems() {
            return items;
        }

        public void setItems(int[] items) {
            this.items = items;
        }

        public double[] getPrices() {
            return prices;
        }

        public void setPrices(double[] prices) {
            this.prices = prices;
        }

        public void printBillWithVAT() {
            double totalPrice = 0;
            for (double price : prices) {
                totalPrice += price;
            }
            double vat = totalPrice * 0.13;
            System.out.println("Order details:");
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + customerNumber);
            System.out.println("Items: " + Arrays.toString(items));
            System.out.println("Prices: " + Arrays.toString(prices));
            System.out.println("Total price: " + totalPrice);
            System.out.println("VAT (13%): " + vat);
            System.out.println("Total price with VAT: " + (totalPrice + vat));
        }
}
