package com.web.entropy.backend.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.web.entropy.backend.services.AdminitratorService;

@Controller

public class AdminitratorController {
	@Autowired
	private AdminitratorService adminitratorService;

}
