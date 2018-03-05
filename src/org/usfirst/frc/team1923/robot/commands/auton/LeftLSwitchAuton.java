package org.usfirst.frc.team1923.robot.commands.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1923.robot.autonomous.Autonomous;
import org.usfirst.frc.team1923.robot.commands.drive.DriveTrajectoryCommand;
import org.usfirst.frc.team1923.robot.commands.elevator.ElevatorPositionCommand;
import org.usfirst.frc.team1923.robot.commands.intake.IntakeOutputCommand;
import org.usfirst.frc.team1923.robot.utils.pathfinder.TrajectoryStore;

@Autonomous(
        name = "Left Left-Switch",
        description = "Starting from the left, place a cube in the left switch",
        startingPosition = Autonomous.Side.LEFT,
        fieldConfigurations = { Autonomous.FieldConfiguration.LLL, Autonomous.FieldConfiguration.LRL },
        defaultPriority = 75
)
public class LeftLSwitchAuton extends CommandGroup {

    public LeftLSwitchAuton() {
        this.addParallel(new DriveTrajectoryCommand(TrajectoryStore.Waypoints.LEFT_LSWITCHLAYUP));
        this.addSequential(new ElevatorPositionCommand(ElevatorPositionCommand.ElevatorPosition.SWITCH));
        this.addSequential(new IntakeOutputCommand(-1.0));
    }

}
