package org.learnwithllew.testinglegacycodecourse.exercise2;

class SystemConfiguration {

    public static int rpm = 4000;
    public static double dt = 0.01;
    public static double x = 0;
    public static double y = 0;
    public static double z = 0;
    public static double x_mph = 1;
    public static double y_mph = 2;
    public static double z_mph = 3;
    public static boolean gravity = true;
    public static double y_torque = 3.2;

    public static void initialiseSystem()
    {
        if ( gravity )
        {
            double dx = x_mph / (60 * 60 * rpm);
            double dy = y_mph / (60 * 60 * rpm);
            for ( int i = 1; i <= rpm / 60; ++i)
            {
                x += dt * dx;
                y += dt * dy;
                z += dt * z_mph / (60 * 60 * rpm);
            }
        }
        else
        {
            double dx = x_mph / (60 * 60 * rpm);
            double dy = y_mph / (60 * 60 * rpm);
            for ( int i = 1; i <= rpm / 60; i++)
            {
                x += dt * dx;
                y += dt * dy;
            }
        }
    }
}
