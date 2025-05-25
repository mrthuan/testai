package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.LoggingBehavior;
import com.facebook.internal.j;
import java.util.HashMap;

/* compiled from: AppEventsCAPIManager.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9493a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final String f9494b = b.class.getCanonicalName();
    public static boolean c;

    public static void a(HashMap hashMap) {
        SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = hashMap.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = hashMap.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = hashMap.get(settingsAPIFields3.getRawValue());
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(settingsAPIFields.getRawValue(), obj.toString());
            edit.putString(settingsAPIFields2.getRawValue(), obj2.toString());
            edit.putString(settingsAPIFields3.getRawValue(), obj3.toString());
            edit.apply();
            j.a aVar = j.f9803d;
            j.a.b(LoggingBehavior.APP_EVENTS, f9494b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
        }
    }
}
