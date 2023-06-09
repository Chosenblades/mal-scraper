package main.model.anime

data class Anime(
    var mal_id: Int? = null,
    var synopsis: String? = null,
    var image_url: String? = null,
    var title_synonyms: List<String>? = null,
    var title_romaji: String? = null,
    var title_japanese: String? = null,
    var title_english: String? = null,
    var title_german: String? = null,
    var title_spanish: String? = null,
    var title_french: String? = null,
    var type: String? = null,
    var episodes: Int? = null,
    var status: String? = null,
    var aired: String? = null,
    var season: String? = null,
    var year: Int? = null,
    var broadcast: String? = null,
    var producers: List<String>? = null,
    var licensors: List<String>? = null,
    var studios: List<String>? = null,
    var source: String? = null,
    var genres: List<String>? = null,
    var themes: List<String>? = null,
    var demographic: String? = null,
    var duration: String? = null,
    var rating: String? = null,
    var relations: List<AnimeRelation>? = null,
    var charactersUrl: String? = null,

    )
