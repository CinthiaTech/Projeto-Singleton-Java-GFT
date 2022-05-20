public class Main {
    public static void main(String[] args) {
        Lazy  lazy = Lazy.getInstancia ();
        System.out.println (lazy);
        lazy = Lazy.getInstancia ();
        System.out.println(lazy);

        Eager  eager = Eager.getInstancia();
        System.out.println(eager);
        eager = Eager.getInstancia();
        System.out.println(eager);

        LazyHolder lazyHolder = LazyHolder . getInstancia ();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
