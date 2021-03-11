package com.company;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/api/lagringserver/")

    public class KinoController {

        @Autowired
        AppRespitory sal;


        @PostMapping("/kino")
        public void lagre(Film film) {
            sal.leggInn(film);
        }
        @PostMapping("/kino")
        public void lagre2(velgFilm velg) {
            sal.leggInn2(velg);
        }
        @GetMapping("/kino")
        public ArrayList<Film> hent() {
            return sal.hentAlle();
        }

        @GetMapping("/kino")
        public ArrayList<velgFilm> hent2() {
            ArrayList <velgFilm> listfilmer = new ArrayList<>();
            listfilmer.add(new velgFilm("Velg film her"));
            listfilmer.add(new velgFilm("Cinderella"));
            listfilmer.add(new velgFilm("A walk to remember"));
            listfilmer.add(new velgFilm("Spiderman"));
            listfilmer.add(new velgFilm("Superman"));
            listfilmer.add(new velgFilm("Toys tale"));
            listfilmer.add(new velgFilm("Hunter"));
            return sal.hentAlle2();
        }

        @DeleteMapping("/kino")
        public void slett() {
            sal.slettAlle();
        }
    }
}
