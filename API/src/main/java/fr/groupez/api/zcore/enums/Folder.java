package fr.groupez.api.zcore.enums;

public enum Folder {

	UTILS,

	;
	

	public String toFolder(){
		return name().toLowerCase();
	}
	
}
