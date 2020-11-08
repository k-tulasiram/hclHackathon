package com.mobileconnect.service;

import com.mobileconnect.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.mobileconnect.entity.Customer;
import com.mobileconnect.repository.DocumentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DocumentService() {
        // TODO Auto-generated constructor stub
    }

        public ResponseEntity getDocumentInformation (String documentID){

            List<Document> queryResult = jdbcTemplate.query("Select * from document where documentID = ?", new Object[]{documentID}, new BeanPropertyRowMapper<>(Document.class));
            return ResponseEntity.ok(queryResult.toString());

        }

    
}
