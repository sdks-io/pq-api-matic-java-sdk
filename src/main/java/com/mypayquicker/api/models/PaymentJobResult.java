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
 * This is a model class for PaymentJobResult type.
 */
public class PaymentJobResult
        extends BaseModel {
    private String token;
    private String portalId;
    private String filename;
    private String fileToken;
    private LocalDateTime created;
    private LocalDateTime notBefore;
    private Integer count;
    private JobTypes type;
    private JobStatusTypes status;
    private List<PaymentObject> items;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public PaymentJobResult() {
        fileToken = "docu-2053aaad-c1a5-45e2-a2da-f71287f32800";
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  portalId  String value for portalId.
     * @param  filename  String value for filename.
     * @param  fileToken  String value for fileToken.
     * @param  created  LocalDateTime value for created.
     * @param  notBefore  LocalDateTime value for notBefore.
     * @param  count  Integer value for count.
     * @param  type  JobTypes value for type.
     * @param  status  JobStatusTypes value for status.
     * @param  items  List of PaymentObject value for items.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public PaymentJobResult(
            String token,
            String portalId,
            String filename,
            String fileToken,
            LocalDateTime created,
            LocalDateTime notBefore,
            Integer count,
            JobTypes type,
            JobStatusTypes status,
            List<PaymentObject> items,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.portalId = portalId;
        this.filename = filename;
        this.fileToken = fileToken;
        this.created = created;
        this.notBefore = notBefore;
        this.count = count;
        this.type = type;
        this.status = status;
        this.items = items;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for PortalId.
     * Reference ID in the PayQuicker Hosted Portal, if applicable.
     * @return Returns the String
     */
    @JsonGetter("portalId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPortalId() {
        return portalId;
    }

    /**
     * Setter for PortalId.
     * Reference ID in the PayQuicker Hosted Portal, if applicable.
     * @param portalId Value for String
     */
    @JsonSetter("portalId")
    public void setPortalId(String portalId) {
        this.portalId = portalId;
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
     * Getter for FileToken.
     * [Token](#/rest/models/structures/token) representing the document
     * @return Returns the String
     */
    @JsonGetter("fileToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFileToken() {
        return fileToken;
    }

    /**
     * Setter for FileToken.
     * [Token](#/rest/models/structures/token) representing the document
     * @param fileToken Value for String
     */
    @JsonSetter("fileToken")
    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    /**
     * Getter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param created Value for LocalDateTime
     */
    @JsonSetter("created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    /**
     * Getter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notBefore")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Setter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @param notBefore Value for LocalDateTime
     */
    @JsonSetter("notBefore")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotBefore(LocalDateTime notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * Getter for Count.
     * @return Returns the Integer
     */
    @JsonGetter("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * @param count Value for Integer
     */
    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Getter for Type.
     * Job Types
     * @return Returns the JobTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JobTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Job Types
     * @param type Value for JobTypes
     */
    @JsonSetter("type")
    public void setType(JobTypes type) {
        this.type = type;
    }

    /**
     * Getter for Status.
     * Job Status Types
     * @return Returns the JobStatusTypes
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JobStatusTypes getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Job Status Types
     * @param status Value for JobStatusTypes
     */
    @JsonSetter("status")
    public void setStatus(JobStatusTypes status) {
        this.status = status;
    }

    /**
     * Getter for Items.
     * @return Returns the List of PaymentObject
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PaymentObject> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of PaymentObject
     */
    @JsonSetter("items")
    public void setItems(List<PaymentObject> items) {
        this.items = items;
    }

    /**
     * Getter for Links.
     * @return Returns the List of HateoasSelfRef
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Meta.
     * @return Returns the MetadataItems
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetadataItems getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for MetadataItems
     */
    @JsonSetter("meta")
    public void setMeta(MetadataItems meta) {
        this.meta = meta;
    }

    /**
     * Converts this PaymentJobResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentJobResult [" + "token=" + token + ", portalId=" + portalId + ", filename="
                + filename + ", fileToken=" + fileToken + ", created=" + created + ", notBefore="
                + notBefore + ", count=" + count + ", type=" + type + ", status=" + status
                + ", items=" + items + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaymentJobResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentJobResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .portalId(getPortalId())
                .filename(getFilename())
                .fileToken(getFileToken())
                .created(getCreated())
                .notBefore(getNotBefore())
                .count(getCount())
                .type(getType())
                .status(getStatus())
                .items(getItems())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentJobResult}.
     */
    public static class Builder {
        private String token;
        private String portalId;
        private String filename;
        private String fileToken = "docu-2053aaad-c1a5-45e2-a2da-f71287f32800";
        private LocalDateTime created;
        private LocalDateTime notBefore;
        private Integer count;
        private JobTypes type;
        private JobStatusTypes status;
        private List<PaymentObject> items;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;



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
         * Setter for portalId.
         * @param  portalId  String value for portalId.
         * @return Builder
         */
        public Builder portalId(String portalId) {
            this.portalId = portalId;
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
         * Setter for fileToken.
         * @param  fileToken  String value for fileToken.
         * @return Builder
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  LocalDateTime value for created.
         * @return Builder
         */
        public Builder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        /**
         * Setter for notBefore.
         * @param  notBefore  LocalDateTime value for notBefore.
         * @return Builder
         */
        public Builder notBefore(LocalDateTime notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * Setter for count.
         * @param  count  Integer value for count.
         * @return Builder
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  JobTypes value for type.
         * @return Builder
         */
        public Builder type(JobTypes type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  JobStatusTypes value for status.
         * @return Builder
         */
        public Builder status(JobStatusTypes status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of PaymentObject value for items.
         * @return Builder
         */
        public Builder items(List<PaymentObject> items) {
            this.items = items;
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
         * Setter for meta.
         * @param  meta  MetadataItems value for meta.
         * @return Builder
         */
        public Builder meta(MetadataItems meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link PaymentJobResult} object using the set fields.
         * @return {@link PaymentJobResult}
         */
        public PaymentJobResult build() {
            return new PaymentJobResult(token, portalId, filename, fileToken, created, notBefore,
                    count, type, status, items, links, meta);
        }
    }
}
