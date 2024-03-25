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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CheckDepositPropertyAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckDepositPropertyAttributes {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private LocalDate settlementDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    AWAITINGIMAGES("AwaitingImages"),
    
    AWAITINGFRONTIMAGE("AwaitingFrontImage"),
    
    AWAITINGBACKIMAGE("AwaitingBackImage"),
    
    PENDING("Pending"),
    
    PENDINGREVIEW("PendingReview"),
    
    AWAITINGCUSTOMERCONFIRMATION("AwaitingCustomerConfirmation"),
    
    REJECTED("Rejected"),
    
    CLEARING("Clearing"),
    
    SENT("Sent"),
    
    CANCELED("Canceled"),
    
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

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS_CREATED_AT = "statusCreatedAt";
  @SerializedName(SERIALIZED_NAME_STATUS_CREATED_AT)
  private OffsetDateTime statusCreatedAt;

  public static final String SERIALIZED_NAME_STATUS_SET_BY = "statusSetBy";
  @SerializedName(SERIALIZED_NAME_STATUS_SET_BY)
  private String statusSetBy;

  public static final String SERIALIZED_NAME_STATUS_HISTORY = "statusHistory";
  @SerializedName(SERIALIZED_NAME_STATUS_HISTORY)
  private List<Object> statusHistory = null;

  public static final String SERIALIZED_NAME_REASON_TEXT = "reasonText";
  @SerializedName(SERIALIZED_NAME_REASON_TEXT)
  private String reasonText;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private Object counterparty = null;

  public CheckDepositPropertyAttributes() {
  }

  public CheckDepositPropertyAttributes tags(Object tags) {
    
    
    
    
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


  public CheckDepositPropertyAttributes description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
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
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public CheckDepositPropertyAttributes createdAt(OffsetDateTime createdAt) {
    
    
    
    
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


  public CheckDepositPropertyAttributes settlementDate(LocalDate settlementDate) {
    
    
    
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getSettlementDate() {
    return settlementDate;
  }


  public void setSettlementDate(LocalDate settlementDate) {
    
    
    
    this.settlementDate = settlementDate;
  }


  public CheckDepositPropertyAttributes amount(Integer amount) {
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


  public CheckDepositPropertyAttributes status(StatusEnum status) {
    
    
    
    
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


  public CheckDepositPropertyAttributes reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public CheckDepositPropertyAttributes statusCreatedAt(OffsetDateTime statusCreatedAt) {
    
    
    
    
    this.statusCreatedAt = statusCreatedAt;
    return this;
  }

   /**
   * Get statusCreatedAt
   * @return statusCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStatusCreatedAt() {
    return statusCreatedAt;
  }


  public void setStatusCreatedAt(OffsetDateTime statusCreatedAt) {
    
    
    
    this.statusCreatedAt = statusCreatedAt;
  }


  public CheckDepositPropertyAttributes statusSetBy(String statusSetBy) {
    
    
    
    
    this.statusSetBy = statusSetBy;
    return this;
  }

   /**
   * Get statusSetBy
   * @return statusSetBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusSetBy() {
    return statusSetBy;
  }


  public void setStatusSetBy(String statusSetBy) {
    
    
    
    this.statusSetBy = statusSetBy;
  }


  public CheckDepositPropertyAttributes statusHistory(List<Object> statusHistory) {
    
    
    
    
    this.statusHistory = statusHistory;
    return this;
  }

  public CheckDepositPropertyAttributes addStatusHistoryItem(Object statusHistoryItem) {
    if (this.statusHistory == null) {
      this.statusHistory = new ArrayList<>();
    }
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getStatusHistory() {
    return statusHistory;
  }


  public void setStatusHistory(List<Object> statusHistory) {
    
    
    
    this.statusHistory = statusHistory;
  }


  public CheckDepositPropertyAttributes reasonText(String reasonText) {
    
    
    
    
    this.reasonText = reasonText;
    return this;
  }

   /**
   * Get reasonText
   * @return reasonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonText() {
    return reasonText;
  }


  public void setReasonText(String reasonText) {
    
    
    
    this.reasonText = reasonText;
  }


  public CheckDepositPropertyAttributes checkNumber(String checkNumber) {
    
    
    
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    
    
    
    this.checkNumber = checkNumber;
  }


  public CheckDepositPropertyAttributes vendor(String vendor) {
    
    
    
    
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    
    
    
    this.vendor = vendor;
  }


  public CheckDepositPropertyAttributes counterparty(Object counterparty) {
    
    
    
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(Object counterparty) {
    
    
    
    this.counterparty = counterparty;
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
   * @return the CheckDepositPropertyAttributes instance itself
   */
  public CheckDepositPropertyAttributes putAdditionalProperty(String key, Object value) {
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
    CheckDepositPropertyAttributes checkDepositPropertyAttributes = (CheckDepositPropertyAttributes) o;
    return Objects.equals(this.tags, checkDepositPropertyAttributes.tags) &&
        Objects.equals(this.description, checkDepositPropertyAttributes.description) &&
        Objects.equals(this.createdAt, checkDepositPropertyAttributes.createdAt) &&
        Objects.equals(this.settlementDate, checkDepositPropertyAttributes.settlementDate) &&
        Objects.equals(this.amount, checkDepositPropertyAttributes.amount) &&
        Objects.equals(this.status, checkDepositPropertyAttributes.status) &&
        Objects.equals(this.reason, checkDepositPropertyAttributes.reason) &&
        Objects.equals(this.statusCreatedAt, checkDepositPropertyAttributes.statusCreatedAt) &&
        Objects.equals(this.statusSetBy, checkDepositPropertyAttributes.statusSetBy) &&
        Objects.equals(this.statusHistory, checkDepositPropertyAttributes.statusHistory) &&
        Objects.equals(this.reasonText, checkDepositPropertyAttributes.reasonText) &&
        Objects.equals(this.checkNumber, checkDepositPropertyAttributes.checkNumber) &&
        Objects.equals(this.vendor, checkDepositPropertyAttributes.vendor) &&
        Objects.equals(this.counterparty, checkDepositPropertyAttributes.counterparty)&&
        Objects.equals(this.additionalProperties, checkDepositPropertyAttributes.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, description, createdAt, settlementDate, amount, status, reason, statusCreatedAt, statusSetBy, statusHistory, reasonText, checkNumber, vendor, counterparty, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDepositPropertyAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    statusCreatedAt: ").append(toIndentedString(statusCreatedAt)).append("\n");
    sb.append("    statusSetBy: ").append(toIndentedString(statusSetBy)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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
    openapiFields.add("settlementDate");
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("reason");
    openapiFields.add("statusCreatedAt");
    openapiFields.add("statusSetBy");
    openapiFields.add("statusHistory");
    openapiFields.add("reasonText");
    openapiFields.add("checkNumber");
    openapiFields.add("vendor");
    openapiFields.add("counterparty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckDepositPropertyAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckDepositPropertyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckDepositPropertyAttributes is not found in the empty JSON string", CheckDepositPropertyAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckDepositPropertyAttributes.openapiRequiredFields) {
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
      if (!jsonObj.get("reason").isJsonNull() && (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("statusSetBy") != null && !jsonObj.get("statusSetBy").isJsonNull()) && !jsonObj.get("statusSetBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusSetBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusSetBy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusHistory") != null && !jsonObj.get("statusHistory").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusHistory` to be an array in the JSON string but got `%s`", jsonObj.get("statusHistory").toString()));
      }
      if ((jsonObj.get("reasonText") != null && !jsonObj.get("reasonText").isJsonNull()) && !jsonObj.get("reasonText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonText").toString()));
      }
      if ((jsonObj.get("checkNumber") != null && !jsonObj.get("checkNumber").isJsonNull()) && !jsonObj.get("checkNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkNumber").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckDepositPropertyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckDepositPropertyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckDepositPropertyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckDepositPropertyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckDepositPropertyAttributes>() {
           @Override
           public void write(JsonWriter out, CheckDepositPropertyAttributes value) throws IOException {
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
           public CheckDepositPropertyAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckDepositPropertyAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckDepositPropertyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckDepositPropertyAttributes
  * @throws IOException if the JSON string is invalid with respect to CheckDepositPropertyAttributes
  */
  public static CheckDepositPropertyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckDepositPropertyAttributes.class);
  }

 /**
  * Convert an instance of CheckDepositPropertyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

