package com.example.report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.report.Report;

//ReportController.java
@RestController
@RequestMapping("/reports")
public class ReportController {

 @PostMapping
 public ResponseEntity<String> createReport(@RequestBody Report report) {
     // Implement your logic to handle the incoming report
     // You can save it to a database or perform any other required operations

     // For now, just return a success message
     return ResponseEntity.ok("Report created successfully");
 }
}
