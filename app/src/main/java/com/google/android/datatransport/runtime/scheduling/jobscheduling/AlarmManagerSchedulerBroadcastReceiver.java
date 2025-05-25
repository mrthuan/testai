package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b7.e;
import v4.o;
import v6.j;
import v6.s;
import v6.w;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9923a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        w.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(f7.a.b(intValue));
        if (queryParameter2 != null) {
            a10.f30714b = Base64.decode(queryParameter2, 0);
        }
        e eVar = w.a().f30735d;
        j a11 = a10.a();
        com.facebook.appevents.a aVar = new com.facebook.appevents.a(4);
        eVar.getClass();
        eVar.f5355e.execute(new o(eVar, a11, i10, aVar, 1));
    }
}
