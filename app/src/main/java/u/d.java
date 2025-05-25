package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final e.b f30087a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f30088b;
    public final Context c;

    public d(e.b bVar, ComponentName componentName, Context context) {
        this.f30087a = bVar;
        this.f30088b = componentName;
        this.c = context;
    }

    public static void a(Context context, String str, g gVar) {
        gVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, gVar, 33);
    }

    public final l b(b bVar) {
        c cVar = new c(bVar);
        e.b bVar2 = this.f30087a;
        try {
            if (bVar2.v(cVar)) {
                return new l(bVar2, cVar, this.f30088b);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }
}
