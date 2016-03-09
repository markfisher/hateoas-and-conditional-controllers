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
package employee;

import lombok.Data;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author Greg Turnquist
 */
@Data
public class Employee extends ResourceSupport {

	private String name;
	private String role;

	public Employee(String name, String role) {

		this.name = name;
		this.role = role;
	}

}
