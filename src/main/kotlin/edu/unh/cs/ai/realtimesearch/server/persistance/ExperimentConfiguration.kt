package edu.unh.cs.ai.realtimesearch.server.persistance

import edu.unh.cs.ai.realtimesearch.server.domain.ExperimentData
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Experiment configuration domain object.
 *
 * @author Bence Cserna (bence@cserna.net)
 */
@Document
data class ExperimentConfiguration(val experimentData: ExperimentData) {
    @Id var id: String? = null
}