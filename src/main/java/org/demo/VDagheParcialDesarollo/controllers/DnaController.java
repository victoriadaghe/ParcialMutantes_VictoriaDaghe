package org.demo.VDagheParcialDesarollo.controllers;

import org.demo.VDagheParcialDesarollo.dto.DnaRequest;
import org.demo.VDagheParcialDesarollo.dto.DnaResponse;
import org.demo.VDagheParcialDesarollo.services.DnaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/mutant")
public class DnaController {

    private final DnaService dnaService;

    public DnaController(DnaService dnaService) {
        this.dnaService = dnaService;
    }

    @PostMapping
    public ResponseEntity<DnaResponse> checkMutant(@Valid @RequestBody DnaRequest dnaRequest) {
        boolean isMutant = dnaService.saveDna(dnaRequest.getDna());
        DnaResponse dnaResponse = new DnaResponse(isMutant);
        if (isMutant) {
            return ResponseEntity.ok(dnaResponse);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }
    }

}
