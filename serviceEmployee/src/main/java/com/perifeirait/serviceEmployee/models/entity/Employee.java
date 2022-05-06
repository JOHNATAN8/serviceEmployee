package com.perifeirait.serviceEmployee.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import lombok.Data;


@Entity
@Table(name="EMPLOYEE")
//@Data 
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false, length = 8)
	private Integer id;

	@Column(name = "EMP_NAME", length = 20)
	private String empName;

	@Column(name = "PASSWORD", length = 20)
	private String password;
	
	@Column(name = "GENDER", length = 20)
	private String gender;

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY")
	private Date birthday;

	@Column(name="DEP_ID", length = 8)
	private Integer depId;
	
	@Column(name="IMP_ROLE_ID", length = 8)
	private Integer impRoleId;
	
	@Column(name="RANK", length = 8)
	private Integer rank;
	
	@Column(name = "TEL", length = 20)
	private String tel;
	
	@Column(name = "EMAIL", length = 30)
	private String email;
	
	@Column(name = "INFO", length = 200)
	private String info;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public Integer getImpRoleId() {
		return impRoleId;
	}

	public void setImpRoleId(Integer impRoleId) {
		this.impRoleId = impRoleId;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}