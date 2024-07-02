public class Phone {
    String phoneNumber;
    String phoneModel;
    double weight;
    static String COUNTRY = "Russia";

    public Phone(String phoneNumber, String phoneModel, double weight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.weight = weight;
    }

    public Phone() {
    }

    void receiveCall(String nameCaller){
        receiveCall(nameCaller,"");
    }

    void receiveCall(String nameCaller, String numberCaller){
        System.out.println("Вам звонит " + nameCaller + " номер " + (numberCaller != "" ? numberCaller : " не известен"));
    }
}
