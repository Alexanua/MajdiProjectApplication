package com.Majdi.Majdi_Project.service;

// File: src/main/java/com/majdi/majdi_project/service/MessageService.java




import com.Majdi.Majdi_Project.Entity.Message;
import com.Majdi.Majdi_Project.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public Optional<Message> getMessageById(Long id) {
        return repository.findById(id);
    }

    public Message saveMessage(Message message) {
        return repository.save(message);
    }

    public Message updateMessage(Long id, Message messageDetails) {
        // Implement logic to update a message
        return null; // Replace null with actual update logic
    }

    public void deleteMessage(Long id) {
        repository.deleteById(id);
    }
}
