/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.ClusterTarget;
import com.openshift.cloud.api.connector.models.ConnectorAllOf;
import com.openshift.cloud.api.connector.models.ConnectorAllOfMetadata;
import com.openshift.cloud.api.connector.models.KafkaConnectionSettings;
import com.openshift.cloud.api.connector.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A connector holds the configuration to connect a Kafka topic to another system.
 */
@ApiModel(description = "A connector holds the configuration to connect a Kafka topic to another system.")
@JsonPropertyOrder({
  Connector.JSON_PROPERTY_ID,
  Connector.JSON_PROPERTY_KIND,
  Connector.JSON_PROPERTY_HREF,
  Connector.JSON_PROPERTY_METADATA,
  Connector.JSON_PROPERTY_DEPLOYMENT_LOCATION,
  Connector.JSON_PROPERTY_KAFKA,
  Connector.JSON_PROPERTY_CONNECTOR_TYPE_ID,
  Connector.JSON_PROPERTY_CONNECTOR_SPEC,
  Connector.JSON_PROPERTY_CHANNEL,
  Connector.JSON_PROPERTY_DESIRED_STATE,
  Connector.JSON_PROPERTY_STATUS
})
@JsonTypeName("Connector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Connector {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConnectorAllOfMetadata metadata;

  public static final String JSON_PROPERTY_DEPLOYMENT_LOCATION = "deployment_location";
  private ClusterTarget deploymentLocation;

  public static final String JSON_PROPERTY_KAFKA = "kafka";
  private KafkaConnectionSettings kafka;

  public static final String JSON_PROPERTY_CONNECTOR_TYPE_ID = "connector_type_id";
  private String connectorTypeId;

  public static final String JSON_PROPERTY_CONNECTOR_SPEC = "connector_spec";
  private Object connectorSpec;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_DESIRED_STATE = "desired_state";
  private String desiredState;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public Connector() { 
  }

  public Connector id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Connector kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public Connector href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public Connector metadata(ConnectorAllOfMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectorAllOfMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ConnectorAllOfMetadata metadata) {
    this.metadata = metadata;
  }


  public Connector deploymentLocation(ClusterTarget deploymentLocation) {
    
    this.deploymentLocation = deploymentLocation;
    return this;
  }

   /**
   * Get deploymentLocation
   * @return deploymentLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClusterTarget getDeploymentLocation() {
    return deploymentLocation;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentLocation(ClusterTarget deploymentLocation) {
    this.deploymentLocation = deploymentLocation;
  }


  public Connector kafka(KafkaConnectionSettings kafka) {
    
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KafkaConnectionSettings getKafka() {
    return kafka;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafka(KafkaConnectionSettings kafka) {
    this.kafka = kafka;
  }


  public Connector connectorTypeId(String connectorTypeId) {
    
    this.connectorTypeId = connectorTypeId;
    return this;
  }

   /**
   * Get connectorTypeId
   * @return connectorTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectorTypeId() {
    return connectorTypeId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorTypeId(String connectorTypeId) {
    this.connectorTypeId = connectorTypeId;
  }


  public Connector connectorSpec(Object connectorSpec) {
    
    this.connectorSpec = connectorSpec;
    return this;
  }

   /**
   * Get connectorSpec
   * @return connectorSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTOR_SPEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConnectorSpec() {
    return connectorSpec;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_SPEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorSpec(Object connectorSpec) {
    this.connectorSpec = connectorSpec;
  }


  public Connector channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(String channel) {
    this.channel = channel;
  }


  public Connector desiredState(String desiredState) {
    
    this.desiredState = desiredState;
    return this;
  }

   /**
   * Get desiredState
   * @return desiredState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredState() {
    return desiredState;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredState(String desiredState) {
    this.desiredState = desiredState;
  }


  public Connector status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return Objects.equals(this.id, connector.id) &&
        Objects.equals(this.kind, connector.kind) &&
        Objects.equals(this.href, connector.href) &&
        Objects.equals(this.metadata, connector.metadata) &&
        Objects.equals(this.deploymentLocation, connector.deploymentLocation) &&
        Objects.equals(this.kafka, connector.kafka) &&
        Objects.equals(this.connectorTypeId, connector.connectorTypeId) &&
        Objects.equals(this.connectorSpec, connector.connectorSpec) &&
        Objects.equals(this.channel, connector.channel) &&
        Objects.equals(this.desiredState, connector.desiredState) &&
        Objects.equals(this.status, connector.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, metadata, deploymentLocation, kafka, connectorTypeId, connectorSpec, channel, desiredState, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    deploymentLocation: ").append(toIndentedString(deploymentLocation)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    connectorTypeId: ").append(toIndentedString(connectorTypeId)).append("\n");
    sb.append("    connectorSpec: ").append(toIndentedString(connectorSpec)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

