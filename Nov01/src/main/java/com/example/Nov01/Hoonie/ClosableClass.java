package com.example.Nov01.Hoonie;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class ClosableClass implements AutoCloseable {
	private String filePath;
	
	@Override
	public void close() throws Exception {
		this.filePath = null;
	}

}
