
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type Diagnostic.
*/
public class Diagnostic extends ODataBaseEntity {

	public Diagnostic(){
		setODataType("#Microsoft.OneNote.Api.Diagnostic");
	}



	private String message;

	/**
	* Gets the message.
	*
	* @return the String
	*/
	public String getmessage() {
		return this.message; 
	}

	/**
	* Sets the message.
	*
	* @param value the String
	*/
	public void setmessage(String value) { 
		this.message = value; 
	}


	private String url;

	/**
	* Gets the url.
	*
	* @return the String
	*/
	public String geturl() {
		return this.url; 
	}

	/**
	* Sets the url.
	*
	* @param value the String
	*/
	public void seturl(String value) { 
		this.url = value; 
	}

}