
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
 * The type  ResourceFetcher.
 */
public class ResourceFetcher extends ODataMediaEntityFetcher<Resource,ResourceOperations> 
                                     implements Readable<Resource> {

     /**
     * Instantiates a new ResourceFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ResourceFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Resource.class, ResourceOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ResourceFetcher addParameter(String name, Object value) {
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
    public ResourceFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
	
}