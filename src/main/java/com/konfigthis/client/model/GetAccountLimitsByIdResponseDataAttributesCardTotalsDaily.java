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
 * GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily {
  public static final String SERIALIZED_NAME_WITHDRAWAL = "withdrawal";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL)
  private Double withdrawal;

  public static final String SERIALIZED_NAME_DEPOSIT = "deposit";
  @SerializedName(SERIALIZED_NAME_DEPOSIT)
  private Double deposit;

  public static final String SERIALIZED_NAME_PURCHASE = "purchase";
  @SerializedName(SERIALIZED_NAME_PURCHASE)
  private Double purchase;

  public static final String SERIALIZED_NAME_CARD_TRANSACTION = "cardTransaction";
  @SerializedName(SERIALIZED_NAME_CARD_TRANSACTION)
  private Double cardTransaction;

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily() {
  }

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily withdrawal(Double withdrawal) {
    
    
    
    
    this.withdrawal = withdrawal;
    return this;
  }

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily withdrawal(Integer withdrawal) {
    
    
    
    
    this.withdrawal = withdrawal.doubleValue();
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getWithdrawal() {
    return withdrawal;
  }


  public void setWithdrawal(Double withdrawal) {
    
    
    
    this.withdrawal = withdrawal;
  }


  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily deposit(Double deposit) {
    
    
    
    
    this.deposit = deposit;
    return this;
  }

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily deposit(Integer deposit) {
    
    
    
    
    this.deposit = deposit.doubleValue();
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDeposit() {
    return deposit;
  }


  public void setDeposit(Double deposit) {
    
    
    
    this.deposit = deposit;
  }


  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily purchase(Double purchase) {
    
    
    
    
    this.purchase = purchase;
    return this;
  }

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily purchase(Integer purchase) {
    
    
    
    
    this.purchase = purchase.doubleValue();
    return this;
  }

   /**
   * Get purchase
   * @return purchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPurchase() {
    return purchase;
  }


  public void setPurchase(Double purchase) {
    
    
    
    this.purchase = purchase;
  }


  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily cardTransaction(Double cardTransaction) {
    
    
    
    
    this.cardTransaction = cardTransaction;
    return this;
  }

  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily cardTransaction(Integer cardTransaction) {
    
    
    
    
    this.cardTransaction = cardTransaction.doubleValue();
    return this;
  }

   /**
   * Get cardTransaction
   * @return cardTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCardTransaction() {
    return cardTransaction;
  }


  public void setCardTransaction(Double cardTransaction) {
    
    
    
    this.cardTransaction = cardTransaction;
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
   * @return the GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily instance itself
   */
  public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily putAdditionalProperty(String key, Object value) {
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
    GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily getAccountLimitsByIdResponseDataAttributesCardTotalsDaily = (GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily) o;
    return Objects.equals(this.withdrawal, getAccountLimitsByIdResponseDataAttributesCardTotalsDaily.withdrawal) &&
        Objects.equals(this.deposit, getAccountLimitsByIdResponseDataAttributesCardTotalsDaily.deposit) &&
        Objects.equals(this.purchase, getAccountLimitsByIdResponseDataAttributesCardTotalsDaily.purchase) &&
        Objects.equals(this.cardTransaction, getAccountLimitsByIdResponseDataAttributesCardTotalsDaily.cardTransaction)&&
        Objects.equals(this.additionalProperties, getAccountLimitsByIdResponseDataAttributesCardTotalsDaily.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawal, deposit, purchase, cardTransaction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily {\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("    cardTransaction: ").append(toIndentedString(cardTransaction)).append("\n");
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
    openapiFields.add("withdrawal");
    openapiFields.add("deposit");
    openapiFields.add("purchase");
    openapiFields.add("cardTransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily is not found in the empty JSON string", GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily>() {
           @Override
           public void write(JsonWriter out, GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily value) throws IOException {
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
           public GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily
  * @throws IOException if the JSON string is invalid with respect to GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily
  */
  public static GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.class);
  }

 /**
  * Convert an instance of GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

