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

package com.liferay.folder.apio.architect.model;

/**
 * Holds information about a {@code
 * com.liferay.portal.kernel.repository.model.Folder} exposed through the API.
 *
 * @author Ruben Pulido
 * @review
 */
public interface Folder {

	/**
	 * Returns the folder's description.
	 *
	 * @return the folder's description
	 * @review
	 */
	public String getDescription();

	/**
	 * Returns the folder's name.
	 *
	 * @return the folder's name
	 * @review
	 */
	public String getName();

}