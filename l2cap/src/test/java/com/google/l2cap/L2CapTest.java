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
@Config(sdk = 36)
public final class L2CapTest {
  @Test
  public void testL2cap() throws IOException {
    int sdkVersion = android.os.Build.VERSION.SDK_INT;
    assert(sdkVersion == 36);
    Log.e("SDK_VERSION", "API Level: " + sdkVersion);
    Context context = ApplicationProvider.getApplicationContext();
    BluetoothAdapter adapter = context.getSystemService(BluetoothManager.class).getAdapter();
    // This will incur java.lang.NoSuchMethodError.
    adapter.listenUsingInsecureL2capChannel();
  }
}
