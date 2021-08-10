package com.falabella;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.falabella.domain.repository.SequenceRepository;
import com.falabella.domain.repository.TerminalsRepository;
import com.falabella.domain.sequence.Sequence;

@SpringBootTest
public class SequenceTest {

	@Autowired SequenceRepository repo;
	
	@Autowired
	TerminalsRepository terRepo;
	
	@Test
	public void testear() {
		Sequence s=repo.getSequenceTerminal(1);
		System.out.println(s.toString());
		repo.resetSeq(1);
	}
	
	@Test
	public void terminalesDoc() {
		List<Integer> lista=terRepo.getDocumentsByTerminal(1); 
		
		for (int i=0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
	}
}
