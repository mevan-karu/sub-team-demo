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
/**
 * AdaptiveAuthTemplates
 */


public class AdaptiveAuthTemplates {
  @SerializedName("templatesJSON")
  private String templatesJSON = null;

  public AdaptiveAuthTemplates templatesJSON(String templatesJSON) {
    this.templatesJSON = templatesJSON;
    return this;
  }

   /**
   * Get templatesJSON
   * @return templatesJSON
  **/
  @Schema(example = "Adaptive Auth Templates JSON", description = "")
  public String getTemplatesJSON() {
    return templatesJSON;
  }

  public void setTemplatesJSON(String templatesJSON) {
    this.templatesJSON = templatesJSON;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveAuthTemplates adaptiveAuthTemplates = (AdaptiveAuthTemplates) o;
    return Objects.equals(this.templatesJSON, adaptiveAuthTemplates.templatesJSON);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templatesJSON);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveAuthTemplates {\n");
    
    sb.append("    templatesJSON: ").append(toIndentedString(templatesJSON)).append("\n");
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