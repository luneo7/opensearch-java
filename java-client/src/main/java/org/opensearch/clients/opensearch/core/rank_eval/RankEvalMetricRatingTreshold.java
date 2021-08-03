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

package org.opensearch.clients.opensearch.core.rank_eval;

import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectDeserializer;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricRatingTreshold

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/rank_eval/types.ts#L34-L40">API
 *      specification</a>
 */

public abstract class RankEvalMetricRatingTreshold extends RankEvalMetricBase {
	@Nullable
	private final Integer relevantRatingThreshold;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalMetricRatingTreshold(AbstractBuilder<?> builder) {
		super(builder);

		this.relevantRatingThreshold = builder.relevantRatingThreshold;

	}

	/**
	 * Sets the rating threshold above which documents are considered to be
	 * &quot;relevant&quot;.
	 * <p>
	 * API name: {@code relevant_rating_threshold}
	 */
	@Nullable
	public final Integer relevantRatingThreshold() {
		return this.relevantRatingThreshold;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.relevantRatingThreshold != null) {
			generator.writeKey("relevant_rating_threshold");
			generator.write(this.relevantRatingThreshold);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				RankEvalMetricBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Integer relevantRatingThreshold;

		/**
		 * Sets the rating threshold above which documents are considered to be
		 * &quot;relevant&quot;.
		 * <p>
		 * API name: {@code relevant_rating_threshold}
		 */
		public final BuilderT relevantRatingThreshold(@Nullable Integer value) {
			this.relevantRatingThreshold = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRankEvalMetricRatingTresholdDeserializer(
			ObjectDeserializer<BuilderT> op) {
		setupRankEvalMetricBaseDeserializer(op);
		op.add(AbstractBuilder::relevantRatingThreshold, JsonpDeserializer.integerDeserializer(),
				"relevant_rating_threshold");

	}

}