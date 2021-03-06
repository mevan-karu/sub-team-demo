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
 * WSTrustConfiguration
 */


public class WSTrustConfiguration {
  @SerializedName("audience")
  private String audience = null;

  @SerializedName("certificateAlias")
  private String certificateAlias = null;

  public WSTrustConfiguration audience(String audience) {
    this.audience = audience;
    return this;
  }

   /**
   * Audience value of the trusted service
   * @return audience
  **/
  @Schema(example = "https://wstrust.endpoint.com", required = true, description = "Audience value of the trusted service")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public WSTrustConfiguration certificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
    return this;
  }

   /**
   * Get certificateAlias
   * @return certificateAlias
  **/
  @Schema(example = "wso2carbon", required = true, description = "")
  public String getCertificateAlias() {
    return certificateAlias;
  }

  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSTrustConfiguration wsTrustConfiguration = (WSTrustConfiguration) o;
    return Objects.equals(this.audience, wsTrustConfiguration.audience) &&
        Objects.equals(this.certificateAlias, wsTrustConfiguration.certificateAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, certificateAlias);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSTrustConfiguration {\n");
    
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    certificateAlias: ").append(toIndentedString(certificateAlias)).append("\n");
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
