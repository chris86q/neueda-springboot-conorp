package uk.ac.belfastmet.titanic.domain;

public class Passenger {
	
	private Integer passengerId;
	private int survived, pclass, sibsp, parch;
	private double fare;
	private String name, sex, age, ticket, cabin, embarked;

	public Passenger() {
		super();
	}

	public Passenger(int survived, int pclass, int sibsp, int parch, double fare, String name, String sex, String age, String ticket, 
			String cabin, String embarked) {
		super();
		this.survived = survived;
		this.pclass = pclass;
		this.sibsp = sibsp;
		this.parch = parch;
		this.fare = fare;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.ticket = ticket;
		this.cabin = cabin;
		this.embarked = embarked;
	}
	
	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public int getSurvived() {
		return survived;
	}

	public void setSurvived(int survived) {
		this.survived = survived;
	}

	public int getPclass() {
		return pclass;
	}

	public void setPclass(int pclass) {
		this.pclass = pclass;
	}

	public int getSibsp() {
		return sibsp;
	}

	public void setSibsp(int sibsp) {
		this.sibsp = sibsp;
	}

	public int getParch() {
		return parch;
	}

	public void setParch(int parch) {
		this.parch = parch;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}
}
