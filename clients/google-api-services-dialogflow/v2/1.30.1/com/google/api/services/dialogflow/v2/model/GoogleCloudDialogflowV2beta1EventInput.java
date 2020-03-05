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

package com.google.api.services.dialogflow.v2.model;

/**
 * Events allow for matching intents by event name instead of the natural language input. For
 * instance, input `` can trigger a personalized welcome response. The parameter `name` may be used
 * by the agent in the response: `"Hello #welcome_event.name! What can I do for you today?"`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1EventInput extends com.google.api.client.json.GenericJson {

  /**
   * Required. The language of this query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the
   * currently supported language codes. Note that queries in the same session do not necessarily
   * need to specify the same language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The unique identifier of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The collection of parameters associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * Required. The language of this query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the
   * currently supported language codes. Note that queries in the same session do not necessarily
   * need to specify the same language.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. The language of this query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the
   * currently supported language codes. Note that queries in the same session do not necessarily
   * need to specify the same language.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EventInput setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Required. The unique identifier of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of the event.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EventInput setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The collection of parameters associated with the event.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * The collection of parameters associated with the event.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EventInput setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1EventInput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1EventInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1EventInput clone() {
    return (GoogleCloudDialogflowV2beta1EventInput) super.clone();
  }

}
