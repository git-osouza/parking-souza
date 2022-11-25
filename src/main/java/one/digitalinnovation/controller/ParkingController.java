package one.digitalinnovation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.controller.dto.ParkingDTO;
import one.digitalinnovation.controller.mapper.ParkingMapper;
import one.digitalinnovation.model.Parking;
import one.digitalinnovation.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	private final ParkingService parkingService = new ParkingService();
	private final ParkingMapper parkingMapper = new ParkingMapper();
	
	@GetMapping
	public List<ParkingDTO> findAll(){
		List<Parking> list = parkingService.findAll();
		return parkingMapper.toParkingDTOList(list);
	}
}
