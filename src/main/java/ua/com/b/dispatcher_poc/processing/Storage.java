package ua.com.b.dispatcher_poc.processing;

import ua.com.b.dispatcher_poc.model.Name;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Storage {
    private static final Set<Name> NAME_SET = new HashSet<>();

    public static Set<Name> dispatch(List<Name> names) {
        Set<Name> resp = new HashSet<>();
        Set<Name> temp = new HashSet<>();
        names.forEach(name -> {
            if (NAME_SET.contains(name)) {
                resp.add(name);
            } else {
                temp.add(name);
            }
        });
        NAME_SET.addAll(temp);

        return resp;
    }

    public static void remove(List<Name> names) {
        names.forEach(NAME_SET::remove);
    }

    private Storage() {}
}
