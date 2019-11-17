/**
 *
 * Copyright 2019 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.demo.util;

import java.util.Date;
import java.util.Random;

public class MakeSeed {
    
    public static long makeLongSeed() {
        var date = new Date();
        long now = date.getTime();
        var pseudoRandom = new Random(now);
        return pseudoRandom.nextLong();
    }
    
    public static byte[] makeByteSeed() {
        var date = new Date();
        long now = date.getTime();
        var pseudoRandom = new Random(now);
        long seed = pseudoRandom.nextLong();
        return (Long.toBinaryString(seed)).getBytes();
    }
}
