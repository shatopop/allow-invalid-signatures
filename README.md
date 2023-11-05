# Allow Invalid Signatures
Allows players to join with an invalid profile signature on Minecraft 1.19+ servers.

## Requirements
For the plugin to start correctly, you'll need:
- ProtocolLib version 5.0.0 or higher (grab it from [here](https://ci.dmulloy2.net/job/ProtocolLib/))
- Minecraft version 1.19 or higher

If any of these requirements aren't met, you won't be able to use the plugin.

## Installation
Grab a copy of the latest release from the [releases page](https://github.com/shatopop/allow-invalid-signatures/releases) and put it in your server's `plugins` folder. Restart it, and you're done. No additional configuration is required.

## Building
First, clone the repository using Git:
```sh
$ git clone https://github.com/shatopop/allow-invalid-signature
```

Go inside the project's working directory:
```sh
$ cd allow-invalid-signatures
```

Then run the following command:
```sh
$ ./gradlew build
```

This will also run the following Gradle tasks as well: `spotlessApply`, `shadowJar`
