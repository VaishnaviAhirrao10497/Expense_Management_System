package com.vaishu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaishu.model.Expense;
import com.vaishu.model.Participent;
import com.vaishu.repository.ExpenseRepository;
import com.vaishu.repository.ParticipentRepository;
@Service
public class ParticipentService {
	@Autowired
	private  ParticipentRepository participentRepository;
	@Autowired
	private ExpenseRepository expenseRepository ;
    Participent participent;
    Expense expense;
	
	
	public Optional<Participent> getParticipentService(Long id) {
		return participentRepository.findById(id);
	}

	public List<Participent> getAllparticipentService() {
		return participentRepository.findAll();
	}

	public Participent addParticipentService(Participent participent) {
		return  participentRepository.save(participent);
	}


      public long countParticipent() {
		List<Participent> p = (List<Participent>) participentRepository.findAll();
		long count=p.stream().count();
		long amount=expense.getExpenseamount(); 
		long divide=amount/count;
		return divide;
	
	}
}


