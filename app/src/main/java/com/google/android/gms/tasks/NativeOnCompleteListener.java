package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    @KeepForSdk
    public native void nativeOnComplete(long j10, Object obj, boolean z10, boolean z11, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public final void onComplete(Task<Object> task) {
        Object obj;
        String str;
        Exception j10;
        if (task.o()) {
            obj = task.k();
            str = null;
        } else if (!task.m() && (j10 = task.j()) != null) {
            str = j10.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(0L, obj, task.o(), task.m(), str);
    }
}
