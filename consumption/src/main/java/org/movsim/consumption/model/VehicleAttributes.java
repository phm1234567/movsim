/*
 * Copyright (C) 2010, 2011, 2012 by Arne Kesting, Martin Treiber, Ralph Germ, Martin Budden
 * <movsim.org@gmail.com>
 * -----------------------------------------------------------------------------------------
 * 
 * This file is part of
 * 
 * MovSim - the multi-model open-source vehicular-traffic simulator.
 * 
 * MovSim is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * MovSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MovSim. If not, see <http://www.gnu.org/licenses/>
 * or <http://www.movsim.org>.
 * 
 * -----------------------------------------------------------------------------------------
 */
package org.movsim.consumption.model;

import org.movsim.consumption.autogen.VehicleData;

public class VehicleAttributes {

    /** mass of vehicle (kg) */
    private final double mass;

    /** hydrodynamical cd-value (dimensionless) */
    private final double cdValue;

    /** front area of vehicle (m^2) */
    private final double crossSectionSurface;

    /** constant friction coefficient (dimensionless) */
    private final double constantFrictionCoefficient;

    /** friction coefficient prop to v (s/m) */
    private final double speedFrictionCoefficient;

    /** power for electrical consumption (W) */
    private final double electricPower;

    public VehicleAttributes(VehicleData vehicle) {
        mass = vehicle.getMass();
        cdValue = vehicle.getCdValue();
        crossSectionSurface = vehicle.getCrossSectionSurface();
        constantFrictionCoefficient = vehicle.getConstFriction();
        speedFrictionCoefficient = vehicle.getVFriction();
        electricPower = vehicle.getElectricPower();
    }

    public double electricPower() {
        return electricPower;
    }

    public double mass() {
        return mass;
    }

    public double cwValue() {
        return cdValue;
    }

    public double crossSectionSurface() {
        return crossSectionSurface;
    }

    public double constantFrictionCoefficient() {
        return constantFrictionCoefficient;
    }

    public double speedFrictionCoefficient() {
        return speedFrictionCoefficient;
    }

}
