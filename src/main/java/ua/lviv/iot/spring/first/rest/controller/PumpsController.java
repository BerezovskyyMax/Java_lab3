package ua.lviv.iot.spring.first.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.first.rest.model.Pump;

@RequestMapping("/pumps")
@RestController
public class PumpsController {
    private Map<Integer, Pump> pumps = new HashMap<>();
    private int idCounter = 0;

    @GetMapping
    public LinkedList<Pump> getPumps() {
        return new LinkedList<Pump>(pumps.values());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pump> getPump(@PathVariable("id") Integer pumpId) {

        Pump getSingle = pumps.get(pumpId);

        if (pumps.get(pumpId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return new ResponseEntity<Pump>(getSingle, HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<Pump> createPump(final @RequestBody Pump pump) {

        pumps.put(pump.setId(++idCounter), pump);

        return new ResponseEntity<Pump>(pump, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Pump> deletePump(@PathVariable("id") Integer pumpId) {

        Pump remove = pumps.remove(pumpId);

        if (remove == null) {
            return new ResponseEntity<Pump>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pump>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Pump> updatePump(@PathVariable("id") Integer pumpId, final @RequestBody Pump pump) {
        pump.setId(pumpId);

        Pump update = pumps.replace(pumpId, pump);

        if (update == null) {
            return new ResponseEntity<Pump>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pump>(update, HttpStatus.OK);

    }
}
