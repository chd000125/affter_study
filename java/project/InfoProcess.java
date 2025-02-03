package com.company.project;

import java.util.ArrayList;

public interface InfoProcess{ 
	void exec( ArrayList<Info> users );
	void exec( ArrayList<Info> users , View_crud crud );
	
}