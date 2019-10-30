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

package com.google.api.services.cloudresourcemanager.model;

/**
 * The request message for searching folders.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchFoldersRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The maximum number of folders to return in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional. A pagination token returned from a previous call to `SearchFolders` that indicates
   * from where search should continue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Search criteria used to select the Folders to return. If no search criteria is specified then
   * all accessible folders will be returned.
   *
   * Query expressions can be used to restrict results based upon displayName, lifecycleState and
   * parent, where the operators `=`, `NOT`, `AND` and `OR` can be used along with the suffix
   * wildcard symbol `*`.
   *
   * The displayName field in a query expression should use escaped quotes for values that include
   * whitespace to prevent unexpected behavior.
   *
   * Some example queries are:
   *
   * * Query `displayName=Test*` returns Folder resources whose display name starts with "Test". *
   * Query `lifecycleState=ACTIVE` returns Folder resources with `lifecycleState` set to `ACTIVE`. *
   * Query `parent=folders/123` returns Folder resources that have `folders/123` as a parent
   * resource. * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active Folder
   * resources that have `folders/123` as a parent resource. * Query `displayName=\\"Test String\\"`
   * returns Folder resources with display names that include both "Test" and "String".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Optional. The maximum number of folders to return in the response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional. The maximum number of folders to return in the response.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchFoldersRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional. A pagination token returned from a previous call to `SearchFolders` that indicates
   * from where search should continue.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional. A pagination token returned from a previous call to `SearchFolders` that indicates
   * from where search should continue.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchFoldersRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Search criteria used to select the Folders to return. If no search criteria is specified then
   * all accessible folders will be returned.
   *
   * Query expressions can be used to restrict results based upon displayName, lifecycleState and
   * parent, where the operators `=`, `NOT`, `AND` and `OR` can be used along with the suffix
   * wildcard symbol `*`.
   *
   * The displayName field in a query expression should use escaped quotes for values that include
   * whitespace to prevent unexpected behavior.
   *
   * Some example queries are:
   *
   * * Query `displayName=Test*` returns Folder resources whose display name starts with "Test". *
   * Query `lifecycleState=ACTIVE` returns Folder resources with `lifecycleState` set to `ACTIVE`. *
   * Query `parent=folders/123` returns Folder resources that have `folders/123` as a parent
   * resource. * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active Folder
   * resources that have `folders/123` as a parent resource. * Query `displayName=\\"Test String\\"`
   * returns Folder resources with display names that include both "Test" and "String".
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Search criteria used to select the Folders to return. If no search criteria is specified then
   * all accessible folders will be returned.
   *
   * Query expressions can be used to restrict results based upon displayName, lifecycleState and
   * parent, where the operators `=`, `NOT`, `AND` and `OR` can be used along with the suffix
   * wildcard symbol `*`.
   *
   * The displayName field in a query expression should use escaped quotes for values that include
   * whitespace to prevent unexpected behavior.
   *
   * Some example queries are:
   *
   * * Query `displayName=Test*` returns Folder resources whose display name starts with "Test". *
   * Query `lifecycleState=ACTIVE` returns Folder resources with `lifecycleState` set to `ACTIVE`. *
   * Query `parent=folders/123` returns Folder resources that have `folders/123` as a parent
   * resource. * Query `parent=folders/123 AND lifecycleState=ACTIVE` returns active Folder
   * resources that have `folders/123` as a parent resource. * Query `displayName=\\"Test String\\"`
   * returns Folder resources with display names that include both "Test" and "String".
   * @param query query or {@code null} for none
   */
  public SearchFoldersRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public SearchFoldersRequest set(String fieldName, Object value) {
    return (SearchFoldersRequest) super.set(fieldName, value);
  }

  @Override
  public SearchFoldersRequest clone() {
    return (SearchFoldersRequest) super.clone();
  }

}
