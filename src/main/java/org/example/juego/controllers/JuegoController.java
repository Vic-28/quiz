package org.example.juego.controllers;


import org.example.juego.models.*;
import org.example.juego.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/juego")
public class JuegoController {
    private final MusicaService musicaService;
    private final PeliculasService peliculasService;
    private final VictorService victorService;
    private final GrupoService grupoService;
    private final CulturaService culturaService;
    private final HistoriaService historiaService;
    private final ProgramacionService programacionService;
    private final DeportesService deportesService;
    private final VideoJuegosService videoJuegosService;

    @GetMapping
    @RequestMapping("/cultura")
    public String cultura(Model model) {
        Cultura respuestas = culturaService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/musica")
    public String musica(Model model)
    {
        Musica respuestas = musicaService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/deportes")
    public String deportes(Model model)
    {
        Deportes respuestas = deportesService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/grupo")
    public String grupo(Model model)
    {

        Grupo respuestas = grupoService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/historia")
    public String historia(Model model)
    {
        Historia respuestas = historiaService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/peliculas")
    public String peliculas(Model model)
    {
        Peliculas respuestas = peliculasService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/programacion")
    public String programacion(Model model)
    {
        Programacion respuestas = programacionService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/victor")
    public String victor(Model model)
    {
        Victor respuestas = victorService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    @GetMapping
    @RequestMapping("/videojuegos")
    public String videojuegos(Model model)
    {
        Videojuegos respuestas = videoJuegosService.getPreguntaAleatoria();
        List<String> opciones = Arrays.asList(respuestas.getOpcion1(), respuestas.getOpcion2(), respuestas.getOpcion3(), respuestas.getOpcion4());
        Collections.shuffle(opciones);
        model.addAttribute("respuesta", respuestas.getRespuesta());
        model.addAttribute("pregunta", respuestas.getPregunta());
        model.addAttribute("opciones", opciones);
        return "juego";
    }

    public JuegoController(MusicaService musicaService, PeliculasService peliculasService, VictorService victorService, GrupoService grupoService, CulturaService culturaService, HistoriaService historiaService, ProgramacionService programacionService, DeportesService deportesService, VideoJuegosService videoJuegosService) {
        this.musicaService = musicaService;
        this.peliculasService = peliculasService;
        this.victorService = victorService;
        this.grupoService = grupoService;
        this.culturaService = culturaService;
        this.historiaService = historiaService;
        this.programacionService = programacionService;
        this.deportesService = deportesService;
        this.videoJuegosService = videoJuegosService;

    }
}
