/*
 * Copyright 2010 Cliff L. Biffle.  All Rights Reserved.
 * Use of this source code is governed by a BSD-style license that can be found
 * in the LICENSE file.
 */
package com.felicekarl.ardrone.managers.navdata.listeners;

public interface VelocityListener {
	void velocityChanged(float vx, float vy, float vz);
}
