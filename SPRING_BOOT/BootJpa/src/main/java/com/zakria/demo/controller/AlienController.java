package com.zakria.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zakria.demo.dao.AlienRepo;
import com.zakria.demo.model.Alien;


//@Controller
@RestController           //in order to avoid Responsebody we will change to RestController
public class AlienController
{
	
	@Autowired
	public AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
//	@RequestMapping("/addAlien")                 // it is for adding
//	public String addAlien(Alien alien)
//	{
//		repo.save(alien);
//		return "home.jsp";
//	}

//	@RequestMapping("/getAlien")
//	public ModelAndView addAlien(@RequestParam int aid)
//	{
//		ModelAndView mv = new ModelAndView("ShowAlien.jsp");  //used COnstructor to show ShowAien.jsp
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		mv.addObject(alien);
//		return mv;
//	}

	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid)
//	{ 
//		ModelAndView mv = new ModelAndView("ShowAlien.jsp");  //used COnstructor to show ShowAien.jsp
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		
//	//System.out.println(repo.findByTech("zakria"));
//	//	System.out.println(repo.findByaidGreaterThan(103));
//		System.out.println(repo.findByTechSorted("khizar"));
//		
//		mv.addObject(alien);
//		return mv;
//	}

	
	
//	@RequestMapping(path="/aliens")     // produces = {"application/xml"},produces = {"application/json"}//by using produces we can restrict content negsitaion by default it supports xml and json
	@GetMapping(path="/aliens")
	//@ResponseBody                    // we are saying dont look for view(String) just return the data
	public List<Alien> getAliens()
	{ 

	//	return repo.findAll().toString();  //HEre we are using return type as String
		
		return repo.findAll();
	}

	
	
	@RequestMapping("/alien/{aid}")              //requestmapping is by default GetMapping
	//@ResponseBody                    // we are saying dont look for view(String) just return the data
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{ 

		return repo.findById(aid);
	}
	
	
	@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)   //to eanble raw data we use requestbody which enable using json
	{
		repo.save(alien);
		return alien;

	}
	
	//h2 database is a inmemory database once restart data gone
	//difference between consumes and produces
	//produces = server will produce data to client
    //	consuems = it accepts data from client 
	
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		Alien a =   repo.getOne(aid);
		
		repo.delete(a);
		
		return "deleted";
	}
	
	

	@PutMapping(path="/alien",consumes= {"application/json"})
	public Alien saveOrupdateAlien(@RequestBody Alien alien)   //to eanble raw data we use requestbody which enable using json
	{
		repo.save(alien);
		return alien;

	}
	
	
}
