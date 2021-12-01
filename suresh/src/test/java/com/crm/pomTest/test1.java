package com.crm.pomTest;

import org.testng.annotations.Test;

import com.crm.pom.pomPage;

import Base.baseclass;

public class test1 extends baseclass {
@Test
	public void tc1() {
pomPage pp=new pomPage(driver);
pp.orgs();

}
@Test
public void tc2() {
	pomPage pp=new pomPage(driver);
	pp.led();
}


}