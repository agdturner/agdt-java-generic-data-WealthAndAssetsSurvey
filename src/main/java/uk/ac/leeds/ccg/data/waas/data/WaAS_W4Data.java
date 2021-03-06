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
package uk.ac.leeds.ccg.data.waas.data;

import uk.ac.leeds.ccg.data.waas.data.records.WaAS_W4Record;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_W1ID;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_W4ID;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_W2ID;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_W3ID;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author geoagdt
 */
public class WaAS_W4Data implements Serializable {

    /**
     * Keys are CASEW4 and values are WaAS_W4Record
     */
    public final Map<WaAS_W4ID, WaAS_W4Record> lookup;
    /**
     * CASEW1 in Wave 4 records.
     */
    public final Set<WaAS_W1ID> w1_In_w4;
    /**
     * CASEW2 in Wave 4 records.
     */
    public final Set<WaAS_W2ID> w2_In_w4;
    /**
     * CASEW3 in Wave 4 records.
     */
    public final Set<WaAS_W3ID> w3_In_w4;
    /**
     * All CASEW4 values.
     */
    public final Set<WaAS_W4ID> all;
    /**
     * CASEW4 values for records that have CASEW1, CASEW2 and CASEW3 values.
     */
    public final Set<WaAS_W4ID> w4_In_w1w2w3;
    /**
     * Keys are CASEW4 and values are w3ID.
     */
    public final Map<WaAS_W4ID, WaAS_W3ID> w4_To_w3;
    /**
     * Keys are w3ID and values are sets of CASEW4 (normally size one).
     */
    public final Map<WaAS_W3ID, Set<WaAS_W4ID>> w3_To_w4;

    public WaAS_W4Data() {
        lookup = new TreeMap<>();
        w1_In_w4 = new TreeSet<>();
        w2_In_w4 = new TreeSet<>();
        w3_In_w4 = new TreeSet<>();
        all = new TreeSet<>();
        w4_In_w1w2w3 = new TreeSet<>();
        w4_To_w3 = new TreeMap<>();
        w3_To_w4 = new TreeMap<>();
    }
}
