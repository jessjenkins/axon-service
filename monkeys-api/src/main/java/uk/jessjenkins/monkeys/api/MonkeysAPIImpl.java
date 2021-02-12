package uk.jessjenkins.monkeys.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MonkeysAPIImpl implements MonkeysApiDelegate {

    @Override
    public ResponseEntity<List<Monkey>> monkeysGet() {
        // TODO map from an entity model
        List<Monkey> monkeys = Arrays.asList(
                new Monkey().name("Baboon"),
                new Monkey().name("Gibbon")
        );
        return ResponseEntity.ok(monkeys);
    }
}
