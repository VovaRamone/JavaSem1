import Sem6.SetExample;
import Sem6.UniquePercentageCalculator;
import Sem6.Cat;

import java.text.ParseException;
import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Sem6App {
    public static void main(String[] args) throws ParseException {
//        SetExample.sem6Test1();
//        UniquePercentageCalculator.sem6Test2();

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        Cat myCat = new Cat(2000, "Барсик", 245, formatter.parse("Sat, April 4, 2019"), true, 1);
        Cat motherCat = new Cat(3000, "Кеша", 245, formatter.parse("Sat, April 4, 2010"), false, 2);

        HashSet<Cat> catSet = new HashSet<Cat>();
        catSet.add(myCat);
        catSet.add(motherCat);

        System.out.println(myCat);
        System.out.println(motherCat);

        System.out.println(myCat.equals(motherCat));
        System.out.println(catSet.contains(motherCat));
    }
}
