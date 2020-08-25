# MineBike-Server

## Setting up the work space 
### Setting up the Forge Mod
To setup the minecraft forge mod, 
run: 
```
./gradlew setupDecompWorkspace --refresh-dependencies
```
For IntelliJ:
  Goto File->New->Project from Existing Source
  Choose File ```forge-1.12.2-14.23.5.2838-mdk/build.gradle```
  Click Ok
  Remember to Check "Use auto-import"
 
After the import is done:
  Goto File->Project Structure
  Find "Modules" under Project Settings
  Under "forge-1.12.2-14.23.5.2838-mdk_main" add the `spongeforge-1.12.2-2838-7.1.8.jar`
  
Goto Run->Edit Configuration:
  Add New Configuration -> Application -> Put "GradleStartServer" under MainClass.
  Click OK.
  
You should be able to build the mod.

### Setting up the sponge plugin

To setup the workspace for sponge plugin, import `build.gradle` under the `sponge-plugin` folder.

## Build Process

To build the forge-mod or the sponge plugin you can run the following in the corresponding directory:
```
./gradlew build
```

This will generate the corresponding ```jar``` file under ```build/lib/```

## Testing your changes

To test the Mod or Plugin, put the build `jar` file under `forge-server/mods/`

Then run:
```
java -jar forge-1.12.2-14.23.5.2838-universal.jar
```
