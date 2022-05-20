public class LazyHolder {

    private static LazyHolder instancia ;
    private LazyHolder () {
        super ();
    }
    public  static LazyHolder  getInstancia () {
        if (instancia == null ) {
            instancia = new LazyHolder();
        }
        return  instancia;
    }
}

