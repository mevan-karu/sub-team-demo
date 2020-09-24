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
 * AccessTokenConfiguration
 */


public class AccessTokenConfiguration {
  @SerializedName("type")
  private String type = null;

  @SerializedName("userAccessTokenExpiryInSeconds")
  private Long userAccessTokenExpiryInSeconds = null;

  @SerializedName("applicationAccessTokenExpiryInSeconds")
  private Long applicationAccessTokenExpiryInSeconds = null;

  public AccessTokenConfiguration type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "JWT", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccessTokenConfiguration userAccessTokenExpiryInSeconds(Long userAccessTokenExpiryInSeconds) {
    this.userAccessTokenExpiryInSeconds = userAccessTokenExpiryInSeconds;
    return this;
  }

   /**
   * Get userAccessTokenExpiryInSeconds
   * @return userAccessTokenExpiryInSeconds
  **/
  @Schema(example = "3600", description = "")
  public Long getUserAccessTokenExpiryInSeconds() {
    return userAccessTokenExpiryInSeconds;
  }

  public void setUserAccessTokenExpiryInSeconds(Long userAccessTokenExpiryInSeconds) {
    this.userAccessTokenExpiryInSeconds = userAccessTokenExpiryInSeconds;
  }

  public AccessTokenConfiguration applicationAccessTokenExpiryInSeconds(Long applicationAccessTokenExpiryInSeconds) {
    this.applicationAccessTokenExpiryInSeconds = applicationAccessTokenExpiryInSeconds;
    return this;
  }

   /**
   * Get applicationAccessTokenExpiryInSeconds
   * @return applicationAccessTokenExpiryInSeconds
  **/
  @Schema(example = "3600", description = "")
  public Long getApplicationAccessTokenExpiryInSeconds() {
    return applicationAccessTokenExpiryInSeconds;
  }

  public void setApplicationAccessTokenExpiryInSeconds(Long applicationAccessTokenExpiryInSeconds) {
    this.applicationAccessTokenExpiryInSeconds = applicationAccessTokenExpiryInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenConfiguration accessTokenConfiguration = (AccessTokenConfiguration) o;
    return Objects.equals(this.type, accessTokenConfiguration.type) &&
        Objects.equals(this.userAccessTokenExpiryInSeconds, accessTokenConfiguration.userAccessTokenExpiryInSeconds) &&
        Objects.equals(this.applicationAccessTokenExpiryInSeconds, accessTokenConfiguration.applicationAccessTokenExpiryInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userAccessTokenExpiryInSeconds, applicationAccessTokenExpiryInSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenConfiguration {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userAccessTokenExpiryInSeconds: ").append(toIndentedString(userAccessTokenExpiryInSeconds)).append("\n");
    sb.append("    applicationAccessTokenExpiryInSeconds: ").append(toIndentedString(applicationAccessTokenExpiryInSeconds)).append("\n");
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