package com.app.Tests.CustomAnnotation;

import java.lang.annotation.Annotation;

public class MetaAnnotationTest {
	@MetaAnnotation
	public void testAnnotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
}
