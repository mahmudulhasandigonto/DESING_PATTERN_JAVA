public class Singleton {
    public static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }


}

