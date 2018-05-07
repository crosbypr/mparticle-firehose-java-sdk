package com.mparticle.sdk.model.eventprocessing.consent;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Record of consent under the GDPR.
 */
public final class GDPRConsent {

    @JsonProperty(value = "consented", required = true)
    private boolean consented;

    @JsonProperty("document")
    private String document;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("location")
    private String location;

    @JsonProperty("hardware_id")
    private String hardwareId;

    public boolean isConsented() {
        return consented;
    }

    public String getDocument() {
        return document;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getLocation() {
        return location;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setConsented(boolean consented) {
        this.consented = consented;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }
}