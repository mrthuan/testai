package com.google.firebase;

import android.content.Context;
import android.os.Build;
import bb.f;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import fa.a;
import ga.b;
import ga.k;
import ga.q;
import ia.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import lb.d;
import lb.g;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import z9.e;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace(PackagingURIHelper.FORWARD_SLASH_CHAR, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.a a10 = b.a(g.class);
        a10.a(new k(d.class, 2, 0));
        a10.f17713f = new m(1);
        arrayList.add(a10.b());
        q qVar = new q(a.class, Executor.class);
        b.a aVar = new b.a(com.google.firebase.heartbeatinfo.a.class, new Class[]{f.class, HeartBeatInfo.class});
        aVar.a(k.a(Context.class));
        aVar.a(k.a(e.class));
        aVar.a(new k(bb.e.class, 2, 0));
        aVar.a(new k(g.class, 1, 1));
        aVar.a(new k(qVar, 1, 0));
        aVar.f17713f = new c(qVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(lb.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(lb.f.a("fire-core", "20.3.2"));
        arrayList.add(lb.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(lb.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(lb.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(lb.f.b("android-target-sdk", new t5.f(8)));
        arrayList.add(lb.f.b("android-min-sdk", new t5.g(6)));
        arrayList.add(lb.f.b("android-platform", new u0.a(5)));
        arrayList.add(lb.f.b("android-installer", new m(5)));
        try {
            str = tf.b.f30005e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(lb.f.a("kotlin", str));
        }
        return arrayList;
    }
}
