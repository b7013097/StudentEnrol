package com.enrol

class Lecturer {
String fullname
String post
String subject
String lecturerEmail
String office
String bio
    static constraints = {
fullname nullable:true, blank:false;
post nullable:true, blank:false;
subject nullable:true, blank:false;
lecturerEmail nullable:true, blank:false,email:true;
office nullable:true,blank:false;
bio nullable:true, blank:false, maxSize:5000,widget:'textarea';
    }
}
