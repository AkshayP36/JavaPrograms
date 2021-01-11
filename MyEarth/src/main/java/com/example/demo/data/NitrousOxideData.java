package com.example.demo.data;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nitrous"
})
public class NitrousOxideData {

    @JsonProperty("nitrous")
    private List<Object> nitrous = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nitrous")
    public List<Object> getNitrous() {
        return nitrous;
    }

    @JsonProperty("nitrous")
    public void setNitrous(List<Object> nitrous) {
        this.nitrous = nitrous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}