/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Team;
import com.liferay.portal.model.TeamModel;
import com.liferay.portal.model.TeamSoap;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the Team service. Represents a row in the &quot;Team&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.TeamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TeamImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeamImpl
 * @see com.liferay.portal.model.Team
 * @see com.liferay.portal.model.TeamModel
 * @generated
 */
public class TeamModelImpl extends BaseModelImpl<Team> implements TeamModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a team model instance should use the {@link com.liferay.portal.model.Team} interface instead.
	 */
	public static final String TABLE_NAME = "Team";
	public static final Object[][] TABLE_COLUMNS = {
			{ "teamId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "groupId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Team (teamId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,groupId LONG,name VARCHAR(75) null,description STRING null)";
	public static final String TABLE_SQL_DROP = "drop table Team";
	public static final String ORDER_BY_JPQL = " ORDER BY team.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Team.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.Team"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.Team"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Team toModel(TeamSoap soapModel) {
		Team model = new TeamImpl();

		model.setTeamId(soapModel.getTeamId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setGroupId(soapModel.getGroupId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Team> toModels(TeamSoap[] soapModels) {
		List<Team> models = new ArrayList<Team>(soapModels.length);

		for (TeamSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_USERS_TEAMS_NAME = com.liferay.portal.model.impl.UserModelImpl.MAPPING_TABLE_USERS_TEAMS_NAME;
	public static final boolean FINDER_CACHE_ENABLED_USERS_TEAMS = com.liferay.portal.model.impl.UserModelImpl.FINDER_CACHE_ENABLED_USERS_TEAMS;
	public static final String MAPPING_TABLE_USERGROUPS_TEAMS_NAME = com.liferay.portal.model.impl.UserGroupModelImpl.MAPPING_TABLE_USERGROUPS_TEAMS_NAME;
	public static final boolean FINDER_CACHE_ENABLED_USERGROUPS_TEAMS = com.liferay.portal.model.impl.UserGroupModelImpl.FINDER_CACHE_ENABLED_USERGROUPS_TEAMS;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.Team"));

	public TeamModelImpl() {
	}

	public long getPrimaryKey() {
		return _teamId;
	}

	public void setPrimaryKey(long pk) {
		setTeamId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_teamId);
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Team toEscapedModel() {
		if (isEscapedModel()) {
			return (Team)this;
		}
		else {
			return (Team)Proxy.newProxyInstance(Team.class.getClassLoader(),
				new Class[] { Team.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Team.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		TeamImpl teamImpl = new TeamImpl();

		TeamModelImpl teamModelImpl = (TeamModelImpl)teamImpl;

		teamImpl.setTeamId(getTeamId());

		teamImpl.setCompanyId(getCompanyId());

		teamImpl.setUserId(getUserId());

		teamImpl.setUserName(getUserName());

		teamImpl.setCreateDate(getCreateDate());

		teamImpl.setModifiedDate(getModifiedDate());

		teamImpl.setGroupId(getGroupId());

		teamModelImpl._originalGroupId = teamModelImpl._groupId;

		teamModelImpl._setOriginalGroupId = false;
		teamImpl.setName(getName());

		teamModelImpl._originalName = teamModelImpl._name;

		teamImpl.setDescription(getDescription());

		return teamImpl;
	}

	public int compareTo(Team team) {
		int value = 0;

		value = getName().compareTo(team.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Team team = null;

		try {
			team = (Team)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = team.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{teamId=");
		sb.append(getTeamId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.Team");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _teamId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _name;
	private String _originalName;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
}