package com.saraya.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.saraya.dto.PlanDTO;

import com.saraya.repository.PlanRepository;



@Service

public class PlanService {

	@Autowired

	private PlanRepository planRepository;

	// methods fetchPlans() and plansLocalRate() go here



	public PlanDTO fetchPlanById(int planId) {

		return planRepository.fetchPlanById(planId);

	}

}
