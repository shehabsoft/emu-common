package org.emu.common.dto.bpm;

import java.io.Serializable;

public class GenericDto<T> implements Serializable {
    public GenericDto() {
    }

    T obj;

    // constructor
    public GenericDto(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

}
