/*
 * Copyright 2018 geoagdt.
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
package uk.ac.leeds.ccg.data.waas.data.id;

/**
 * A Record ID for Wave 5 to help with type safety.
 * 
 * @author Andy Turner
 */
public class WaAS_W5ID extends WaAS_WID {

    public WaAS_W5ID(long l) {
        super(l);
    }

    @Override
    public String toString() {
        return "CASEW5=" + getID();
    }
}

