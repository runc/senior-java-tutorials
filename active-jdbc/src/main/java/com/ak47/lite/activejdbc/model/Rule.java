package com.ak47.lite.activejdbc.model;

import org.javalite.activejdbc.Model;

public class Rule extends Model{

    public Rule() {
    }

    public Rule(String role,String createdBy){
        set("rule_name",role);
        set("created_by",createdBy);
    }

}
