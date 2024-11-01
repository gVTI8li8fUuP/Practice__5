package Task1;

class ConcreteObserver1 implements Observer {

    public void update(String message) {
        System.out.println("Observer 1 received update: " + message);
    }
}

class ConcreteObserver2 implements Observer {

    public void update(String message) {
        System.out.println("Observer 2 received update: " + message);
    }
}
