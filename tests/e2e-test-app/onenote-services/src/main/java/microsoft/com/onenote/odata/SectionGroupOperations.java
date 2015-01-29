
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
 * The type SectionGroupOperations.
 */
public class SectionGroupOperations extends ODataOperations {

     /**
      * Instantiates a new SectionGroupOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public SectionGroupOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public SectionGroupOperations addParameter(String name, Object value) {
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
    public SectionGroupOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }



}