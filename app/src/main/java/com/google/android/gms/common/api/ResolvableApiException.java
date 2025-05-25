package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().c;
    }

    public void startResolutionForResult(Activity activity, int i10) {
        boolean z10;
        PendingIntent pendingIntent = getStatus().c;
        if (pendingIntent != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Preconditions.j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }
}
