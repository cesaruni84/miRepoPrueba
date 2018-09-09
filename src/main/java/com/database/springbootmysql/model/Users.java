package com.database.springbootmysql.model;

public class Users {
	
	
	private Integer id;
	private String name;
	private String teamname;
	private Integer salary;
	/**
	 * 
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the teamname
	 */
	public String getTeamname() {
		return teamname;
	}
	/**
	 * @param teamname the teamname to set
	 */
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	

}
