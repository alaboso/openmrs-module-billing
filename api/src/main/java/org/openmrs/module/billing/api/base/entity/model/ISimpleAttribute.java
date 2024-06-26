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
package org.openmrs.module.billing.api.base.entity.model;

// @formatter:off
/**
 * Represents classes that define simple attribute data.
 * @param <TAttributeType> The {@link ISimpleAttributeType} class.
 */
public interface ISimpleAttribute<
			TOwner extends ICustomizable<?>,
			TAttributeType extends ISimpleAttributeType>
		extends IAttribute<TOwner, TAttributeType> {
// @formatter:on
	
}
