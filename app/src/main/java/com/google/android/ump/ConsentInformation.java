package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import x9.c;
import x9.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public interface ConsentInformation {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    /* loaded from: classes2.dex */
    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    /* loaded from: classes2.dex */
    public interface a {
        void onConsentInfoUpdateFailure(@RecentlyNonNull d dVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    /* loaded from: classes2.dex */
    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    int getConsentStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull c cVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);
}
