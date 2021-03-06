package com.example.demo.security;

public enum ApplicationUserPermission {
	USER_READ("user:read"), USER_WIRTE("user:write"), COURSE_READ("course:read"),
	COURSE_WRITE("course:write");

	private final String permission;

	ApplicationUserPermission(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}

}
