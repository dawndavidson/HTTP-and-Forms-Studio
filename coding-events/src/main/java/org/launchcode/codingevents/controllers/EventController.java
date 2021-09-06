package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping() {
        public String displayAllEvents(Model model) {
            List<String> events = new ArrayList<>();
            events.add("BLM");
            events.add("Women in Tech");
            events.add("Black Girls Code");
            events.add("Coding Is Fun");
            model.addAttribute("events", events);
            return "events/index";
        }
        @GetMapping("create")
        public String renderCreateEventForm() {
            return "events/Create";
        }

    }
}
