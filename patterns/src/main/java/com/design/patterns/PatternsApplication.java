package com.design.patterns;

import com.design.patterns.prototype.ProtoFalse;
import com.design.patterns.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
	}


	@Bean
	public ProtoFalse protoFalse(){
		return new ProtoFalse();
	}


	// Very seldom would we simply return an instance.
	// What we're going to do in Spring usually during this
	// method is at all of the expansive behavior through injectin
	// g other beans into this class. And once it's all injected then
	// we're going to hand it back out. Now if all of those values are beans
	// that means that they're singletons and they've been controlled and we can
	// actually put behavior in the class that doesn't have to worry about being thread-safe
	// while keeping all of those singletons in place. So in the real world all of your work is
	// done in this method but because it's a prototype the expansive operations that get injected
	// into this class have already been done. It's only the work that goes on here so that you get
	// a bean that acts as a prototype. It acts as a cloned object even though it really isn't in the
	// Spring world.
	@Bean
	@Scope("prototype")
	public ProtoTrue protoTrue(){
		return  new ProtoTrue();
	}




}


