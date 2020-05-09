package lambda;

public class Main {
    public static void main(String[] args)
    {
        answerable phone = () -> {return "Hello";};
        System.out.println(phone.answer());

        predicate isOdd = n -> n%2 != 0;
        System.out.println(isOdd.test(2));

        predicate isEven = n -> n%2 == 0;
        System.out.println(isEven.test(2));
    }
}
