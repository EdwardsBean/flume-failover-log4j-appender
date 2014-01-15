FlumeFailoverLog4jAppender
==========================
This is a log4j appender base on flume FailoverRpcClient.
You can set MaxAttempts and Hosts in log4j.xml.
I use Log4j AsyAppender to load my FailoverAppender, keep off blocking.
more information see:
http://edwardsbean.github.io/
