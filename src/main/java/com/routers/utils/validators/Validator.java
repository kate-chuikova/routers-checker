package com.routers.utils.validators;

/**
 * Created by shulg95 on 08.05.2017.
 */
public interface Validator<T> {
    boolean validate(T data);
}
