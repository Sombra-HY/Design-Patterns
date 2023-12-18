package Creational.Singleton.Singleton;
//"""
//O Singleton tem a intenção de garantir que uma classe tenha somente
//uma instância e fornece um ponto global de acesso para a mesma.
//
//When discussing which patterns to drop, we found
//that we still love them all.
//(Not really—I'm in favor of dropping Singleton.
//Its use is almost always a design smell.)
//- Erich Gamma, em entrevista para informIT
//http://www.informit.com/articles/article.aspx?p=1404056
//"""
public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if (instance==null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

class Client{
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.equals(obj));

    }
}