package org.usfirst.frc1922.TinManIX2.commands;

import org.usfirst.frc1922.TinManIX2.Robot;
import org.usfirst.frc1922.TinManIX2.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SolenoidToggle2 extends Command {

    public SolenoidToggle2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(RobotMap.pneumaticsSolenoid2.get() == true){
    		RobotMap.pneumaticsSolenoid2.set(false);
    	}
    	else if(RobotMap.pneumaticsSolenoid2.get() == false){
    		RobotMap.pneumaticsSolenoid2.set(true);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
