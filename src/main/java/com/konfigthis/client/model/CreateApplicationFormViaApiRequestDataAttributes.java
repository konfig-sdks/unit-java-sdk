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
 * CreateApplicationFormViaApiRequestDataAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateApplicationFormViaApiRequestDataAttributes {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags = null;

  public static final String SERIALIZED_NAME_APPLICANT_DETAILS = "applicantDetails";
  @SerializedName(SERIALIZED_NAME_APPLICANT_DETAILS)
  private Object applicantDetails = null;

  public static final String SERIALIZED_NAME_SETTINGS_OVERRIDE = "settingsOverride";
  @SerializedName(SERIALIZED_NAME_SETTINGS_OVERRIDE)
  private Object settingsOverride = null;

  public static final String SERIALIZED_NAME_REQUIRE_ID_VERIFICATION = "requireIdVerification";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID_VERIFICATION)
  private Object requireIdVerification = null;

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

  /**
   * Gets or Sets lang
   */
  @JsonAdapter(LangEnum.Adapter.class)
 public enum LangEnum {
    EN("en"),
    
    ES("es");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LangEnum fromValue(String value) {
      for (LangEnum b : LangEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LangEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LangEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LangEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LangEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private LangEnum lang;

  public static final String SERIALIZED_NAME_HIDE_APPLICATION_PROGRESS_TRACKER = "hideApplicationProgressTracker";
  @SerializedName(SERIALIZED_NAME_HIDE_APPLICATION_PROGRESS_TRACKER)
  private Boolean hideApplicationProgressTracker;

  public CreateApplicationFormViaApiRequestDataAttributes() {
  }

  public CreateApplicationFormViaApiRequestDataAttributes tags(Object tags) {
    
    
    
    
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


  public CreateApplicationFormViaApiRequestDataAttributes applicantDetails(Object applicantDetails) {
    
    
    
    
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


  public CreateApplicationFormViaApiRequestDataAttributes settingsOverride(Object settingsOverride) {
    
    
    
    
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


  public CreateApplicationFormViaApiRequestDataAttributes requireIdVerification(Object requireIdVerification) {
    
    
    
    
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRequireIdVerification() {
    return requireIdVerification;
  }


  public void setRequireIdVerification(Object requireIdVerification) {
    
    
    
    this.requireIdVerification = requireIdVerification;
  }


  public CreateApplicationFormViaApiRequestDataAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    
    
    
    
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public CreateApplicationFormViaApiRequestDataAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
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


  public CreateApplicationFormViaApiRequestDataAttributes lang(LangEnum lang) {
    
    
    
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LangEnum getLang() {
    return lang;
  }


  public void setLang(LangEnum lang) {
    
    
    
    this.lang = lang;
  }


  public CreateApplicationFormViaApiRequestDataAttributes hideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    
    
    
    
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
    return this;
  }

   /**
   * Get hideApplicationProgressTracker
   * @return hideApplicationProgressTracker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHideApplicationProgressTracker() {
    return hideApplicationProgressTracker;
  }


  public void setHideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    
    
    
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
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
   * @return the CreateApplicationFormViaApiRequestDataAttributes instance itself
   */
  public CreateApplicationFormViaApiRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
    CreateApplicationFormViaApiRequestDataAttributes createApplicationFormViaApiRequestDataAttributes = (CreateApplicationFormViaApiRequestDataAttributes) o;
    return Objects.equals(this.tags, createApplicationFormViaApiRequestDataAttributes.tags) &&
        Objects.equals(this.applicantDetails, createApplicationFormViaApiRequestDataAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, createApplicationFormViaApiRequestDataAttributes.settingsOverride) &&
        Objects.equals(this.requireIdVerification, createApplicationFormViaApiRequestDataAttributes.requireIdVerification) &&
        Objects.equals(this.allowedApplicationTypes, createApplicationFormViaApiRequestDataAttributes.allowedApplicationTypes) &&
        Objects.equals(this.lang, createApplicationFormViaApiRequestDataAttributes.lang) &&
        Objects.equals(this.hideApplicationProgressTracker, createApplicationFormViaApiRequestDataAttributes.hideApplicationProgressTracker)&&
        Objects.equals(this.additionalProperties, createApplicationFormViaApiRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, applicantDetails, settingsOverride, requireIdVerification, allowedApplicationTypes, lang, hideApplicationProgressTracker, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationFormViaApiRequestDataAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    hideApplicationProgressTracker: ").append(toIndentedString(hideApplicationProgressTracker)).append("\n");
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
    openapiFields.add("applicantDetails");
    openapiFields.add("settingsOverride");
    openapiFields.add("requireIdVerification");
    openapiFields.add("allowedApplicationTypes");
    openapiFields.add("lang");
    openapiFields.add("hideApplicationProgressTracker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateApplicationFormViaApiRequestDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateApplicationFormViaApiRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApplicationFormViaApiRequestDataAttributes is not found in the empty JSON string", CreateApplicationFormViaApiRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedApplicationTypes") != null && !jsonObj.get("allowedApplicationTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedApplicationTypes` to be an array in the JSON string but got `%s`", jsonObj.get("allowedApplicationTypes").toString()));
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApplicationFormViaApiRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApplicationFormViaApiRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApplicationFormViaApiRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApplicationFormViaApiRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApplicationFormViaApiRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreateApplicationFormViaApiRequestDataAttributes value) throws IOException {
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
           public CreateApplicationFormViaApiRequestDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateApplicationFormViaApiRequestDataAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateApplicationFormViaApiRequestDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApplicationFormViaApiRequestDataAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateApplicationFormViaApiRequestDataAttributes
  */
  public static CreateApplicationFormViaApiRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApplicationFormViaApiRequestDataAttributes.class);
  }

 /**
  * Convert an instance of CreateApplicationFormViaApiRequestDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

