import java.util.* ;
class ElectricityBill {
    int Bill_Id;
    String CustomerName;
    int MeterReading;
    int Bill = 100;

    ElectricityBill(int id, String name, int reading) {
        Bill_Id = id;
        CustomerName = name;
        MeterReading = reading;

        if (MeterReading < 20)
            this.Bill += 100;
        else if (MeterReading < 50)
            this.Bill += 200;
        else
            this.Bill += 500;
    }

    void display() {
        System.out.println("Bill ID: " + Bill_Id);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Meter Reading: " + MeterReading);
        System.out.println("Bill Amount: Rs. " + this.Bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill ID: ");
        int bill_id = sc.nextInt();

        System.out.println("Enter Customer name: ");
        String customerName = sc.next();

        System.out.println("Enter Meter Reading : ");
        int meterReading = sc.nextInt() ;

        ElectricityBill b = new ElectricityBill(bill_id, customerName, meterReading) ;

        b.display() ;
    }
}

