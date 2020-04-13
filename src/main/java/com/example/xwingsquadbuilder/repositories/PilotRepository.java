package com.example.xwingsquadbuilder.repositories;

import com.example.xwingsquadbuilder.models.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long>
{
}
