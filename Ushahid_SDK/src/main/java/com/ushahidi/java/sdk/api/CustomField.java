/*****************************************************************************
 ** Copyright (c) 2010 - 2012 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 **
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.
 **
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 **
 *****************************************************************************/
package com.ushahidi.java.sdk.api;

import com.google.gson.annotations.SerializedName;
import com.ushahidi.java.sdk.api.json.Date;

/**
 * This CustomField class has all properties and methods of the Ushahidi API's
 * comment resource
 * 
 * @author gterrel
 * 
 */
public class CustomField {

	/**
	 * The unique ID for the field
	 */
	@SerializedName("field_id")
	private int fieldId;

	/**
	 * The unique ID of the form
	 */
	@SerializedName("form_id")
	private int formId;

	/**
	 * The name of the custom field
	 */
	@SerializedName("field_name")
	private String fieldName;

	/**
	 * The name of the field response
	 */
	@SerializedName("field_response")
	private String fieldResponse;

	
	/**
	 * Get the field ID
	 * 
	 * @return The field ID
	 */
	public int getFieldId() {
		return fieldId;
	}

	/**
	 * Set the Field ID
	 * 
	 * @param FieldId
	 */
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	/**
	 * Get the form ID
	 * 
	 * @return The form ID
	 */
	public int getFormId() {
		return formId;
	}

	/**
	 * Set the form ID
	 * 
	 * @param formId
	 *            The form ID
	 */
	public void setReportId(int formId) {
		this.formId = formId;
	}
	
	/**
	 * Get the field name
	 * 
	 * @param fieldName
	 *            The field name
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * Set the field name
	 * 
	 * @param fieldName
	 *            The field name
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * Get the field response
	 * 
	 * @param fieldResponse
	 *            The field response
	 */
	public String getFieldResponse() {
		return fieldResponse;
	}

	/**
	 * Set the field response
	 * 
	 * @param fieldResponse
	 *            The field response
	 */
	public void setFieldResponse(String fieldResponse) {
		this.fieldResponse = fieldResponse;
	}


	@Override
	public String toString() {
		return "CustomField [fieldId:" + fieldId + ", formId:" + formId
				+ ", fieldName:" + fieldName + ", fieldResponse:" + fieldResponse
				+ "]";
	}
}
