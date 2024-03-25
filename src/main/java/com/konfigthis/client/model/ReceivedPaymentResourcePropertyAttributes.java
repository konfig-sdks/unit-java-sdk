/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ReceivedPaymentResourcePropertyAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReceivedPaymentResourcePropertyAttributes {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("Pending"),
    
    ADVANCED("Advanced"),
    
    COMPLETED("Completed"),
    
    RETURNED("Returned");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private String completionDate;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
 public enum DirectionEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public static final String SERIALIZED_NAME_WAS_ADVANCED = "wasAdvanced";
  @SerializedName(SERIALIZED_NAME_WAS_ADVANCED)
  private Boolean wasAdvanced;

  public static final String SERIALIZED_NAME_IS_ADVANCEABLE = "isAdvanceable";
  @SerializedName(SERIALIZED_NAME_IS_ADVANCEABLE)
  private Boolean isAdvanceable;

  public static final String SERIALIZED_NAME_IS_ADVACEABLE = "isAdvaceable";
  @SerializedName(SERIALIZED_NAME_IS_ADVACEABLE)
  private Boolean isAdvaceable;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ROUTING_NUMBER = "counterpartyRoutingNumber";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ROUTING_NUMBER)
  private String counterpartyRoutingNumber;

  public static final String SERIALIZED_NAME_ADDENDA = "addenda";
  @SerializedName(SERIALIZED_NAME_ADDENDA)
  private String addenda;

  public static final String SERIALIZED_NAME_TRACE_NUMBER = "traceNumber";
  @SerializedName(SERIALIZED_NAME_TRACE_NUMBER)
  private String traceNumber;

  public static final String SERIALIZED_NAME_SEC_CODE = "secCode";
  @SerializedName(SERIALIZED_NAME_SEC_CODE)
  private String secCode;

  public static final String SERIALIZED_NAME_RETURN_REASON = "returnReason";
  @SerializedName(SERIALIZED_NAME_RETURN_REASON)
  private String returnReason;

  public static final String SERIALIZED_NAME_RECEIVING_ENTITY_NAME = "receivingEntityName";
  @SerializedName(SERIALIZED_NAME_RECEIVING_ENTITY_NAME)
  private String receivingEntityName;

  public ReceivedPaymentResourcePropertyAttributes() {
  }

  public ReceivedPaymentResourcePropertyAttributes tags(Object tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    
    
    
    this.tags = tags;
  }


  public ReceivedPaymentResourcePropertyAttributes description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ReceivedPaymentResourcePropertyAttributes createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public ReceivedPaymentResourcePropertyAttributes status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ReceivedPaymentResourcePropertyAttributes amount(Integer amount) {
    if (amount != null && amount < 1) {
      throw new IllegalArgumentException("Invalid value for amount. Must be greater than or equal to 1.");
    }
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 1
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    if (amount != null && amount < 1) {
      throw new IllegalArgumentException("Invalid value for amount. Must be greater than or equal to 1.");
    }
    
    
    this.amount = amount;
  }


  public ReceivedPaymentResourcePropertyAttributes completionDate(String completionDate) {
    
    
    
    
    this.completionDate = completionDate;
    return this;
  }

   /**
   * Get completionDate
   * @return completionDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCompletionDate() {
    return completionDate;
  }


  public void setCompletionDate(String completionDate) {
    
    
    
    this.completionDate = completionDate;
  }


  public ReceivedPaymentResourcePropertyAttributes direction(DirectionEnum direction) {
    
    
    
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    
    
    
    this.direction = direction;
  }


  public ReceivedPaymentResourcePropertyAttributes wasAdvanced(Boolean wasAdvanced) {
    
    
    
    
    this.wasAdvanced = wasAdvanced;
    return this;
  }

   /**
   * Get wasAdvanced
   * @return wasAdvanced
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getWasAdvanced() {
    return wasAdvanced;
  }


  public void setWasAdvanced(Boolean wasAdvanced) {
    
    
    
    this.wasAdvanced = wasAdvanced;
  }


  public ReceivedPaymentResourcePropertyAttributes isAdvanceable(Boolean isAdvanceable) {
    
    
    
    
    this.isAdvanceable = isAdvanceable;
    return this;
  }

   /**
   * Get isAdvanceable
   * @return isAdvanceable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdvanceable() {
    return isAdvanceable;
  }


  public void setIsAdvanceable(Boolean isAdvanceable) {
    
    
    
    this.isAdvanceable = isAdvanceable;
  }


  public ReceivedPaymentResourcePropertyAttributes isAdvaceable(Boolean isAdvaceable) {
    
    
    
    
    this.isAdvaceable = isAdvaceable;
    return this;
  }

   /**
   * Get isAdvaceable
   * @return isAdvaceable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdvaceable() {
    return isAdvaceable;
  }


  public void setIsAdvaceable(Boolean isAdvaceable) {
    
    
    
    this.isAdvaceable = isAdvaceable;
  }


  public ReceivedPaymentResourcePropertyAttributes companyName(String companyName) {
    
    
    
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    
    
    
    this.companyName = companyName;
  }


  public ReceivedPaymentResourcePropertyAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    
    
    
    
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

   /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCounterpartyRoutingNumber() {
    return counterpartyRoutingNumber;
  }


  public void setCounterpartyRoutingNumber(String counterpartyRoutingNumber) {
    
    
    
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
  }


  public ReceivedPaymentResourcePropertyAttributes addenda(String addenda) {
    
    
    
    
    this.addenda = addenda;
    return this;
  }

   /**
   * Get addenda
   * @return addenda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddenda() {
    return addenda;
  }


  public void setAddenda(String addenda) {
    
    
    
    this.addenda = addenda;
  }


  public ReceivedPaymentResourcePropertyAttributes traceNumber(String traceNumber) {
    
    
    
    
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Get traceNumber
   * @return traceNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTraceNumber() {
    return traceNumber;
  }


  public void setTraceNumber(String traceNumber) {
    
    
    
    this.traceNumber = traceNumber;
  }


  public ReceivedPaymentResourcePropertyAttributes secCode(String secCode) {
    
    
    if (secCode != null && secCode.length() < 3) {
      throw new IllegalArgumentException("Invalid value for secCode. Length must be greater than or equal to 3.");
    }
    
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSecCode() {
    return secCode;
  }


  public void setSecCode(String secCode) {
    
    
    if (secCode != null && secCode.length() < 3) {
      throw new IllegalArgumentException("Invalid value for secCode. Length must be greater than or equal to 3.");
    }
    this.secCode = secCode;
  }


  public ReceivedPaymentResourcePropertyAttributes returnReason(String returnReason) {
    
    
    
    
    this.returnReason = returnReason;
    return this;
  }

   /**
   * Get returnReason
   * @return returnReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnReason() {
    return returnReason;
  }


  public void setReturnReason(String returnReason) {
    
    
    
    this.returnReason = returnReason;
  }


  public ReceivedPaymentResourcePropertyAttributes receivingEntityName(String receivingEntityName) {
    
    
    
    
    this.receivingEntityName = receivingEntityName;
    return this;
  }

   /**
   * Get receivingEntityName
   * @return receivingEntityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReceivingEntityName() {
    return receivingEntityName;
  }


  public void setReceivingEntityName(String receivingEntityName) {
    
    
    
    this.receivingEntityName = receivingEntityName;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ReceivedPaymentResourcePropertyAttributes instance itself
   */
  public ReceivedPaymentResourcePropertyAttributes putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedPaymentResourcePropertyAttributes receivedPaymentResourcePropertyAttributes = (ReceivedPaymentResourcePropertyAttributes) o;
    return Objects.equals(this.tags, receivedPaymentResourcePropertyAttributes.tags) &&
        Objects.equals(this.description, receivedPaymentResourcePropertyAttributes.description) &&
        Objects.equals(this.createdAt, receivedPaymentResourcePropertyAttributes.createdAt) &&
        Objects.equals(this.status, receivedPaymentResourcePropertyAttributes.status) &&
        Objects.equals(this.amount, receivedPaymentResourcePropertyAttributes.amount) &&
        Objects.equals(this.completionDate, receivedPaymentResourcePropertyAttributes.completionDate) &&
        Objects.equals(this.direction, receivedPaymentResourcePropertyAttributes.direction) &&
        Objects.equals(this.wasAdvanced, receivedPaymentResourcePropertyAttributes.wasAdvanced) &&
        Objects.equals(this.isAdvanceable, receivedPaymentResourcePropertyAttributes.isAdvanceable) &&
        Objects.equals(this.isAdvaceable, receivedPaymentResourcePropertyAttributes.isAdvaceable) &&
        Objects.equals(this.companyName, receivedPaymentResourcePropertyAttributes.companyName) &&
        Objects.equals(this.counterpartyRoutingNumber, receivedPaymentResourcePropertyAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.addenda, receivedPaymentResourcePropertyAttributes.addenda) &&
        Objects.equals(this.traceNumber, receivedPaymentResourcePropertyAttributes.traceNumber) &&
        Objects.equals(this.secCode, receivedPaymentResourcePropertyAttributes.secCode) &&
        Objects.equals(this.returnReason, receivedPaymentResourcePropertyAttributes.returnReason) &&
        Objects.equals(this.receivingEntityName, receivedPaymentResourcePropertyAttributes.receivingEntityName)&&
        Objects.equals(this.additionalProperties, receivedPaymentResourcePropertyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, description, createdAt, status, amount, completionDate, direction, wasAdvanced, isAdvanceable, isAdvaceable, companyName, counterpartyRoutingNumber, addenda, traceNumber, secCode, returnReason, receivingEntityName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedPaymentResourcePropertyAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    wasAdvanced: ").append(toIndentedString(wasAdvanced)).append("\n");
    sb.append("    isAdvanceable: ").append(toIndentedString(isAdvanceable)).append("\n");
    sb.append("    isAdvaceable: ").append(toIndentedString(isAdvaceable)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    receivingEntityName: ").append(toIndentedString(receivingEntityName)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tags");
    openapiFields.add("description");
    openapiFields.add("createdAt");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("completionDate");
    openapiFields.add("direction");
    openapiFields.add("wasAdvanced");
    openapiFields.add("isAdvanceable");
    openapiFields.add("isAdvaceable");
    openapiFields.add("companyName");
    openapiFields.add("counterpartyRoutingNumber");
    openapiFields.add("addenda");
    openapiFields.add("traceNumber");
    openapiFields.add("secCode");
    openapiFields.add("returnReason");
    openapiFields.add("receivingEntityName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("completionDate");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("wasAdvanced");
    openapiRequiredFields.add("companyName");
    openapiRequiredFields.add("counterpartyRoutingNumber");
    openapiRequiredFields.add("traceNumber");
    openapiRequiredFields.add("secCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceivedPaymentResourcePropertyAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReceivedPaymentResourcePropertyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceivedPaymentResourcePropertyAttributes is not found in the empty JSON string", ReceivedPaymentResourcePropertyAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReceivedPaymentResourcePropertyAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("completionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completionDate").toString()));
      }
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if (!jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if (!jsonObj.get("counterpartyRoutingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterpartyRoutingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterpartyRoutingNumber").toString()));
      }
      if ((jsonObj.get("addenda") != null && !jsonObj.get("addenda").isJsonNull()) && !jsonObj.get("addenda").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addenda` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addenda").toString()));
      }
      if (!jsonObj.get("traceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceNumber").toString()));
      }
      if (!jsonObj.get("secCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secCode").toString()));
      }
      if ((jsonObj.get("returnReason") != null && !jsonObj.get("returnReason").isJsonNull()) && !jsonObj.get("returnReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnReason").toString()));
      }
      if ((jsonObj.get("receivingEntityName") != null && !jsonObj.get("receivingEntityName").isJsonNull()) && !jsonObj.get("receivingEntityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receivingEntityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receivingEntityName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceivedPaymentResourcePropertyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceivedPaymentResourcePropertyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceivedPaymentResourcePropertyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceivedPaymentResourcePropertyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceivedPaymentResourcePropertyAttributes>() {
           @Override
           public void write(JsonWriter out, ReceivedPaymentResourcePropertyAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ReceivedPaymentResourcePropertyAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReceivedPaymentResourcePropertyAttributes instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReceivedPaymentResourcePropertyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceivedPaymentResourcePropertyAttributes
  * @throws IOException if the JSON string is invalid with respect to ReceivedPaymentResourcePropertyAttributes
  */
  public static ReceivedPaymentResourcePropertyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivedPaymentResourcePropertyAttributes.class);
  }

 /**
  * Convert an instance of ReceivedPaymentResourcePropertyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

