package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
@Entity
@Table(name="employee1")
public class Employee implements Serializable{
	
@Id
@Column(name="id")
    private long empno;
@Column(name="ename")
    private String ename;
@Column(name="sal")
    private int sal;
@Column(name="job")
    private String job;
@Column(name="deptno")
    private int deptno ;
    public long getEmpno() {
        return empno;
    }
     public void setEmpno(long empno) {
        this.empno = empno;
    }
      public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}