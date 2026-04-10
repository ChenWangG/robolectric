Used to test the open-sourced robolectric from
https://github.com/robolectric/robolectric.

To test:
./gradlew clean && ./gradlew test

After clone the repo, you need to add a file local.properties
under the same directory of this README with a line as bleow.

sdk.dir=/Users/Name/Library/Android/sdk

The value of sdk.dir shoud be a valid Android SDK of your local machine,
which can be downloaded from
https://developer.android.com/tools/releases/platform-tools#downloads
