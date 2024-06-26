/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
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
package org.openmrs.module.billing.api.base.entity.security;

/**
 * Represents types that define the privileges for the core
 * {@link org.openmrs.module.openhmis.commons.api.entity .IEntityDataService} operations.
 */
public interface IEntityAuthorizationPrivileges extends IObjectAuthorizationPrivileges {
	
	/**
	 * The privilege required to void or unvoid an entity or {@code null} for no authorization.
	 *
	 * @return The privilege name.
	 */
	String getVoidPrivilege();
}
