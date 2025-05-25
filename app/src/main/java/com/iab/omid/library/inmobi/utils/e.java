package com.iab.omid.library.inmobi.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.inmobi.adsession.DeviceCategory;
import com.iab.omid.library.inmobi.adsession.OutputDeviceStatus;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static OutputDeviceStatus f14005a = OutputDeviceStatus.UNKNOWN;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                } else {
                    return;
                }
                OutputDeviceStatus unused = e.f14005a = outputDeviceStatus;
            }
        }
    }

    public static OutputDeviceStatus a() {
        return com.iab.omid.library.inmobi.utils.a.a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f14005a;
    }

    public static void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
