/*
 * WSO2 Identity Server - Application Management Rest API
 * This document specifies a **Application Management RESTful API** for **WSO2 Identity Server** . 
 *
 * OpenAPI spec version: v1
 * Contact: architecture@wso2.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.iqvia.development.portal.application.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomInboundProtocolProperty
 */


public class CustomInboundProtocolProperty {
  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    INTEGER("INTEGER");

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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("availableValues")
  private List<String> availableValues = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("validationRegex")
  private String validationRegex = null;

  @SerializedName("displayOrder")
  private Integer displayOrder = null;

  @SerializedName("isConfidential")
  private Boolean isConfidential = false;

  public CustomInboundProtocolProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "encryptionAlgorithm", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomInboundProtocolProperty displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(example = "Encryption Algorithm", description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CustomInboundProtocolProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "STRING", description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CustomInboundProtocolProperty required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @Schema(example = "true", description = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CustomInboundProtocolProperty availableValues(List<String> availableValues) {
    this.availableValues = availableValues;
    return this;
  }

  public CustomInboundProtocolProperty addAvailableValuesItem(String availableValuesItem) {
    if (this.availableValues == null) {
      this.availableValues = new ArrayList<>();
    }
    this.availableValues.add(availableValuesItem);
    return this;
  }

   /**
   * Get availableValues
   * @return availableValues
  **/
  @Schema(description = "")
  public List<String> getAvailableValues() {
    return availableValues;
  }

  public void setAvailableValues(List<String> availableValues) {
    this.availableValues = availableValues;
  }

  public CustomInboundProtocolProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(example = "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public CustomInboundProtocolProperty validationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

   /**
   * Get validationRegex
   * @return validationRegex
  **/
  @Schema(example = "^[a-b][A-B]*", description = "")
  public String getValidationRegex() {
    return validationRegex;
  }

  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }

  public CustomInboundProtocolProperty displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @Schema(example = "1", description = "")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public CustomInboundProtocolProperty isConfidential(Boolean isConfidential) {
    this.isConfidential = isConfidential;
    return this;
  }

   /**
   * Get isConfidential
   * @return isConfidential
  **/
  @Schema(description = "")
  public Boolean isIsConfidential() {
    return isConfidential;
  }

  public void setIsConfidential(Boolean isConfidential) {
    this.isConfidential = isConfidential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomInboundProtocolProperty customInboundProtocolProperty = (CustomInboundProtocolProperty) o;
    return Objects.equals(this.name, customInboundProtocolProperty.name) &&
        Objects.equals(this.displayName, customInboundProtocolProperty.displayName) &&
        Objects.equals(this.type, customInboundProtocolProperty.type) &&
        Objects.equals(this.required, customInboundProtocolProperty.required) &&
        Objects.equals(this.availableValues, customInboundProtocolProperty.availableValues) &&
        Objects.equals(this.defaultValue, customInboundProtocolProperty.defaultValue) &&
        Objects.equals(this.validationRegex, customInboundProtocolProperty.validationRegex) &&
        Objects.equals(this.displayOrder, customInboundProtocolProperty.displayOrder) &&
        Objects.equals(this.isConfidential, customInboundProtocolProperty.isConfidential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, type, required, availableValues, defaultValue, validationRegex, displayOrder, isConfidential);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomInboundProtocolProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    availableValues: ").append(toIndentedString(availableValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    isConfidential: ").append(toIndentedString(isConfidential)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
