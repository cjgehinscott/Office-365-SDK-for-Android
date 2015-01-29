
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote.odata;

import com.microsoft.services.odata.ODataCollectionFetcher;
import com.microsoft.services.odata.ODataEntityFetcher;
import com.microsoft.services.odata.ODataExecutable;
import com.microsoft.services.odata.Readable;

import microsoft.com.onenote.*;

/**
 * The type  NotebookFetcher.
 */
public class NotebookFetcher extends ODataEntityFetcher<Notebook,NotebookOperations>
                                     implements Readable<Notebook> {

     /**
     * Instantiates a new NotebookFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public NotebookFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Notebook.class, NotebookOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public NotebookFetcher addParameter(String name, Object value) {
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
    public NotebookFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
	
     /**
     * Gets sections.
     *
     * @return the sections
     */
    public ODataCollectionFetcher<Section, SectionFetcher, SectionCollectionOperations> getsections() {
        return new ODataCollectionFetcher<Section, SectionFetcher,SectionCollectionOperations>("sections", this, Section.class,SectionCollectionOperations.class);
    }

    /**
     * Gets section.
     *
     * @return the section
     */
    public SectionFetcher getsection(String id){
         return new ODataCollectionFetcher<Section, SectionFetcher,SectionCollectionOperations>("sections", this, Section.class,SectionCollectionOperations.class).getById(id);
    }

     /**
     * Gets section groups.
     *
     * @return the section groups
     */
    public ODataCollectionFetcher<SectionGroup, SectionGroupFetcher, SectionGroupCollectionOperations> getsectionGroups() {
        return new ODataCollectionFetcher<SectionGroup, SectionGroupFetcher,SectionGroupCollectionOperations>("sectionGroups", this, SectionGroup.class,SectionGroupCollectionOperations.class);
    }

    /**
     * Gets section group.
     *
     * @return the section group
     */
    public SectionGroupFetcher getsectionGroup(String id){
         return new ODataCollectionFetcher<SectionGroup, SectionGroupFetcher,SectionGroupCollectionOperations>("sectionGroups", this, SectionGroup.class,SectionGroupCollectionOperations.class).getById(id);
    }

}