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

package com.liferay.commerce.openapi.util.util;

import java.util.Collections;
import java.util.List;

/**
 * @author Ivica Cardic
 */
public class DateTimeProvider extends Provider {

	public DateTimeProvider() {
		super("Date", "java.util.Date");
	}

	public List<String> getAdditionalImportableJavaTypes() {
		return Collections.singletonList(
			"com.fasterxml.jackson.annotation.JsonFormat");
	}

	public String getGetterMethodAnnotation() {
		return _JSON_DATE_TIME_FORMAT;
	}

	public String getSetterMethodAnnotation() {
		return _JSON_DATE_TIME_FORMAT;
	}

	private static final String _JSON_DATE_TIME_FORMAT =
		"\t@JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", shape = " +
			"JsonFormat.Shape.STRING)\n";

}