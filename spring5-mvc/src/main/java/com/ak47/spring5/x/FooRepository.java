package com.ak47.spring5.x;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FooRepository extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {

}
