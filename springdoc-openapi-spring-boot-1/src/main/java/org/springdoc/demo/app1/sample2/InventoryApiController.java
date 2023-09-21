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

package org.springdoc.demo.app1.sample2;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-08T09:37:36.546Z[GMT]")
@RestController
public class InventoryApiController implements InventoryApi {


	@SuppressWarnings("unused")
	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public InventoryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> addInventory(
			@Parameter(description = "Inventory item to add") @Valid @RequestBody InventoryItem body) {
		@SuppressWarnings("unused")
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<InventoryItem>> searchInventory(String searchString,
			@Min(0) @Valid @RequestParam(value = "skip", required = true) Integer skip,
			@Min(0) @Max(50) @Valid @RequestParam(value = "limit", required = true) Integer limit) {
		@SuppressWarnings("unused")
		String accept = request.getHeader("Accept");
		return new ResponseEntity<List<InventoryItem>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public String getme(String language) {
		return language;
	}

}
