package org.team4.upcomingevents.generics;

public interface IGenericEditService<T,R> {
    
    R save(T type) throws Exception;

}
