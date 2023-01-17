package ua.com.b.dispatcher_poc.controller;

import org.springframework.web.bind.annotation.*;
import ua.com.b.dispatcher_poc.model.Name;
import ua.com.b.dispatcher_poc.processing.Storage;

import java.util.List;
import java.util.Set;

@RestController
public class NameController {
    @PostMapping("/name")
    public Set<Name> namePost(@RequestBody List<Name> names) {
        return Storage.dispatch(names);
    }

    @DeleteMapping("/name")
    public void nameDelete(@RequestBody List<Name> names) {
        Storage.remove(names);
    }
}
