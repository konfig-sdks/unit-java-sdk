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
 * AccountEndOfDayResourcePropertyAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountEndOfDayResourcePropertyAttributes {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Integer hold;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_OVERDRAFT_LIMIT = "overdraftLimit";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_LIMIT)
  private Integer overdraftLimit;

  public AccountEndOfDayResourcePropertyAttributes() {
  }

  public AccountEndOfDayResourcePropertyAttributes date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public AccountEndOfDayResourcePropertyAttributes balance(Integer balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    
    
    
    this.balance = balance;
  }


  public AccountEndOfDayResourcePropertyAttributes hold(Integer hold) {
    
    
    
    
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHold() {
    return hold;
  }


  public void setHold(Integer hold) {
    
    
    
    this.hold = hold;
  }


  public AccountEndOfDayResourcePropertyAttributes available(Integer available) {
    
    
    
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAvailable() {
    return available;
  }


  public void setAvailable(Integer available) {
    
    
    
    this.available = available;
  }


  public AccountEndOfDayResourcePropertyAttributes overdraftLimit(Integer overdraftLimit) {
    
    
    
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * @return overdraftLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOverdraftLimit() {
    return overdraftLimit;
  }


  public void setOverdraftLimit(Integer overdraftLimit) {
    
    
    
    this.overdraftLimit = overdraftLimit;
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
   * @return the AccountEndOfDayResourcePropertyAttributes instance itself
   */
  public AccountEndOfDayResourcePropertyAttributes putAdditionalProperty(String key, Object value) {
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
    AccountEndOfDayResourcePropertyAttributes accountEndOfDayResourcePropertyAttributes = (AccountEndOfDayResourcePropertyAttributes) o;
    return Objects.equals(this.date, accountEndOfDayResourcePropertyAttributes.date) &&
        Objects.equals(this.balance, accountEndOfDayResourcePropertyAttributes.balance) &&
        Objects.equals(this.hold, accountEndOfDayResourcePropertyAttributes.hold) &&
        Objects.equals(this.available, accountEndOfDayResourcePropertyAttributes.available) &&
        Objects.equals(this.overdraftLimit, accountEndOfDayResourcePropertyAttributes.overdraftLimit)&&
        Objects.equals(this.additionalProperties, accountEndOfDayResourcePropertyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, balance, hold, available, overdraftLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEndOfDayResourcePropertyAttributes {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("balance");
    openapiFields.add("hold");
    openapiFields.add("available");
    openapiFields.add("overdraftLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("hold");
    openapiRequiredFields.add("available");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountEndOfDayResourcePropertyAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountEndOfDayResourcePropertyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountEndOfDayResourcePropertyAttributes is not found in the empty JSON string", AccountEndOfDayResourcePropertyAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountEndOfDayResourcePropertyAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountEndOfDayResourcePropertyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountEndOfDayResourcePropertyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountEndOfDayResourcePropertyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountEndOfDayResourcePropertyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountEndOfDayResourcePropertyAttributes>() {
           @Override
           public void write(JsonWriter out, AccountEndOfDayResourcePropertyAttributes value) throws IOException {
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
           public AccountEndOfDayResourcePropertyAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountEndOfDayResourcePropertyAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountEndOfDayResourcePropertyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountEndOfDayResourcePropertyAttributes
  * @throws IOException if the JSON string is invalid with respect to AccountEndOfDayResourcePropertyAttributes
  */
  public static AccountEndOfDayResourcePropertyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountEndOfDayResourcePropertyAttributes.class);
  }

 /**
  * Convert an instance of AccountEndOfDayResourcePropertyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

