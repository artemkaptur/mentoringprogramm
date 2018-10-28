package com.epam.mentoringprogramm.listener;

import com.epam.mentoringprogramm.annotations.IgnoreThisTest;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomTransformer implements IAnnotationTransformer {
    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {

        if (testMethod.isAnnotationPresent(IgnoreThisTest.class)){
            annotation.setEnabled(false);
        }
    }
}
