package com.galosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
