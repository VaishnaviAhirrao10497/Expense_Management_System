package com.vaishu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaishu.model.Category;
import com.vaishu.model.Participent;
import com.vaishu.service.ParticipentService;
@RestController
@RequestMapping("/api")
public class ParticipentController {

	@Autowired
	private ParticipentService participentService;
	
	@PostMapping("/part")
	public Participent addParticipent(@RequestBody Participent participent) {
		return participentService.addParticipentService(participent);
	}

	@GetMapping("/part/{id}")
	public Optional<Participent> getParticipent(@PathVariable Long id) {
		return participentService.getParticipentService(id);
	}

	@GetMapping("/part")
	public List<Participent> getAllParticipent() {
		return participentService.getAllparticipentService();
	}
	@GetMapping("/divide_equally")
	 public long countParticipent(){
		return participentService.countParticipent();
	}
}
