package ua.lviv.iot.spring.first.rest.controller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
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

import ua.lviv.iot.spring.first.business.PumpService;
import ua.lviv.iot.spring.first.rest.model.Pump;

@RequestMapping("/pumps")
@RestController
public class PumpsController {

    private int idCounter = 0;

    @Autowired
    PumpService pumpService;

    @PostMapping()
    public ResponseEntity<Pump> createPump(final @RequestBody Pump pump) {

        pump.setId(++idCounter);

        pumpService.createPump(pump);

        return new ResponseEntity<Pump>(pump, HttpStatus.CREATED);
    }

    @GetMapping
    public LinkedList<Pump> getPumps() {
        return new LinkedList<Pump>(pumpService.getAllPumps());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pump> getPump(@PathVariable("id") Integer pumpId) {

        Pump getSingle = pumpService.getSinglePump(pumpId);

        return new ResponseEntity<Pump>(getSingle, HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Pump> deletePump(@PathVariable("id") Integer pumpId) {

        pumpService.deletePump(pumpId);
        return new ResponseEntity<Pump>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Pump> updatePump(@PathVariable("id") Integer pumpId, final @RequestBody Pump pump) {
        pump.setId(pumpId);

        Pump updatedPump = pumpService.updatePump(pumpId, pump);

        if (updatedPump == null) {
            return new ResponseEntity<Pump>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pump>(updatedPump, HttpStatus.OK);

    }
}
