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

package com.google.api.services.displayvideo.v1;

/**
 * Service definition for DisplayVideo (v1).
 *
 * <p>
 * Display & Video 360 API allows users to manage and create campaigns and reports.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/display-video/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link DisplayVideoRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class DisplayVideo extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.8 of the Display & Video 360 API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://displayvideo.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public DisplayVideo(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  DisplayVideo(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Media collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code DisplayVideo displayvideo = new DisplayVideo(...);}
   *   {@code DisplayVideo.Media.List request = displayvideo.media().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Media media() {
    return new Media();
  }

  /**
   * The "media" collection of methods.
   */
  public class Media {

    /**
     * Downloads media. Download is supported on the URI `/download/{resource_name=**}?alt=media.`
     *
     * **Note**: Download requests will not be successful without including `alt=media` query string.
     *
     * Create a request for the method "media.download".
     *
     * This request holds the parameters needed by the displayvideo server.  After setting any optional
     * parameters, call the {@link Download#execute()} method to invoke the remote operation.
     *
     * @param resourceName Name of the media that is being downloaded.  See
    ReadRequest.resource_name.
     * @return the request
     */
    public Download download(java.lang.String resourceName) throws java.io.IOException {
      Download result = new Download(resourceName);
      initialize(result);
      return result;
    }

    public class Download extends DisplayVideoRequest<com.google.api.services.displayvideo.v1.model.GoogleBytestreamMedia> {

      private static final String REST_PATH = "download/{+resourceName}";

      private final java.util.regex.Pattern RESOURCE_NAME_PATTERN =
          java.util.regex.Pattern.compile("^.*$");

      /**
       * Downloads media. Download is supported on the URI `/download/{resource_name=**}?alt=media.`
       *
       * **Note**: Download requests will not be successful without including `alt=media` query string.
       *
       * Create a request for the method "media.download".
       *
       * This request holds the parameters needed by the the displayvideo server.  After setting any
       * optional parameters, call the {@link Download#execute()} method to invoke the remote operation.
       * <p> {@link
       * Download#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param resourceName Name of the media that is being downloaded.  See
    ReadRequest.resource_name.
       * @since 1.13
       */
      protected Download(java.lang.String resourceName) {
        super(DisplayVideo.this, "GET", REST_PATH, null, com.google.api.services.displayvideo.v1.model.GoogleBytestreamMedia.class);
        this.resourceName = com.google.api.client.util.Preconditions.checkNotNull(resourceName, "Required parameter resourceName must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_NAME_PATTERN.matcher(resourceName).matches(),
              "Parameter resourceName must conform to the pattern " +
              "^.*$");
        }
        initializeMediaDownload();
      }

      @Override
      public void executeMediaAndDownloadTo(java.io.OutputStream outputStream) throws java.io.IOException {
        super.executeMediaAndDownloadTo(outputStream);
      }

      @Override
      public java.io.InputStream executeMediaAsInputStream() throws java.io.IOException {
        return super.executeMediaAsInputStream();
      }

      @Override
      public com.google.api.client.http.HttpResponse executeMedia() throws java.io.IOException {
        return super.executeMedia();
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Download set$Xgafv(java.lang.String $Xgafv) {
        return (Download) super.set$Xgafv($Xgafv);
      }

      @Override
      public Download setAccessToken(java.lang.String accessToken) {
        return (Download) super.setAccessToken(accessToken);
      }

      @Override
      public Download setAlt(java.lang.String alt) {
        return (Download) super.setAlt(alt);
      }

      @Override
      public Download setCallback(java.lang.String callback) {
        return (Download) super.setCallback(callback);
      }

      @Override
      public Download setFields(java.lang.String fields) {
        return (Download) super.setFields(fields);
      }

      @Override
      public Download setKey(java.lang.String key) {
        return (Download) super.setKey(key);
      }

      @Override
      public Download setOauthToken(java.lang.String oauthToken) {
        return (Download) super.setOauthToken(oauthToken);
      }

      @Override
      public Download setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Download) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Download setQuotaUser(java.lang.String quotaUser) {
        return (Download) super.setQuotaUser(quotaUser);
      }

      @Override
      public Download setUploadType(java.lang.String uploadType) {
        return (Download) super.setUploadType(uploadType);
      }

      @Override
      public Download setUploadProtocol(java.lang.String uploadProtocol) {
        return (Download) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Name of the media that is being downloaded.  See ReadRequest.resource_name.
       */
      @com.google.api.client.util.Key
      private java.lang.String resourceName;

      /** Name of the media that is being downloaded.  See ReadRequest.resource_name.
       */
      public java.lang.String getResourceName() {
        return resourceName;
      }

      /**
       * Name of the media that is being downloaded.  See ReadRequest.resource_name.
       */
      public Download setResourceName(java.lang.String resourceName) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(RESOURCE_NAME_PATTERN.matcher(resourceName).matches(),
              "Parameter resourceName must conform to the pattern " +
              "^.*$");
        }
        this.resourceName = resourceName;
        return this;
      }

      @Override
      public Download set(String parameterName, Object value) {
        return (Download) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Sdfdownloadtasks collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code DisplayVideo displayvideo = new DisplayVideo(...);}
   *   {@code DisplayVideo.Sdfdownloadtasks.List request = displayvideo.sdfdownloadtasks().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Sdfdownloadtasks sdfdownloadtasks() {
    return new Sdfdownloadtasks();
  }

  /**
   * The "sdfdownloadtasks" collection of methods.
   */
  public class Sdfdownloadtasks {

    /**
     * Creates an SDF Download Task. Returns an Operation.
     *
     * An SDF Download Task is a long-running, asynchronous operation. The metadata type of this
     * operation is SdfDownloadTaskMetadata. If the request is successful, the response type of the
     * operation is SdfDownloadTask. The response will not include the download files, which must be
     * retrieved with media.download. The state of operation can be retrieved with
     * sdfdownloadtask.operations.get.
     *
     * Any errors can be found in the error.message. Note that error.details is expected to be empty.
     *
     * Create a request for the method "sdfdownloadtasks.create".
     *
     * This request holds the parameters needed by the displayvideo server.  After setting any optional
     * parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.displayvideo.v1.model.CreateSdfDownloadTaskRequest}
     * @return the request
     */
    public Create create(com.google.api.services.displayvideo.v1.model.CreateSdfDownloadTaskRequest content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends DisplayVideoRequest<com.google.api.services.displayvideo.v1.model.Operation> {

      private static final String REST_PATH = "v1/sdfdownloadtasks";

      /**
       * Creates an SDF Download Task. Returns an Operation.
       *
       * An SDF Download Task is a long-running, asynchronous operation. The metadata type of this
       * operation is SdfDownloadTaskMetadata. If the request is successful, the response type of the
       * operation is SdfDownloadTask. The response will not include the download files, which must be
       * retrieved with media.download. The state of operation can be retrieved with
       * sdfdownloadtask.operations.get.
       *
       * Any errors can be found in the error.message. Note that error.details is expected to be empty.
       *
       * Create a request for the method "sdfdownloadtasks.create".
       *
       * This request holds the parameters needed by the the displayvideo server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       * <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.displayvideo.v1.model.CreateSdfDownloadTaskRequest}
       * @since 1.13
       */
      protected Create(com.google.api.services.displayvideo.v1.model.CreateSdfDownloadTaskRequest content) {
        super(DisplayVideo.this, "POST", REST_PATH, content, com.google.api.services.displayvideo.v1.model.Operation.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the Operations collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code DisplayVideo displayvideo = new DisplayVideo(...);}
     *   {@code DisplayVideo.Operations.List request = displayvideo.operations().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Operations operations() {
      return new Operations();
    }

    /**
     * The "operations" collection of methods.
     */
    public class Operations {

      /**
       * Gets the latest state of an asynchronous SDF download task operation. Clients should poll this
       * method at intervals of 30 seconds.
       *
       * Create a request for the method "operations.get".
       *
       * This request holds the parameters needed by the displayvideo server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation.
       *
       * @param name The name of the operation resource.
       * @return the request
       */
      public Get get(java.lang.String name) throws java.io.IOException {
        Get result = new Get(name);
        initialize(result);
        return result;
      }

      public class Get extends DisplayVideoRequest<com.google.api.services.displayvideo.v1.model.Operation> {

        private static final String REST_PATH = "v1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^sdfdownloadtasks/operations/[^/]+$");

        /**
         * Gets the latest state of an asynchronous SDF download task operation. Clients should poll this
         * method at intervals of 30 seconds.
         *
         * Create a request for the method "operations.get".
         *
         * This request holds the parameters needed by the the displayvideo server.  After setting any
         * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
         * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name The name of the operation resource.
         * @since 1.13
         */
        protected Get(java.lang.String name) {
          super(DisplayVideo.this, "GET", REST_PATH, null, com.google.api.services.displayvideo.v1.model.Operation.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^sdfdownloadtasks/operations/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Get set$Xgafv(java.lang.String $Xgafv) {
          return (Get) super.set$Xgafv($Xgafv);
        }

        @Override
        public Get setAccessToken(java.lang.String accessToken) {
          return (Get) super.setAccessToken(accessToken);
        }

        @Override
        public Get setAlt(java.lang.String alt) {
          return (Get) super.setAlt(alt);
        }

        @Override
        public Get setCallback(java.lang.String callback) {
          return (Get) super.setCallback(callback);
        }

        @Override
        public Get setFields(java.lang.String fields) {
          return (Get) super.setFields(fields);
        }

        @Override
        public Get setKey(java.lang.String key) {
          return (Get) super.setKey(key);
        }

        @Override
        public Get setOauthToken(java.lang.String oauthToken) {
          return (Get) super.setOauthToken(oauthToken);
        }

        @Override
        public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Get) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Get setQuotaUser(java.lang.String quotaUser) {
          return (Get) super.setQuotaUser(quotaUser);
        }

        @Override
        public Get setUploadType(java.lang.String uploadType) {
          return (Get) super.setUploadType(uploadType);
        }

        @Override
        public Get setUploadProtocol(java.lang.String uploadProtocol) {
          return (Get) super.setUploadProtocol(uploadProtocol);
        }

        /** The name of the operation resource. */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** The name of the operation resource.
         */
        public java.lang.String getName() {
          return name;
        }

        /** The name of the operation resource. */
        public Get setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^sdfdownloadtasks/operations/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Get set(String parameterName, Object value) {
          return (Get) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link DisplayVideo}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link DisplayVideo}. */
    @Override
    public DisplayVideo build() {
      return new DisplayVideo(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link DisplayVideoRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDisplayVideoRequestInitializer(
        DisplayVideoRequestInitializer displayvideoRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(displayvideoRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
