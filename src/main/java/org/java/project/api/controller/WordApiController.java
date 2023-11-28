package org.java.project.api.controller;

import org.java.project.pojo.WordAnalysis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/word")
public class WordApiController {
	
	@GetMapping("/analyze/{word}")
    public ResponseEntity<WordAnalysis> analyzeWord(@PathVariable String word) {
        WordAnalysis result = WordUtils.analyzeWord(word);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
