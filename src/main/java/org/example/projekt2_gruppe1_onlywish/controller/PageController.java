/*package org.example.projekt2_gruppe1_onlywish.controller;

import org.example.projekt2_gruppe1_onlywish.config.InitData;
import org.example.projekt2_gruppe1_onlywish.model.Wish;
import org.example.projekt2_gruppe1_onlywish.repository.UserRepository;
import org.example.projekt2_gruppe1_onlywish.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PageController {

    @Autowired
    InitData initData;

    @Autowired
    UserRepository userRepo;



    @GetMapping("/")
    public String mainPage(Model model) {
        // Ingen grund til at oprette nyt Arraylist carList da vi bare kan kalde den neden under i en linje
        //ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Wish> carList= carRepo.getAllCars();
        model.addAttribute("carList", carList);


        return "index";
    }
}

 */
