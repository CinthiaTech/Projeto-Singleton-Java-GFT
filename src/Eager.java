public class Eager {
    private static Eager instancia ;
    private Eager () {
        super ();
    }
    public  static Eager  getInstancia () {
        if (instancia == null ) {
            instancia = new Eager();
        }
        return  instancia;
    }
}


