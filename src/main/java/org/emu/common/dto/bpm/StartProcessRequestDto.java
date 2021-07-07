
package org.emu.common.dto.bpm;
/**
 * Copyright 2021-2022 By Dirac Systems.
 *
 * Created by {@khalid.nouh on 1/4/2021}.
 */

public class StartProcessRequestDto {
    private String businessKey;

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @Override
    public String toString() {
        return "StartProcessRequestDto{" +
            "businessKey='" + businessKey + '\'' +
            '}';
    }
}
