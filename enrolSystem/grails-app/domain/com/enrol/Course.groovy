package com.enrol

class Course {
String department
String courseTitle
String courseLeader
String courseCode
Date startDate 
Date endDate
String description 
int numberofStudents
String studyMode
double tutionFees
    static constraints = {
     courseTitle blank:false, nullable:true;
department blank:false, nullable:true;
courseLeader blank:false, nullable:true;
courseCode blank:false, nullable:true;
numberofStudents blank:false, nullable:true, min:20, max:60;
startDate blank:false, nullable:true;
endDate blank:false, nullable:true;
studyMode blank:false, nullable:true,size:20;
description blank:false, nullable:true,maxSize:5000,widget:'textarea';
tutionFees blank:false, nullable:true,scale:2;
	

    }
}
