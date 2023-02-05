package com.zohocrm.service;

import com.zohocrm.entities.Lead;

import java.util.List;

public interface LeadService {
	public void saveOneLead(Lead lead);
	public Lead getLeadById(long id);
	public void deleteLeadById(long id);
	public List<Lead> getAllLeads();

}
