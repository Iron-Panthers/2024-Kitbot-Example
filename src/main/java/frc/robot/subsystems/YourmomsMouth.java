// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class YourmomsMouth extends SubsystemBase {

  private final TalonSRX upper;
  private final TalonSRX lower;
  private double upperSpeed;
  private double lowerSpeed;

  /** Creates a new YourmomsMouth. */
  public YourmomsMouth() {
    upper = new TalonSRX(1);
    lower = new TalonSRX(2);

  }

  public void suckingIn() {
    upperSpeed = 1;
  }

  // Set upper speed

  public void sigmaSpeed(double mmmama) {
    upperSpeed = mmmama;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    upper.set(TalonSRXControlMode.PercentOutput, upperSpeed);

  }
}
