package stefan.springframework.stefanpetclinic.services;

import stefan.springframework.stefanpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();
}
