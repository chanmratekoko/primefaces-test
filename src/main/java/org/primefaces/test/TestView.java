package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
    
    private String testString;
    
    private String name;
    
    private String expected;
    
    @PostConstruct  
    public void init() {
        testString = "Keyboard: Unicode Character does not support at p:keyboard in attribute layoutTemplate #3487!!!";
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}
    
}
