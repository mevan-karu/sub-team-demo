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
 * OIDCLogoutConfiguration
 */


public class OIDCLogoutConfiguration {
  @SerializedName("backChannelLogoutUrl")
  private String backChannelLogoutUrl = null;

  @SerializedName("frontChannelLogoutUrl")
  private String frontChannelLogoutUrl = null;

  public OIDCLogoutConfiguration backChannelLogoutUrl(String backChannelLogoutUrl) {
    this.backChannelLogoutUrl = backChannelLogoutUrl;
    return this;
  }

   /**
   * Get backChannelLogoutUrl
   * @return backChannelLogoutUrl
  **/
  @Schema(example = "https://app.example.com/backchannel/callback", description = "")
  public String getBackChannelLogoutUrl() {
    return backChannelLogoutUrl;
  }

  public void setBackChannelLogoutUrl(String backChannelLogoutUrl) {
    this.backChannelLogoutUrl = backChannelLogoutUrl;
  }

  public OIDCLogoutConfiguration frontChannelLogoutUrl(String frontChannelLogoutUrl) {
    this.frontChannelLogoutUrl = frontChannelLogoutUrl;
    return this;
  }

   /**
   * Get frontChannelLogoutUrl
   * @return frontChannelLogoutUrl
  **/
  @Schema(example = "https://app.example.com/frontchannel/callback", description = "")
  public String getFrontChannelLogoutUrl() {
    return frontChannelLogoutUrl;
  }

  public void setFrontChannelLogoutUrl(String frontChannelLogoutUrl) {
    this.frontChannelLogoutUrl = frontChannelLogoutUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCLogoutConfiguration oiDCLogoutConfiguration = (OIDCLogoutConfiguration) o;
    return Objects.equals(this.backChannelLogoutUrl, oiDCLogoutConfiguration.backChannelLogoutUrl) &&
        Objects.equals(this.frontChannelLogoutUrl, oiDCLogoutConfiguration.frontChannelLogoutUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backChannelLogoutUrl, frontChannelLogoutUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCLogoutConfiguration {\n");
    
    sb.append("    backChannelLogoutUrl: ").append(toIndentedString(backChannelLogoutUrl)).append("\n");
    sb.append("    frontChannelLogoutUrl: ").append(toIndentedString(frontChannelLogoutUrl)).append("\n");
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
