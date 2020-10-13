package thread;

import java.util.concurrent.atomic.*;
import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class TestAtomic {

    public static void main(String[] args) {
        testAtomicLong();
        testAtomicBool();
        testAtomicIntegerArray();
        testAtomicInferenceArray();
        testDoubleAccumulator();
        testDoubleAdder();
        testReference();
        testField();
    }

static void testAtomicLong() {
    AtomicLong atomicLong = new AtomicLong();
    for(int i =0;i<10;i++) {
        atomicLong.getAndIncrement();
    }
    System.out.println(atomicLong);
    System.out.println(atomicLong.getAndAdd(3));
    System.out.println(atomicLong.addAndGet(4));
    System.out.println(atomicLong.compareAndSet(17,20));
    System.out.println(atomicLong.get());
}

static void testAtomicBool() {
    AtomicBoolean atomicBoolean = new AtomicBoolean();
    System.out.println(atomicBoolean.get());
    System.out.println(atomicBoolean.getAndSet(true));
    System.out.println(atomicBoolean.get());
    atomicBoolean.lazySet(false);
    System.out.println(atomicBoolean.get());
}

static void testAtomicIntegerArray() {
    AtomicIntegerArray array = new AtomicIntegerArray(10);
    array.set(0,10);


    System.out.println(array);
    System.out.println(array.addAndGet(1,2));
    System.out.println(array);
    System.out.println(array.getAndIncrement(2));
    System.out.println(array);
}

static void testAtomicInferenceArray() {
    AtomicReferenceArray<Person> reference = new AtomicReferenceArray<>(10);

    reference.set(0,new Person(0,"lily"));
    System.out.println(reference.getAndSet(0,new Person(1,"lucy")));

    System.out.println(reference);
}

static void testDoubleAccumulator() {
    DoubleAccumulator accumulator = new DoubleAccumulator(new DoubleBinaryOperator() {
        /**
         * Applies this operator to the given operands.
         *
         * @param left  the first operand
         * @param right the second operand
         * @return the operator result
         */
        @Override
        public double applyAsDouble(double left, double right) {

            return left + right;
        }
    },4.3);

    System.out.println(accumulator);
    accumulator.accumulate(-4.3);
    System.out.println(accumulator);
    System.out.println(accumulator.getThenReset());
    System.out.println(accumulator);
    System.out.println(accumulator);
}

static void testDoubleAdder() {
    DoubleAdder adder = new DoubleAdder();
    adder.add(10);
    adder.add(3);
    adder.sumThenReset();

    System.out.println(adder);
}

static void testReference() {
    Person person1 = new Person(1,"kate");
    AtomicReference<Person> reference = new AtomicReference<>(person1);
    person1.setName("ss");
    reference.getAndSet(new Person(1,"lucy"));
    System.out.println(reference.getAndUpdate(new UnaryOperator<Person>() {
        @Override
        public Person apply(Person person) {
            Person persons = new Person(2,"lmn");
            return persons;
        }
    }));
    System.out.println(reference);

    Person person2 = new Person(2,"kate");
    AtomicStampedReference<Person> stamped = new AtomicStampedReference<>(person2,0);

    Person person3 = new Person(3,"kate");
    AtomicMarkableReference<Person> markable = new AtomicMarkableReference<>(person3,true);
}

static void testField() {
    AtomicIntegerFieldUpdater<Person> updater = AtomicIntegerFieldUpdater.newUpdater(Person.class,"count");

    Person person = new Person(12,"lucy");
    person.setCount(10);
    updater.compareAndSet(person,10,30);
    System.out.println(person);
    System.out.println(updater.getAndIncrement(person));
    System.out.println(person);
}
}

