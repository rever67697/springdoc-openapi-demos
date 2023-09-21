/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springdoc.demo.app2.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.Explode;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.demo.app2.model.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "org.springdoc.demo.app2.codegen.languages.SpringCodegen", date = "2019-07-11T00:09:29.839+02:00[Europe/Paris]")

@Tag(name = "user", description = "the user API")
public interface UserApi {

	default UserApiDelegate getDelegate() {
		return new UserApiDelegate() {
		};
	}

	@Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags = { "user" })
	@ApiResponses(value = { @ApiResponse(description = "successful operation", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class)) }) })
	@PostMapping(value = "/user", consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" })
	default ResponseEntity<Void> createUser(
			@Parameter(description = "Created user object") @Valid @RequestBody User user) {
		return getDelegate().createUser(user);
	}

	@Operation(summary = "Creates list of users with given input array", tags = { "user" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful operation") })

	@PostMapping(value = "/user/createWithArray", consumes = { "application/json" })
	default ResponseEntity<Void> createUsersWithArrayInput(
			@Parameter(description = "List of user object", required = true) @Valid @RequestBody List<User> user) {
		return getDelegate().createUsersWithArrayInput(user);
	}

	@Operation(summary = "Creates list of users with given input array", description = "Creates list of users with given input array", tags = { "user" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successful operation", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(description = "successful operation")

	})
	@PostMapping(value = "/user/createWithList", consumes = { "application/json" })
	default ResponseEntity<Void> createUsersWithListInput(
			@Parameter @Valid @RequestBody List<User> user) {
		return getDelegate().createUsersWithListInput(user);
	}

	@Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags = { "user" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "400", description = "Invalid username supplied"),
			@ApiResponse(responseCode = "404", description = "User not found")
	})
	@DeleteMapping(value = "/user/{username}")
	default ResponseEntity<Void> deleteUser(
			@Parameter(description = "The name that needs to be deleted", required = true) @PathVariable("username") String username) {
		return getDelegate().deleteUser(username);
	}

	@Operation(summary = "Get user by user name", tags = { "user" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid username supplied", content = @Content),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })

	@GetMapping(value = "/user/{username}")
	default ResponseEntity<User> getUserByName(
			@Parameter(description = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") String username) {
		return getDelegate().getUserByName(username);
	}

	@Operation(summary = "Logs user into the system", tags = { "user" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", headers = {
					@Header(name = "X-Rate-Limit", description = "calls per hour allowed by the user", schema = @Schema(type = "integer", format = "int32")),
					@Header(name = "X-Expires-After", description = "date in UTC when toekn expires", schema = @Schema(type = "string", format = "date-time")) },
					description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),
			@ApiResponse(responseCode = "400", description = "Invalid username/password supplied", content = @Content) })
	@GetMapping(value = "/user/login", produces = { "application/xml", "application/json" })
	default ResponseEntity<String> loginUser(
			@NotNull @Parameter(description = "The user name for login", required = false) @Valid @RequestParam(value = "username", required = false) String username,
			@NotNull @Parameter(description = "The password for login in clear text", required = false) @Valid @RequestParam(value = "password", required = false) String password) {
		return getDelegate().loginUser(username, password);
	}

	@Operation(summary = "Logs out current logged in user session", tags = { "user" })
	@ApiResponses(value = { @ApiResponse(description = "successful operation") })
	@GetMapping(value = "/user/logout")
	default ResponseEntity<Void> logoutUser() {
		return getDelegate().logoutUser();
	}

	@Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags = { "user" })
	@ApiResponses(value = @ApiResponse(description = "successful operation"))
	@PutMapping(value = "/user/{username}", consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" })
	default ResponseEntity<Void> updateUser(
			@Parameter(description = "name that need to be deleted", required = true, explode = Explode.FALSE, in = ParameterIn.PATH, name = "username", style = ParameterStyle.SIMPLE, schema = @Schema(type = "string")) @PathVariable("username") String username,
			@Parameter(description = "Update an existent user in the store") @Valid @RequestBody User user) {
		return getDelegate().updateUser(username, user);
	}

}
