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
 * RefreshTokenConfiguration
 */


public class RefreshTokenConfiguration {
  @SerializedName("expiryInSeconds")
  private Long expiryInSeconds = null;

  @SerializedName("renewRefreshToken")
  private Boolean renewRefreshToken = null;

  public RefreshTokenConfiguration expiryInSeconds(Long expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
    return this;
  }

   /**
   * Get expiryInSeconds
   * @return expiryInSeconds
  **/
  @Schema(example = "86400", description = "")
  public Long getExpiryInSeconds() {
    return expiryInSeconds;
  }

  public void setExpiryInSeconds(Long expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
  }

  public RefreshTokenConfiguration renewRefreshToken(Boolean renewRefreshToken) {
    this.renewRefreshToken = renewRefreshToken;
    return this;
  }

   /**
   * Decides whether the refresh token needs to renewed during refresh grant flow.
   * @return renewRefreshToken
  **/
  @Schema(example = "true", description = "Decides whether the refresh token needs to renewed during refresh grant flow.")
  public Boolean isRenewRefreshToken() {
    return renewRefreshToken;
  }

  public void setRenewRefreshToken(Boolean renewRefreshToken) {
    this.renewRefreshToken = renewRefreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshTokenConfiguration refreshTokenConfiguration = (RefreshTokenConfiguration) o;
    return Objects.equals(this.expiryInSeconds, refreshTokenConfiguration.expiryInSeconds) &&
        Objects.equals(this.renewRefreshToken, refreshTokenConfiguration.renewRefreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryInSeconds, renewRefreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshTokenConfiguration {\n");
    
    sb.append("    expiryInSeconds: ").append(toIndentedString(expiryInSeconds)).append("\n");
    sb.append("    renewRefreshToken: ").append(toIndentedString(renewRefreshToken)).append("\n");
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
