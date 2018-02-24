package br.ufsc.ine.agent.context;

import alice.tuprolog.Theory;

public interface ContextService {

	public Theory getTheory();
	public boolean verify(String fact);
	public void appendFact(String fact);
	public String getName();
}
