package org.usfirst.frc.team1923.robot.commands.elevator;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1923.robot.Robot;

public class ElevatorMoveCommand extends Command {

    private double out;

    public ElevatorMoveCommand(double out, double timeout) {
        this.requires(Robot.elevatorSubsystem);

        this.out = out;
        this.setTimeout(timeout);
    }

    @Override
    protected void execute() {
        Robot.elevatorSubsystem.set(ControlMode.PercentOutput, this.out);
    }

    @Override
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    @Override
    protected void end() {
        Robot.elevatorSubsystem.stop();
    }

    @Override
    protected void interrupted() {
        this.end();
    }

}
