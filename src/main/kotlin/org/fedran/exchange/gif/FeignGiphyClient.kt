package org.fedran.exchange.gif

import feign.Param
import feign.RequestLine
import org.fedran.exchange.gif.dto.GiphyResponse

interface FeignGiphyClient {

    @RequestLine("GET /search?api_key={apiKey}&q={query}&limit={limit}&offset={offset}")
    fun searchGif(
        @Param("apiKey") apiKey: String,
        @Param("query") query: String,
        @Param("limit") limit: Int,
        @Param("offset") offset: Int,
    ): GiphyResponse
}