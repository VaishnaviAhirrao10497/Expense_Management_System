package com.vaishu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaishu.model.Participent;

public interface ParticipentRepository extends JpaRepository<Participent, Long> {

}
