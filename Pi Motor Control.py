import RPi.GPIO as GPIO
from pyPS4Controller.controller import Controller

# Motor GPIO Pins (CHANGE THIS DO NOT FORGET AND FREAK OUT FUTURE ME)
LEFT_MOTOR_FORWARD = 17
LEFT_MOTOR_BACKWARD = 27
RIGHT_MOTOR_FORWARD = 22
RIGHT_MOTOR_BACKWARD = 23

# Setup GPIO mode
GPIO.setmode(GPIO.BCM)
GPIO.setup([LEFT_MOTOR_FORWARD, LEFT_MOTOR_BACKWARD, RIGHT_MOTOR_FORWARD, RIGHT_MOTOR_BACKWARD], GPIO.OUT)

# Initialize motor signals to False
GPIO.output([LEFT_MOTOR_FORWARD, LEFT_MOTOR_BACKWARD, RIGHT_MOTOR_FORWARD, RIGHT_MOTOR_BACKWARD], False)

def drive_motor(motor_pins, state):
    GPIO.output(motor_pins, state)

class MyController(Controller):

    def on_L3_up(self, value):
        drive_motor([LEFT_MOTOR_FORWARD, RIGHT_MOTOR_FORWARD], True)
    
    def on_L3_down(self, value):
        drive_motor([LEFT_MOTOR_BACKWARD, RIGHT_MOTOR_BACKWARD], True)

    def on_L3_y_at_rest(self):
        # Stop the motors when the stick is at rest
        drive_motor([LEFT_MOTOR_FORWARD, LEFT_MOTOR_BACKWARD, RIGHT_MOTOR_FORWARD, RIGHT_MOTOR_BACKWARD], False)

controller = MyController(interface="/dev/input/js0", connecting_using_ds4drv=False)
controller.listen(timeout=60)

# Cleanup GPIO pins on exit
GPIO.cleanup()
