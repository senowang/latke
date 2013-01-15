/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.urlfetch;


import java.io.IOException;
import java.util.concurrent.Future;


/**
 * URL fetch service.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Aug 8, 2011
 */
public interface URLFetchService {

    /**
     * Execute the specified request and return its response. 
     * 
     * @param request the specified request
     * @return response
     * @throws IOException if the remote service could not be contacted or the 
     * request URL could not be fetched
     */
    HTTPResponse fetch(final HTTPRequest request) throws IOException;

    /**
     * The asynchronous version of interface 
     * {@link #fetch(org.b3log.latke.urlfetch.HTTPRequest)}.
     * 
     * @param request the specified request
     * @return future response 
     */
    Future<?> fetchAsync(final HTTPRequest request);
}
