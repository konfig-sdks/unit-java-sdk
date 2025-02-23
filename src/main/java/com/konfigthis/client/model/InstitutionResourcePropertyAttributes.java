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
 * InstitutionResourcePropertyAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InstitutionResourcePropertyAttributes {
  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_IS_WIRE_SUPPORTED = "isWireSupported";
  @SerializedName(SERIALIZED_NAME_IS_WIRE_SUPPORTED)
  private Boolean isWireSupported;

  public static final String SERIALIZED_NAME_IS_A_C_H_SUPPORTED = "isACHSupported";
  @SerializedName(SERIALIZED_NAME_IS_A_C_H_SUPPORTED)
  private Boolean isACHSupported;

  public InstitutionResourcePropertyAttributes() {
  }

  public InstitutionResourcePropertyAttributes routingNumber(String routingNumber) {
    
    
    
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    
    
    
    this.routingNumber = routingNumber;
  }


  public InstitutionResourcePropertyAttributes name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public InstitutionResourcePropertyAttributes address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public InstitutionResourcePropertyAttributes isWireSupported(Boolean isWireSupported) {
    
    
    
    
    this.isWireSupported = isWireSupported;
    return this;
  }

   /**
   * Get isWireSupported
   * @return isWireSupported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsWireSupported() {
    return isWireSupported;
  }


  public void setIsWireSupported(Boolean isWireSupported) {
    
    
    
    this.isWireSupported = isWireSupported;
  }


  public InstitutionResourcePropertyAttributes isACHSupported(Boolean isACHSupported) {
    
    
    
    
    this.isACHSupported = isACHSupported;
    return this;
  }

   /**
   * Get isACHSupported
   * @return isACHSupported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsACHSupported() {
    return isACHSupported;
  }


  public void setIsACHSupported(Boolean isACHSupported) {
    
    
    
    this.isACHSupported = isACHSupported;
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
   * @return the InstitutionResourcePropertyAttributes instance itself
   */
  public InstitutionResourcePropertyAttributes putAdditionalProperty(String key, Object value) {
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
    InstitutionResourcePropertyAttributes institutionResourcePropertyAttributes = (InstitutionResourcePropertyAttributes) o;
    return Objects.equals(this.routingNumber, institutionResourcePropertyAttributes.routingNumber) &&
        Objects.equals(this.name, institutionResourcePropertyAttributes.name) &&
        Objects.equals(this.address, institutionResourcePropertyAttributes.address) &&
        Objects.equals(this.isWireSupported, institutionResourcePropertyAttributes.isWireSupported) &&
        Objects.equals(this.isACHSupported, institutionResourcePropertyAttributes.isACHSupported)&&
        Objects.equals(this.additionalProperties, institutionResourcePropertyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, name, address, isWireSupported, isACHSupported, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionResourcePropertyAttributes {\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isWireSupported: ").append(toIndentedString(isWireSupported)).append("\n");
    sb.append("    isACHSupported: ").append(toIndentedString(isACHSupported)).append("\n");
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
    openapiFields.add("routingNumber");
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("isWireSupported");
    openapiFields.add("isACHSupported");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("routingNumber");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("isWireSupported");
    openapiRequiredFields.add("isACHSupported");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstitutionResourcePropertyAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstitutionResourcePropertyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstitutionResourcePropertyAttributes is not found in the empty JSON string", InstitutionResourcePropertyAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstitutionResourcePropertyAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("routingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingNumber").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstitutionResourcePropertyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstitutionResourcePropertyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstitutionResourcePropertyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstitutionResourcePropertyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<InstitutionResourcePropertyAttributes>() {
           @Override
           public void write(JsonWriter out, InstitutionResourcePropertyAttributes value) throws IOException {
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
           public InstitutionResourcePropertyAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InstitutionResourcePropertyAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InstitutionResourcePropertyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstitutionResourcePropertyAttributes
  * @throws IOException if the JSON string is invalid with respect to InstitutionResourcePropertyAttributes
  */
  public static InstitutionResourcePropertyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstitutionResourcePropertyAttributes.class);
  }

 /**
  * Convert an instance of InstitutionResourcePropertyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

