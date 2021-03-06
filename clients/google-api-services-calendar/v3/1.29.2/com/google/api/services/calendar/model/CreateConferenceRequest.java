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

package com.google.api.services.calendar.model;

/**
 * Model definition for CreateConferenceRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateConferenceRequest extends com.google.api.client.json.GenericJson {

  /**
   * The conference solution, such as Hangouts or Hangouts Meet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConferenceSolutionKey conferenceSolutionKey;

  /**
   * The client-generated unique ID for this request. Clients should regenerate this ID for every
   * new request. If an ID provided is the same as for the previous request, the request is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * The status of the conference create request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConferenceRequestStatus status;

  /**
   * The conference solution, such as Hangouts or Hangouts Meet.
   * @return value or {@code null} for none
   */
  public ConferenceSolutionKey getConferenceSolutionKey() {
    return conferenceSolutionKey;
  }

  /**
   * The conference solution, such as Hangouts or Hangouts Meet.
   * @param conferenceSolutionKey conferenceSolutionKey or {@code null} for none
   */
  public CreateConferenceRequest setConferenceSolutionKey(ConferenceSolutionKey conferenceSolutionKey) {
    this.conferenceSolutionKey = conferenceSolutionKey;
    return this;
  }

  /**
   * The client-generated unique ID for this request. Clients should regenerate this ID for every
   * new request. If an ID provided is the same as for the previous request, the request is ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * The client-generated unique ID for this request. Clients should regenerate this ID for every
   * new request. If an ID provided is the same as for the previous request, the request is ignored.
   * @param requestId requestId or {@code null} for none
   */
  public CreateConferenceRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The status of the conference create request.
   * @return value or {@code null} for none
   */
  public ConferenceRequestStatus getStatus() {
    return status;
  }

  /**
   * The status of the conference create request.
   * @param status status or {@code null} for none
   */
  public CreateConferenceRequest setStatus(ConferenceRequestStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public CreateConferenceRequest set(String fieldName, Object value) {
    return (CreateConferenceRequest) super.set(fieldName, value);
  }

  @Override
  public CreateConferenceRequest clone() {
    return (CreateConferenceRequest) super.clone();
  }

}
