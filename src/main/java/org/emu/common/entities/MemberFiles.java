package org.emu.common.entities;

import java.io.Serializable;

public class MemberFiles implements Serializable {

    private static final long serialVersionUID = 1L;
 private Long id;

     private String fileName;

     private String fileType;

      private byte[] fileContent;

    private String fileContentContentType;

    private Member member;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberFiles id(Long id) {
        this.id = id;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public MemberFiles fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return this.fileType;
    }

    public MemberFiles fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getFileContent() {
        return this.fileContent;
    }

    public MemberFiles fileContent(byte[] fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileContentContentType() {
        return this.fileContentContentType;
    }

    public MemberFiles fileContentContentType(String fileContentContentType) {
        this.fileContentContentType = fileContentContentType;
        return this;
    }

    public void setFileContentContentType(String fileContentContentType) {
        this.fileContentContentType = fileContentContentType;
    }

    public Member getMember() {
        return this.member;
    }

    public MemberFiles member(Member member) {
        this.setMember(member);
        return this;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberFiles)) {
            return false;
        }
        return id != null && id.equals(((MemberFiles) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MemberFiles{" +
            "id=" + getId() +
            ", fileName='" + getFileName() + "'" +
            ", fileType='" + getFileType() + "'" +
            ", fileContent='" + getFileContent() + "'" +
            ", fileContentContentType='" + getFileContentContentType() + "'" +
            "}";
    }
}
