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
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.Employee;
import employee.EmployeeRepository;

/**
 * @author Greg Turnquist
 */
@RestController
@ExposesResourceFor(Employee.class)
public class EmployeeController {

	private final EmployeeRepository repository;

	@Autowired
	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/employees")
	ResponseEntity<?> employees() {
		return ResponseEntity.ok(repository.findAll());
	}

	@RequestMapping(value = "/employees/{id}")
	ResponseEntity<?> employee(String id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

}
