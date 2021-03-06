/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.template.velocity.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.configuration.admin.ConfigurationAdmin;

/**
 * @author Peter Fellwock
 */
@ConfigurationAdmin(category = "platform")
@Meta.OCD(
	id = "com.liferay.portal.template.velocity.configuration.VelocityEngineConfiguration"
)
public interface VelocityEngineConfiguration {

	@Meta.AD(deflt = "false", required = false)
	public boolean directiveIfToStringNullCheck();

	@Meta.AD(
		deflt = "org.apache.velocity.runtime.log.SimpleLog4JLogSystem",
		required = false
	)
	public String logger();

	@Meta.AD(deflt = "org.apache.velocity", required = false)
	public String loggerCategory();

	@Meta.AD(deflt = "60", required = false)
	public int resourceModificationCheckInterval();

	@Meta.AD(
		deflt = "com.liferay.portal.template.velocity.VelocityBundleResourceParser|com.liferay.portal.template.velocity.VelocityServletResourceParser|com.liferay.portal.template.ThemeResourceParser|com.liferay.portal.template.DDMTemplateResourceParser|com.liferay.portal.template.ClassLoaderResourceParser",
		required = false
	)
	public String[] resourceParsers();

	@Meta.AD(
		deflt = "java.lang.Class|java.lang.ClassLoader|java.lang.Thread",
		required = false
	)
	public String[] restrictedClasses();

	@Meta.AD(deflt = "", required = false)
	public String[] restrictedPackages();

	@Meta.AD(deflt = "serviceLocator|", required = false)
	public String[] restrictedVariables();

	@Meta.AD(deflt = "VM_global_library.vm|VM_liferay.vm", required = false)
	public String[] velocimacroLibrary();

}