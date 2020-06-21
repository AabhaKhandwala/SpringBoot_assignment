package com.homework.assignment.Repository;

import com.homework.assignment.GreetingController.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}