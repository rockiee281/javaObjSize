get java object size on your machine. execute this command on your folder and see what will hapen

```
javac ObjectSizeFetcher.java && jar cvfm test.jar manifest.mf ObjectSizeFetcher.class && java -javaagent:test.jar -cp test.jar ObjectSizeFetcher
```

on CentOS 64 server, java version: 
```
java version "1.7.0_05"
Java(TM) SE Runtime Environment (build 1.7.0_05-b06)
Java HotSpot(TM) 64-Bit Server VM (build 23.1-b03, mixed mode)
```

And we can find some output info like this:
```
empyt hashmap size:48
empty hashset size:16
empty arraylist size:24
empty LinkedList size:32
empty String size:32
empty String[] size:16
String[1] size:24
int[0] size:16
int[1] size:24
int[2] size:24
int[3] size:32
int[4] size:32
```
So I find that the `UseCompressedOops`  option is open by default on my server, [relate post in Chinese](http://developer.51cto.com/art/201104/256957.htm)
