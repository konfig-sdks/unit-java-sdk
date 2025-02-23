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
import java.util.ArrayList;
import java.util.List;

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
 * GetListRepaymentsFromApiFilterParameter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetListRepaymentsFromApiFilterParameter {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_ID = "creditAccountId";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_ID)
  private String creditAccountId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("Pending"),
    
    PENDINGREVIEW("PendingReview"),
    
    RETURNED("Returned"),
    
    SENT("Sent"),
    
    REJECTED("Rejected");

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
  private List<StatusEnum> status = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    ACHREPAYMENT("AchRepayment"),
    
    BOOKREPAYMENT("BookRepayment");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<TypeEnum> type = null;

  public GetListRepaymentsFromApiFilterParameter() {
  }

  public GetListRepaymentsFromApiFilterParameter accountId(String accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    
    this.accountId = accountId;
  }


  public GetListRepaymentsFromApiFilterParameter creditAccountId(String creditAccountId) {
    
    
    
    
    this.creditAccountId = creditAccountId;
    return this;
  }

   /**
   * Get creditAccountId
   * @return creditAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreditAccountId() {
    return creditAccountId;
  }


  public void setCreditAccountId(String creditAccountId) {
    
    
    
    this.creditAccountId = creditAccountId;
  }


  public GetListRepaymentsFromApiFilterParameter customerId(String customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    
    
    
    this.customerId = customerId;
  }


  public GetListRepaymentsFromApiFilterParameter status(List<StatusEnum> status) {
    
    
    
    
    this.status = status;
    return this;
  }

  public GetListRepaymentsFromApiFilterParameter addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StatusEnum> getStatus() {
    return status;
  }


  public void setStatus(List<StatusEnum> status) {
    
    
    
    this.status = status;
  }


  public GetListRepaymentsFromApiFilterParameter type(List<TypeEnum> type) {
    
    
    
    
    this.type = type;
    return this;
  }

  public GetListRepaymentsFromApiFilterParameter addTypeItem(TypeEnum typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TypeEnum> getType() {
    return type;
  }


  public void setType(List<TypeEnum> type) {
    
    
    
    this.type = type;
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
   * @return the GetListRepaymentsFromApiFilterParameter instance itself
   */
  public GetListRepaymentsFromApiFilterParameter putAdditionalProperty(String key, Object value) {
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
    GetListRepaymentsFromApiFilterParameter getListRepaymentsFromApiFilterParameter = (GetListRepaymentsFromApiFilterParameter) o;
    return Objects.equals(this.accountId, getListRepaymentsFromApiFilterParameter.accountId) &&
        Objects.equals(this.creditAccountId, getListRepaymentsFromApiFilterParameter.creditAccountId) &&
        Objects.equals(this.customerId, getListRepaymentsFromApiFilterParameter.customerId) &&
        Objects.equals(this.status, getListRepaymentsFromApiFilterParameter.status) &&
        Objects.equals(this.type, getListRepaymentsFromApiFilterParameter.type)&&
        Objects.equals(this.additionalProperties, getListRepaymentsFromApiFilterParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditAccountId, customerId, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListRepaymentsFromApiFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("creditAccountId");
    openapiFields.add("customerId");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetListRepaymentsFromApiFilterParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetListRepaymentsFromApiFilterParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetListRepaymentsFromApiFilterParameter is not found in the empty JSON string", GetListRepaymentsFromApiFilterParameter.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("creditAccountId") != null && !jsonObj.get("creditAccountId").isJsonNull()) && !jsonObj.get("creditAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditAccountId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetListRepaymentsFromApiFilterParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetListRepaymentsFromApiFilterParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetListRepaymentsFromApiFilterParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetListRepaymentsFromApiFilterParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetListRepaymentsFromApiFilterParameter>() {
           @Override
           public void write(JsonWriter out, GetListRepaymentsFromApiFilterParameter value) throws IOException {
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
           public GetListRepaymentsFromApiFilterParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetListRepaymentsFromApiFilterParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetListRepaymentsFromApiFilterParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetListRepaymentsFromApiFilterParameter
  * @throws IOException if the JSON string is invalid with respect to GetListRepaymentsFromApiFilterParameter
  */
  public static GetListRepaymentsFromApiFilterParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetListRepaymentsFromApiFilterParameter.class);
  }

 /**
  * Convert an instance of GetListRepaymentsFromApiFilterParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

