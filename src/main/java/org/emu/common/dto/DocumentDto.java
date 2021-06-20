package org.emu.common.dto;

import java.io.InputStream;
import java.util.List;

public class DocumentDto implements IDto {

    private Long documentOwnerId;
    private String ownerType;//hosiptial -pharmacy -member
    private List<DocumentDetails>documentDetailsList;

    public Long getDocumentOwnerId() {
        return documentOwnerId;
    }

    public void setDocumentOwnerId(Long documentOwnerId) {
        this.documentOwnerId = documentOwnerId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public List<DocumentDetails> getDocumentDetailsList() {
        return documentDetailsList;
    }

    public void setDocumentDetailsList(List<DocumentDetails> documentDetailsList) {
        this.documentDetailsList = documentDetailsList;
    }

    @Override
    public long getId() {
        return 0;
    }
}
