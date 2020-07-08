package turtlebot3_example;

public interface Turtlebot3ActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot3_example/Turtlebot3ActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nturtlebot3_example/Turtlebot3Result result";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  turtlebot3_example.Turtlebot3Result getResult();
  void setResult(turtlebot3_example.Turtlebot3Result value);
}
