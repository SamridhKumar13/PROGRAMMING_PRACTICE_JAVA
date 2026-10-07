// //? call by value

// public class callByValue {
//  void solve( int num){               //? Function/Method Decleration.
//     System.out.println("Inside solve function: "+num);
//     num=num*10;
// System.out.println("Inside solve function: "+num);
//  }
// void main() {
//     int num=5;
//     System.out.println("In main function: "+num);
//     solve(num);                   //? Function/method calling, here copy of num is passed. 
// System.out.println("In main function: "+num);
// }
// }
// class Bank {

//     String bankName = "SBI";

//     class Account {

//         void showDetails() {
//             System.out.println("Bank Name: " + bankName);
//             System.out.println("You have 3 accounts in this bank");
//         }
//     }
// }

// class Main {

//     public static void main(String[] args) {
//         Bank b = new Bank();
//         Bank.Account a = b.new Account();
//         a.showDetails();

//     }
// }

// class Bank { static String bankName = "SBI";
// static class ATM { void showDetails() { System.out.println("Bank Name: "+bankName); System.out.println("ATM is in service"); } } } class Main { public static void main(String[] args) { //Bank b = new Bank(); Bank.ATM a = new Bank.ATM(); a.showDetails();

// }
// }

/*An online shopping application calculates discounts differently for different types of customers. Create a parent class Customer with a method: calculateDiscount(double amount) which provides a 5% discount. Create two child classes: • PremiumCustomer → 15% discount • VIPCustomer → 25% discount Override the calculateDiscount() method in both child classes. Additionally, overload the method in the parent class as: calculateDiscount(double amount, double couponDiscount) The second version should calculate the discount using both percentage discount and coupon amount. Create objects of Customer, PremiumCustomer, and VIPCustomer and display their final payable amounts.*/
/*
class Customer {

    // Method Overriding ke liye parent method
    double calculateDiscount(double amount) {
        return amount - (amount * 0.05);
    }

    // Method Overloading
    double calculateDiscount(double amount, double couponDiscount) {
        double discount = amount * 0.05;
        return amount - discount - couponDiscount;
    }
}

class PremiumCustomer extends Customer {

    // Method Overriding
    @Override
    double calculateDiscount(double amount) {
        return amount - (amount * 0.15);
    }
}

class VIPCustomer extends Customer {

    // Method Overriding
    @Override
    double calculateDiscount(double amount) {
        return amount - (amount * 0.25);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        PremiumCustomer premium = new PremiumCustomer();
        VIPCustomer vip = new VIPCustomer();

        double amount = 10000;

        System.out.println("Customer Final Amount: "
                + customer.calculateDiscount(amount));

        System.out.println("Premium Customer Final Amount: "
                + premium.calculateDiscount(amount));

        System.out.println("VIP Customer Final Amount: "
                + vip.calculateDiscount(amount));

        // Overloaded method
        double coupon = 500;

        System.out.println("Customer Final Amount with Coupon: "
                + customer.calculateDiscount(amount, coupon));
    }
}*/
