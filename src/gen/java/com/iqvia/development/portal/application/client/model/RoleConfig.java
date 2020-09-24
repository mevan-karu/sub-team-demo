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
import com.iqvia.development.portal.application.client.model.Claim;
import com.iqvia.development.portal.application.client.model.RoleMapping;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RoleConfig
 */


public class RoleConfig {
  @SerializedName("mappings")
  private List<RoleMapping> mappings = null;

  @SerializedName("includeUserDomain")
  private Boolean includeUserDomain = null;

  @SerializedName("claim")
  private Claim claim = null;

  public RoleConfig mappings(List<RoleMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public RoleConfig addMappingsItem(RoleMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Get mappings
   * @return mappings
  **/
  @Schema(description = "")
  public List<RoleMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<RoleMapping> mappings) {
    this.mappings = mappings;
  }

  public RoleConfig includeUserDomain(Boolean includeUserDomain) {
    this.includeUserDomain = includeUserDomain;
    return this;
  }

   /**
   * Get includeUserDomain
   * @return includeUserDomain
  **/
  @Schema(example = "true", description = "")
  public Boolean isIncludeUserDomain() {
    return includeUserDomain;
  }

  public void setIncludeUserDomain(Boolean includeUserDomain) {
    this.includeUserDomain = includeUserDomain;
  }

  public RoleConfig claim(Claim claim) {
    this.claim = claim;
    return this;
  }

   /**
   * Get claim
   * @return claim
  **/
  @Schema(description = "")
  public Claim getClaim() {
    return claim;
  }

  public void setClaim(Claim claim) {
    this.claim = claim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleConfig roleConfig = (RoleConfig) o;
    return Objects.equals(this.mappings, roleConfig.mappings) &&
        Objects.equals(this.includeUserDomain, roleConfig.includeUserDomain) &&
        Objects.equals(this.claim, roleConfig.claim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, includeUserDomain, claim);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleConfig {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    includeUserDomain: ").append(toIndentedString(includeUserDomain)).append("\n");
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
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