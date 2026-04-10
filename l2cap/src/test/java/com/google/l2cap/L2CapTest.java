package com.google.l2cap;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;

/** Robolectric test. */
@RunWith(AndroidJUnit4.class)
public final class L2CapTest {
  @Test
  public void testL2cap() throws IOException {
    Context context = ApplicationProvider.getApplicationContext();
    BluetoothAdapter adapter = context.getSystemService(BluetoothManager.class).getAdapter();
    // This will incur java.lang.NoSuchMethodError.
    adapter.listenUsingInsecureL2capChannel();
  }
}
