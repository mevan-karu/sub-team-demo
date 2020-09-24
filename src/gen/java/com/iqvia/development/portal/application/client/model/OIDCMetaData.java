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
import com.iqvia.development.portal.application.client.model.MetadataProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OIDCMetaData
 */


public class OIDCMetaData {
  @SerializedName("allowedGrantTypes")
  private MetadataProperty allowedGrantTypes = null;

  @SerializedName("defaultUserAccessTokenExpiryTime")
  private String defaultUserAccessTokenExpiryTime = null;

  @SerializedName("defaultApplicationAccessTokenExpiryTime")
  private String defaultApplicationAccessTokenExpiryTime = null;

  @SerializedName("defaultRefreshTokenExpiryTime")
  private String defaultRefreshTokenExpiryTime = null;

  @SerializedName("defaultIdTokenExpiryTime")
  private String defaultIdTokenExpiryTime = null;

  @SerializedName("idTokenEncryptionAlgorithm")
  private MetadataProperty idTokenEncryptionAlgorithm = null;

  @SerializedName("idTokenEncryptionMethod")
  private MetadataProperty idTokenEncryptionMethod = null;

  @SerializedName("scopeValidators")
  private MetadataProperty scopeValidators = null;

  @SerializedName("accessTokenType")
  private MetadataProperty accessTokenType = null;

  public OIDCMetaData allowedGrantTypes(MetadataProperty allowedGrantTypes) {
    this.allowedGrantTypes = allowedGrantTypes;
    return this;
  }

   /**
   * Get allowedGrantTypes
   * @return allowedGrantTypes
  **/
  @Schema(description = "")
  public MetadataProperty getAllowedGrantTypes() {
    return allowedGrantTypes;
  }

  public void setAllowedGrantTypes(MetadataProperty allowedGrantTypes) {
    this.allowedGrantTypes = allowedGrantTypes;
  }

  public OIDCMetaData defaultUserAccessTokenExpiryTime(String defaultUserAccessTokenExpiryTime) {
    this.defaultUserAccessTokenExpiryTime = defaultUserAccessTokenExpiryTime;
    return this;
  }

   /**
   * Get defaultUserAccessTokenExpiryTime
   * @return defaultUserAccessTokenExpiryTime
  **/
  @Schema(example = "3600", description = "")
  public String getDefaultUserAccessTokenExpiryTime() {
    return defaultUserAccessTokenExpiryTime;
  }

  public void setDefaultUserAccessTokenExpiryTime(String defaultUserAccessTokenExpiryTime) {
    this.defaultUserAccessTokenExpiryTime = defaultUserAccessTokenExpiryTime;
  }

  public OIDCMetaData defaultApplicationAccessTokenExpiryTime(String defaultApplicationAccessTokenExpiryTime) {
    this.defaultApplicationAccessTokenExpiryTime = defaultApplicationAccessTokenExpiryTime;
    return this;
  }

   /**
   * Get defaultApplicationAccessTokenExpiryTime
   * @return defaultApplicationAccessTokenExpiryTime
  **/
  @Schema(example = "3600", description = "")
  public String getDefaultApplicationAccessTokenExpiryTime() {
    return defaultApplicationAccessTokenExpiryTime;
  }

  public void setDefaultApplicationAccessTokenExpiryTime(String defaultApplicationAccessTokenExpiryTime) {
    this.defaultApplicationAccessTokenExpiryTime = defaultApplicationAccessTokenExpiryTime;
  }

  public OIDCMetaData defaultRefreshTokenExpiryTime(String defaultRefreshTokenExpiryTime) {
    this.defaultRefreshTokenExpiryTime = defaultRefreshTokenExpiryTime;
    return this;
  }

   /**
   * Get defaultRefreshTokenExpiryTime
   * @return defaultRefreshTokenExpiryTime
  **/
  @Schema(example = "86400", description = "")
  public String getDefaultRefreshTokenExpiryTime() {
    return defaultRefreshTokenExpiryTime;
  }

  public void setDefaultRefreshTokenExpiryTime(String defaultRefreshTokenExpiryTime) {
    this.defaultRefreshTokenExpiryTime = defaultRefreshTokenExpiryTime;
  }

  public OIDCMetaData defaultIdTokenExpiryTime(String defaultIdTokenExpiryTime) {
    this.defaultIdTokenExpiryTime = defaultIdTokenExpiryTime;
    return this;
  }

   /**
   * Get defaultIdTokenExpiryTime
   * @return defaultIdTokenExpiryTime
  **/
  @Schema(example = "3600", description = "")
  public String getDefaultIdTokenExpiryTime() {
    return defaultIdTokenExpiryTime;
  }

  public void setDefaultIdTokenExpiryTime(String defaultIdTokenExpiryTime) {
    this.defaultIdTokenExpiryTime = defaultIdTokenExpiryTime;
  }

  public OIDCMetaData idTokenEncryptionAlgorithm(MetadataProperty idTokenEncryptionAlgorithm) {
    this.idTokenEncryptionAlgorithm = idTokenEncryptionAlgorithm;
    return this;
  }

   /**
   * Get idTokenEncryptionAlgorithm
   * @return idTokenEncryptionAlgorithm
  **/
  @Schema(description = "")
  public MetadataProperty getIdTokenEncryptionAlgorithm() {
    return idTokenEncryptionAlgorithm;
  }

  public void setIdTokenEncryptionAlgorithm(MetadataProperty idTokenEncryptionAlgorithm) {
    this.idTokenEncryptionAlgorithm = idTokenEncryptionAlgorithm;
  }

  public OIDCMetaData idTokenEncryptionMethod(MetadataProperty idTokenEncryptionMethod) {
    this.idTokenEncryptionMethod = idTokenEncryptionMethod;
    return this;
  }

   /**
   * Get idTokenEncryptionMethod
   * @return idTokenEncryptionMethod
  **/
  @Schema(description = "")
  public MetadataProperty getIdTokenEncryptionMethod() {
    return idTokenEncryptionMethod;
  }

  public void setIdTokenEncryptionMethod(MetadataProperty idTokenEncryptionMethod) {
    this.idTokenEncryptionMethod = idTokenEncryptionMethod;
  }

  public OIDCMetaData scopeValidators(MetadataProperty scopeValidators) {
    this.scopeValidators = scopeValidators;
    return this;
  }

   /**
   * Get scopeValidators
   * @return scopeValidators
  **/
  @Schema(description = "")
  public MetadataProperty getScopeValidators() {
    return scopeValidators;
  }

  public void setScopeValidators(MetadataProperty scopeValidators) {
    this.scopeValidators = scopeValidators;
  }

  public OIDCMetaData accessTokenType(MetadataProperty accessTokenType) {
    this.accessTokenType = accessTokenType;
    return this;
  }

   /**
   * Get accessTokenType
   * @return accessTokenType
  **/
  @Schema(description = "")
  public MetadataProperty getAccessTokenType() {
    return accessTokenType;
  }

  public void setAccessTokenType(MetadataProperty accessTokenType) {
    this.accessTokenType = accessTokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCMetaData oiDCMetaData = (OIDCMetaData) o;
    return Objects.equals(this.allowedGrantTypes, oiDCMetaData.allowedGrantTypes) &&
        Objects.equals(this.defaultUserAccessTokenExpiryTime, oiDCMetaData.defaultUserAccessTokenExpiryTime) &&
        Objects.equals(this.defaultApplicationAccessTokenExpiryTime, oiDCMetaData.defaultApplicationAccessTokenExpiryTime) &&
        Objects.equals(this.defaultRefreshTokenExpiryTime, oiDCMetaData.defaultRefreshTokenExpiryTime) &&
        Objects.equals(this.defaultIdTokenExpiryTime, oiDCMetaData.defaultIdTokenExpiryTime) &&
        Objects.equals(this.idTokenEncryptionAlgorithm, oiDCMetaData.idTokenEncryptionAlgorithm) &&
        Objects.equals(this.idTokenEncryptionMethod, oiDCMetaData.idTokenEncryptionMethod) &&
        Objects.equals(this.scopeValidators, oiDCMetaData.scopeValidators) &&
        Objects.equals(this.accessTokenType, oiDCMetaData.accessTokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedGrantTypes, defaultUserAccessTokenExpiryTime, defaultApplicationAccessTokenExpiryTime, defaultRefreshTokenExpiryTime, defaultIdTokenExpiryTime, idTokenEncryptionAlgorithm, idTokenEncryptionMethod, scopeValidators, accessTokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCMetaData {\n");
    
    sb.append("    allowedGrantTypes: ").append(toIndentedString(allowedGrantTypes)).append("\n");
    sb.append("    defaultUserAccessTokenExpiryTime: ").append(toIndentedString(defaultUserAccessTokenExpiryTime)).append("\n");
    sb.append("    defaultApplicationAccessTokenExpiryTime: ").append(toIndentedString(defaultApplicationAccessTokenExpiryTime)).append("\n");
    sb.append("    defaultRefreshTokenExpiryTime: ").append(toIndentedString(defaultRefreshTokenExpiryTime)).append("\n");
    sb.append("    defaultIdTokenExpiryTime: ").append(toIndentedString(defaultIdTokenExpiryTime)).append("\n");
    sb.append("    idTokenEncryptionAlgorithm: ").append(toIndentedString(idTokenEncryptionAlgorithm)).append("\n");
    sb.append("    idTokenEncryptionMethod: ").append(toIndentedString(idTokenEncryptionMethod)).append("\n");
    sb.append("    scopeValidators: ").append(toIndentedString(scopeValidators)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
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