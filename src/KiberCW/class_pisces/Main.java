package KiberCW.class_pisces;


public class Main {
    public static void main(String[] args) {
        ChondrichthyesFish ChondrichthyesFish = new ChondrichthyesFish("Хрящевые", "Пластиножаберные", "Хрящевой скелет");
        Holocephali Holocephali = new Holocephali("Хрящевые", "Цельноголовые", "Большие глаза, большая голова и длинный хвост");
        Osteichthyes Osteichthyes = new Osteichthyes("Костные", "Костно-хрящевые", "Основу скелета составляет костная ткань");
        Crossopterygii Crossopterygii = new Crossopterygii("Костные", "Кистепёрые", "Плавники, в основании которых расположена мышечная лопасть");

        System.out.println(ChondrichthyesFish.eat());
        System.out.println(Holocephali.eat());
        System.out.println(Crossopterygii.eat());
        System.out.println(Osteichthyes.eat());


    }
}
