# Springboot-rabbitmq-producer

# Setup RabbitMQ server on local machine. 
Local machine setup: rabbitmq.com : https://www.rabbitmq.com/install-windows.html
RabbitMQ requires a 64-bit supported version of Erlang for Windows to be installed : this should be download from another source. 
https://www.erlang.org/downloads : 64bit
Rabbit MQ Download : Installer for Windows systems (from GitHub, recommended) rabbitmq-server-3.8.8.exe Signature

Please run RabbitMQ cmd line path : C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.8\sbin
Run command : rabbitmq-plugins enable rabbitmq_management

RabbitMQ console : http://localhost:15672/
username default : guest
password default : guest

Otherway to enbale RabbitMQ , we can use Docker Cotainer to use the RabbitMQ image. 

Checkout the socure code and run, you can simply hit the Get endpoint. 
