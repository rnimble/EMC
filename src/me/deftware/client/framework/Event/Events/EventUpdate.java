package me.deftware.client.framework.Event.Events;

import me.deftware.client.framework.Event.Event;

public class EventUpdate extends Event {
	
	private double posX, posY, posZ;
	public float rotationYaw, rotationPitch;
	private boolean onGround;

	public EventUpdate(double posX, double posY, double posZ, float rotationYaw, float rotationPitch,
			boolean onGround) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.rotationYaw = rotationYaw;
		this.rotationPitch = rotationPitch;
		this.onGround = onGround;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public double getPosZ() {
		return posZ;
	}

	public float getRotationYaw() {
		return rotationYaw;
	}

	public float getRotationPitch() {
		return rotationPitch;
	}

	public boolean isOnGround() {
		return onGround;
	}
	
}
