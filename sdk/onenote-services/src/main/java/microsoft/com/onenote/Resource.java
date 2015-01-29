
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote;


/**
 * The type Resource.
*/
public class Resource extends ODataBaseEntity {

    public Resource(){
        setODataType("#Microsoft.OneNote.Api.Resource");
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
}