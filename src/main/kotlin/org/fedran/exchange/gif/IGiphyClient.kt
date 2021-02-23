package org.fedran.exchange.gif

import org.fedran.exchange.gif.dto.GiphyResponse
import reactor.core.publisher.Mono

interface IGiphyClient {

    fun searchGif(query: String, limit: Int, offset: Int): Mono<GiphyResponse>
}
