/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch.snapshot;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.transport.endpoints.DictionaryResponse;
import org.opensearch.clients.util.ObjectBuilder;

import java.lang.String;
import java.util.function.Function;

// typedef: snapshot.get_repository.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/snapshot/get_repository/SnapshotGetRepositoryResponse.ts#L23-L23">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRepositoryResponse extends DictionaryResponse<String, Repository> {
	// ---------------------------------------------------------------------------------------------

	private GetRepositoryResponse(Builder builder) {
		super(builder);

	}

	public static GetRepositoryResponse of(Function<Builder, ObjectBuilder<GetRepositoryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRepositoryResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Repository, Builder>
			implements
				ObjectBuilder<GetRepositoryResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRepositoryResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRepositoryResponse}
	 */
	public static final JsonpDeserializer<GetRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRepositoryResponse::setupGetRepositoryResponseDeserializer);

	protected static void setupGetRepositoryResponseDeserializer(ObjectDeserializer<GetRepositoryResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				Repository._DESERIALIZER);

	}

}