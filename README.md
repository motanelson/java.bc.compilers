template java byte code assembly compiler



java -jar antlr-4.9.2-complete.jar -visitor bc.g4


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java


java -cp .:antlr-4.9.2-complete.jar Main my.bc






