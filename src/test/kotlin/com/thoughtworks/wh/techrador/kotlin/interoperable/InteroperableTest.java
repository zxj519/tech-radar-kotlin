package com.thoughtworks.wh.techrador.kotlin.interoperable;


import com.thoughtworks.wh.techrador.kotlin.dataclass.Gender;
import com.thoughtworks.wh.techrador.kotlin.dataclass.KPerson;
import org.junit.Assert;
import org.junit.Test;

public class InteroperableTest {
  @Test
  public void testKotlinDataClass(){
    KPerson kPerson = new KPerson("Xunjie", "Zhou", Gender.MALE, 18);
    Assert.assertEquals("KPerson(firstName=Xunjie, lastName=Zhou, gender=MALE, age=18)", kPerson.toString());
  }

  @Test
  public void testKotlinExtension() {
    KPerson kPerson = new KPerson("Xunjie", "Zhou", Gender.MALE, 18);

  }
}
