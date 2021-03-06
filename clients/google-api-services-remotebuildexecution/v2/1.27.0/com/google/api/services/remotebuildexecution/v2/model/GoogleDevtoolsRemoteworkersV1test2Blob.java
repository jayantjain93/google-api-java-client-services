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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Describes a blob of binary content with its digest.
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
public final class GoogleDevtoolsRemoteworkersV1test2Blob extends com.google.api.client.json.GenericJson {

  /**
   * The contents of the blob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * The digest of the blob. This should be verified by the receiver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteworkersV1test2Digest digest;

  /**
   * The contents of the blob.
   * @see #decodeContents()
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * The contents of the blob.
   * @see #getContents()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContents() {
    return com.google.api.client.util.Base64.decodeBase64(contents);
  }

  /**
   * The contents of the blob.
   * @see #encodeContents()
   * @param contents contents or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Blob setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * The contents of the blob.
   * @see #setContents()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleDevtoolsRemoteworkersV1test2Blob encodeContents(byte[] contents) {
    this.contents = com.google.api.client.util.Base64.encodeBase64URLSafeString(contents);
    return this;
  }

  /**
   * The digest of the blob. This should be verified by the receiver.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Digest getDigest() {
    return digest;
  }

  /**
   * The digest of the blob. This should be verified by the receiver.
   * @param digest digest or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Blob setDigest(GoogleDevtoolsRemoteworkersV1test2Digest digest) {
    this.digest = digest;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2Blob set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2Blob) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2Blob clone() {
    return (GoogleDevtoolsRemoteworkersV1test2Blob) super.clone();
  }

}
