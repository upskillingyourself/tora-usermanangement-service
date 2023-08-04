package com.user.management.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-04T06:09:10.608841297Z[GMT]")


public class User   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userEmailId")
  private String userEmailId = null;

  @JsonProperty("userPassword")
  private String userPassword = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("roles")
  private Role roles = null;

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * This is the users first Name. 
   * @return firstName
   **/
  @Schema(example = "Foo", description = "This is the users first Name. ")
  
  @Size(min=1,max=100)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User Last name.
   * @return lastName
   **/
  @Schema(example = "Decusa", description = "User Last name.")
  
  @Size(min=1,max=100)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * This is  user unique id in the system. 
   * @return userId
   **/
  @Schema(example = "dancy", description = "This is  user unique id in the system. ")
  
  @Size(min=8,max=20)   public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public User userEmailId(String userEmailId) {
    this.userEmailId = userEmailId;
    return this;
  }

  /**
   * This is  user unique email id in the system. 
   * @return userEmailId
   **/
  @Schema(example = "test@xyx.com", description = "This is  user unique email id in the system. ")
  
    public String getUserEmailId() {
    return userEmailId;
  }

  public void setUserEmailId(String userEmailId) {
    this.userEmailId = userEmailId;
  }

  public User userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

  /**
   * This is  user password. 
   * @return userPassword
   **/
  @Schema(description = "This is  user password. ")
  
  @Size(min=8,max=200)   public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public User address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public User roles(Role roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @Schema(description = "")
  
    @Valid
    public Role getRoles() {
    return roles;
  }

  public void setRoles(Role roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.userEmailId, user.userEmailId) &&
        Objects.equals(this.userPassword, user.userPassword) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.roles, user.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, userId, userEmailId, userPassword, address, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userEmailId: ").append(toIndentedString(userEmailId)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}