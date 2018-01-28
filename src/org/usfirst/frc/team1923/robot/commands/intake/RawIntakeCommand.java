package org.usfirst.frc.team1923.robot.commands.intake;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1923.robot.Robot;

public class RawIntakeCommand extends Command {

    public RawIntakeCommand() {
        this.requires(Robot.intakeSubsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        Robot.intakeSubsystem.intakeLeft(Robot.oi.operator.getLeftY());
        Robot.intakeSubsystem.intakeRight(Robot.oi.operator.getRightY());
    }

    @Override
    public void end() {
        Robot.intakeSubsystem.stop();
    }

    @Override
    public void interrupted() {
        Robot.intakeSubsystem.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}
