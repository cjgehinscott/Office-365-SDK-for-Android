
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type Section.
*/
public class Section extends ODataBaseEntity {

    public Section(){
        setODataType("#Microsoft.OneNote.Api.Section");
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
    
    

    private SectionGroup parentSectionGroup = null;

    /**
    * Gets the parent Section Group.
    *
    * @return the parentSectionGroup
    */
    public SectionGroup getparentSectionGroup() {
        return this.parentSectionGroup; 
    }
    

    /**
    * Sets the parent Section Group.
    *
    * @param value the SectionGroup
    */
    public void setparentSectionGroup(SectionGroup value) { 
        this.parentSectionGroup = value; 
    }
    
    

    private java.util.List<Page> pages = new java.util.ArrayList<Page>();

    /**
    * Gets the pages.
    *
    * @return the pages
    */
    public java.util.List<Page> getpages() {
        return this.pages; 
    }
    
    

    
	private Boolean isDefault;

    /**
    * Gets the is Default.
    *
    * @return the Boolean
    */
    public Boolean getisDefault() {
        return this.isDefault; 
    }

    /**
    * Sets the is Default.
    *
    * @param value the Boolean
    */
    public void setisDefault(Boolean value) { 
        this.isDefault = value; 
    }

    
	private String pagesUrl;

    /**
    * Gets the pages Url.
    *
    * @return the String
    */
    public String getpagesUrl() {
        return this.pagesUrl; 
    }

    /**
    * Sets the pages Url.
    *
    * @param value the String
    */
    public void setpagesUrl(String value) { 
        this.pagesUrl = value; 
    }

    
	private String name;

    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getname() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setname(String value) { 
        this.name = value; 
    }

    
	private String createdBy;

    /**
    * Gets the created By.
    *
    * @return the String
    */
    public String getcreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the String
    */
    public void setcreatedBy(String value) { 
        this.createdBy = value; 
    }

    
	private String lastModifiedBy;

    /**
    * Gets the last Modified By.
    *
    * @return the String
    */
    public String getlastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the String
    */
    public void setlastModifiedBy(String value) { 
        this.lastModifiedBy = value; 
    }

    
	private java.util.Calendar lastModifiedTime;

    /**
    * Gets the last Modified Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getlastModifiedTime() {
        return this.lastModifiedTime; 
    }

    /**
    * Sets the last Modified Time.
    *
    * @param value the java.util.Calendar
    */
    public void setlastModifiedTime(java.util.Calendar value) { 
        this.lastModifiedTime = value; 
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