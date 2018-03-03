package org.usfirst.frc.team1923.robot.commands.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1923.robot.autonomous.Autonomous;
import org.usfirst.frc.team1923.robot.commands.drive.DriveTrajectoryCommand;
import org.usfirst.frc.team1923.robot.commands.elevator.ElevatorPositionCommand;
import org.usfirst.frc.team1923.robot.commands.intake.IntakeOutputCommand;
import org.usfirst.frc.team1923.robot.utils.pathfinder.TrajectoryStore;

@Autonomous(
        name = "Right Right-Switch",
        description = "Starting from the right, place a cube in the right switch",
        startingPosition = Autonomous.Side.RIGHT,
        fieldConfigurations = { Autonomous.FieldConfiguration.RRR, Autonomous.FieldConfiguration.RLR },
        defaultPriority = 75
)
public class RightRSwitchAuton extends CommandGroup {

    public RightRSwitchAuton() {
        this.addParallel(new DriveTrajectoryCommand(TrajectoryStore.Waypoints.LEFT_LSWITCHLAYUP));
        this.addSequential(new ElevatorPositionCommand(ElevatorPositionCommand.ElevatorPosition.SWITCH));
        this.addSequential(new IntakeOutputCommand(-1.0));
    }

}
