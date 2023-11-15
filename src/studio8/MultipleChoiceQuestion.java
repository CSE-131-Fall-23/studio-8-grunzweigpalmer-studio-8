package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt, answer, points);
		this.setChoices(choices);
		
	}
	@Override
	public void displayPrompt() {
		//FIXME
		super.displayPrompt();
		for (int i = 0; i < getChoices().length; i++) {
			System.out.println(i+1 + ". " + getChoices()[i]);
		}
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"one", "two", "three", "eight"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "8", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("8"));//right
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}

}
