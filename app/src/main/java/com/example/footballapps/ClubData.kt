package com.example.footballapps

import com.example.footballapps.model.Club

object ClubData {

    private val clubNames = arrayOf(
        "A.C.Milan",
        "Arsenal",
        "Barcelona B",
        "Bayern Munchen",
        "Chelsea F.C.",
        "Manchester City",
        "Inter Milan",
        "Realmadrid",
        "Manchester United",
        "Paris Saint-Germain"
    )

    private val clubDetails = arrayOf(
        "Associazione Calcio Milan (Italian pronunciation: ), commonly referred to as A.C. Milan or simply Milan, is a professional football club in Milan, Italy, founded in 1899.",
        "Arsenal Football Club is a professional football club based in Holloway, London which currently plays in the Premier League, the highest level of English football.",
        "Futbol Club Barcelona B is a Spanish football team based in Barcelona, in the autonomous community of Catalonia. Founded in 1970 as FC Barcelona Atlètic, it is the reserve team of FC Barcelona, and currently plays in Segunda División, holding home matches at Mini Estadi.",
        "FC Bayern was founded in 1900 by eleven football players led by Franz John. Although Bayern won its first national championship in 1932, the club was not selected for the Bundesliga at its inception in 1963.",
        "Chelsea Football Club are a professional football club based in Fulham, London, who play in the Premier League, the highest level of English football.",
        "Manchester City Football Club is a football club in Manchester, England. Founded in 1880 as St. Marks (West Gorton), it became Ardwick Association Football Club in 1887 and Manchester City in 1894.",
        "F.C. Internazionale Milano, commonly referred to as Internazionale or simply Inter, and colloquially known as Inter Milan outside of Italy, is a professional Italian football club based in Milan, Lombardy.",
        "Real Madrid Club de Futbol (Royal Madrid Football Club), commonly known as Real Madrid, or simply as Real, is a professional football club based in Madrid, Spain.",
        "Manchester United Football Club is an English professional football club, based in Old Trafford, Greater Manchester that plays in the Premier League. Founded as Newton Heath LYR Football Club in 1878, the club changed its name to Manchester United in 1902 and moved to Old Trafford in 1910.",
        "Paris Saint-Germain Football Club, also known simply as Paris Saint-Germain (French pronunciation) and familiarly as Paris SG or PSG , is a professional association football club based in Paris, France."

    )

    private val clubImages = intArrayOf(
        R.drawable.img_acm,
        R.drawable.img_arsenal,
        R.drawable.img_barca,
        R.drawable.img_bayern,
        R.drawable.img_chelsea,
        R.drawable.img_city,
        R.drawable.img_inter,
        R.drawable.img_madrid,
        R.drawable.img_mu,
        R.drawable.img_psg
    )


    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices) {
                val club = Club()
                club.name = clubNames[position]
                club.detail = clubDetails[position]
                club.photo = clubImages[position]
                list.add(club)
            }
            return list
        }
}