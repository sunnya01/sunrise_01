package TestTmp;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author sunchaowei
 * @create 2026/1/9-15:05
 */
public class OptionalTest {
    public static void main(String[] args) {
        A a = new A();
//        Optional<String> s = Optional.of(a).map(A::getB).map(B::getC).map(C::getD).map(D::getName);
        //        if (s.isPresent()) System.out.println(s.get());
//        Optional<B> b = Optional.of(a).map(A::getB);
        Optional<A> a1 = Optional.of(a);
        a1.map(new Function<A, B>() {
            @Override
            public B apply(A a) {
                return a.getB();
            }
        });
//        if (b.isPresent()) System.out.println(b.get());

    }
}

class A {
    B b;

    public B getB() {
        System.out.println("B");
        b = new B();
        return b;
    }
}

class B {
    C c;

    public C getC() {
        System.out.println("C");
//        c = new C();
        return c;
    }
}

class C {
    D d;

    public D getD() {
        System.out.println("D");
        d = new D();
        return d;
    }
}

class D {
    String name = "Class DHJKADHJKAKHD";

    public String getName() {
        return name;
    }
}