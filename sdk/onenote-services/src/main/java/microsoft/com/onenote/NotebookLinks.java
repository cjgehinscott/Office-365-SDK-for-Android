
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type Notebook Links.
*/
public class NotebookLinks extends ODataBaseEntity {

	public NotebookLinks(){
		setODataType("#Microsoft.OneNote.Api.NotebookLinks");
	}



	private ExternalLink oneNoteClientUrl;

	/**
	* Gets the one Note Client Url.
	*
	* @return the ExternalLink
	*/
	public ExternalLink getoneNoteClientUrl() {
		return this.oneNoteClientUrl; 
	}

	/**
	* Sets the one Note Client Url.
	*
	* @param value the ExternalLink
	*/
	public void setoneNoteClientUrl(ExternalLink value) { 
		this.oneNoteClientUrl = value; 
	}


	private ExternalLink oneNoteWebUrl;

	/**
	* Gets the one Note Web Url.
	*
	* @return the ExternalLink
	*/
	public ExternalLink getoneNoteWebUrl() {
		return this.oneNoteWebUrl; 
	}

	/**
	* Sets the one Note Web Url.
	*
	* @param value the ExternalLink
	*/
	public void setoneNoteWebUrl(ExternalLink value) { 
		this.oneNoteWebUrl = value; 
	}

}