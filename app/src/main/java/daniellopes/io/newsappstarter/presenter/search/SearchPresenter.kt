package daniellopes.io.newsappstarter.presenter.search

import daniellopes.io.newsappstarter.model.NewsResponse
import daniellopes.io.newsappstarter.model.data.NewsDataSource
import daniellopes.io.newsappstarter.presenter.ViewHome

class SearchPresenter(val view: ViewHome.View,
    private val dataSource: NewsDataSource): SearchHome.Presenter{
    override fun search(term: String) {
        TODO("Not yet implemented")
    }

    override fun onSuccess(newsResponse: NewsResponse) {
        TODO("Not yet implemented")
    }

    override fun onError(message: String) {

    }

    override fun onComplete() {
        TODO("Not yet implemented")
    }
}