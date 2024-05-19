# Automated Bottling System (ABS)
Group project using SystemJ and Java for COMPSYS 704 Advanced Embedded Systems in 2023.
A group project where we developed an Automated Bottling System, ABS, (manufacturing component). This bottles the liquids produced by mixing two 
or more liquids based on customised recipes under strictly controlled environmental conditions and keeps 
them in strictly controlled climate environment before shipping them to the customers.

We have also individually created subsystems for Environment Control System (ECS), Access and Control System (ACS) and Product Order System (POS).

- ECS: Controls environmental conditions (temperature, humidity and cleanliness, as well as lighting conditions) in manufacturing and office sections of the facility, as well as control the conditions for storage of bottled products before delivery. Implemented by Shou.
- ACS: Controls presence of people in both major sections of the facility and enforces both safety and security measures according to the adopted regulations and monitors safety of the environment in terms of presence of fire, humans in certain areas, etc. Implemented by Anthony.
- POS: Accepts the orders from the trusted (registered) customers through an automated online system and launches and schedules the production automatically. Implemented by Rachel.

# Contributors
- [Anthony Mulder](https://github.com/amul339)
- [Shou Miyamoto](https://github.com/sm43576)
- [Rachel Nataatmadja](https://github.com/rnat697)

# Requirements
- jre1.8
- javafx libaries(latest builds from 2020 onwards)
- Build the ABS system using the build all file provided and jre 1.8 and then refresh.
- sysjetnapi (contained in the lab files.)


# Steps:
After that in no determinant order using run configurations:
- The ABS Plant.sysj
- ABS controller.sysj
- ABS_UI- main.java
- POS- main.java


# Notes:
Make sure to hit enter for the order systems, bottle and liquid capacity.
