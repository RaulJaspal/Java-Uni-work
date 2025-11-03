public class Course {	  	    		        	    		      	
	  	    		        	    		      	
    private Lecturer lecturer;	  	    		        	    		      	
    public Lecturer getLecturer() {	  	    		        	    		      	
        return lecturer;	  	    		        	    		      	
    }	  	    		        	    		      	
    public void setLecturer(Lecturer lecturer) {	  	    		        	    		      	
        this.lecturer = lecturer;	  	    		        	    		      	
    }	  	    		        	    		      	
    public Module[] getModules() {	  	    		        	    		      	
        return modules;	  	    		        	    		      	
    }	  	    		        	    		      	
    public void setModules(Module[] modules) {	  	    		        	    		      	
        this.modules = modules;	  	    		        	    		      	
    }	  	    		        	    		      	
    public String getName() {	  	    		        	    		      	
        return name;	  	    		        	    		      	
    }	  	    		        	    		      	
    public void setName(String name) {	  	    		        	    		      	
        this.name = name;	  	    		        	    		      	
    }	  	    		        	    		      	
    public String getDepartment() {	  	    		        	    		      	
        return department;	  	    		        	    		      	
    }	  	    		        	    		      	
    public void setDepartment(String department) {	  	    		        	    		      	
        this.department = department;	  	    		        	    		      	
    }	  	    		        	    		      	
    public int getDurationInYears() {	  	    		        	    		      	
        return durationInYears;	  	    		        	    		      	
    }	  	    		        	    		      	
    public void setDurationInYears(int durationInYears) {	  	    		        	    		      	
        this.durationInYears = durationInYears;	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
    public void setStudents(Student[] students)	  	    		        	    		      	
    {	  	    		        	    		      	
      this.students = students;	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
    public Student[] getStudents()	  	    		        	    		      	
    {	  	    		        	    		      	
      return students;	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
    private Module[] modules;	  	    		        	    		      	
    private String name;	  	    		        	    		      	
    private String department;	  	    		        	    		      	
    private int durationInYears;	  	    		        	    		      	
    private Student[] students;	  	    		        	    		      	
	  	    		        	    		      	
}