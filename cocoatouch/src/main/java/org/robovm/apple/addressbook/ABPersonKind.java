/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.addressbook;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPersonKind/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABPersonKind.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static final ABPersonKind Person = new ABPersonKind() {
        public NSNumber value() {
            return PersonValue();
        }
    };
    public static final ABPersonKind Organization = new ABPersonKind() {
        public NSNumber value() {
            return OrganizationValue();
        }
    };
    private static ABPersonKind[] values = new ABPersonKind[] {Person, Organization};
    
    private ABPersonKind() {
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSNumber value() {
        return null;
    }
    
    public static ABPersonKind valueOf(NSNumber value) {
        for (ABPersonKind v : values) {
            if (v.value().intValue() == value.intValue()) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ABPersonKind/*</name>*/.class.getName());
    }
    /*<methods>*/
    @GlobalValue(symbol="kABPersonKindPerson", optional=true)
    protected static native NSNumber PersonValue();
    @GlobalValue(symbol="kABPersonKindOrganization", optional=true)
    protected static native NSNumber OrganizationValue();
    /*</methods>*/
}