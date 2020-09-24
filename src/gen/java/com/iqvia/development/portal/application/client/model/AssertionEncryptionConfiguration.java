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
 * AssertionEncryptionConfiguration
 */


public class AssertionEncryptionConfiguration {
  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("assertionEncryptionAlgorithm")
  private String assertionEncryptionAlgorithm = "http://www.w3.org/2001/04/xmlenc#aes256-cbc";

  @SerializedName("keyEncryptionAlgorithm")
  private String keyEncryptionAlgorithm = "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p";

  public AssertionEncryptionConfiguration enabled(Boolean enabled) {
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

  public AssertionEncryptionConfiguration assertionEncryptionAlgorithm(String assertionEncryptionAlgorithm) {
    this.assertionEncryptionAlgorithm = assertionEncryptionAlgorithm;
    return this;
  }

   /**
   * Get assertionEncryptionAlgorithm
   * @return assertionEncryptionAlgorithm
  **/
  @Schema(description = "")
  public String getAssertionEncryptionAlgorithm() {
    return assertionEncryptionAlgorithm;
  }

  public void setAssertionEncryptionAlgorithm(String assertionEncryptionAlgorithm) {
    this.assertionEncryptionAlgorithm = assertionEncryptionAlgorithm;
  }

  public AssertionEncryptionConfiguration keyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
    this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
    return this;
  }

   /**
   * Get keyEncryptionAlgorithm
   * @return keyEncryptionAlgorithm
  **/
  @Schema(description = "")
  public String getKeyEncryptionAlgorithm() {
    return keyEncryptionAlgorithm;
  }

  public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
    this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionEncryptionConfiguration assertionEncryptionConfiguration = (AssertionEncryptionConfiguration) o;
    return Objects.equals(this.enabled, assertionEncryptionConfiguration.enabled) &&
        Objects.equals(this.assertionEncryptionAlgorithm, assertionEncryptionConfiguration.assertionEncryptionAlgorithm) &&
        Objects.equals(this.keyEncryptionAlgorithm, assertionEncryptionConfiguration.keyEncryptionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, assertionEncryptionAlgorithm, keyEncryptionAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionEncryptionConfiguration {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    assertionEncryptionAlgorithm: ").append(toIndentedString(assertionEncryptionAlgorithm)).append("\n");
    sb.append("    keyEncryptionAlgorithm: ").append(toIndentedString(keyEncryptionAlgorithm)).append("\n");
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
