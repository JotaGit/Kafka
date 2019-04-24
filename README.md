# Kafka

 nohup ./bin/zookeeper-server-start.sh ./config/zookeeper.properties &
 
 tail -f nohup.out
 
 nohup ./bin/kafka-server-start.sh config/server.properties &
 
 tail -f nohup.out
 
 ./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic topico
 
 ./bin/kafka-topics.sh --list --zookeeper localhost:2181
 
 Port 9092 is the default port of kafka server
 ./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topico --from-beginning
 
 ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic topico



# Confluent
nohup ./bin/zookeeper-server-start ./etc/kafka/zookeeper.properties &

./bin/kafka-console-consumer --topic topico --bootstrap-server localhost:2181 --from-beginning