/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.savepatient;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.BaseOpenmrsObject;

import java.io.Serializable;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class PatientModel extends BaseOpenmrsObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer national_id;
    private String country;
    private String spouse;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNational_id(Integer national_id) {
        this.national_id = national_id;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public Integer getNational_id() {
        return national_id;
    }

    public String getCountry() {
        return country;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSpouse() {
        return spouse;
    }

    @Override
    public Integer getId() {
        return national_id;
    }

    @Override
    public void setId(Integer national_id) {
        this.national_id = national_id;
    }
}