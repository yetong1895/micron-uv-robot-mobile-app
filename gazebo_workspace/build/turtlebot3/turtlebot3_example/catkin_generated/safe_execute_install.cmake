execute_process(COMMAND "/home/e0325555/Desktop/Micron/gazebo_workspace/build/turtlebot3/turtlebot3_example/catkin_generated/python_distutils_install.sh" RESULT_VARIABLE res)

if(NOT res EQUAL 0)
  message(FATAL_ERROR "execute_process(/home/e0325555/Desktop/Micron/gazebo_workspace/build/turtlebot3/turtlebot3_example/catkin_generated/python_distutils_install.sh) returned error code ")
endif()
