# TDT4250 Assignment 3 

This is based on model from exercise 1: https://github.com/martheab/TDT4250-studyprogram with the following improvements: 
* Constraint for checking duplicate semesters within programmes and specialisations.
* Constraint that checks for too many obligatory courses each semester. 
* New reference that allows specialisations to own other specialisations.  
* Improved model-instance. 

We did a model to text transformation using Acceleo. To generate the HTML run EcoreToHtml.mtl with the following configurations: 
* Main class should be EcoreToHtml. 
* Model should be Department.xmi
* Target can be set to whereever.
* The runner must be Java Application, NOT Acceleo Plugin.

There is a generated HTML file included:  https://github.com/martheab/model-to-text/blob/master/org.eclipse.acceleo.tdt4250.assignment3/target/Institutt%20for%20datateknologi%20og%20informatikk.html

