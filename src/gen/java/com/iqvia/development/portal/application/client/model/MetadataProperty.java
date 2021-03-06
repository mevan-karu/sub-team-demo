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
 * MetadataProperty
 */


public class MetadataProperty {
  @SerializedName("options")
  private List<String> options = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  public MetadataProperty options(List<String> options) {
    this.options = options;
    return this;
  }

  public MetadataProperty addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(example = "[\"Option 1\",\"Option 2\"]", description = "")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  public MetadataProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(example = "Option 1", description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataProperty metadataProperty = (MetadataProperty) o;
    return Objects.equals(this.options, metadataProperty.options) &&
        Objects.equals(this.defaultValue, metadataProperty.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, defaultValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataProperty {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
