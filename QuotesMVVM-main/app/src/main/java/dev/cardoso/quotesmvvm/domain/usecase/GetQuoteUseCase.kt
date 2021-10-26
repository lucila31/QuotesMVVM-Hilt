package dev.cardoso.quotesmvvm.domain.usecase

import dev.cardoso.quotesmvvm.data.QuoteRepositoryImpl
import dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO
import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(private  val quoteRepository: QuoteRepository) {



    suspend fun getQuote(quoteId:Int): Flow<QuoteModel> = quoteRepository.getQuote(quoteId)

}