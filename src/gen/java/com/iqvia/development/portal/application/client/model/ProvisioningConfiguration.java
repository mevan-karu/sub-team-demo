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
import com.iqvia.development.portal.application.client.model.InboundSCIMProvisioningConfiguration;
import com.iqvia.development.portal.application.client.model.OutboundProvisioningConfiguration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProvisioningConfiguration
 */


public class ProvisioningConfiguration {
  @SerializedName("inboundProvisioning")
  private InboundSCIMProvisioningConfiguration inboundProvisioning = null;

  @SerializedName("outboundProvisioningIdps")
  private List<OutboundProvisioningConfiguration> outboundProvisioningIdps = null;

  public ProvisioningConfiguration inboundProvisioning(InboundSCIMProvisioningConfiguration inboundProvisioning) {
    this.inboundProvisioning = inboundProvisioning;
    return this;
  }

   /**
   * Get inboundProvisioning
   * @return inboundProvisioning
  **/
  @Schema(description = "")
  public InboundSCIMProvisioningConfiguration getInboundProvisioning() {
    return inboundProvisioning;
  }

  public void setInboundProvisioning(InboundSCIMProvisioningConfiguration inboundProvisioning) {
    this.inboundProvisioning = inboundProvisioning;
  }

  public ProvisioningConfiguration outboundProvisioningIdps(List<OutboundProvisioningConfiguration> outboundProvisioningIdps) {
    this.outboundProvisioningIdps = outboundProvisioningIdps;
    return this;
  }

  public ProvisioningConfiguration addOutboundProvisioningIdpsItem(OutboundProvisioningConfiguration outboundProvisioningIdpsItem) {
    if (this.outboundProvisioningIdps == null) {
      this.outboundProvisioningIdps = new ArrayList<>();
    }
    this.outboundProvisioningIdps.add(outboundProvisioningIdpsItem);
    return this;
  }

   /**
   * Get outboundProvisioningIdps
   * @return outboundProvisioningIdps
  **/
  @Schema(description = "")
  public List<OutboundProvisioningConfiguration> getOutboundProvisioningIdps() {
    return outboundProvisioningIdps;
  }

  public void setOutboundProvisioningIdps(List<OutboundProvisioningConfiguration> outboundProvisioningIdps) {
    this.outboundProvisioningIdps = outboundProvisioningIdps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningConfiguration provisioningConfiguration = (ProvisioningConfiguration) o;
    return Objects.equals(this.inboundProvisioning, provisioningConfiguration.inboundProvisioning) &&
        Objects.equals(this.outboundProvisioningIdps, provisioningConfiguration.outboundProvisioningIdps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundProvisioning, outboundProvisioningIdps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningConfiguration {\n");
    
    sb.append("    inboundProvisioning: ").append(toIndentedString(inboundProvisioning)).append("\n");
    sb.append("    outboundProvisioningIdps: ").append(toIndentedString(outboundProvisioningIdps)).append("\n");
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