package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.concurrent.ExecutionException;
import jb.j;
import jb.o;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.a(new j(context).c(cloudMessage.f10833a))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (o.b(putExtras)) {
            o.a(putExtras.getExtras(), "_nd");
        }
    }
}
