package com.Majdi.Majdi_Project.dao;

import com.Majdi.Majdi_Project.Entity.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDAO  extends JpaRepository<Message, Long> { }