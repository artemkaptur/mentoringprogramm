package com.epam.mentoringprogramm.listener;

import com.epam.mentoringprogramm.annotations.IgnoreThisTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomTransformer implements IAnnotationTransformer {

    private static Logger logger = LogManager.getLogger();

    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {

        if (testMethod.isAnnotationPresent(IgnoreThisTest.class)){
            annotation.setEnabled(false);
        }

        StringBuilder usedAnnotations = new StringBuilder();

        for(Annotation ann: testMethod.getAnnotations())
        {
            usedAnnotations.append(ann.toString()).append(", ");
        }

        logger.info(testMethod.getName() + " gets annotations: " + usedAnnotations);

    }

}
