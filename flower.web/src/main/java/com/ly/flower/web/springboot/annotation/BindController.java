package com.ly.flower.web.springboot.annotation;
import org.springframework.web.bind.annotation.RequestMethod;


public @interface BindController {
  String value() default "@RestController";
  String type() default "@RequestMapping";
  String path();
  RequestMethod method();
  Class<?> paramClass() default Void.class;
}