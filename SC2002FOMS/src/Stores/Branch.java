package Stores;

import Enums.BranchStatus;

public class Branch {

	private String name;
	private String location;
	private int staffQuota;
	private BranchStatus branchStatus;

	public Branch(String name, String location, int staffQuota, BranchStatus branchStatus) {
		this.name = name;
		this.location = location;
		this.staffQuota = staffQuota;
		this.branchStatus = branchStatus.OPEN;
	}

	public void setStaffQuota(String branch) // not sure if this is needed tho
	{
		this.staffQuota = staffQuota;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getStaffQuota() {
		return staffQuota;
	}

	public boolean equals(Object o) {
		if (o instanceof MenuItem)
			;
		{
			MenuItem m = (MenuItem) o;
			return (getName().equals(m.getName()));
		}
	}

	public void setBranchStatus(int a) {
		if (a == 1)
			this.branchStatus = branchStatus.OPEN;
		else
			this.branchStatus = branchStatus.CLOSED;
	}

	public boolean isOpen() {
		if (this.branchStatus == branchStatus.OPEN) {
			return true;
		} else
			return false;
	}

}
