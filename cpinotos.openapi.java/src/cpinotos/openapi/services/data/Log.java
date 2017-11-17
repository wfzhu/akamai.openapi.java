
package cpinotos.openapi.services.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A series of loglines for this error request. Note that this data is arranged differently than in the [LogLines](data.html#loglines) object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "fields"
})
public class Log {

    /**
     * Description for this logline.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description for this logline.")
    private String description;
    /**
     * Log items provided as key/value pairs. This object's membership is indeterminate.
     * (Required)
     * 
     */
    @JsonProperty("fields")
    @JsonPropertyDescription("Log items provided as key/value pairs. This object's membership is indeterminate.")
    private Fields fields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description for this logline.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description for this logline.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Log items provided as key/value pairs. This object's membership is indeterminate.
     * (Required)
     * 
     */
    @JsonProperty("fields")
    public Fields getFields() {
        return fields;
    }

    /**
     * Log items provided as key/value pairs. This object's membership is indeterminate.
     * (Required)
     * 
     */
    @JsonProperty("fields")
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("fields", fields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(additionalProperties).append(fields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Log) == false) {
            return false;
        }
        Log rhs = ((Log) other);
        return new EqualsBuilder().append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).append(fields, rhs.fields).isEquals();
    }

}
