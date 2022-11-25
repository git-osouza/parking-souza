package one.digitalinnovation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String>{

}
