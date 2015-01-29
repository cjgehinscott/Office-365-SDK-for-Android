
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type External Link.
*/
public class ExternalLink extends ODataBaseEntity {

	public ExternalLink(){
		setODataType("#Microsoft.OneNote.Api.ExternalLink");
	}



	private String href;

	/**
	* Gets the href.
	*
	* @return the String
	*/
	public String gethref() {
		return this.href; 
	}

	/**
	* Sets the href.
	*
	* @param value the String
	*/
	public void sethref(String value) { 
		this.href = value; 
	}

}