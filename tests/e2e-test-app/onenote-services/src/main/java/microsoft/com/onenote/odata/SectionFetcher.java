
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
 * The type  SectionFetcher.
 */
public class SectionFetcher extends ODataEntityFetcher<Section,SectionOperations> 
                                     implements Readable<Section> {

     /**
     * Instantiates a new SectionFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SectionFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Section.class, SectionOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SectionFetcher addParameter(String name, Object value) {
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
    public SectionFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
	
     /**
     * Gets parentnotebook.
     *
     * @return the parent notebook
     */
	public NotebookFetcher getparentNotebook() {
        return new NotebookFetcher("parentNotebook", this);
    }

     /**
     * Gets parentsectiongroup.
     *
     * @return the parent section group
     */
	public SectionGroupFetcher getparentSectionGroup() {
        return new SectionGroupFetcher("parentSectionGroup", this);
    }

     /**
     * Gets pages.
     *
     * @return the pages
     */
    public ODataCollectionFetcher<Page, PageFetcher, PageCollectionOperations> getpages() {
        return new ODataCollectionFetcher<Page, PageFetcher,PageCollectionOperations>("pages", this, Page.class,PageCollectionOperations.class);
    }

    /**
     * Gets page.
     *
     * @return the page
     */
    public PageFetcher getpage(String id){
         return new ODataCollectionFetcher<Page, PageFetcher,PageCollectionOperations>("pages", this, Page.class,PageCollectionOperations.class).getById(id);
    }

}