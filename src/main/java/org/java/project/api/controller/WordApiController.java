package org.java.project.api.controller;

import org.java.project.pojo.SimilarityScore;
import org.java.project.pojo.WordAnalysis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/word")
public class WordApiController {
	
	@GetMapping("/analyze/{word}")
    public ResponseEntity<WordAnalysis> analyzeWord(@PathVariable String word) {
        WordAnalysis result = WordUtils.analyzeWord(word);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
    @PostMapping("/compare")
    public ResponseEntity<SimilarityScore> compareWords(@RequestParam String word1, @RequestParam String word2) {
        SimilarityScore result = WordUtils.compareWords(word1, word2);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
