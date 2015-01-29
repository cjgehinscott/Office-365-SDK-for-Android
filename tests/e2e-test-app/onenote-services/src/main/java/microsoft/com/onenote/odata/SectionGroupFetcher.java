
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
 * The type  SectionGroupFetcher.
 */
public class SectionGroupFetcher extends ODataEntityFetcher<SectionGroup,SectionGroupOperations> 
                                     implements Readable<SectionGroup> {

     /**
     * Instantiates a new SectionGroupFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SectionGroupFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, SectionGroup.class, SectionGroupOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SectionGroupFetcher addParameter(String name, Object value) {
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
    public SectionGroupFetcher addHeader(String name, String value) {
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