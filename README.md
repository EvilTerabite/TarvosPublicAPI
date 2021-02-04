# Tarvos Public Java API

To gather statistics for players on the Tarvos Network

## Maven

Add the jitpack.io Repository to the pom.xml

```
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
```

Add the dependencyy
```
	<dependency>
	    <groupId>com.github.EvilTerabite</groupId>
	    <artifactId>TarvosPublicAPI</artifactId>
	    <version>0.1</version>
	</dependency>
```

## Usage

```java
TarvosPlayer tarvosPlayer = TarvosAPI.getPlayer(token);
```
## Token
 - Login to portal.tarvos-gaming.com
 - Inspect Element and click on Applications
 - Under Local Storage, you will find your token. 
### Please be aware that the token refreshes, so you might need to keep changing it to get your current token!


## License
[MIT](https://choosealicense.com/licenses/mit/)
