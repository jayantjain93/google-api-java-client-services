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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * The internal status of the command result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildbotCommandStatus extends com.google.api.client.json.GenericJson {

  /**
   * The status code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The error message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The status code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The status code.
   * @param code code or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandStatus setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * The error message.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The error message.
   * @param message message or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandStatus setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandStatus set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildbotCommandStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandStatus clone() {
    return (GoogleDevtoolsRemotebuildbotCommandStatus) super.clone();
  }

}
