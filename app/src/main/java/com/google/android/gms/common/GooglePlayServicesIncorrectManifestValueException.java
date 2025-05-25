package com.google.android.gms.common;

import androidx.activity.f;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepName
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        super(i10, f.k("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", GoogleApiAvailabilityLight.f10883a, " but found ", i10, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
