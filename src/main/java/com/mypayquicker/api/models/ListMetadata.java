/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ListMetadata type.
 */
public class ListMetadata
        extends BaseModel {
    private String pageNo;
    private String pageSize;
    private String pageCount;
    private String recordCount;
    private String timezone;
    private String requestRef;

    /**
     * Default constructor.
     */
    public ListMetadata() {
        pageNo = "1";
        pageSize = "10";
        pageCount = "1";
    }

    /**
     * Initialization constructor.
     * @param  pageNo  String value for pageNo.
     * @param  pageSize  String value for pageSize.
     * @param  pageCount  String value for pageCount.
     * @param  recordCount  String value for recordCount.
     * @param  timezone  String value for timezone.
     * @param  requestRef  String value for requestRef.
     */
    public ListMetadata(
            String pageNo,
            String pageSize,
            String pageCount,
            String recordCount,
            String timezone,
            String requestRef) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.recordCount = recordCount;
        this.timezone = timezone;
        this.requestRef = requestRef;
    }

    /**
     * Getter for PageNo.
     * @return Returns the String
     */
    @JsonGetter("pageNo")
    public String getPageNo() {
        return pageNo;
    }

    /**
     * Setter for PageNo.
     * @param pageNo Value for String
     */
    @JsonSetter("pageNo")
    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * Getter for PageSize.
     * @return Returns the String
     */
    @JsonGetter("pageSize")
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * @param pageSize Value for String
     */
    @JsonSetter("pageSize")
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for PageCount.
     * @return Returns the String
     */
    @JsonGetter("pageCount")
    public String getPageCount() {
        return pageCount;
    }

    /**
     * Setter for PageCount.
     * @param pageCount Value for String
     */
    @JsonSetter("pageCount")
    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * Getter for RecordCount.
     * @return Returns the String
     */
    @JsonGetter("recordCount")
    public String getRecordCount() {
        return recordCount;
    }

    /**
     * Setter for RecordCount.
     * @param recordCount Value for String
     */
    @JsonSetter("recordCount")
    public void setRecordCount(String recordCount) {
        this.recordCount = recordCount;
    }

    /**
     * Getter for Timezone.
     * Timezone of the datetime objects in the response
     * @return Returns the String
     */
    @JsonGetter("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Setter for Timezone.
     * Timezone of the datetime objects in the response
     * @param timezone Value for String
     */
    @JsonSetter("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Getter for RequestRef.
     * @return Returns the String
     */
    @JsonGetter("requestRef")
    public String getRequestRef() {
        return requestRef;
    }

    /**
     * Setter for RequestRef.
     * @param requestRef Value for String
     */
    @JsonSetter("requestRef")
    public void setRequestRef(String requestRef) {
        this.requestRef = requestRef;
    }

    /**
     * Converts this ListMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMetadata [" + "pageNo=" + pageNo + ", pageSize=" + pageSize + ", pageCount="
                + pageCount + ", recordCount=" + recordCount + ", timezone=" + timezone
                + ", requestRef=" + requestRef + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pageNo, pageSize, pageCount, recordCount, timezone,
                requestRef);
        return builder;
    }

    /**
     * Class to build instances of {@link ListMetadata}.
     */
    public static class Builder {
        private String pageNo = "1";
        private String pageSize = "10";
        private String pageCount = "1";
        private String recordCount;
        private String timezone;
        private String requestRef;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pageNo  String value for pageNo.
         * @param  pageSize  String value for pageSize.
         * @param  pageCount  String value for pageCount.
         * @param  recordCount  String value for recordCount.
         * @param  timezone  String value for timezone.
         * @param  requestRef  String value for requestRef.
         */
        public Builder(String pageNo, String pageSize, String pageCount, String recordCount,
                String timezone, String requestRef) {
            this.pageNo = pageNo;
            this.pageSize = pageSize;
            this.pageCount = pageCount;
            this.recordCount = recordCount;
            this.timezone = timezone;
            this.requestRef = requestRef;
        }

        /**
         * Setter for pageNo.
         * @param  pageNo  String value for pageNo.
         * @return Builder
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  String value for pageSize.
         * @return Builder
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Setter for pageCount.
         * @param  pageCount  String value for pageCount.
         * @return Builder
         */
        public Builder pageCount(String pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * Setter for recordCount.
         * @param  recordCount  String value for recordCount.
         * @return Builder
         */
        public Builder recordCount(String recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * Setter for timezone.
         * @param  timezone  String value for timezone.
         * @return Builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Setter for requestRef.
         * @param  requestRef  String value for requestRef.
         * @return Builder
         */
        public Builder requestRef(String requestRef) {
            this.requestRef = requestRef;
            return this;
        }

        /**
         * Builds a new {@link ListMetadata} object using the set fields.
         * @return {@link ListMetadata}
         */
        public ListMetadata build() {
            return new ListMetadata(pageNo, pageSize, pageCount, recordCount, timezone, requestRef);
        }
    }
}
