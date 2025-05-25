package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import jb.t;
import jb.w;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque f13658g = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent b(Intent intent) {
        return (Intent) w.a().f19161d.poll();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:56|(1:58)|59|(1:61)(2:136|(2:138|139))|62|(2:130|131)|64|65|(1:67)(1:129)|68|(1:70)|71|(1:73)(1:128)|74|(1:127)|(1:79)(1:126)|80|(1:82)(1:125)|83|(1:85)(1:124)|86|(1:88)(1:123)|89|(5:(7:119|120|98|(1:100)(1:106)|101|102|103)|(7:115|116|98|(0)(0)|101|102|103)|(1:96)(8:108|(2:110|(1:112))|113|98|(0)(0)|101|102|103)|102|103)|91|93|94|97|98|(0)(0)|101) */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    public void d(t tVar) {
    }

    public void e(String str) {
    }
}
