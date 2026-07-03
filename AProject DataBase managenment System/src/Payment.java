// 5. Payment Interface

interface Payment {

    void processPayment();

    void generateReceipt();

}

// 6. Card Payment Class

class CardPayment implements Payment {

    @Override

    public void processPayment() {

        System.out.println("Processing card payment.");

        System.out.println("Card details validated successfully.");

    }

    @Override

    public void generateReceipt() {

        System.out.println("Digital receipt generated successfully.");

    }

}

// 7. Cash Payment Class

class CashPayment implements Payment {

    @Override

    public void processPayment() {

        System.out.println("Processing cash payment.");

    }

    @Override

    public void generateReceipt() {

        System.out.println("Cash payment receipt generated successfully.");

    }

}
