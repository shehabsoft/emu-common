package org.emu.common.entities;

import java.io.Serializable;

public class StpMessage extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String key;

    private String descAr;

    private String descEn;

    private String messageAr;

    private String messageEn;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StpMessage id(Long id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StpMessage key(String key) {
        this.key = key;
        return this;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescAr() {
        return this.descAr;
    }

    public StpMessage descAr(String descAr) {
        this.descAr = descAr;
        return this;
    }

    public void setDescAr(String descAr) {
        this.descAr = descAr;
    }

    public String getDescEn() {
        return this.descEn;
    }

    public StpMessage descEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getMessageAr() {
        return this.messageAr;
    }

    public StpMessage messageAr(String messageAr) {
        this.messageAr = messageAr;
        return this;
    }

    public void setMessageAr(String messageAr) {
        this.messageAr = messageAr;
    }

    public String getMessageEn() {
        return this.messageEn;
    }

    public StpMessage messageEn(String messageEn) {
        this.messageEn = messageEn;
        return this;
    }

    public void setMessageEn(String messageEn) {
        this.messageEn = messageEn;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StpMessage)) {
            return false;
        }
        return id != null && id.equals(((StpMessage) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StpMessage{" +
            "id=" + getId() +
            ", key='" + getKey() + "'" +
            ", descAr='" + getDescAr() + "'" +
            ", descEn='" + getDescEn() + "'" +
            ", messageAr='" + getMessageAr() + "'" +
            ", messageEn='" + getMessageEn() + "'" +
            "}";
    }
}
