
/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package microsoft.com.onenote.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;

import static com.microsoft.services.odata.Helpers.*;

/**
 * The type ResourceOperations.
 */
public class ResourceOperations extends ODataOperations {

     /**
      * Instantiates a new ResourceOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public ResourceOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ResourceOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ResourceOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }



}