package org.algohub.engine.judge

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Function(val name: String,
               @JsonProperty("return") val returnStatement: Function.Return,
               val parameters: Array<Function.Parameter>) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    class Return(val type: String, val comment: String)

    @JsonIgnoreProperties(ignoreUnknown = true)
    class Parameter(val name: String, val type: String, val comment: String)
}
