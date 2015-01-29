
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote.odata;

import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.DependencyResolver;


import microsoft.com.onenote.*;

/**
 * The type OneNoteApiClient.
 */
public class OneNoteApiClient extends BaseODataContainer {

     /**
     * Instantiates a new OneNoteApiClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public OneNoteApiClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

	     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OneNoteApiClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OneNoteApiClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }


     /**
     * Gets Notebook.
     *
     * @return the Notebook
     */
    public ODataCollectionFetcher<Notebook, NotebookFetcher, NotebookCollectionOperations> getnotebooks() {
        return new ODataCollectionFetcher<Notebook, NotebookFetcher,NotebookCollectionOperations>("notebooks", this, Notebook.class,NotebookCollectionOperations.class);
    }

     /**
     * Gets SectionGroup.
     *
     * @return the SectionGroup
     */
    public ODataCollectionFetcher<SectionGroup, SectionGroupFetcher, SectionGroupCollectionOperations> getsectionGroups() {
        return new ODataCollectionFetcher<SectionGroup, SectionGroupFetcher,SectionGroupCollectionOperations>("sectionGroups", this, SectionGroup.class,SectionGroupCollectionOperations.class);
    }

     /**
     * Gets Section.
     *
     * @return the Section
     */
    public ODataCollectionFetcher<Section, SectionFetcher, SectionCollectionOperations> getsections() {
        return new ODataCollectionFetcher<Section, SectionFetcher,SectionCollectionOperations>("sections", this, Section.class,SectionCollectionOperations.class);
    }

     /**
     * Gets Page.
     *
     * @return the Page
     */
    public ODataCollectionFetcher<Page, PageFetcher, PageCollectionOperations> getpages() {
        return new ODataCollectionFetcher<Page, PageFetcher,PageCollectionOperations>("pages", this, Page.class,PageCollectionOperations.class);
    }

     /**
     * Gets Resource.
     *
     * @return the Resource
     */
    public ODataCollectionFetcher<Resource, ResourceFetcher, ResourceCollectionOperations> getresources() {
        return new ODataCollectionFetcher<Resource, ResourceFetcher,ResourceCollectionOperations>("resources", this, Resource.class,ResourceCollectionOperations.class);
    }

}