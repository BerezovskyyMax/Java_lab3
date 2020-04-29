package ua.lviv.iot.spring.first.business;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.datacess.PumpRepository;
import ua.lviv.iot.spring.first.rest.model.Pump;

@Service
public class PumpService {

    @Autowired
    private PumpRepository pumpRepository;

    public Pump createPump(Pump pump) {
        return pumpRepository.save(pump);
    }

    public List<Pump> getAllPumps() {
        return pumpRepository.findAll();
    }

    public Pump getSinglePump(Integer id) {
        return pumpRepository.findById(id).orElse(null);
    }

    public void deletePump(Integer id) {
        pumpRepository.deleteById(id);
    }

    public Pump updatePump(Integer id, Pump pump) {

        Pump pumpToUpdate = null;
        Pump temporaryPump = pumpRepository.findById(id).orElse(null);
        if (temporaryPump != null) {
            pumpToUpdate = new Pump();
            BeanUtils.copyProperties(temporaryPump, pumpToUpdate);
            pumpRepository.save(pump);
        }
        return pumpToUpdate;
    }

}
