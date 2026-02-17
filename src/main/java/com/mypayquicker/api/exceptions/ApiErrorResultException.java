/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ApiErrorResultException type.
 */
public class ApiErrorResultException extends ApiException {
    private static final long serialVersionUID = -3146624316305666706L;
    private String severity;
    private String error;
    private double code;
    private String message;
    private String referenceId;
    private String timestamp;
    private String requestRef;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ApiErrorResultException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Severity.
     * Error Severity
     * @return Returns the String
     */
    @JsonGetter("severity")
    public String getSeverity() {
        return this.severity;
    }

    /**
     * Setter for Severity.
     * Error Severity
     * @param severity Value for String
     */
    @JsonSetter("severity")
    private void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * Getter for Error.
     * Error Code Name
     * @return Returns the String
     */
    @JsonGetter("error")
    public String getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * Error Code Name
     * @param error Value for String
     */
    @JsonSetter("error")
    private void setError(String error) {
        this.error = error;
    }

    /**
     * Getter for Code.
     * Error Code Number
     * @return Returns the double
     */
    @JsonGetter("code")
    public double getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * Error Code Number
     * @param code Value for double
     */
    @JsonSetter("code")
    private void setCode(double code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * Description of the error.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Description of the error.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }

    /**
     * Getter for ReferenceId.
     * Reference ID for issue tracking.
     * @return Returns the String
     */
    @JsonGetter("referenceId")
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * Setter for ReferenceId.
     * Reference ID for issue tracking.
     * @param referenceId Value for String
     */
    @JsonSetter("referenceId")
    private void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Getter for Timestamp.
     * Timestamp of when the error occurred.
     * @return Returns the String
     */
    @JsonGetter("timestamp")
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for Timestamp.
     * Timestamp of when the error occurred.
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    private void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for RequestRef.
     * Request reference for issue tracking.
     * @return Returns the String
     */
    @JsonGetter("requestRef")
    public String getRequestRef() {
        return this.requestRef;
    }

    /**
     * Setter for RequestRef.
     * Request reference for issue tracking.
     * @param requestRef Value for String
     */
    @JsonSetter("requestRef")
    private void setRequestRef(String requestRef) {
        this.requestRef = requestRef;
    }

    /**
     * Converts this ApiErrorResultException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiErrorResultException [" + "statusCode=" + getResponseCode() + ", message="
                + getMessage() + ", severity=" + severity + ", error=" + error + ", code=" + code
                + ", message=" + message + ", referenceId=" + referenceId + ", timestamp="
                + timestamp + ", requestRef=" + requestRef + "]";
    }
}
