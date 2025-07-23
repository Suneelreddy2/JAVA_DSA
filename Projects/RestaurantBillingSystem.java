package Projects;

class FoodItem {
    String itemId;
    String itemName;
    double unitPrice;
    int quantity;

    FoodItem(String itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double calculateBill() {
        double subtotal = unitPrice * quantity;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total -= total * 0.10;
        }
        return total;
    }

    void displayDetails() {
        System.out.println("\nFood Item Record");
        System.out.println("ID " + itemId);
        System.out.println("Name " + itemName);
        System.out.println("Unit Price " + unitPrice);
        System.out.println("Quantity " + quantity);
    }
}

class DineIn extends FoodItem {
    double serviceCharge;

    DineIn(String itemId, String itemName, double unitPrice, int quantity, double serviceCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.serviceCharge = serviceCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total -= total * 0.10;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double discount = 0;
        double total = subtotal + gst;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        super.displayDetails();
        System.out.println("Service Charge " + serviceCharge);
        System.out.println("Subtotal " + subtotal);
        System.out.println("GST " + gst);
        System.out.println("Discount " + discount);
        System.out.println("Total Bill " + total);
    }
}

class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(String itemId, String itemName, double unitPrice, int quantity, double packingCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.packingCharge = packingCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total -= total * 0.10;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double discount = 0;
        double total = subtotal + gst;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        super.displayDetails();
        System.out.println("Packing Charge " + packingCharge);
        System.out.println("Subtotal " + subtotal);
        System.out.println("GST " + gst);
        System.out.println("Discount " + discount);
        System.out.println("Total Bill " + total);
    }
}



 class Delivery extends FoodItem {
        double deliveryFee;

        Delivery(String itemId, String itemName, double unitPrice, int quantity, double deliveryFee) {
            super(itemId, itemName, unitPrice, quantity);
            this.deliveryFee = deliveryFee;
        }

        @Override
        double calculateBill() {
            double subtotal = unitPrice * quantity + deliveryFee;
            double gst = subtotal * 0.05;
            double total = subtotal + gst;
            if (total > 1000) {
                total -= total * 0.10;
            }
            return total;
        }

        @Override
        void displayDetails() {
            double subtotal = unitPrice * quantity + deliveryFee;
            double gst = subtotal * 0.05;
            double discount = 0;
            double total = subtotal + gst;
            if (total > 1000) {
                discount = total * 0.10;
                total -= discount;
            }

            super.displayDetails();
            System.out.println("Delivery Fee " + deliveryFee);
            System.out.println("Subtotal " + subtotal);
            System.out.println("GST " + gst);
            System.out.println("Discount " + discount);
            System.out.println("Total Bill " + total);
        }
    }
    public class RestaurantBillingSystem {

    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];

        orders[0] = new DineIn("F101", "Paneer Butter Masala", 250.0, 4, 50.0);
        orders[1] = new Takeaway("F102", "Veg Biryani", 180.0, 2, 20.0);
        orders[2] = new Delivery("F103", "Chicken Pizza", 300.0, 4, 40.0);

        for (int i = 0; i < orders.length; i++) {
            orders[i].displayDetails();
        }
    }
}
