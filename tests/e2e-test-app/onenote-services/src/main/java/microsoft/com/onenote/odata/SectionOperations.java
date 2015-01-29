
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
 * The type SectionOperations.
 */
public class SectionOperations extends ODataOperations {

     /**
      * Instantiates a new SectionOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public SectionOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public SectionOperations addParameter(String name, Object value) {
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
    public SectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }



}