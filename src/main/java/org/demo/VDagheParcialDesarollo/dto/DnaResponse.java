package org.demo.VDagheParcialDesarollo.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class DnaResponse {
    private boolean isMutant;

    public boolean isMutant() {
        return isMutant;
    }
}
