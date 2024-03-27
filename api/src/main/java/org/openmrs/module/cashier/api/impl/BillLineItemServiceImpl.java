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
package org.openmrs.module.cashier.api.impl;

import org.openmrs.module.cashier.api.BillLineItemService;
import org.openmrs.module.cashier.api.base.entity.impl.BaseEntityDataServiceImpl;
import org.openmrs.module.cashier.api.base.entity.security.IEntityAuthorizationPrivileges;
import org.openmrs.module.cashier.api.model.BillLineItem;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BillLineItemServiceImpl extends BaseEntityDataServiceImpl<BillLineItem> implements IEntityAuthorizationPrivileges, BillLineItemService {
	
	@Override
	protected IEntityAuthorizationPrivileges getPrivileges() {
		return this;
	}
	
	@Override
	protected void validate(BillLineItem object) {
		
	}
	
	@Override
	public String getVoidPrivilege() {
		return null;
	}
	
	@Override
	public String getSavePrivilege() {
		return null;
	}
	
	@Override
	public String getPurgePrivilege() {
		return null;
	}
	
	@Override
	public String getGetPrivilege() {
		return null;
	}
}
