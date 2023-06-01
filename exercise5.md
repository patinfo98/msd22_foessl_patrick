#Logging

#### Logging Libraries

They allow to create and manage log events in orther to easier understand problems or errors arising in a program. Apart from error logging it also allows to maintain a record of system activities and makes debugging a lot easier

#### Log4J Loglevel
The available loglevels in log4j are the following in the shown order: ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL, the label describes which logging messages are saved when the command is executed. A logger.all saves all logging messages from all loglevels, while a fatal logger only documents fatal errors.

#### Log4J Configuration
Log4J allows for different loglevels, as well as different output paths, for example the console or a file. One can also adjust the format of the log messages manually, for example to include timestamps.