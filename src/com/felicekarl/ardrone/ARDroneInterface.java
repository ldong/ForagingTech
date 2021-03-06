package com.felicekarl.ardrone;

import com.felicekarl.ardrone.managers.navdata.listeners.*;

public interface ARDroneInterface extends UpdateAttitudeListener,
UpdateBatteryListener, UpdateGpsListener, UpdateMagnetoListener, UpdateStateListener, UpdateVelocityListener{
	// connection
	public boolean connect();
	public boolean connectVideo();
	public boolean connectNav();
	public void disconnect();
	public void start();
	public void stop();

	// camera
	public void setHorizontalCamera();// setFrontCameraStreaming()
	public void setVerticalCamera();// setBellyCameraStreaming()
	public void toggleCamera();

	// control command
	public void landing();
	public void takeOff();
	public void reset();
	public void move3D(int speedX, int speedY, int speedZ, int speedSpin);
	public void move3DNav(int speedX, int speedY, int speedZ, int speedSpin);
	
	public enum ARDroneVersion {
		ARDRONE1, ARDRONE2
	}
	
	public enum ARDroneCameraMode {
		FRONT_CAMERA, BOTTOM_CAMERA
	}
}