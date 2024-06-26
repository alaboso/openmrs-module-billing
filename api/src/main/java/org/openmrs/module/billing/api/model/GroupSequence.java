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
package org.openmrs.module.billing.api.model;

import org.openmrs.BaseOpenmrsObject;

/**
 * Model class that represent the Group Sequence
 */
public class GroupSequence extends BaseOpenmrsObject {
	
	public static final long serialVersionUID = 0L;
	
	private Integer groupSequenceId;
	
	private String group;
	
	private int value;
	
	@Override
	public Integer getId() {
		return groupSequenceId;
	}
	
	@Override
	public void setId(Integer id) {
		groupSequenceId = id;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
