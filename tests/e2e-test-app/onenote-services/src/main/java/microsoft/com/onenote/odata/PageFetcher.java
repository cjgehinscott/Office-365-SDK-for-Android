
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.onenote.api.*; 
import com.microsoft.onenote.api.*;       

/**
 * The type  PageFetcher.
 */
public class PageFetcher extends ODataMediaEntityFetcher<Page,PageOperations> 
                                     implements Readable<Page> {

     /**
     * Instantiates a new PageFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public PageFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Page.class, PageOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public PageFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public PageFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
	
     /**
     * Gets parentsection.
     *
     * @return the parent section
     */
	public SectionFetcher getparentSection() {
        return new SectionFetcher("parentSection", this);
    }

     /**
     * Gets parentnotebook.
     *
     * @return the parent notebook
     */
	public NotebookFetcher getparentNotebook() {
        return new NotebookFetcher("parentNotebook", this);
    }

}