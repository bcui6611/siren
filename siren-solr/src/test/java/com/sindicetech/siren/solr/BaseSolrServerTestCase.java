/**
 * Copyright (c) 2014, Sindice Limited. All Rights Reserved.
 *
 * This file is part of the SIREn project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sindicetech.siren.solr;

import org.junit.BeforeClass;

/**
 * Abstract class which instantiates a Solr server with the default
 * {@link SolrServerTestCase#SOLR_HOME}
 * (<code>./src/test/resources/solr.home/</code>), solrconfig.xml and
 * schema.xml.
 */
public abstract class BaseSolrServerTestCase extends SolrServerTestCase {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    initCore("solrconfig.xml", "schema.xml", SOLR_HOME);
  }

}
