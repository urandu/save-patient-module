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
package org.openmrs.module.savepatient.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.module.savepatient.PatientModel;
import org.openmrs.module.savepatient.api.db.SavePatientDAO;

import java.util.List;

/**
 * It is a default implementation of  {@link SavePatientDAO}.
 */
public class PatientDAO implements SavePatientDAO {
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
    }
    
	/**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
	    return sessionFactory;
    }

    @Override
    public List<PatientModel> listPatients() {
        return sessionFactory.getCurrentSession().createCriteria(PatientModel.class).list();
    }

    @Override
    public PatientModel getPatient(Integer national_id) {
        return null;
    }

    @Override
    public PatientModel savePatient(PatientModel patientModel) {
        return null;
    }

    @Override
    public void deletePatient(PatientModel patientModel) {

    }
}