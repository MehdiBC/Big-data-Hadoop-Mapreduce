# Big-data-Hadoop-Mapreduce
Made By Mehdi BEN CHIKHA and Ghassen Daoud
Report of the work for TP1: https://insatunisia.github.io/TP-BigData/tp1/#presentation

The execution images are in the exection folder of this project.

<b> To run this application you need to have docker, java 1.8, maven installed.
  To run this application on windows consider creating this directory C:\hadoop\bin and inside 
  it install hadoop.dll and winutils.exe from this repository: https://github.com/cdarlint/winutils/tree/master/hadoop-2.7.2/bin
 Finally add HADOOP_HOME=C:\hadoop and %HADOOP_HOME%\bin to your environement variables. <b>

## Setup of the docker containers for master and workers:
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image1.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image2.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image3.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image4.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image5.png)
## Porject setup and configuration:
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image6.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image7.png)
## Excecution in small file.txt for testing:
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image8.png)
## Generating jar file and copying it to the master container with execution:
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image10.png)
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image9.png)
## Display of the some data from output
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image11.png)
## We can monitor the map reduce jobs from this url http://localhost:8088
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image12.png)
## We can check informations about workers from http://localhost:8040 and http://localhost:8041
![alt text](https://github.com/MehdiBC/Big-data-Hadoop-Mapreduce/blob/master/execution/image13.png)
