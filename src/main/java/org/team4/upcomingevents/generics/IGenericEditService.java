package org.team4.upcomingevents.generics;

public interface IGenericEditService<T1,T2> {
    
    T2 save(T1 type) throws Exception;

}
