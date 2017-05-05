package Singleton_02;

/**
 * Created by bupt on 5/2/17.
 */

/*
 two way
 first
  */
public class Singleton {
    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
