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
 * This is a model class for StatementResult type.
 */
public class StatementResult
        extends BaseModel {
    private String fileContents;
    private String filename;
    private String mimeType;
    private String token;
    private String userToken;
    private String prepaidCardToken;
    private LocalDateTime from;
    private LocalDateTime to;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public StatementResult() {
    }

    /**
     * Initialization constructor.
     * @param  fileContents  String value for fileContents.
     * @param  filename  String value for filename.
     * @param  mimeType  String value for mimeType.
     * @param  token  String value for token.
     * @param  userToken  String value for userToken.
     * @param  prepaidCardToken  String value for prepaidCardToken.
     * @param  from  LocalDateTime value for from.
     * @param  to  LocalDateTime value for to.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public StatementResult(
            String fileContents,
            String filename,
            String mimeType,
            String token,
            String userToken,
            String prepaidCardToken,
            LocalDateTime from,
            LocalDateTime to,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.fileContents = fileContents;
        this.filename = filename;
        this.mimeType = mimeType;
        this.token = token;
        this.userToken = userToken;
        this.prepaidCardToken = prepaidCardToken;
        this.from = from;
        this.to = to;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for FileContents.
     * The string representation of the file content.
     * @return Returns the String
     */
    @JsonGetter("fileContents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFileContents() {
        return fileContents;
    }

    /**
     * Setter for FileContents.
     * The string representation of the file content.
     * @param fileContents Value for String
     */
    @JsonSetter("fileContents")
    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
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
     * Getter for UserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @return Returns the String
     */
    @JsonGetter("userToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserToken() {
        return userToken;
    }

    /**
     * Setter for UserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @param userToken Value for String
     */
    @JsonSetter("userToken")
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * Getter for PrepaidCardToken.
     * Auto-generated unique identifier representing a dest, prefixed with dest-.
     * @return Returns the String
     */
    @JsonGetter("prepaidCardToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrepaidCardToken() {
        return prepaidCardToken;
    }

    /**
     * Setter for PrepaidCardToken.
     * Auto-generated unique identifier representing a dest, prefixed with dest-.
     * @param prepaidCardToken Value for String
     */
    @JsonSetter("prepaidCardToken")
    public void setPrepaidCardToken(String prepaidCardToken) {
        this.prepaidCardToken = prepaidCardToken;
    }

    /**
     * Getter for From.
     * Beginning date and time of a prepaid card statement
     * @return Returns the LocalDateTime
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * Beginning date and time of a prepaid card statement
     * @param from Value for LocalDateTime
     */
    @JsonSetter("from")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    /**
     * Getter for To.
     * Ending date and time of a prepaid card statement
     * @return Returns the LocalDateTime
     */
    @JsonGetter("to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTo() {
        return to;
    }

    /**
     * Setter for To.
     * Ending date and time of a prepaid card statement
     * @param to Value for LocalDateTime
     */
    @JsonSetter("to")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTo(LocalDateTime to) {
        this.to = to;
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
     * Converts this StatementResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StatementResult [" + "fileContents=" + fileContents + ", filename=" + filename
                + ", mimeType=" + mimeType + ", token=" + token + ", userToken=" + userToken
                + ", prepaidCardToken=" + prepaidCardToken + ", from=" + from + ", to=" + to
                + ", links=" + links + ", meta=" + meta + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link StatementResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StatementResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fileContents(getFileContents())
                .filename(getFilename())
                .mimeType(getMimeType())
                .token(getToken())
                .userToken(getUserToken())
                .prepaidCardToken(getPrepaidCardToken())
                .from(getFrom())
                .to(getTo())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link StatementResult}.
     */
    public static class Builder {
        private String fileContents;
        private String filename;
        private String mimeType;
        private String token;
        private String userToken;
        private String prepaidCardToken;
        private LocalDateTime from;
        private LocalDateTime to;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;



        /**
         * Setter for fileContents.
         * @param  fileContents  String value for fileContents.
         * @return Builder
         */
        public Builder fileContents(String fileContents) {
            this.fileContents = fileContents;
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
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for userToken.
         * @param  userToken  String value for userToken.
         * @return Builder
         */
        public Builder userToken(String userToken) {
            this.userToken = userToken;
            return this;
        }

        /**
         * Setter for prepaidCardToken.
         * @param  prepaidCardToken  String value for prepaidCardToken.
         * @return Builder
         */
        public Builder prepaidCardToken(String prepaidCardToken) {
            this.prepaidCardToken = prepaidCardToken;
            return this;
        }

        /**
         * Setter for from.
         * @param  from  LocalDateTime value for from.
         * @return Builder
         */
        public Builder from(LocalDateTime from) {
            this.from = from;
            return this;
        }

        /**
         * Setter for to.
         * @param  to  LocalDateTime value for to.
         * @return Builder
         */
        public Builder to(LocalDateTime to) {
            this.to = to;
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
         * Builds a new {@link StatementResult} object using the set fields.
         * @return {@link StatementResult}
         */
        public StatementResult build() {
            return new StatementResult(fileContents, filename, mimeType, token, userToken,
                    prepaidCardToken, from, to, links, meta);
        }
    }
}
