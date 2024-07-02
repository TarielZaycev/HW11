public class Main {
    public static void main(String[] args) {
        Phone tarielPhone = new Phone("9203554496","onePlus",1.2);
        Phone mamaPhone = new Phone("9016915822","sonyEricson",0.9);

        tarielPhone.receiveCall("Irina","9065113372");
        mamaPhone.receiveCall("Tariel");

    }
}
