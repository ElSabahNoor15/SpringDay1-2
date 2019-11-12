package com.SpringApp1.model;

public class TextEditor {

	private SpellChecker spellchecker;
	
	
//	public SpellChecker getSpellchecker() {
//		return spellchecker;
//	}
//
//	public void setSpellchecker(SpellChecker spellchecker) {
//		this.spellchecker = spellchecker;
//	}

	
	
	public TextEditor(){}
	 
	public TextEditor(SpellChecker spellchecker) {
		super();
		this.spellchecker = spellchecker;
	}

	public void write(){
		System.out.println("writing starts ..");
	spellchecker.check();
	}
	
	
}
