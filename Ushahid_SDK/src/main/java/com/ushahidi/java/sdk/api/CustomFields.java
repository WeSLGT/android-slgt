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
public class CustomFields {

	/**
	 * The unique ID for the field
	 */
	@SerializedName("1")
	private CustomField fieldOne;

	/**
	 * The unique ID of the form
	 */
	@SerializedName("2")
	private CustomField fieldTwo;

	public CustomField getFieldOne() {
		return fieldOne;
	}

	public void setFieldOne(CustomField fieldOne) {
		this.fieldOne = fieldOne;
	}
	
	public CustomField getFieldTwo() {
		return fieldTwo;
	}

	public void setFieldTwo(CustomField fieldTwo) {
		this.fieldTwo = fieldTwo;
	}

	@Override
	public String toString() {
		return "CustomField [fieldOne:" + fieldOne + ", fieldTwo:" + fieldTwo
				+ "]";
	}
}
