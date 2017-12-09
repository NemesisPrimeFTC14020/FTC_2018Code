package org.firstinspires.ftc.teamcode.OpModes;

    import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
    import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
    import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

    import org.firstinspires.ftc.teamcode.subsystems.BoxManipulator;
    import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;
    import org.firstinspires.ftc.teamcode.subsystems.RelicManipulator;

    import java.sql.Time;


/**
 * Created by Chinmay on 12/9/2017.
 */

@Autonomous(name="Nemesis Prime Blue Right Auto", group="Ares Auto")
public class AutoBlueRight extends LinearOpMode {

    private DriveTrain driveTrain;
    private BoxManipulator boxManipulator;
    private RelicManipulator relicManipulator;
    //private Arm arm;

    @Override
    public void runOpMode() throws InterruptedException {
        //init all systems
        driveTrain = DriveTrain.getNewDriveInstance(hardwareMap);
        boxManipulator = BoxManipulator.getNewBoxManipulatorInstance(hardwareMap);
        relicManipulator = RelicManipulator.getNewRelicManipulatorInstance(hardwareMap);
        //arm = Arm.getNewArm(hardwareMap);

        //set system stops
        driveTrain.setStop();
        boxManipulator.setStop();
        relicManipulator.setStop();
        //arm.setStop();

        //arm.setArmExtended();
//        if(arm.seesRed()) {
//            driveTrain.updateDrive(0,0,0.5);
//            driveTrain.update();
//            sleep(10);
//            driveTrain.setStop();
//        }
        //turn right/left accordingly

        //turn towards safe zone (right)
        //forward until in zone (sleep for 5k milliseconds?)
    }

}