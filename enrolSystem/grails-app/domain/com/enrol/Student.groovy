package com.enrol

class Student {
String studentName
String studentID
Date dob
Boolean isFundingAvailable
String studentEmail
String studentUsername
String studentPassword
String course

    static constraints = {
    studentName blank:false, nullable:true;
studentID blank:false, nullable:true;
dob blank:false, nullable:true;
isFundingAvailable blank:false, nullable:true;
studentEmail blank:false, nullable:true,email:true;
studentUsername blank:false, nullable:true,unique:true;
studentPassword blank:false, nullable:true;
course blank:false, nullable:true;
    }
}
