package pr2.task5;

public class PitomnikSobak {
    Dog[] pitomnik;
    int size;

    public PitomnikSobak(){};

    public void fillPitomnik(int size){
        pitomnik = new Dog[size];

        for (int i = 0; i < size; i++){
            System.out.println("Собака №" + (i + 1));
            Dog dog = new Dog();
            dog.fillDog();
            pitomnik[i] = dog;
            this.size = size;
        }
    }

    public void addDog(){
        Dog[] newPitomnik = new Dog[pitomnik.length + 1];
        for (int i = 0; i < pitomnik.length; i++){
            newPitomnik[i] = pitomnik[i];
        }
        Dog dog = new Dog();
        dog.fillDog();
        newPitomnik[newPitomnik.length - 1] = dog;
        pitomnik = newPitomnik;
        size++;
    }

    public void showPitomnik(){
        for (int i = 0; i < size; i++){
            System.out.println("Собака №" + (i + 1));
            System.out.println(pitomnik[i].toString());
        }
    }
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько собак в питомнике ?");
        System.out.print("Ответ: ");
        int size = scanner.nextInt();

        Dog[] pitomnik = new Dog[size];

        for (int i = 0; i < size; i++){
            System.out.println("Собака №" + (i + 1));
            Dog dog = new Dog();
            dog.fillDog();
            pitomnik[i] = dog;
            System.out.println();
        }
        System.out.println("(: Питомник заполнен - V\n");

        for (int j = 0; j < size; j++){
            System.out.println("Собака №" + (j + 1));
            System.out.println(pitomnik[j].toString());
        }
    }*/
}
