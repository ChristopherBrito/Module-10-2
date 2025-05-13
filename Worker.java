abstract class Worker {
    String name;

    Worker(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void working() {
        System.out.println(name + " is working.");
    }
}