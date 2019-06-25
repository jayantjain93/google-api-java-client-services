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

package com.google.api.services.fcm.v1.model;

/**
 * Notification to send to android devices.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidNotification extends com.google.api.client.json.GenericJson {

  /**
   * The notification's body text. If present, it will override
   * google.firebase.fcm.v1.Notification.body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * Variable string values to be used in place of the format specifiers in body_loc_key to use to
   * localize the body text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> bodyLocArgs;

  /**
   * The key to the body string in the app's string resources to use to localize the body text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bodyLocKey;

  /**
   * The [notification's channel
   * id](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) (new
   * in Android O). The app must create a channel with this channel ID before any notification with
   * this channel ID is received. If you don't send this channel ID in the request, or if the
   * channel ID provided has not yet been created by the app, FCM uses the channel ID specified in
   * the app manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The action associated with a user click on the notification. If specified, an activity with a
   * matching intent filter is launched when a user clicks on the notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clickAction;

  /**
   * The notification's icon color, expressed in #rrggbb format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String color;

  /**
   * The notification's icon. Sets the notification icon to myicon for drawable resource myicon. If
   * you don't send this key in the request, FCM displays the launcher icon specified in your app
   * manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * The sound to play when the device receives the notification. Supports "default" or the filename
   * of a sound resource bundled in the app. Sound files must reside in /res/raw/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sound;

  /**
   * Identifier used to replace existing notifications in the notification drawer. If not specified,
   * each request creates a new notification. If specified and a notification with the same tag is
   * already being shown, the new notification replaces the existing one in the notification drawer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The notification's title. If present, it will override
   * google.firebase.fcm.v1.Notification.title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Variable string values to be used in place of the format specifiers in title_loc_key to use to
   * localize the title text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> titleLocArgs;

  /**
   * The key to the title string in the app's string resources to use to localize the title text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String titleLocKey;

  /**
   * The notification's body text. If present, it will override
   * google.firebase.fcm.v1.Notification.body.
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * The notification's body text. If present, it will override
   * google.firebase.fcm.v1.Notification.body.
   * @param body body or {@code null} for none
   */
  public AndroidNotification setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * Variable string values to be used in place of the format specifiers in body_loc_key to use to
   * localize the body text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBodyLocArgs() {
    return bodyLocArgs;
  }

  /**
   * Variable string values to be used in place of the format specifiers in body_loc_key to use to
   * localize the body text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * @param bodyLocArgs bodyLocArgs or {@code null} for none
   */
  public AndroidNotification setBodyLocArgs(java.util.List<java.lang.String> bodyLocArgs) {
    this.bodyLocArgs = bodyLocArgs;
    return this;
  }

  /**
   * The key to the body string in the app's string resources to use to localize the body text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.String getBodyLocKey() {
    return bodyLocKey;
  }

  /**
   * The key to the body string in the app's string resources to use to localize the body text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * @param bodyLocKey bodyLocKey or {@code null} for none
   */
  public AndroidNotification setBodyLocKey(java.lang.String bodyLocKey) {
    this.bodyLocKey = bodyLocKey;
    return this;
  }

  /**
   * The [notification's channel
   * id](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) (new
   * in Android O). The app must create a channel with this channel ID before any notification with
   * this channel ID is received. If you don't send this channel ID in the request, or if the
   * channel ID provided has not yet been created by the app, FCM uses the channel ID specified in
   * the app manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The [notification's channel
   * id](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) (new
   * in Android O). The app must create a channel with this channel ID before any notification with
   * this channel ID is received. If you don't send this channel ID in the request, or if the
   * channel ID provided has not yet been created by the app, FCM uses the channel ID specified in
   * the app manifest.
   * @param channelId channelId or {@code null} for none
   */
  public AndroidNotification setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The action associated with a user click on the notification. If specified, an activity with a
   * matching intent filter is launched when a user clicks on the notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getClickAction() {
    return clickAction;
  }

  /**
   * The action associated with a user click on the notification. If specified, an activity with a
   * matching intent filter is launched when a user clicks on the notification.
   * @param clickAction clickAction or {@code null} for none
   */
  public AndroidNotification setClickAction(java.lang.String clickAction) {
    this.clickAction = clickAction;
    return this;
  }

  /**
   * The notification's icon color, expressed in #rrggbb format.
   * @return value or {@code null} for none
   */
  public java.lang.String getColor() {
    return color;
  }

  /**
   * The notification's icon color, expressed in #rrggbb format.
   * @param color color or {@code null} for none
   */
  public AndroidNotification setColor(java.lang.String color) {
    this.color = color;
    return this;
  }

  /**
   * The notification's icon. Sets the notification icon to myicon for drawable resource myicon. If
   * you don't send this key in the request, FCM displays the launcher icon specified in your app
   * manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * The notification's icon. Sets the notification icon to myicon for drawable resource myicon. If
   * you don't send this key in the request, FCM displays the launcher icon specified in your app
   * manifest.
   * @param icon icon or {@code null} for none
   */
  public AndroidNotification setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The sound to play when the device receives the notification. Supports "default" or the filename
   * of a sound resource bundled in the app. Sound files must reside in /res/raw/.
   * @return value or {@code null} for none
   */
  public java.lang.String getSound() {
    return sound;
  }

  /**
   * The sound to play when the device receives the notification. Supports "default" or the filename
   * of a sound resource bundled in the app. Sound files must reside in /res/raw/.
   * @param sound sound or {@code null} for none
   */
  public AndroidNotification setSound(java.lang.String sound) {
    this.sound = sound;
    return this;
  }

  /**
   * Identifier used to replace existing notifications in the notification drawer. If not specified,
   * each request creates a new notification. If specified and a notification with the same tag is
   * already being shown, the new notification replaces the existing one in the notification drawer.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * Identifier used to replace existing notifications in the notification drawer. If not specified,
   * each request creates a new notification. If specified and a notification with the same tag is
   * already being shown, the new notification replaces the existing one in the notification drawer.
   * @param tag tag or {@code null} for none
   */
  public AndroidNotification setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The notification's title. If present, it will override
   * google.firebase.fcm.v1.Notification.title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The notification's title. If present, it will override
   * google.firebase.fcm.v1.Notification.title.
   * @param title title or {@code null} for none
   */
  public AndroidNotification setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Variable string values to be used in place of the format specifiers in title_loc_key to use to
   * localize the title text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTitleLocArgs() {
    return titleLocArgs;
  }

  /**
   * Variable string values to be used in place of the format specifiers in title_loc_key to use to
   * localize the title text to the user's current localization. See [Formatting and
   * Styling](https://goo.gl/MalYE3) for more information.
   * @param titleLocArgs titleLocArgs or {@code null} for none
   */
  public AndroidNotification setTitleLocArgs(java.util.List<java.lang.String> titleLocArgs) {
    this.titleLocArgs = titleLocArgs;
    return this;
  }

  /**
   * The key to the title string in the app's string resources to use to localize the title text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitleLocKey() {
    return titleLocKey;
  }

  /**
   * The key to the title string in the app's string resources to use to localize the title text to
   * the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
   * information.
   * @param titleLocKey titleLocKey or {@code null} for none
   */
  public AndroidNotification setTitleLocKey(java.lang.String titleLocKey) {
    this.titleLocKey = titleLocKey;
    return this;
  }

  @Override
  public AndroidNotification set(String fieldName, Object value) {
    return (AndroidNotification) super.set(fieldName, value);
  }

  @Override
  public AndroidNotification clone() {
    return (AndroidNotification) super.clone();
  }

}
