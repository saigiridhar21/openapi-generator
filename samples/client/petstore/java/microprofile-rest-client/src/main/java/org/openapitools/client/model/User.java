/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.client.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

/**
  * A User who is purchasing from the pet store
 **/
public class User  {
  
  private Long id;

  private String username;

  private String firstName;

  private String lastName;

  private String email;

  private String password;

  private String phone;

 /**
   * User Status
  **/
  private Integer userStatus;
  
 /**
   * Get id
   * @return id
  **/
  @JsonbProperty("id")
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonbProperty("username")
  public String getUsername() {
    return username;
  }

  /**
    * Set username
  **/
  public void setUsername(String username) {
    this.username = username;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonbProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
    * Set firstName
  **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonbProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
    * Set lastName
  **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonbProperty("email")
  public String getEmail() {
    return email;
  }

  /**
    * Set email
  **/
  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonbProperty("password")
  public String getPassword() {
    return password;
  }

  /**
    * Set password
  **/
  public void setPassword(String password) {
    this.password = password;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  @JsonbProperty("phone")
  public String getPhone() {
    return phone;
  }

  /**
    * Set phone
  **/
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * User Status
   * @return userStatus
  **/
  @JsonbProperty("userStatus")
  public Integer getUserStatus() {
    return userStatus;
  }

  /**
    * Set userStatus
  **/
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

