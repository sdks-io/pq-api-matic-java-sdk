/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for UserEventResult type.
 */
public class UserEventResult
        extends BaseModel {
    private String token;
    private Boolean canBeCancelled;
    private EventRequirementCategories eventRequirementCategoryType;
    private EventRequirements eventRequirementType;
    private EventStatuses eventStatus;
    private EventTypes eventType;
    private Boolean isComplete;
    private UserAction userAction;
    private UserImpact userImpact;
    private EventCategoryTypes event;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public UserEventResult() {
    }

    /**
     * Initialization constructor.
     * @param  event  EventCategoryTypes value for event.
     * @param  token  String value for token.
     * @param  canBeCancelled  Boolean value for canBeCancelled.
     * @param  eventRequirementCategoryType  EventRequirementCategories value for
     *         eventRequirementCategoryType.
     * @param  eventRequirementType  EventRequirements value for eventRequirementType.
     * @param  eventStatus  EventStatuses value for eventStatus.
     * @param  eventType  EventTypes value for eventType.
     * @param  isComplete  Boolean value for isComplete.
     * @param  userAction  UserAction value for userAction.
     * @param  userImpact  UserImpact value for userImpact.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public UserEventResult(
            EventCategoryTypes event,
            String token,
            Boolean canBeCancelled,
            EventRequirementCategories eventRequirementCategoryType,
            EventRequirements eventRequirementType,
            EventStatuses eventStatus,
            EventTypes eventType,
            Boolean isComplete,
            UserAction userAction,
            UserImpact userImpact,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.canBeCancelled = canBeCancelled;
        this.eventRequirementCategoryType = eventRequirementCategoryType;
        this.eventRequirementType = eventRequirementType;
        this.eventStatus = eventStatus;
        this.eventType = eventType;
        this.isComplete = isComplete;
        this.userAction = userAction;
        this.userImpact = userImpact;
        this.event = event;
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
     * Getter for CanBeCancelled.
     * @return Returns the Boolean
     */
    @JsonGetter("canBeCancelled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCanBeCancelled() {
        return canBeCancelled;
    }

    /**
     * Setter for CanBeCancelled.
     * @param canBeCancelled Value for Boolean
     */
    @JsonSetter("canBeCancelled")
    public void setCanBeCancelled(Boolean canBeCancelled) {
        this.canBeCancelled = canBeCancelled;
    }

    /**
     * Getter for EventRequirementCategoryType.
     * @return Returns the EventRequirementCategories
     */
    @JsonGetter("eventRequirementCategoryType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EventRequirementCategories getEventRequirementCategoryType() {
        return eventRequirementCategoryType;
    }

    /**
     * Setter for EventRequirementCategoryType.
     * @param eventRequirementCategoryType Value for EventRequirementCategories
     */
    @JsonSetter("eventRequirementCategoryType")
    public void setEventRequirementCategoryType(EventRequirementCategories eventRequirementCategoryType) {
        this.eventRequirementCategoryType = eventRequirementCategoryType;
    }

    /**
     * Getter for EventRequirementType.
     * @return Returns the EventRequirements
     */
    @JsonGetter("eventRequirementType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EventRequirements getEventRequirementType() {
        return eventRequirementType;
    }

    /**
     * Setter for EventRequirementType.
     * @param eventRequirementType Value for EventRequirements
     */
    @JsonSetter("eventRequirementType")
    public void setEventRequirementType(EventRequirements eventRequirementType) {
        this.eventRequirementType = eventRequirementType;
    }

    /**
     * Getter for EventStatus.
     * Indicates the current verification status type of an event.
     * @return Returns the EventStatuses
     */
    @JsonGetter("eventStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EventStatuses getEventStatus() {
        return eventStatus;
    }

    /**
     * Setter for EventStatus.
     * Indicates the current verification status type of an event.
     * @param eventStatus Value for EventStatuses
     */
    @JsonSetter("eventStatus")
    public void setEventStatus(EventStatuses eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * Getter for EventType.
     * @return Returns the EventTypes
     */
    @JsonGetter("eventType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EventTypes getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * @param eventType Value for EventTypes
     */
    @JsonSetter("eventType")
    public void setEventType(EventTypes eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for IsComplete.
     * @return Returns the Boolean
     */
    @JsonGetter("isComplete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsComplete() {
        return isComplete;
    }

    /**
     * Setter for IsComplete.
     * @param isComplete Value for Boolean
     */
    @JsonSetter("isComplete")
    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * Getter for UserAction.
     * @return Returns the UserAction
     */
    @JsonGetter("userAction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserAction getUserAction() {
        return userAction;
    }

    /**
     * Setter for UserAction.
     * @param userAction Value for UserAction
     */
    @JsonSetter("userAction")
    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    /**
     * Getter for UserImpact.
     * @return Returns the UserImpact
     */
    @JsonGetter("userImpact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserImpact getUserImpact() {
        return userImpact;
    }

    /**
     * Setter for UserImpact.
     * @param userImpact Value for UserImpact
     */
    @JsonSetter("userImpact")
    public void setUserImpact(UserImpact userImpact) {
        this.userImpact = userImpact;
    }

    /**
     * Getter for Event.
     * The type of Registration tied to a particular event
     * @return Returns the EventCategoryTypes
     */
    @JsonGetter("event")
    public EventCategoryTypes getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * The type of Registration tied to a particular event
     * @param event Value for EventCategoryTypes
     */
    @JsonSetter("event")
    public void setEvent(EventCategoryTypes event) {
        this.event = event;
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
     * Converts this UserEventResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserEventResult [" + "event=" + event + ", token=" + token + ", canBeCancelled="
                + canBeCancelled + ", eventRequirementCategoryType=" + eventRequirementCategoryType
                + ", eventRequirementType=" + eventRequirementType + ", eventStatus=" + eventStatus
                + ", eventType=" + eventType + ", isComplete=" + isComplete + ", userAction="
                + userAction + ", userImpact=" + userImpact + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UserEventResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserEventResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(event)
                .token(getToken())
                .canBeCancelled(getCanBeCancelled())
                .eventRequirementCategoryType(getEventRequirementCategoryType())
                .eventRequirementType(getEventRequirementType())
                .eventStatus(getEventStatus())
                .eventType(getEventType())
                .isComplete(getIsComplete())
                .userAction(getUserAction())
                .userImpact(getUserImpact())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link UserEventResult}.
     */
    public static class Builder {
        private EventCategoryTypes event;
        private String token;
        private Boolean canBeCancelled;
        private EventRequirementCategories eventRequirementCategoryType;
        private EventRequirements eventRequirementType;
        private EventStatuses eventStatus;
        private EventTypes eventType;
        private Boolean isComplete;
        private UserAction userAction;
        private UserImpact userImpact;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  event  EventCategoryTypes value for event.
         */
        public Builder(EventCategoryTypes event) {
            this.event = event;
        }

        /**
         * Setter for event.
         * @param  event  EventCategoryTypes value for event.
         * @return Builder
         */
        public Builder event(EventCategoryTypes event) {
            this.event = event;
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
         * Setter for canBeCancelled.
         * @param  canBeCancelled  Boolean value for canBeCancelled.
         * @return Builder
         */
        public Builder canBeCancelled(Boolean canBeCancelled) {
            this.canBeCancelled = canBeCancelled;
            return this;
        }

        /**
         * Setter for eventRequirementCategoryType.
         * @param  eventRequirementCategoryType  EventRequirementCategories value for
         *         eventRequirementCategoryType.
         * @return Builder
         */
        public Builder eventRequirementCategoryType(
                EventRequirementCategories eventRequirementCategoryType) {
            this.eventRequirementCategoryType = eventRequirementCategoryType;
            return this;
        }

        /**
         * Setter for eventRequirementType.
         * @param  eventRequirementType  EventRequirements value for eventRequirementType.
         * @return Builder
         */
        public Builder eventRequirementType(EventRequirements eventRequirementType) {
            this.eventRequirementType = eventRequirementType;
            return this;
        }

        /**
         * Setter for eventStatus.
         * @param  eventStatus  EventStatuses value for eventStatus.
         * @return Builder
         */
        public Builder eventStatus(EventStatuses eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * Setter for eventType.
         * @param  eventType  EventTypes value for eventType.
         * @return Builder
         */
        public Builder eventType(EventTypes eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for isComplete.
         * @param  isComplete  Boolean value for isComplete.
         * @return Builder
         */
        public Builder isComplete(Boolean isComplete) {
            this.isComplete = isComplete;
            return this;
        }

        /**
         * Setter for userAction.
         * @param  userAction  UserAction value for userAction.
         * @return Builder
         */
        public Builder userAction(UserAction userAction) {
            this.userAction = userAction;
            return this;
        }

        /**
         * Setter for userImpact.
         * @param  userImpact  UserImpact value for userImpact.
         * @return Builder
         */
        public Builder userImpact(UserImpact userImpact) {
            this.userImpact = userImpact;
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
         * Builds a new {@link UserEventResult} object using the set fields.
         * @return {@link UserEventResult}
         */
        public UserEventResult build() {
            return new UserEventResult(event, token, canBeCancelled, eventRequirementCategoryType,
                    eventRequirementType, eventStatus, eventType, isComplete, userAction,
                    userImpact, links, meta);
        }
    }
}
