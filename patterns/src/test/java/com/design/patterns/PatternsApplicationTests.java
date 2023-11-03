package com.design.patterns;

import com.design.patterns.prototype.ProtoFalse;
import com.design.patterns.prototype.ProtoTrue;
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

	@Autowired
	private ProtoTrue true1;

	@Autowired
	private ProtoFalse false1;

	@Autowired
	private ProtoTrue true2;

	@Autowired
	private ProtoFalse false2;






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






	@Test
	public  void testPrototypes(){

		Assertions.assertNotSame(true1, true2);
		Assertions.assertSame(false1,false2);


	}
}

