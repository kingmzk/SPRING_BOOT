package com.zakria.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController
{
	
//  @RequestMapping("home")
  // @ResponseBody    //it will not return whole page
//  public String home(HttpServletRequest req, HttpServletResponse res)
//  {
//	  System.out.println("HI HELLO");
//	  HttpSession session = req.getSession();
//	  String name = req.getParameter("name");
//	  session.setAttribute("name", name);
//	  System.out.println("WELCOME "+ name);
//	  
//	  return "home";     //added tomcat jesper depedency to work removed .jsp and inside pages
	  
  
//	@RequestMapping("home")
//  public String home(@RequestParam("name") String myName, HttpSession session)
//  {
//	
//	
//	  session.setAttribute("name", myName);
//	  System.out.println("WELCOME "+ myName);
//	  
//	  return "home";     //added tomcat jesper depedency to work removed .jsp and inside pages
//  }
	
	
//	@RequestMapping("home")
//  public ModelAndView   home(@RequestParam("name") String myName)
//  {
//	ModelAndView mv = new ModelAndView();
//	mv.addObject("name", myName);
//	mv.setViewName("home");
//	
//  
//	  return mv;    
//  }
	
	
	
	  @RequestMapping("home")
	  public ModelAndView  home(Alien alien)
	  {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		
	  
		  return mv;    
	  }
	
	
	
}
