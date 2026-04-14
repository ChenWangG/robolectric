package com.google.l2cap;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

/** Robolectric test. */
@RunWith(AndroidJUnit4.class)
public final class L2CapTest {
  @Test
  public void testL2cap() throws IOException {
    int sdkVersion = android.os.Build.VERSION.SDK_INT;
    assert(sdkVersion == 36);
    Log.e("L2CAP_TEST", "Log Android SDK version: ");
    System.out.println("System out print Android SDK version: ");
    Context context = ApplicationProvider.getApplicationContext();
    BluetoothAdapter adapter = context.getSystemService(BluetoothManager.class).getAdapter();
    // This is supported only after sdk version 29.
    adapter.listenUsingInsecureL2capChannel();
  }
}
