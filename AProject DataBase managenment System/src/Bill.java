// 8. Bill Class - Composition with Payment

class Bill {

    private int billId;

    private int consultationCharge;

    private int laboratoryCharge;

    private int medicalCharge;

    private int totalAmount;

    private Payment payment;

    public Bill() {

    }

    public Bill(int billId, int consultationCharge, int laboratoryCharge, int medicalCharge, Payment payment) {

        this.billId = billId;

        this.consultationCharge = consultationCharge;

        this.laboratoryCharge = laboratoryCharge;

        this.medicalCharge = medicalCharge;

        this.payment = payment;

        this.totalAmount = calculateBill();

    }

    public int getBillId() {

        return billId;

    }

    public int getTotalAmount() {

        return totalAmount;

    }

    public int calculateBill() {

        return consultationCharge + laboratoryCharge + medicalCharge;

    }

    public void payBill() {

        payment.processPayment();

        payment.generateReceipt();

    }

    public void displayBillDetails() {

        System.out.println("Bill ID: " + billId);

        System.out.println("Consultation Charge: " + consultationCharge);

        System.out.println("Laboratory Charge: " + laboratoryCharge);

        System.out.println("Medical Charge: " + medicalCharge);

        System.out.println("Total Amount: " + totalAmount);

    }
}
