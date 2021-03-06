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

package com.google.api.services.content.model;

/**
 * Model definition for TestOrderLineItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestOrderLineItem extends com.google.api.client.json.GenericJson {

  /**
   * Product data from the time of the order placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderLineItemProduct product;

  /**
   * Number of items ordered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityOrdered;

  /**
   * Details of the return policy for the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemReturnInfo returnInfo;

  /**
   * Details of the requested shipping for the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemShippingDetails shippingDetails;

  /**
   * Product data from the time of the order placement.
   * @return value or {@code null} for none
   */
  public TestOrderLineItemProduct getProduct() {
    return product;
  }

  /**
   * Product data from the time of the order placement.
   * @param product product or {@code null} for none
   */
  public TestOrderLineItem setProduct(TestOrderLineItemProduct product) {
    this.product = product;
    return this;
  }

  /**
   * Number of items ordered.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityOrdered() {
    return quantityOrdered;
  }

  /**
   * Number of items ordered.
   * @param quantityOrdered quantityOrdered or {@code null} for none
   */
  public TestOrderLineItem setQuantityOrdered(java.lang.Long quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

  /**
   * Details of the return policy for the line item.
   * @return value or {@code null} for none
   */
  public OrderLineItemReturnInfo getReturnInfo() {
    return returnInfo;
  }

  /**
   * Details of the return policy for the line item.
   * @param returnInfo returnInfo or {@code null} for none
   */
  public TestOrderLineItem setReturnInfo(OrderLineItemReturnInfo returnInfo) {
    this.returnInfo = returnInfo;
    return this;
  }

  /**
   * Details of the requested shipping for the line item.
   * @return value or {@code null} for none
   */
  public OrderLineItemShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  /**
   * Details of the requested shipping for the line item.
   * @param shippingDetails shippingDetails or {@code null} for none
   */
  public TestOrderLineItem setShippingDetails(OrderLineItemShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

  @Override
  public TestOrderLineItem set(String fieldName, Object value) {
    return (TestOrderLineItem) super.set(fieldName, value);
  }

  @Override
  public TestOrderLineItem clone() {
    return (TestOrderLineItem) super.clone();
  }

}
