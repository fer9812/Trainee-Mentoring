public class Main {
    public static void main(String[] args) {
        StringBuilder vehiclePlateNumber = new StringBuilder();
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        System.out.println("The randomly generated vehicle plate number is " + vehiclePlateNumber);
    }
}
