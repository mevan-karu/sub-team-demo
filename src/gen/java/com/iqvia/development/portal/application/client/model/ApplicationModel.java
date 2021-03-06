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
import com.iqvia.development.portal.application.client.model.AdvancedApplicationConfiguration;
import com.iqvia.development.portal.application.client.model.AuthenticationSequence;
import com.iqvia.development.portal.application.client.model.ClaimConfiguration;
import com.iqvia.development.portal.application.client.model.InboundProtocols;
import com.iqvia.development.portal.application.client.model.ProvisioningConfiguration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApplicationModel
 */


public class ApplicationModel {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("accessUrl")
  private String accessUrl = null;

  @SerializedName("claimConfiguration")
  private ClaimConfiguration claimConfiguration = null;

  @SerializedName("inboundProtocolConfiguration")
  private InboundProtocols inboundProtocolConfiguration = null;

  @SerializedName("authenticationSequence")
  private AuthenticationSequence authenticationSequence = null;

  @SerializedName("advancedConfigurations")
  private AdvancedApplicationConfiguration advancedConfigurations = null;

  @SerializedName("provisioningConfigurations")
  private ProvisioningConfiguration provisioningConfigurations = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "394b8adcce24c64a8a09a0d80abf8c337bd253de", description = "")
  public String getId() {
    return id;
  }

  public ApplicationModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "pickup", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "This is the configuration for Pickup application.", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationModel imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @Schema(example = "https://example.com/logo/my-logo.png", description = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ApplicationModel accessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
    return this;
  }

   /**
   * Get accessUrl
   * @return accessUrl
  **/
  @Schema(example = "https://example.com/login", description = "")
  public String getAccessUrl() {
    return accessUrl;
  }

  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }

  public ApplicationModel claimConfiguration(ClaimConfiguration claimConfiguration) {
    this.claimConfiguration = claimConfiguration;
    return this;
  }

   /**
   * Get claimConfiguration
   * @return claimConfiguration
  **/
  @Schema(description = "")
  public ClaimConfiguration getClaimConfiguration() {
    return claimConfiguration;
  }

  public void setClaimConfiguration(ClaimConfiguration claimConfiguration) {
    this.claimConfiguration = claimConfiguration;
  }

  public ApplicationModel inboundProtocolConfiguration(InboundProtocols inboundProtocolConfiguration) {
    this.inboundProtocolConfiguration = inboundProtocolConfiguration;
    return this;
  }

   /**
   * Get inboundProtocolConfiguration
   * @return inboundProtocolConfiguration
  **/
  @Schema(description = "")
  public InboundProtocols getInboundProtocolConfiguration() {
    return inboundProtocolConfiguration;
  }

  public void setInboundProtocolConfiguration(InboundProtocols inboundProtocolConfiguration) {
    this.inboundProtocolConfiguration = inboundProtocolConfiguration;
  }

  public ApplicationModel authenticationSequence(AuthenticationSequence authenticationSequence) {
    this.authenticationSequence = authenticationSequence;
    return this;
  }

   /**
   * Get authenticationSequence
   * @return authenticationSequence
  **/
  @Schema(description = "")
  public AuthenticationSequence getAuthenticationSequence() {
    return authenticationSequence;
  }

  public void setAuthenticationSequence(AuthenticationSequence authenticationSequence) {
    this.authenticationSequence = authenticationSequence;
  }

  public ApplicationModel advancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {
    this.advancedConfigurations = advancedConfigurations;
    return this;
  }

   /**
   * Get advancedConfigurations
   * @return advancedConfigurations
  **/
  @Schema(description = "")
  public AdvancedApplicationConfiguration getAdvancedConfigurations() {
    return advancedConfigurations;
  }

  public void setAdvancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {
    this.advancedConfigurations = advancedConfigurations;
  }

  public ApplicationModel provisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {
    this.provisioningConfigurations = provisioningConfigurations;
    return this;
  }

   /**
   * Get provisioningConfigurations
   * @return provisioningConfigurations
  **/
  @Schema(description = "")
  public ProvisioningConfiguration getProvisioningConfigurations() {
    return provisioningConfigurations;
  }

  public void setProvisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {
    this.provisioningConfigurations = provisioningConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationModel applicationModel = (ApplicationModel) o;
    return Objects.equals(this.id, applicationModel.id) &&
        Objects.equals(this.name, applicationModel.name) &&
        Objects.equals(this.description, applicationModel.description) &&
        Objects.equals(this.imageUrl, applicationModel.imageUrl) &&
        Objects.equals(this.accessUrl, applicationModel.accessUrl) &&
        Objects.equals(this.claimConfiguration, applicationModel.claimConfiguration) &&
        Objects.equals(this.inboundProtocolConfiguration, applicationModel.inboundProtocolConfiguration) &&
        Objects.equals(this.authenticationSequence, applicationModel.authenticationSequence) &&
        Objects.equals(this.advancedConfigurations, applicationModel.advancedConfigurations) &&
        Objects.equals(this.provisioningConfigurations, applicationModel.provisioningConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, accessUrl, claimConfiguration, inboundProtocolConfiguration, authenticationSequence, advancedConfigurations, provisioningConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    accessUrl: ").append(toIndentedString(accessUrl)).append("\n");
    sb.append("    claimConfiguration: ").append(toIndentedString(claimConfiguration)).append("\n");
    sb.append("    inboundProtocolConfiguration: ").append(toIndentedString(inboundProtocolConfiguration)).append("\n");
    sb.append("    authenticationSequence: ").append(toIndentedString(authenticationSequence)).append("\n");
    sb.append("    advancedConfigurations: ").append(toIndentedString(advancedConfigurations)).append("\n");
    sb.append("    provisioningConfigurations: ").append(toIndentedString(provisioningConfigurations)).append("\n");
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
