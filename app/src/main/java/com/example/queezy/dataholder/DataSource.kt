package com.example.queezy.dataholder

import com.example.queezy.R
import com.example.queezy.data.model.Quiz

object DataSource {
    fun getAllQuiz(): List<Quiz> {
        return listOf(
            Quiz("Chile", R.drawable._868665411626934443,"Long and thin, stretching from desert to glacier—where Andes meet the Pacific."),
            Quiz("United_Kingdom", R.drawable._320950591626934443,"Tea time, rainy skies, royal traditions, and red double-deckers."),
            Quiz("Brazil", R.drawable._626585481626934373,"Samba, sun, and the Amazon—where football is a religion."),
            Quiz("Nigeria", R.drawable._620667311626934410,"Rich in rhythms and roots—where Afrobeat and ancient empires live on."),
            Quiz("Philippines", R.drawable._929176121626934417,"Archipelago of smiles, jeepneys, and island sunsets."),
            Quiz("Korea", R.drawable._594239531626934433,"High-tech meets tradition—where K-pop echoes from old palaces."),
            Quiz("Germany", R.drawable._865140001626934370,"Castles, cars, and precision—where history and innovation collide."),
            Quiz("Hungary", R.drawable._696181521626934397,"Thermal baths and paprika spice in the heart of Europe."),
            Quiz("India", R.drawable._407673031553750387,"A tapestry of color, spice, and stories stretching millennia."),
            Quiz("Spain", R.drawable._330325361626934434,"Tapas, flamenco, and siesta vibes in Mediterranean light."),
            Quiz("Poland", R.drawable._635710591626934419,"Pierogi, resilience, and cobblestone tales of old Europe."),
            Quiz("Venezuela ", R.drawable._813836031626934447,"Angel Falls to Caribbean shores—a land of contrast and courage."),
            Quiz("Egypt", R.drawable._086998941626934385,"Pyramids, pharaohs, and the eternal Nile’s whisper.")
        )
    }
}