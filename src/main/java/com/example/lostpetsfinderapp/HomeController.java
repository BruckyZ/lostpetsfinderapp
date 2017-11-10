package com.example.lostpetsfinderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController
{
	@Autowired
	LostPetsRepository lostPetsRepository;


	@RequestMapping("/")
	public String listpets(Model model)
	{
		model.addAttribute("petes", lostPetsRepository.findAll());
		return "list";
	}

	@GetMapping("/add")
	public String petsForm(Model model)
	{
		model.addAttribute("pets", new Pets());
		return "petsform";
	}

	@PostMapping("/process")
	public String petsForm(@Valid Pets pets, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "petsform";
		}
		lostPetsRepository.save(pets);
		return "redirect:/";
	}

	@RequestMapping("/detail/{id}")
	public String showpets(@PathVariable("id") long id, Model model)
	{
		model.addAttribute("pets", lostPetsRepository.findOne(id));
		return "show";
	}

	@RequestMapping("/update/{id}")
	public String updatepets(@PathVariable("id") long id, Model model)
	{
		model.addAttribute("pets", lostPetsRepository.findOne(id));
		return "petsformupdate";
	}

	@RequestMapping("/delete/{id}")
	public String deletepets(@PathVariable("id") long id)
	{
		lostPetsRepository.delete(id);
		return "redirect:/";
	}
}

