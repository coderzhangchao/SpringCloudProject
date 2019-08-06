package com.zhangchao.entities;

import java.io.Serializable;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import lombok.experimental.Accessors;

//@SuppressWarnings("serial")
//@AllArgsConstructor     全参构造方法
//@NoArgsConstructor      无参构造
//@Data                   get、set方法 
//@ToString               toString方法
//@Accessors(chain=true)  链式写法
public class Dept implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7565517769925108486L;

	private Long deptno; // 主键
	
	private String 	dname;  // 部门名称
	
	private String 	db_source;

	public Dept() {
		super();
	}

	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
	}
	
}
