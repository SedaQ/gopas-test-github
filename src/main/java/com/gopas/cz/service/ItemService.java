package com.gopas.cz.service;

import java.util.List;

import com.gopas.cz.model.Person;
import com.gopas.cz.repository.ItemRepository;

public class ItemService {

    private ItemRepository itemRepository;
    
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository=itemRepository;
    }
    
    public void findAllUsers() {
        List<Person> persons = itemRepository.findAllUsers();
        persons.forEach(System.out::println);
    }
}
