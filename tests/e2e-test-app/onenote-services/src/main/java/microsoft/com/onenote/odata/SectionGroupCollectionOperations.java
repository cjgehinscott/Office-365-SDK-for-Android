
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.onenote.api.*;
import static com.microsoft.services.odata.Helpers.*;



/**
 * The type SectionGroupCollectionOperations
 */
public class SectionGroupCollectionOperations extends ODataOperations{

    /**
     * Instantiates a new SectionGroupCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public SectionGroupCollectionOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public SectionGroupCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public SectionGroupCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

}
