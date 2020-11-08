package com.mobileconnect.controller;

import com.mobileconnect.entity.Document;
import com.mobileconnect.repository.DocumentRepository;
import com.mobileconnect.service.ApplicationService;
import com.mobileconnect.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping("/getDocument/{documentID}")
    @ResponseBody
    public ResponseEntity<String> getDocumentInformation(@PathVariable("documentID") String documentID){
         return documentService.getDocumentInformation(documentID);
    }

}
