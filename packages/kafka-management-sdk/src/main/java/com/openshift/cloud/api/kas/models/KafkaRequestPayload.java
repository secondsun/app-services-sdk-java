/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kakfa instances and connectors.
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Schema for the request body sent to /kafkas POST
 */
@ApiModel(description = "Schema for the request body sent to /kafkas POST")
@JsonPropertyOrder({
  KafkaRequestPayload.JSON_PROPERTY_CLOUD_PROVIDER,
  KafkaRequestPayload.JSON_PROPERTY_MULTI_AZ,
  KafkaRequestPayload.JSON_PROPERTY_NAME,
  KafkaRequestPayload.JSON_PROPERTY_REGION
})
@JsonTypeName("KafkaRequestPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-11T11:25:23.732610761-04:00[America/New_York]")
public class KafkaRequestPayload {
  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_MULTI_AZ = "multi_az";
  private Boolean multiAz;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;


  public KafkaRequestPayload cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * The cloud provider where the Kafka cluster will be created in
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud provider where the Kafka cluster will be created in")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudProvider() {
    return cloudProvider;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public KafkaRequestPayload multiAz(Boolean multiAz) {
    
    this.multiAz = multiAz;
    return this;
  }

   /**
   * Set this to true to configure the Kafka cluster to be multiAZ
   * @return multiAz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this to true to configure the Kafka cluster to be multiAZ")
  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiAz() {
    return multiAz;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }


  public KafkaRequestPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or &#39;-&#39;, start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or '-', start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public KafkaRequestPayload region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region where the Kafka cluster will be created in
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region where the Kafka cluster will be created in")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaRequestPayload kafkaRequestPayload = (KafkaRequestPayload) o;
    return Objects.equals(this.cloudProvider, kafkaRequestPayload.cloudProvider) &&
        Objects.equals(this.multiAz, kafkaRequestPayload.multiAz) &&
        Objects.equals(this.name, kafkaRequestPayload.name) &&
        Objects.equals(this.region, kafkaRequestPayload.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, multiAz, name, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaRequestPayload {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

