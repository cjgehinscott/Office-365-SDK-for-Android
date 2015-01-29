
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type Page.
*/
public class Page extends ODataBaseEntity {

    public Page(){
        setODataType("#Microsoft.OneNote.Api.Page");
    }

    

    private Section parentSection = null;

    /**
    * Gets the parent Section.
    *
    * @return the parentSection
    */
    public Section getparentSection() {
        return this.parentSection; 
    }
    

    /**
    * Sets the parent Section.
    *
    * @param value the Section
    */
    public void setparentSection(Section value) { 
        this.parentSection = value; 
    }
    
    

    private Notebook parentNotebook = null;

    /**
    * Gets the parent Notebook.
    *
    * @return the parentNotebook
    */
    public Notebook getparentNotebook() {
        return this.parentNotebook; 
    }
    

    /**
    * Sets the parent Notebook.
    *
    * @param value the Notebook
    */
    public void setparentNotebook(Notebook value) { 
        this.parentNotebook = value; 
    }
    
    

    
	private String title;

    /**
    * Gets the title.
    *
    * @return the String
    */
    public String gettitle() {
        return this.title; 
    }

    /**
    * Sets the title.
    *
    * @param value the String
    */
    public void settitle(String value) { 
        this.title = value; 
    }

    
	private String createdByAppId;

    /**
    * Gets the created By App Id.
    *
    * @return the String
    */
    public String getcreatedByAppId() {
        return this.createdByAppId; 
    }

    /**
    * Sets the created By App Id.
    *
    * @param value the String
    */
    public void setcreatedByAppId(String value) { 
        this.createdByAppId = value; 
    }

    
	private PageLinks links;

    /**
    * Gets the links.
    *
    * @return the PageLinks
    */
    public PageLinks getlinks() {
        return this.links; 
    }

    /**
    * Sets the links.
    *
    * @param value the PageLinks
    */
    public void setlinks(PageLinks value) { 
        this.links = value; 
    }

    
	private String contentUrl;

    /**
    * Gets the content Url.
    *
    * @return the String
    */
    public String getcontentUrl() {
        return this.contentUrl; 
    }

    /**
    * Sets the content Url.
    *
    * @param value the String
    */
    public void setcontentUrl(String value) { 
        this.contentUrl = value; 
    }

    
	private byte[] content;

    /**
    * Gets the content.
    *
    * @return the byte[]
    */
    public byte[] getcontent() {
        return this.content; 
    }

    /**
    * Sets the content.
    *
    * @param value the byte[]
    */
    public void setcontent(byte[] value) { 
        this.content = value; 
    }

    
	private String id;

    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }

    
	private String self;

    /**
    * Gets the self.
    *
    * @return the String
    */
    public String getself() {
        return this.self; 
    }

    /**
    * Sets the self.
    *
    * @param value the String
    */
    public void setself(String value) { 
        this.self = value; 
    }

    
	private java.util.Calendar createdTime;

    /**
    * Gets the created Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getcreatedTime() {
        return this.createdTime; 
    }

    /**
    * Sets the created Time.
    *
    * @param value the java.util.Calendar
    */
    public void setcreatedTime(java.util.Calendar value) { 
        this.createdTime = value; 
    }
}