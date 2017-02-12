/*
 * Copyright 2016, Julius Krah                                                 
 * by the @authors tag. See the LICENCE in the distribution for a              
 * full listing of individual contributors.                                   
 *                                                                           
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 * http://www.apache.org/licenses/LICENSE-2.0                                  
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License. 
 */
package com.tutorial.repository;

import com.tutorial.entity.Person;

/**
 * 
 * @author Julius Krah
 *
 */
public interface PersonRepository {
	/**
	 * Create a new Person
	 * 
	 * @param person
	 * @return Person
	 */
	Person create(Person person);

	/**
	 * Read Person by id
	 * 
	 * @param id
	 * @return Person
	 */
	Person read(Long id);

	/**
	 * Update person
	 * 
	 * @param person
	 */
	Person update(Person person);

	/**
	 * Delete person
	 * 
	 * @param person
	 */
	void delete(Person person);

	/**
	 * close the entity manager factory
	 */
	void close();

}