package com.zakria.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zakria.demo.model.Alien;





//public interface AlienRepo extends CrudRepository<Alien, Integer>
//{
//	//List<Alien> findByTech(String tech);
//  //   List<Alien> findByaidGreaterThan(int aid);
//     
////     @Query("from  Alien where tech=?1 order by aname")   //this query is jpa query it is like sql query syntax difference
////     List<Alien> findByTechSorted(String tech);
//
//}



public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	
}
