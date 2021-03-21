package com.carrot.personal.aspects;

import com.carrot.personal.utils.DataTrackHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DataTrackAspect {

    @Around("@annotation(com.carrot.personal.aspects.DataTrackEnabled)")
    public Object performAspect(ProceedingJoinPoint joinPoint, DataTrackEnabled dataTrackEnabled) throws Throwable {

        Object result = joinPoint.proceed();
        DataTrackHelper dataTrackHelper = new DataTrackHelper();
        dataTrackHelper.recordInstanceCount(dataTrackEnabled.dataClass(), dataTrackEnabled.dataName(), dataTrackEnabled.instance());
        return result;
    }
}
