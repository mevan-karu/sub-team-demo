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
import com.iqvia.development.portal.application.client.model.CustomInboundProtocolConfiguration;
import com.iqvia.development.portal.application.client.model.OpenIDConnectConfiguration;
import com.iqvia.development.portal.application.client.model.PassiveStsConfiguration;
import com.iqvia.development.portal.application.client.model.SAML2Configuration;
import com.iqvia.development.portal.application.client.model.WSTrustConfiguration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InboundProtocols
 */


public class InboundProtocols {
  @SerializedName("saml")
  private SAML2Configuration saml = null;

  @SerializedName("oidc")
  private OpenIDConnectConfiguration oidc = null;

  @SerializedName("passiveSts")
  private PassiveStsConfiguration passiveSts = null;

  @SerializedName("wsTrust")
  private WSTrustConfiguration wsTrust = null;

  @SerializedName("custom")
  private List<CustomInboundProtocolConfiguration> custom = null;

  public InboundProtocols saml(SAML2Configuration saml) {
    this.saml = saml;
    return this;
  }

   /**
   * Get saml
   * @return saml
  **/
  @Schema(description = "")
  public SAML2Configuration getSaml() {
    return saml;
  }

  public void setSaml(SAML2Configuration saml) {
    this.saml = saml;
  }

  public InboundProtocols oidc(OpenIDConnectConfiguration oidc) {
    this.oidc = oidc;
    return this;
  }

   /**
   * Get oidc
   * @return oidc
  **/
  @Schema(description = "")
  public OpenIDConnectConfiguration getOidc() {
    return oidc;
  }

  public void setOidc(OpenIDConnectConfiguration oidc) {
    this.oidc = oidc;
  }

  public InboundProtocols passiveSts(PassiveStsConfiguration passiveSts) {
    this.passiveSts = passiveSts;
    return this;
  }

   /**
   * Get passiveSts
   * @return passiveSts
  **/
  @Schema(description = "")
  public PassiveStsConfiguration getPassiveSts() {
    return passiveSts;
  }

  public void setPassiveSts(PassiveStsConfiguration passiveSts) {
    this.passiveSts = passiveSts;
  }

  public InboundProtocols wsTrust(WSTrustConfiguration wsTrust) {
    this.wsTrust = wsTrust;
    return this;
  }

   /**
   * Get wsTrust
   * @return wsTrust
  **/
  @Schema(description = "")
  public WSTrustConfiguration getWsTrust() {
    return wsTrust;
  }

  public void setWsTrust(WSTrustConfiguration wsTrust) {
    this.wsTrust = wsTrust;
  }

  public InboundProtocols custom(List<CustomInboundProtocolConfiguration> custom) {
    this.custom = custom;
    return this;
  }

  public InboundProtocols addCustomItem(CustomInboundProtocolConfiguration customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @Schema(description = "")
  public List<CustomInboundProtocolConfiguration> getCustom() {
    return custom;
  }

  public void setCustom(List<CustomInboundProtocolConfiguration> custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundProtocols inboundProtocols = (InboundProtocols) o;
    return Objects.equals(this.saml, inboundProtocols.saml) &&
        Objects.equals(this.oidc, inboundProtocols.oidc) &&
        Objects.equals(this.passiveSts, inboundProtocols.passiveSts) &&
        Objects.equals(this.wsTrust, inboundProtocols.wsTrust) &&
        Objects.equals(this.custom, inboundProtocols.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saml, oidc, passiveSts, wsTrust, custom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundProtocols {\n");
    
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    passiveSts: ").append(toIndentedString(passiveSts)).append("\n");
    sb.append("    wsTrust: ").append(toIndentedString(wsTrust)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
