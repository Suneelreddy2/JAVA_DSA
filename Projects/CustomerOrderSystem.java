package Projects;

import java.util.*;

// Abstraction + Inheritance
abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public abstract void displayInfo();  // Polymorphism
}

// Encapsulation
class Order {
    private String orderId;
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String orderId, String productName, int quantity, double unitPrice) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void updateOrder(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return quantity * unitPrice;
    }

    public void displayOrder() {
        System.out.println("- Order ID: " + orderId + ", Product: " + productName +
                ", Quantity: " + quantity + ", Unit Price: ₹" + unitPrice +
                ", Total: ₹" + getTotalAmount());
    }
}

// Inheritance + Polymorphism
class Customer extends Person {
    private ArrayList<Order> orders;

    public Customer(int customerId, String customerName) {
        super(customerId, customerName);
        orders = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("\nCustomer Name: " + getName());
        System.out.println("Customer ID: " + getId());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(String orderId) {
        for (Order o : orders) {
            if (o.getOrderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }

    public boolean removeOrder(String orderId) {
        Order toRemove = getOrderById(orderId);
        if (toRemove != null) {
            orders.remove(toRemove);
            return true;
        }
        return false;
    }

    public void displayOrders() {
        displayInfo();
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            System.out.println("Orders:");
            for (Order o : orders) {
                o.displayOrder();
            }
        }
    }
}

// Main class
public class CustomerOrderSystem {
    public static void main(String[] args) {
        HashMap<Integer, Customer> customerMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Customer Order Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Order to Existing Customer");
            System.out.println("3. View Orders by Customer ID");
            System.out.println("4. Update an Order");
            System.out.println("5. Cancel an Order");
            System.out.println("6. Exit");
            System.out.println("7. Display All Customers and Orders");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    if (customerMap.containsKey(cid)) {
                        System.out.println("Customer ID already exists.");
                    } else {
                        System.out.print("Enter Customer Name: ");
                        String cname = sc.nextLine();
                        Customer customer = new Customer(cid, cname);
                        customerMap.put(cid, customer);
                        System.out.println("Customer added successfully!");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter Customer ID to add order: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    Customer customer = customerMap.get(cid);
                    if (customer != null) {
                        System.out.print("Enter Order ID: ");
                        String oid = sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        System.out.print("Enter Unit Price: ");
                        double price = sc.nextDouble();

                        Order order = new Order(oid, pname, qty, price);
                        customer.addOrder(order);
                        System.out.println("Order added successfully!");
                    } else {
                        System.out.println("Customer ID not found.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    Customer customer = customerMap.get(cid);
                    if (customer != null) {
                        customer.displayOrders();
                    } else {
                        System.out.println("No customer found.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    Customer customer = customerMap.get(cid);
                    if (customer != null) {
                        System.out.print("Enter Order ID to update: ");
                        String oid = sc.nextLine();
                        Order order = customer.getOrderById(oid);
                        if (order != null) {
                            System.out.print("Enter new product name: ");
                            String pname = sc.nextLine();
                            System.out.print("Enter new quantity: ");
                            int qty = sc.nextInt();
                            System.out.print("Enter new unit price: ");
                            double price = sc.nextDouble();

                            order.updateOrder(pname, qty, price);
                            System.out.println("Order updated!");
                        } else {
                            System.out.println("Order ID not found.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    Customer customer = customerMap.get(cid);
                    if (customer != null) {
                        System.out.print("Enter Order ID to delete: ");
                        String oid = sc.nextLine();
                        if (customer.removeOrder(oid)) {
                            System.out.println("Order deleted!");
                        } else {
                            System.out.println("Order ID not found.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }

                case 6:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);

                case 7: {
                    if (customerMap.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        System.out.println("\n--- All Customers and Their Orders ---");
                        for (Customer c : customerMap.values()) {
                            c.displayOrders();
                            System.out.println(); // spacing
                        }
                    }
                    break;
                }

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
