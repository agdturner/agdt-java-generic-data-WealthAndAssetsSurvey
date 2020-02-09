/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.data.waas.data.subset;

import java.io.IOException;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_W3ID;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import uk.ac.leeds.ccg.data.waas.core.WaAS_Environment;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_CollectionID;

/**
 * WaAS_DataSubsetW3
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class WaAS_DataSubsetW3 extends WaAS_DataSubset {

    /**
     * Lookup from Data_CollectionID to WaAS_W3ID.
     */
    public TreeMap<WaAS_CollectionID, HashSet<WaAS_W3ID>> c_To_w3;

    /**
     * Lookup from WaAS_W3ID to Data_CollectionID.
     */
    public HashMap<WaAS_W3ID, WaAS_CollectionID> w3_To_c;

    /**
     *
     * @param e
     * @param cSize
     * @param w3IDs
     * @throws java.io.IOException If encountered.
     */
    public WaAS_DataSubsetW3(WaAS_Environment e, int cSize, 
            Set<WaAS_W3ID> w3IDs) throws IOException {
        super(e, cSize);
        c_To_w3 = new TreeMap<>();
        w3_To_c = new HashMap<>();
        Iterator<WaAS_W3ID> ite = w3IDs.iterator();
        int i = 0;
        WaAS_CollectionID cID = getCollectionID(i);
        int ci = 0;
        while (ite.hasNext()) {
            WaAS_W3ID w3ID = ite.next();
            w3_To_c.put(w3ID, cID);
            ci++;
            if (ci == cSize) {
                ci = 0;
                i++;
                cID = getCollectionID(i);
            }
        }
        initCFs(we.W3);
    }
}
