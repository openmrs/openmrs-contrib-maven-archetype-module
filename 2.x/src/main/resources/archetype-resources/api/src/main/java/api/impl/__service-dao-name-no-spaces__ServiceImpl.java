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
package ${package}.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ${package}.api.${service-dao-name-no-spaces}Service;
import ${package}.api.db.${service-dao-name-no-spaces}DAO;

/**
 * It is a default implementation of {@link ${service-dao-name-no-spaces}Service}.
 */
public class ${service-dao-name-no-spaces}ServiceImpl extends BaseOpenmrsService implements ${service-dao-name-no-spaces}Service {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private ${service-dao-name-no-spaces}DAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(${service-dao-name-no-spaces}DAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public ${service-dao-name-no-spaces}DAO getDao() {
	    return dao;
    }
}