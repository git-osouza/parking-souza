package one.digitalinnovation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import one.digitalinnovation.model.Parking;

@Service
public class ParkingService {

	
	private static Map<String, Parking> parkingMap = new HashMap<>();
	
	static {
		String id = getUID();
		Parking parking = new Parking(id, "CIG-0166", "SC", "GOL", "ROSA");
		parkingMap.put(id, parking);
	}

	private static String getUID() {
		return UUID.randomUUID().toString().replace("-","");
	}
	
	public List<Parking> findAll(){
		return new ArrayList<>(parkingMap.values());
	}
}
