package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;
//import hipster.view.HipsterFrame;

public class HipsterController 
{
	
// private HipsterFrame appFrame;
	private int [] numbers;
	private String [] words = {"This ","is the ","second hipster ","level: ","initialization ","lists"}; 
	private Hipster [] hipsters;
	
	public HipsterController()
	{
		thirdLevelHipster();
		
		hipsters = new Hipster[6];
		appFrame = new HipsterFrame(this);
	}
	
	
	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,87,6,5,4,3,2,1,0};
	}

	public void start()
	{
		
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster # " + index);
		}
		
		
		for(Hipster currentHipster : hipsters)
		{
			System.out.println(currentHipster);
		}
		System.out.println("Next");
		for(String currentWord : words)
		{
			System.out.println(currentWord + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			System.out.println(tempInt + ", ");
		}
	}

	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
	
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
}

