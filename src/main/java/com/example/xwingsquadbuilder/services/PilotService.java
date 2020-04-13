package com.example.xwingsquadbuilder.services;

import com.example.xwingsquadbuilder.models.Pilot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PilotService
{

    public Pilot save(Pilot pilot)
    {
        return null;
    }

    public Page<Pilot> findAll(Pageable pageable)
    {
        return null;
    }

    public Collection<Pilot> findAll()
    {
        return null;
    }

    public Pilot findById(Long pilotId)
    {
        return null;
    }

    public Pilot findByName(String name)
    {
        return null;
    }

    public Page<Pilot> findByShip(Pageable pageable, String shipName)
    {
        return null;
    }

    public Collection<Pilot> findByShip(String shipName)
    {
        return null;
    }

    public Pilot update(Pilot pilot)
    {
        return null;
    }

    public void delete(Pilot pilot)
    {

    }
}
