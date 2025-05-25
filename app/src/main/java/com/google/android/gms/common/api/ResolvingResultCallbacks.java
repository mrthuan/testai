package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void b(Status status) {
        boolean z10;
        boolean z11 = true;
        PendingIntent pendingIntent = status.c;
        if (pendingIntent != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (pendingIntent == null) {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            try {
                Preconditions.j(pendingIntent);
                pendingIntent.getIntentSender();
                throw null;
            } catch (IntentSender.SendIntentException unused) {
                new Status(8, null, null, null);
                d();
                return;
            }
        }
        d();
    }

    public abstract void d();
}
