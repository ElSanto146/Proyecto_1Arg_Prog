package com.backend.Carlos.service;

import com.backend.Carlos.model.Persona;
import com.backend.Carlos.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public  PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
        //Se agrega el .orElse para que devuelva un null si no se encuentra a la persona

    }
    
}
