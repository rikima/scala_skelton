package com.rikima

import java.sql.{DriverManager, Connection, Statement, ResultSet, SQLException}

object ExecHql {
    /**
     * execute sql or hql
     */
    def execute(stmt: Statement, hql: String) {
        hql.split(";").foreach {
            (hql_fragment) => {
                if (hql_fragment.trim().length() > 0) {
                    if (hql_fragment.toLowerCase startsWith "select") {
                        stmt.executeUpdate(hql_fragment.trim());
                    } else {
                        var rs = stmt.executeQuery(hql_fragment.trim());
                        while (rs.next()){
                            
                        }
                    }
                }
            }
        }
    }
    
    /**
     * main
     */
    def main(args : Array[String]) {
    	println("1\n\ttest")
    }
}
