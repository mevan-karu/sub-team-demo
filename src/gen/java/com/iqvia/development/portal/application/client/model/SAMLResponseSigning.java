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
 * SAMLResponseSigning
 */


public class SAMLResponseSigning {
  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("signingAlgorithm")
  private String signingAlgorithm = null;

  public SAMLResponseSigning enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SAMLResponseSigning signingAlgorithm(String signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
    return this;
  }

   /**
   * Get signingAlgorithm
   * @return signingAlgorithm
  **/
  @Schema(description = "")
  public String getSigningAlgorithm() {
    return signingAlgorithm;
  }

  public void setSigningAlgorithm(String signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLResponseSigning saMLResponseSigning = (SAMLResponseSigning) o;
    return Objects.equals(this.enabled, saMLResponseSigning.enabled) &&
        Objects.equals(this.signingAlgorithm, saMLResponseSigning.signingAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, signingAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLResponseSigning {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
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
