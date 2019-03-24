# Kafka

 nohup ./bin/zookeeper-server-start.sh ./config/zookeeper.properties &
 
 tail -f nohup.out
 
 nohup bin/kafka-server-start.sh config/server.properties &
 
 tail -f nohup.out
 
 bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
 
 nohup bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test &
 
 tail -f nohup.out
 
 bin/kafka-topics.sh --list --zookeeper localhost:2181


