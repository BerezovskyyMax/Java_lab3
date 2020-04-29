package ua.lviv.iot.spring.first.datacess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.first.rest.model.Pump;

@Repository
public interface PumpRepository extends JpaRepository<Pump, Integer> {

}
