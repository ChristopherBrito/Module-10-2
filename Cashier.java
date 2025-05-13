class Cashier extends Worker {

    Cashier(String name) {
        super(name); 
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Cash or card.");
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier("James");
        cashier.makeSound(); 
    }
}