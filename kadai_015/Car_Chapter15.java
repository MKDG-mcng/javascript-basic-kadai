package kadai_015;

public class Car_Chapter15 {
    
    private int gear = 1;
    private int speed = 10;
    
    public void gearChange(int afterGear) {
        System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
        gear = afterGear;
        // Gear changes cause speed to change
        speed = afterGear * 10;  // Example: gear 1 -> speed 10, gear 2 -> speed 20 etc.
    }
    
    public void run() {
        // Use the updated speed value
        switch (gear) {
            case 1 -> System.out.println("速度は時速" + speed + "kmです");
            case 2 -> System.out.println("速度は時速" + speed + "kmです");
            case 3 -> System.out.println("速度は時速" + speed + "kmです");
            case 4 -> System.out.println("速度は時速" + speed + "kmです");
            case 5 -> System.out.println("速度は時速" + speed + "kmです");
            default -> System.out.println("速度は時速" + speed + "kmです");
        }
    }
}
