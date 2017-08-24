/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.training.workerrostering.domain;

import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class Roster {

	private RosterParametrization rosterParametrization;
	private List<Skill> skillList;
	@ProblemFactCollectionProperty
	private List<Spot> spotList;
	private List<TimeSlot> timeSlotList;

	@ValueRangeProvider(id = "employees")
	@ProblemFactCollectionProperty
	private List<Employee> employeeList;

	@PlanningEntityCollectionProperty
	private List<ShiftAssignment> shiftAssignmentList;

	private HardSoftScore score;

	private Roster() {
	}

	public Roster(RosterParametrization rosterParametrization, List<Skill> skillList, List<Spot> spotList,
			List<TimeSlot> timeSlotList, List<Employee> employeeList, List<ShiftAssignment> shiftAssignmentList) {
		this.rosterParametrization = rosterParametrization;
		this.skillList = skillList;
		this.spotList = spotList;
		this.timeSlotList = timeSlotList;
		this.employeeList = employeeList;
		this.shiftAssignmentList = shiftAssignmentList;
	}

	public RosterParametrization getRosterParametrization() {
		return rosterParametrization;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public List<Spot> getSpotList() {
		return spotList;
	}

	public List<TimeSlot> getTimeSlotList() {
		return timeSlotList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public List<ShiftAssignment> getShiftAssignmentList() {
		return shiftAssignmentList;
	}

	@PlanningScore
	public HardSoftScore getScore() {
		return score;
	}

	public void setScore(HardSoftScore score) {
		this.score = score;
	}

}
