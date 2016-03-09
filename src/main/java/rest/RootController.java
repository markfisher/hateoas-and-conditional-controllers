/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.Employee;

/**
 * @author Greg Turnquist
 */
@RestController
public class RootController {

	private final EntityLinks entityLinks;

	@Autowired
	public RootController(EntityLinks entityLinks) {
		this.entityLinks = entityLinks;
	}

	@RequestMapping(value = "/info")
	ResponseEntity<?> info() {

		ResourceSupport info = new ResourceSupport();

		info.add(entityLinks.linkToSingleResource(Employee.class, 1).withRel("employee 1"));
		info.add(entityLinks.linkToCollectionResource(Employee.class).withRel("All employees"));

		return ResponseEntity.ok(info);
	}



}
