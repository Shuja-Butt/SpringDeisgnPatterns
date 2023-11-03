package com.design.patterns;

import com.design.patterns.singleton.SingA;
import com.design.patterns.singleton.SingB;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class PatternsApplicationTests {

	@Autowired
	private  SingB A;

	@Autowired
	private SingB B;


	@Test
	void contextLoads() {
	}


	@Test
	public void testSingletons(){

		SingA C = SingA.getInstance();
		SingA D = SingA.getInstance();

		Assertions.assertNotNull(C);
		Assertions.assertSame(C,D);


		Assertions.assertNotNull(A);
		Assertions.assertSame(A,B);









	}
}
