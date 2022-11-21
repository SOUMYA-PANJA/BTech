class Phone {
    public void ShowTime() {
        System.out.println("The Time is Now 8 am.");
    }

    public void on() {
        System.out.println("Turning on the Phone.");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing Music.");
    }

    public void on() {
        System.out.println("Turning on the SmartPhone.");
    }
}

public class DMM {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
    }
}