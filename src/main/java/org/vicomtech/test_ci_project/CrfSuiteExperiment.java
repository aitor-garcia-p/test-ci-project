package org.vicomtech.test_ci_project;

import com.github.jcrfsuite.CrfTagger;
import com.github.jcrfsuite.CrfTrainer;

public class CrfSuiteExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrfTagger fCrfTagger=new CrfTagger("crfsuite-example-trainset.txt");
		
		CrfTrainer trainer=new CrfTrainer();
		
		//trainer.tr
		
	}

}
