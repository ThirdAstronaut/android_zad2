package example.com.android_zad2_238292;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafał on 2018-03-16.
 */

public class PersonKeeper {
    private static PersonKeeper instance = null;
    private List<Person> mPersonList;
    private PersonKeeper() {
        mPersonList = new ArrayList<>();
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
        mPersonList.add(new Person("John", "Snow", "12/03/1991"));
    }

    public List<Person> getPersonList() {
        return mPersonList;
    }

    public static PersonKeeper getInstance() {
        if(instance == null) {
            instance = new PersonKeeper();
        }
        return instance;
    }
}
