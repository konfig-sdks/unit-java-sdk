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
 * ApplicationFormPropertyAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicationFormPropertyAttributes {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Object email = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Gets or Sets stage
   */
  @JsonAdapter(StageEnum.Adapter.class)
 public enum StageEnum {
    CHOOSEBUSINESSORINDIVIDUAL("ChooseBusinessOrIndividual"),
    
    ENTERINDIVIDUALINFORMATION("EnterIndividualInformation"),
    
    INDIVIDUALPHONEVERIFICATION("IndividualPhoneVerification"),
    
    INDIVIDUALAPPLICATIONCREATED("IndividualApplicationCreated"),
    
    ENTERBUSINESSINFORMATION("EnterBusinessInformation"),
    
    ENTERBUSINESSADDITIONALINFORMATION("EnterBusinessAdditionalInformation"),
    
    ENTEROFFICERINFORMATION("EnterOfficerInformation"),
    
    BUSINESSPHONEVERIFICATION("BusinessPhoneVerification"),
    
    ENTERBENEFICIALOWNERSINFORMATION("EnterBeneficialOwnersInformation"),
    
    BUSINESSAPPLICATIONCREATED("BusinessApplicationCreated"),
    
    ENTERSOLEPROPRIETORSHIPINFORMATION("EnterSoleProprietorshipInformation"),
    
    ENTERSOLEPROPRIETORSHIPBUSINESSINFORMATION("EnterSoleProprietorshipBusinessInformation"),
    
    SOLEPROPRIETORSHIPPHONEVERIFICATION("SoleProprietorshipPhoneVerification"),
    
    SOLEPROPRIETORSHIPAPPLICATIONCREATED("SoleProprietorshipApplicationCreated");

    private String value;

    StageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StageEnum fromValue(String value) {
      for (StageEnum b : StageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private StageEnum stage;

  public static final String SERIALIZED_NAME_APPLICANT_DETAILS = "applicantDetails";
  @SerializedName(SERIALIZED_NAME_APPLICANT_DETAILS)
  private Object applicantDetails = null;

  public static final String SERIALIZED_NAME_SETTINGS_OVERRIDE = "settingsOverride";
  @SerializedName(SERIALIZED_NAME_SETTINGS_OVERRIDE)
  private Object settingsOverride = null;

  /**
   * Gets or Sets allowedApplicationTypes
   */
  @JsonAdapter(AllowedApplicationTypesEnum.Adapter.class)
 public enum AllowedApplicationTypesEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    SOLEPROPRIETORSHIP("SoleProprietorship");

    private String value;

    AllowedApplicationTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedApplicationTypesEnum fromValue(String value) {
      for (AllowedApplicationTypesEnum b : AllowedApplicationTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedApplicationTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedApplicationTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedApplicationTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedApplicationTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_APPLICATION_TYPES = "allowedApplicationTypes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_APPLICATION_TYPES)
  private List<AllowedApplicationTypesEnum> allowedApplicationTypes = null;

  public ApplicationFormPropertyAttributes() {
  }

  public ApplicationFormPropertyAttributes tags(Object tags) {
    
    
    
    
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


  public ApplicationFormPropertyAttributes email(Object email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEmail() {
    return email;
  }


  public void setEmail(Object email) {
    
    
    
    this.email = email;
  }


  public ApplicationFormPropertyAttributes url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public ApplicationFormPropertyAttributes stage(StageEnum stage) {
    
    
    
    
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StageEnum getStage() {
    return stage;
  }


  public void setStage(StageEnum stage) {
    
    
    
    this.stage = stage;
  }


  public ApplicationFormPropertyAttributes applicantDetails(Object applicantDetails) {
    
    
    
    
    this.applicantDetails = applicantDetails;
    return this;
  }

   /**
   * Get applicantDetails
   * @return applicantDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getApplicantDetails() {
    return applicantDetails;
  }


  public void setApplicantDetails(Object applicantDetails) {
    
    
    
    this.applicantDetails = applicantDetails;
  }


  public ApplicationFormPropertyAttributes settingsOverride(Object settingsOverride) {
    
    
    
    
    this.settingsOverride = settingsOverride;
    return this;
  }

   /**
   * Get settingsOverride
   * @return settingsOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSettingsOverride() {
    return settingsOverride;
  }


  public void setSettingsOverride(Object settingsOverride) {
    
    
    
    this.settingsOverride = settingsOverride;
  }


  public ApplicationFormPropertyAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    
    
    
    
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public ApplicationFormPropertyAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
    if (this.allowedApplicationTypes == null) {
      this.allowedApplicationTypes = new ArrayList<>();
    }
    this.allowedApplicationTypes.add(allowedApplicationTypesItem);
    return this;
  }

   /**
   * Get allowedApplicationTypes
   * @return allowedApplicationTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AllowedApplicationTypesEnum> getAllowedApplicationTypes() {
    return allowedApplicationTypes;
  }


  public void setAllowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    
    
    
    this.allowedApplicationTypes = allowedApplicationTypes;
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
   * @return the ApplicationFormPropertyAttributes instance itself
   */
  public ApplicationFormPropertyAttributes putAdditionalProperty(String key, Object value) {
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
    ApplicationFormPropertyAttributes applicationFormPropertyAttributes = (ApplicationFormPropertyAttributes) o;
    return Objects.equals(this.tags, applicationFormPropertyAttributes.tags) &&
        Objects.equals(this.email, applicationFormPropertyAttributes.email) &&
        Objects.equals(this.url, applicationFormPropertyAttributes.url) &&
        Objects.equals(this.stage, applicationFormPropertyAttributes.stage) &&
        Objects.equals(this.applicantDetails, applicationFormPropertyAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, applicationFormPropertyAttributes.settingsOverride) &&
        Objects.equals(this.allowedApplicationTypes, applicationFormPropertyAttributes.allowedApplicationTypes)&&
        Objects.equals(this.additionalProperties, applicationFormPropertyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, email, url, stage, applicantDetails, settingsOverride, allowedApplicationTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFormPropertyAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("url");
    openapiFields.add("stage");
    openapiFields.add("applicantDetails");
    openapiFields.add("settingsOverride");
    openapiFields.add("allowedApplicationTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationFormPropertyAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationFormPropertyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationFormPropertyAttributes is not found in the empty JSON string", ApplicationFormPropertyAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationFormPropertyAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("stage") != null && !jsonObj.get("stage").isJsonNull()) && !jsonObj.get("stage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedApplicationTypes") != null && !jsonObj.get("allowedApplicationTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedApplicationTypes` to be an array in the JSON string but got `%s`", jsonObj.get("allowedApplicationTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationFormPropertyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationFormPropertyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationFormPropertyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationFormPropertyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationFormPropertyAttributes>() {
           @Override
           public void write(JsonWriter out, ApplicationFormPropertyAttributes value) throws IOException {
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
           public ApplicationFormPropertyAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicationFormPropertyAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicationFormPropertyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationFormPropertyAttributes
  * @throws IOException if the JSON string is invalid with respect to ApplicationFormPropertyAttributes
  */
  public static ApplicationFormPropertyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationFormPropertyAttributes.class);
  }

 /**
  * Convert an instance of ApplicationFormPropertyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

