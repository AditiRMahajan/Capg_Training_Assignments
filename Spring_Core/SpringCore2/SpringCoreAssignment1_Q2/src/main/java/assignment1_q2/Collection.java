
package assignment1_q2;

import java.util.*;

public class Collection {
	
	private List<Question> QuestionList;
	private Set<Question> QuestionSet;
	private Map<Integer,Question> QuestionMap;
	
	

	public Map<Integer, Question> getQuestionMap() {
		System.out.println("Map Elements :"  + QuestionMap);
		return QuestionMap;
	}

	public void setQuestionMap(Map<Integer, Question> questionMap) {
		QuestionMap = questionMap;
	}

	public Set<Question> getQuestionSet() {
		System.out.println("Set Elements :"  + QuestionSet);
		return QuestionSet;
	}

	public void setQuestionSet(Set<Question> questionSet) {
		QuestionSet = questionSet;
	}

	public List<Question> getQuestionList() {
		System.out.println("List Elements :"  + QuestionList);
		return QuestionList;
	}

	public void setQuestionList(List<Question> questionList) {
		QuestionList = questionList;
	}
	
	public void showList() {
		for(Question q:QuestionList)
			System.out.println("Question- "+q.getQuestion()+" Answer- "+q.getAnswer());	
	}
	
	public void showSet() {
		for(Question q:QuestionSet)
			System.out.println("Question- "+q.getQuestion()+" Answer- "+q.getAnswer());	
	}
	
	public void showMap() {
		for (Integer i : QuestionMap.keySet()) {
			  System.out.println("key: " + i + " Question- " + QuestionMap.get(i).getQuestion()+" Answer- "+QuestionMap.get(i).getAnswer());
		}
	}

}
