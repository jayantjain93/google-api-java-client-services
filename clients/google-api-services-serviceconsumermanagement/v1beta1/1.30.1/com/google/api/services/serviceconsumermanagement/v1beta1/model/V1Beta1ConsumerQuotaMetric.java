/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.serviceconsumermanagement.v1beta1.model;

/**
 * Consumer quota settings for a quota metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V1Beta1ConsumerQuotaMetric extends com.google.api.client.json.GenericJson {

  /**
   * The consumer quota for each quota limit defined on the metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<V1Beta1ConsumerQuotaLimit> consumerQuotaLimits;

  static {
    // hack to force ProGuard to consider V1Beta1ConsumerQuotaLimit used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(V1Beta1ConsumerQuotaLimit.class);
  }

  /**
   * The display name of the metric.
   *
   * An example name would be: "CPUs"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The name of the metric.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * The resource name of the quota settings on this metric for this consumer.
   *
   * An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/quota
   * /metrics/compute.googleapis.com%2Fcpus
   *
   * The resource name is intended to be opaque and should not be parsed for its component strings,
   * since its representation could change in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The units in which the metric value is reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The consumer quota for each quota limit defined on the metric.
   * @return value or {@code null} for none
   */
  public java.util.List<V1Beta1ConsumerQuotaLimit> getConsumerQuotaLimits() {
    return consumerQuotaLimits;
  }

  /**
   * The consumer quota for each quota limit defined on the metric.
   * @param consumerQuotaLimits consumerQuotaLimits or {@code null} for none
   */
  public V1Beta1ConsumerQuotaMetric setConsumerQuotaLimits(java.util.List<V1Beta1ConsumerQuotaLimit> consumerQuotaLimits) {
    this.consumerQuotaLimits = consumerQuotaLimits;
    return this;
  }

  /**
   * The display name of the metric.
   *
   * An example name would be: "CPUs"
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the metric.
   *
   * An example name would be: "CPUs"
   * @param displayName displayName or {@code null} for none
   */
  public V1Beta1ConsumerQuotaMetric setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The name of the metric.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * The name of the metric.
   *
   * An example name would be: `compute.googleapis.com/cpus`
   * @param metric metric or {@code null} for none
   */
  public V1Beta1ConsumerQuotaMetric setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The resource name of the quota settings on this metric for this consumer.
   *
   * An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/quota
   * /metrics/compute.googleapis.com%2Fcpus
   *
   * The resource name is intended to be opaque and should not be parsed for its component strings,
   * since its representation could change in the future.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the quota settings on this metric for this consumer.
   *
   * An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/quota
   * /metrics/compute.googleapis.com%2Fcpus
   *
   * The resource name is intended to be opaque and should not be parsed for its component strings,
   * since its representation could change in the future.
   * @param name name or {@code null} for none
   */
  public V1Beta1ConsumerQuotaMetric setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The units in which the metric value is reported.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The units in which the metric value is reported.
   * @param unit unit or {@code null} for none
   */
  public V1Beta1ConsumerQuotaMetric setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public V1Beta1ConsumerQuotaMetric set(String fieldName, Object value) {
    return (V1Beta1ConsumerQuotaMetric) super.set(fieldName, value);
  }

  @Override
  public V1Beta1ConsumerQuotaMetric clone() {
    return (V1Beta1ConsumerQuotaMetric) super.clone();
  }

}
