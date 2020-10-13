public class TestSuper {
    public static void main(String[] args) {
        C c = new C();
        c.handler();
    }

}


class A {
    public void handler() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void handler() {
        System.out.println("B");
        super.handler();
    }
}

class C extends B {
    @Override
    public void handler() {
        System.out.println("C");
        super.handler();
    }
}
