package build.gui.controller;

import RootElement.Staff;
import RootElement.SysAdmin;

public class User {

	private static final User DEFAULT_USER = new User(null, null, null, WorkRole.NONE);
	
	private static User currentUser;
	
	private String staffID;
	private Staff staff;
	private SysAdmin sysAdmin;
	private WorkRole workRole = WorkRole.NONE;
	
	private User(String staffID, Staff s, SysAdmin a, WorkRole role){
		this.staffID = staffID;
		this.staff = s;
		this.sysAdmin = a;
		this.workRole = role;
	}
	
	public static User getCurrentUser(){
		return (currentUser==null?DEFAULT_USER:currentUser);
	}
	
	public static void setCurrentUser(String staffID, Staff s, SysAdmin a, WorkRole role){
		currentUser = new User(staffID, s, a, role);
	}
	
	public String getStaffID(){
		return staffID;
	}
	
	public Staff getStaff(){
		if(staff == null){
			throw new IllegalStateException("This user has no staff permissions");
		}
		return staff;
	}
	
	public SysAdmin getSysAdmin(){
		if(sysAdmin == null){
			if(staff instanceof SysAdmin){
				return (SysAdmin)staff;
			}else{
				throw new IllegalStateException("This user has no staff permissions");
			}
		}
		
		return sysAdmin;
	}
	
	public WorkRole getWorkRole(){
		return workRole;
	}
	
	public boolean hasPermission(WorkRole role){
		if(role == WorkRole.SYSADMIN){
			return role.adminPrio <= workRole.adminPrio;
		}else{
			return role.staffPrio <= workRole.staffPrio;
		}
	}
	
	public enum WorkRole{
		MANAGER("MA", 10, 2),
		CLERK("CL", 7, 0),
		STAFF("ST", 4, 0),
		SYSADMIN("SA", 0, 2),
		NONE("NO", 0, 0);
		
		private String shortName;
		private int staffPrio;
		private int adminPrio;
		private WorkRole(String shortName, int staffPrio, int adminPrio){
			this.shortName = shortName;
			this.staffPrio = staffPrio;
			this.adminPrio = adminPrio;
		}
		
		static WorkRole getWorkRole(String shortName){
			for(WorkRole wr : WorkRole.values()){
				if(wr.shortName.equals(shortName)){
					return wr;
				}
			}
			
			return NONE;
		}
	}
}
