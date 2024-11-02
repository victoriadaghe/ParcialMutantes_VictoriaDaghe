package org.demo.VDagheParcialDesarollo.dto;

import lombok.Getter;
import lombok.Setter;
import org.demo.VDagheParcialDesarollo.validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
