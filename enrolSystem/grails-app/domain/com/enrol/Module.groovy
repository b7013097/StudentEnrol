package com.enrol

class Module {
String module_title
String module_code
int credits
String lecturer
String course
String description

    static constraints = {
module_title blank:false, nullable:true;
module_code blank:false, nullable:true;
credits blank:false, nullable:true, min:20, max:120;
lecturer blank:false, nullable:true;
course blank:false, nullable:true;
description blank:false, nullable:true,maxSize:5000, widget:'textarea';

}
}
