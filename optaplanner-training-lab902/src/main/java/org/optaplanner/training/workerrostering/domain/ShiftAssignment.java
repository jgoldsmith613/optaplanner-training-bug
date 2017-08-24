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

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class ShiftAssignment {

    private final Spot spot;
    private final TimeSlot timeSlot;

    private boolean lockedByUser = false;

    @PlanningVariable(valueRangeProviderRefs="employees")
    private Employee employee = null;

    private ShiftAssignment() {
        spot = null;
        timeSlot = null;
    }

    public ShiftAssignment(Spot spot, TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
        this.spot = spot;
    }

    public Spot getSpot() {
        return spot;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public boolean isLockedByUser() {
        return lockedByUser;
    }

    public void setLockedByUser(boolean lockedByUser) {
        this.lockedByUser = lockedByUser;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return spot + " " + timeSlot;
    }

}
