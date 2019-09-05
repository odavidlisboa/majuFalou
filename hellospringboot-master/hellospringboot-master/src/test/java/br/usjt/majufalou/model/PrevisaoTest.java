package br.usjt.majufalou.model;

import org.junit.Assert;
import org.junit.Test;

import br.usjt.majufalou.model.Previsao;

public class PrevisaoTest {

	@Test
	public void alunoTest() {
		Previsao a = new Previsao();
		a.setId(1L);
		Assert.assertEquals(1L, a.getId(), 0);
	}
}
