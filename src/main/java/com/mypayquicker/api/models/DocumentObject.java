/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mypayquicker.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for DocumentObject type.
 */
public class DocumentObject
        extends BaseModel {
    private LocalDateTime createDate;
    private List<DocumentDetails> fields;
    private String filename;
    private String mimeType;
    private String token;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public DocumentObject() {
        token = "docu-2053aaad-c1a5-45e2-a2da-f71287f32800";
    }

    /**
     * Initialization constructor.
     * @param  createDate  LocalDateTime value for createDate.
     * @param  token  String value for token.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  fields  List of DocumentDetails value for fields.
     * @param  filename  String value for filename.
     * @param  mimeType  String value for mimeType.
     */
    public DocumentObject(
            LocalDateTime createDate,
            String token,
            List<HateoasSelfRef> links,
            List<DocumentDetails> fields,
            String filename,
            String mimeType) {
        this.createDate = createDate;
        this.fields = fields;
        this.filename = filename;
        this.mimeType = mimeType;
        this.token = token;
        this.links = links;
    }

    /**
     * Getter for CreateDate.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createDate")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * Setter for CreateDate.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param createDate Value for LocalDateTime
     */
    @JsonSetter("createDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * Getter for Fields.
     * @return Returns the List of DocumentDetails
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DocumentDetails> getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for List of DocumentDetails
     */
    @JsonSetter("fields")
    public void setFields(List<DocumentDetails> fields) {
        this.fields = fields;
    }

    /**
     * Getter for Filename.
     * The name given to a computer file in order to distinguish it from other files
     * @return Returns the String
     */
    @JsonGetter("filename")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilename() {
        return filename;
    }

    /**
     * Setter for Filename.
     * The name given to a computer file in order to distinguish it from other files
     * @param filename Value for String
     */
    @JsonSetter("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Getter for MimeType.
     * A label used to identify a type of data. Acts like a file extension on the internet.
     * @return Returns the String
     */
    @JsonGetter("mimeType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Setter for MimeType.
     * A label used to identify a type of data. Acts like a file extension on the internet.
     * @param mimeType Value for String
     */
    @JsonSetter("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Getter for Token.
     * [Token](#/rest/models/structures/token) representing the document
     * @return Returns the String
     */
    @JsonGetter("token")
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * [Token](#/rest/models/structures/token) representing the document
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Links.
     * @return Returns the List of HateoasSelfRef
     */
    @JsonGetter("links")
    public List<HateoasSelfRef> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for List of HateoasSelfRef
     */
    @JsonSetter("links")
    public void setLinks(List<HateoasSelfRef> links) {
        this.links = links;
    }

    /**
     * Converts this DocumentObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DocumentObject [" + "createDate=" + createDate + ", token=" + token + ", links="
                + links + ", fields=" + fields + ", filename=" + filename + ", mimeType=" + mimeType
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DocumentObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DocumentObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createDate, token, links)
                .fields(getFields())
                .filename(getFilename())
                .mimeType(getMimeType());
        return builder;
    }

    /**
     * Class to build instances of {@link DocumentObject}.
     */
    public static class Builder {
        private LocalDateTime createDate;
        private String token = "docu-2053aaad-c1a5-45e2-a2da-f71287f32800";
        private List<HateoasSelfRef> links;
        private List<DocumentDetails> fields;
        private String filename;
        private String mimeType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createDate  LocalDateTime value for createDate.
         * @param  token  String value for token.
         * @param  links  List of HateoasSelfRef value for links.
         */
        public Builder(LocalDateTime createDate, String token, List<HateoasSelfRef> links) {
            this.createDate = createDate;
            this.token = token;
            this.links = links;
        }

        /**
         * Setter for createDate.
         * @param  createDate  LocalDateTime value for createDate.
         * @return Builder
         */
        public Builder createDate(LocalDateTime createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for fields.
         * @param  fields  List of DocumentDetails value for fields.
         * @return Builder
         */
        public Builder fields(List<DocumentDetails> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Setter for filename.
         * @param  filename  String value for filename.
         * @return Builder
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Setter for mimeType.
         * @param  mimeType  String value for mimeType.
         * @return Builder
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        /**
         * Builds a new {@link DocumentObject} object using the set fields.
         * @return {@link DocumentObject}
         */
        public DocumentObject build() {
            return new DocumentObject(createDate, token, links, fields, filename, mimeType);
        }
    }
}
