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

package com.liferay.fragment.util;

import com.liferay.fragment.model.FragmentCollection;
import com.liferay.fragment.model.FragmentEntry;
import com.liferay.fragment.service.FragmentCollectionLocalServiceUtil;
import com.liferay.fragment.service.FragmentEntryLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.Date;

/**
 * @author Kyle Miho
 */
public class FragmentEntryTestUtil {

	public static FragmentEntry addFragmentEntry(long fragmentCollectionId)
		throws PortalException {

		FragmentCollection fragmentCollection =
			FragmentCollectionLocalServiceUtil.getFragmentCollection(
				fragmentCollectionId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				fragmentCollection.getGroupId());

		return FragmentEntryLocalServiceUtil.addFragmentEntry(
			TestPropsValues.getUserId(), serviceContext.getScopeGroupId(),
			fragmentCollectionId, StringPool.BLANK,
			RandomTestUtil.randomString(), StringPool.BLANK, "<div></div>",
			StringPool.BLANK, WorkflowConstants.STATUS_APPROVED,
			serviceContext);
	}

	public static FragmentEntry addFragmentEntry(
			long fragmentCollectionId, String name, Date createDate)
		throws PortalException {

		FragmentCollection fragmentCollection =
			FragmentCollectionLocalServiceUtil.getFragmentCollection(
				fragmentCollectionId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				fragmentCollection.getGroupId());

		serviceContext.setCreateDate(createDate);
		serviceContext.setModifiedDate(createDate);

		return FragmentEntryLocalServiceUtil.addFragmentEntry(
			TestPropsValues.getUserId(), serviceContext.getScopeGroupId(),
			fragmentCollectionId, StringPool.BLANK, name, StringPool.BLANK,
			"<div></div>", StringPool.BLANK, WorkflowConstants.STATUS_APPROVED,
			serviceContext);
	}

	public static FragmentEntry addFragmentEntry(
			long fragmentCollectionId, String name, int status, Date createDate)
		throws PortalException {

		FragmentCollection fragmentCollection =
			FragmentCollectionLocalServiceUtil.getFragmentCollection(
				fragmentCollectionId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				fragmentCollection.getGroupId());

		serviceContext.setCreateDate(createDate);
		serviceContext.setModifiedDate(createDate);

		return FragmentEntryLocalServiceUtil.addFragmentEntry(
			TestPropsValues.getUserId(), serviceContext.getScopeGroupId(),
			fragmentCollectionId, StringPool.BLANK, name, StringPool.BLANK,
			"<div></div>", StringPool.BLANK, status, serviceContext);
	}

	public static FragmentEntry addFragmentEntryByType(
			long fragmentCollectionId, String name, int type)
		throws PortalException {

		FragmentCollection fragmentCollection =
			FragmentCollectionLocalServiceUtil.getFragmentCollection(
				fragmentCollectionId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				fragmentCollection.getGroupId());

		return FragmentEntryLocalServiceUtil.addFragmentEntry(
			TestPropsValues.getUserId(), serviceContext.getScopeGroupId(),
			fragmentCollectionId, name, type, WorkflowConstants.STATUS_APPROVED,
			serviceContext);
	}

	public static FragmentEntry addFragmentEntryByType(
			long fragmentCollectionId, String name, int type, Date createDate)
		throws PortalException {

		FragmentCollection fragmentCollection =
			FragmentCollectionLocalServiceUtil.getFragmentCollection(
				fragmentCollectionId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				fragmentCollection.getGroupId());

		return FragmentEntryLocalServiceUtil.addFragmentEntry(
			TestPropsValues.getUserId(), serviceContext.getScopeGroupId(),
			fragmentCollectionId, name, type, WorkflowConstants.STATUS_APPROVED,
			serviceContext);
	}

}