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
 * This is a model class for IdvCheckResult type.
 */
public class IdvCheckResult
        extends BaseModel {
    private String token;
    private String userToken;
    private String idvProviderReference;
    private IdentityVerificationResultTypes idvResult;
    private IdentityVerificationResultSubTypes idvSubResult;
    private IdentityVerificationProviders idvProvider;
    private LocalDateTime createdOn;
    private String raw;
    private String idvCheckType;
    private String idvDisposition;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public IdvCheckResult() {
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  userToken  String value for userToken.
     * @param  idvProviderReference  String value for idvProviderReference.
     * @param  idvResult  IdentityVerificationResultTypes value for idvResult.
     * @param  idvSubResult  IdentityVerificationResultSubTypes value for idvSubResult.
     * @param  idvProvider  IdentityVerificationProviders value for idvProvider.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  raw  String value for raw.
     * @param  idvCheckType  String value for idvCheckType.
     * @param  idvDisposition  String value for idvDisposition.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public IdvCheckResult(
            String token,
            String userToken,
            String idvProviderReference,
            IdentityVerificationResultTypes idvResult,
            IdentityVerificationResultSubTypes idvSubResult,
            IdentityVerificationProviders idvProvider,
            LocalDateTime createdOn,
            String raw,
            String idvCheckType,
            String idvDisposition,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.userToken = userToken;
        this.idvProviderReference = idvProviderReference;
        this.idvResult = idvResult;
        this.idvSubResult = idvSubResult;
        this.idvProvider = idvProvider;
        this.createdOn = createdOn;
        this.raw = raw;
        this.idvCheckType = idvCheckType;
        this.idvDisposition = idvDisposition;
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
     * Getter for UserToken.
     * [Token](#/rest/models/structures/token) representing the resource
     * @return Returns the String
     */
    @JsonGetter("userToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserToken() {
        return userToken;
    }

    /**
     * Setter for UserToken.
     * [Token](#/rest/models/structures/token) representing the resource
     * @param userToken Value for String
     */
    @JsonSetter("userToken")
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * Getter for IdvProviderReference.
     * [Provider reference](#/rest/models/structures/identity-verification-provider-reference) used
     * for performing identity checks for the provider
     * @return Returns the String
     */
    @JsonGetter("idvProviderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIdvProviderReference() {
        return idvProviderReference;
    }

    /**
     * Setter for IdvProviderReference.
     * [Provider reference](#/rest/models/structures/identity-verification-provider-reference) used
     * for performing identity checks for the provider
     * @param idvProviderReference Value for String
     */
    @JsonSetter("idvProviderReference")
    public void setIdvProviderReference(String idvProviderReference) {
        this.idvProviderReference = idvProviderReference;
    }

    /**
     * Getter for IdvResult.
     * Result type of [verification](#/rest/models/structures/identity-verification-result-type)
     * @return Returns the IdentityVerificationResultTypes
     */
    @JsonGetter("idvResult")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdentityVerificationResultTypes getIdvResult() {
        return idvResult;
    }

    /**
     * Setter for IdvResult.
     * Result type of [verification](#/rest/models/structures/identity-verification-result-type)
     * @param idvResult Value for IdentityVerificationResultTypes
     */
    @JsonSetter("idvResult")
    public void setIdvResult(IdentityVerificationResultTypes idvResult) {
        this.idvResult = idvResult;
    }

    /**
     * Getter for IdvSubResult.
     * Sub result type of
     * [verification](#/rest/models/structures/identity-verification-sub-result-type)
     * @return Returns the IdentityVerificationResultSubTypes
     */
    @JsonGetter("idvSubResult")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdentityVerificationResultSubTypes getIdvSubResult() {
        return idvSubResult;
    }

    /**
     * Setter for IdvSubResult.
     * Sub result type of
     * [verification](#/rest/models/structures/identity-verification-sub-result-type)
     * @param idvSubResult Value for IdentityVerificationResultSubTypes
     */
    @JsonSetter("idvSubResult")
    public void setIdvSubResult(IdentityVerificationResultSubTypes idvSubResult) {
        this.idvSubResult = idvSubResult;
    }

    /**
     * Getter for IdvProvider.
     * Provider types of
     * [verification](#/rest/models/structures/identity-verification-provider-type) that can be used
     * for performing identity checks
     * @return Returns the IdentityVerificationProviders
     */
    @JsonGetter("idvProvider")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdentityVerificationProviders getIdvProvider() {
        return idvProvider;
    }

    /**
     * Setter for IdvProvider.
     * Provider types of
     * [verification](#/rest/models/structures/identity-verification-provider-type) that can be used
     * for performing identity checks
     * @param idvProvider Value for IdentityVerificationProviders
     */
    @JsonSetter("idvProvider")
    public void setIdvProvider(IdentityVerificationProviders idvProvider) {
        this.idvProvider = idvProvider;
    }

    /**
     * Getter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createdOn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("createdOn")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Raw.
     * Contains the raw (unprocessed)
     * [output](/#/rest/models/structures/identity-verification-provider-raw-output) from the IDV
     * provider
     * @return Returns the String
     */
    @JsonGetter("raw")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRaw() {
        return raw;
    }

    /**
     * Setter for Raw.
     * Contains the raw (unprocessed)
     * [output](/#/rest/models/structures/identity-verification-provider-raw-output) from the IDV
     * provider
     * @param raw Value for String
     */
    @JsonSetter("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * Getter for IdvCheckType.
     * [Type](#/rest/models/structures/identity-verification-check-type) of verification used for
     * performing an identity check
     * @return Returns the String
     */
    @JsonGetter("idvCheckType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIdvCheckType() {
        return idvCheckType;
    }

    /**
     * Setter for IdvCheckType.
     * [Type](#/rest/models/structures/identity-verification-check-type) of verification used for
     * performing an identity check
     * @param idvCheckType Value for String
     */
    @JsonSetter("idvCheckType")
    public void setIdvCheckType(String idvCheckType) {
        this.idvCheckType = idvCheckType;
    }

    /**
     * Getter for IdvDisposition.
     * Disposition type of
     * [verification](#/rest/models/structures/identity-verification-disposition-type)
     * @return Returns the String
     */
    @JsonGetter("idvDisposition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIdvDisposition() {
        return idvDisposition;
    }

    /**
     * Setter for IdvDisposition.
     * Disposition type of
     * [verification](#/rest/models/structures/identity-verification-disposition-type)
     * @param idvDisposition Value for String
     */
    @JsonSetter("idvDisposition")
    public void setIdvDisposition(String idvDisposition) {
        this.idvDisposition = idvDisposition;
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
     * Converts this IdvCheckResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IdvCheckResult [" + "token=" + token + ", userToken=" + userToken
                + ", idvProviderReference=" + idvProviderReference + ", idvResult=" + idvResult
                + ", idvSubResult=" + idvSubResult + ", idvProvider=" + idvProvider + ", createdOn="
                + createdOn + ", raw=" + raw + ", idvCheckType=" + idvCheckType
                + ", idvDisposition=" + idvDisposition + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link IdvCheckResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IdvCheckResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .userToken(getUserToken())
                .idvProviderReference(getIdvProviderReference())
                .idvResult(getIdvResult())
                .idvSubResult(getIdvSubResult())
                .idvProvider(getIdvProvider())
                .createdOn(getCreatedOn())
                .raw(getRaw())
                .idvCheckType(getIdvCheckType())
                .idvDisposition(getIdvDisposition())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link IdvCheckResult}.
     */
    public static class Builder {
        private String token;
        private String userToken;
        private String idvProviderReference;
        private IdentityVerificationResultTypes idvResult;
        private IdentityVerificationResultSubTypes idvSubResult;
        private IdentityVerificationProviders idvProvider;
        private LocalDateTime createdOn;
        private String raw;
        private String idvCheckType;
        private String idvDisposition;
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
         * Setter for userToken.
         * @param  userToken  String value for userToken.
         * @return Builder
         */
        public Builder userToken(String userToken) {
            this.userToken = userToken;
            return this;
        }

        /**
         * Setter for idvProviderReference.
         * @param  idvProviderReference  String value for idvProviderReference.
         * @return Builder
         */
        public Builder idvProviderReference(String idvProviderReference) {
            this.idvProviderReference = idvProviderReference;
            return this;
        }

        /**
         * Setter for idvResult.
         * @param  idvResult  IdentityVerificationResultTypes value for idvResult.
         * @return Builder
         */
        public Builder idvResult(IdentityVerificationResultTypes idvResult) {
            this.idvResult = idvResult;
            return this;
        }

        /**
         * Setter for idvSubResult.
         * @param  idvSubResult  IdentityVerificationResultSubTypes value for idvSubResult.
         * @return Builder
         */
        public Builder idvSubResult(IdentityVerificationResultSubTypes idvSubResult) {
            this.idvSubResult = idvSubResult;
            return this;
        }

        /**
         * Setter for idvProvider.
         * @param  idvProvider  IdentityVerificationProviders value for idvProvider.
         * @return Builder
         */
        public Builder idvProvider(IdentityVerificationProviders idvProvider) {
            this.idvProvider = idvProvider;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for raw.
         * @param  raw  String value for raw.
         * @return Builder
         */
        public Builder raw(String raw) {
            this.raw = raw;
            return this;
        }

        /**
         * Setter for idvCheckType.
         * @param  idvCheckType  String value for idvCheckType.
         * @return Builder
         */
        public Builder idvCheckType(String idvCheckType) {
            this.idvCheckType = idvCheckType;
            return this;
        }

        /**
         * Setter for idvDisposition.
         * @param  idvDisposition  String value for idvDisposition.
         * @return Builder
         */
        public Builder idvDisposition(String idvDisposition) {
            this.idvDisposition = idvDisposition;
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
         * Builds a new {@link IdvCheckResult} object using the set fields.
         * @return {@link IdvCheckResult}
         */
        public IdvCheckResult build() {
            return new IdvCheckResult(token, userToken, idvProviderReference, idvResult,
                    idvSubResult, idvProvider, createdOn, raw, idvCheckType, idvDisposition, links,
                    meta);
        }
    }
}
