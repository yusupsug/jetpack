package com.dicoding.yusup.movieku.utils

import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R

object  DataJoin {
    fun generateMovieList(): ArrayList<DataEntity> {
        val movies = ArrayList<DataEntity>()

        movies.add(DataEntity("m01",
            "A Star Is Born (2018)",
            "10/05/2018",
            "Drama, Romance, Music ",
            "Bradley Cooper",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            R.drawable.poster_a_star_is_born
        ))
        movies.add(DataEntity("m02",
            "Alita: Battle Angel (2019)",
            "02/14/2019",
            "Action, Science Fiction, Adventure ",
            "Robert Rodriguez",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            R.drawable.poster_alita
        ))
        movies.add(DataEntity("m03",
            "Aquaman (2018)",
            "12/21/2018",
            "Action, Adventure, Fantasy ",
            "James Wan",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            R.drawable.poster_aquaman
        ))
        movies.add(DataEntity("m04",
            "Bohemian Rhapsody (2018) ",
            "11/02/2018",
            "Music, Drama, History",
            "Dexter Fletcher",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            R.drawable.poster_bohemian
        ))
        movies.add(DataEntity("m05",
            "Cold Pursuit (2019) ",
            "02/08/2019",
            "Action, Crime, Thriller",
            "Hans Petter Moland",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            R.drawable.poster_cold_persuit
        ))
        movies.add(DataEntity("m06",
            "Creed II (2018) ",
            "11/21/2018",
            "Drama",
            "Steven Caple Jr.",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            R.drawable.poster_creed
        ))
        movies.add(DataEntity("m07",
            "Fantastic Beasts: The Crimes of Grindelwald (2018) ",
            "11/16/2018",
            "Adventure, Fantasy, Drama ",
            "David Yates",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            R.drawable.poster_crimes
        ))
        movies.add(DataEntity("m08",
            "Glass (2019) ",
            "01/18/2019",
            "Thriller, Drama, Science Fiction ",
            "M. Night Shyamalan",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            R.drawable.poster_glass
        ))
        movies.add(DataEntity("m09",
            "How to Train Your Dragon: The Hidden World (2019) ",
            "02/22/2019 ",
            "Animation, Family, Adventure ",
            "Dean DeBlois",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            R.drawable.poster_how_to_train
        ))
        movies.add(DataEntity("m10",
            "Avengers: Infinity War (2018) ",
            "04/27/2018",
            "Adventure, Action, Science Fiction  ",
            "Anthony Russo",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            R.drawable.poster_infinity_war
        ))
        movies.add(DataEntity("m11",
            "Mary Queen of Scots (2018) ",
            "12/21/2018",
            "Drama, History ",
            "Josie Rourke",
            "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
            R.drawable.poster_mary_queen
        ))
        movies.add(DataEntity("m12",
            "Master Z: Ip Man Legacy (2018) ",
            "12/26/2018",
            "Action",
            "Yuen Woo-ping",
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            R.drawable.poster_master_z
        ))



        return movies
    }

    fun generateTvShowList() : ArrayList<DataEntity> {
        val tvShow = ArrayList<DataEntity>()

        tvShow.add(DataEntity("tv01",
            "Arrow (2012)",
            "October 10, 2012",
            "Crime, Drama, Mystery, Action & Adventure ",
            "Greg Berlanti",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            R.drawable.tvshow_arrow
        ))
        tvShow.add(DataEntity("tv02",
            "Doom Patrol (2019) ",
            "February 15, 2019",
            "Sci-Fi & Fantasy, Action & Adventure, Comedy ",
            "Jeremy Carver",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            R.drawable.tvshow_doom_patrol
        ))
        tvShow.add(DataEntity("tv03",
            "Dragon Ball (1986) ",
            "February 26, 1986",
            "Comedy, Sci-Fi & Fantasy, Animation, Action & Adventure ",
            "Akira Toriyama",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            R.drawable.tvshow_dragon_ball
        ))
        tvShow.add(DataEntity("tv04",
            "Fairy Tail: Phoenix Priestess (2012) ",
            "August 18, 2012",
            "Action, Adventure, Comedy, Fantasy, Animation ",
            "Masaya Fujimori",
            "The film revolves around a mysterious girl named Éclair who appears before Fairy Tail, the world's most notorious wizard's guild. She lost all of her memories, except for the imperative that she must deliver two Phoenix Stones somewhere. The stones may spell the collapse of the magical world, and Natsu, Lucy, and the rest of the Fairy Tail guild are caught up in the intrigue.",
            R.drawable.tvshow_fairytail
        ))
        tvShow.add(DataEntity("tv05",
            "Family Guy (1999)",
            "January 31, 1999",
            "Animation, Comedy ",
            "Seth MacFarlane",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            R.drawable.tvshow_family_guy
        ))
        tvShow.add(DataEntity("tv06",
            "The Flash (2014)",
            "October 7, 2014",
            "Drama, Sci-Fi & Fantasy ",
            "Greg Berlanti",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            R.drawable.tvshow_flash
        ))
        tvShow.add(DataEntity("tv07",
            "NCIS (2003) ",
            "September 23, 2003",
            "Crime, Action & Adventure, Drama ",
            "Donald P. Bellisario & Don McGill",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            R.drawable.tvshow_ncis
        ))
        tvShow.add(DataEntity("tv08",
            "Gotham (2014) ",
            "September 22, 2014",
            "Drama, Crime, Sci-Fi & Fantasy",
            "Bruno Heller",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            R.drawable.tvshow_gotham
        ))
        tvShow.add(DataEntity("tv09",
            "Grey's Anatomy (2005)",
            "March 27, 2005",
            "Drama",
            "Shonda Rhimes",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            R.drawable.tvshow_grey_anatomy
        ))
        tvShow.add(DataEntity("tv10",
            "Hanna (2019)",
            "March 28, 2019",
            "Action & Adventure, Drama ",
            "David Farr",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            R.drawable.tvshow_hanna
        ))
        tvShow.add(
            DataEntity("tv11",
            "Marvel's Iron Fist (2017) ",
                "March 17, 2017",
            "Action & Adventure, Drama, Sci-Fi & Fantasy ",
            "Scott Buck",
            "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
            R.drawable.tvshow_iron_fist
        )
        )
        tvShow.add(DataEntity("tv12",
            "Riverdale (2017) ",
            "January 26, 2017",
            "Mystery, Drama, Crime ",
            "Roberto Aguirre-Sacasa",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            R.drawable.tvshow_riverdale
        ))

        return tvShow
    }
}