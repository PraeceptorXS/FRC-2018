package org.usfirst.frc.team5212.autonomous.commands;

import org.usfirst.frc.team5212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReverseOrientation extends Command {

	boolean done = false;

	public ReverseOrientation() {
		super("ReverseOrientaion");
		requires(Robot.drivetrain);
	}
	// Called just before this Command runs the first time
	protected void initialize() {
		System.out.println("Reversing orientation");
	}
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		System.out.println("Actually reversing");
		Robot.drivetrain.reverseOrientaion();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
