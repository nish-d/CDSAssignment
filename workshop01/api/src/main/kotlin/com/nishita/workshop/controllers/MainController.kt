package com.nishita.workshop.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class MainController {
    @GetMapping("/quote")
    fun getRandomQuote(model: Model): String {
        val quotes = listOf(
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."

        )
        var randomQuote = quotes.random();
        model.addAttribute("quote", randomQuote)
        return "quote" // this refers to templates/quote.html
    }

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("message", "Hello from Thymeleaf + Kotlin!")
        return "index" // this refers to templates/index.html
    }
}
