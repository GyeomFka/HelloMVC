package com.cnc.HelloMVC.entity;

import org.springframework.beans.factory.annotation.Required;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class User {
	private final Long id;
	private final String name;
}
