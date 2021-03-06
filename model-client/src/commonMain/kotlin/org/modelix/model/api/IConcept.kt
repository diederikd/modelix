/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */

package org.modelix.model.api

interface IConcept {
    fun getShortName(): String
    fun getLongName(): String
    fun isSubconceptOf(superConcept: IConcept?): Boolean
    fun isExactly(concept: IConcept?): Boolean
    val properties: Iterable<IProperty>
    val childLinks: Iterable<IChildLink>
    val referenceLinks: Iterable<IReferenceLink>
    fun getProperty(name: String): IProperty
    fun getChildLink(name: String): IChildLink
    fun getReferenceLink(name: String): IReferenceLink
}
