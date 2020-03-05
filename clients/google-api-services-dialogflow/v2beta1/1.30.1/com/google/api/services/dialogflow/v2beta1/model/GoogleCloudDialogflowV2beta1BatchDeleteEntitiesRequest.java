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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The request message for EntityTypes.BatchDeleteEntities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The reference `values` of the entities to delete. Note that these are not fully-
   * qualified names, i.e. they don't start with `projects/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entityValues;

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note:
   * languages must be enabled in the agent before they can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The reference `values` of the entities to delete. Note that these are not fully-
   * qualified names, i.e. they don't start with `projects/`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntityValues() {
    return entityValues;
  }

  /**
   * Required. The reference `values` of the entities to delete. Note that these are not fully-
   * qualified names, i.e. they don't start with `projects/`.
   * @param entityValues entityValues or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest setEntityValues(java.util.List<java.lang.String> entityValues) {
    this.entityValues = entityValues;
    return this;
  }

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note:
   * languages must be enabled in the agent before they can be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note:
   * languages must be enabled in the agent before they can be used.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest clone() {
    return (GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest) super.clone();
  }

}
