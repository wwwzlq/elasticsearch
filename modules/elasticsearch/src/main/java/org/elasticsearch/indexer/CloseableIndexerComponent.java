/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.indexer;

import org.elasticsearch.ElasticSearchException;

/**
 * @author kimchy (shay.banon)
 */
public interface CloseableIndexerComponent {

    /**
     * Closes the indexer component. A boolean indicating if its part of an actual index
     * deletion or not is passed.
     *
     * @param delete <tt>true</tt> if the index is being deleted.
     * @throws org.elasticsearch.ElasticSearchException
     *
     */
    void close(boolean delete) throws ElasticSearchException;
}