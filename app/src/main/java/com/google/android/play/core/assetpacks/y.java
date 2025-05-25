package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class y implements t2 {

    /* renamed from: g  reason: collision with root package name */
    public static final q9.y f13440g = new q9.y("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    public static final Intent f13441h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final String f13442a;

    /* renamed from: b  reason: collision with root package name */
    public final y0 f13443b;
    public final v1 c;

    /* renamed from: d  reason: collision with root package name */
    public final q9.i0 f13444d;

    /* renamed from: e  reason: collision with root package name */
    public final q9.i0 f13445e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f13446f = new AtomicBoolean();

    public y(Context context, y0 y0Var, v1 v1Var) {
        this.f13442a = context.getPackageName();
        this.f13443b = y0Var;
        this.c = v1Var;
        boolean b10 = q9.g.b(context);
        q9.y yVar = f13440g;
        if (b10) {
            Context applicationContext = context.getApplicationContext();
            applicationContext = applicationContext == null ? context : applicationContext;
            Intent intent = f13441h;
            this.f13444d = new q9.i0(applicationContext, yVar, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.f13445e = new q9.i0(applicationContext2 != null ? applicationContext2 : context, yVar, "AssetPackService-keepAlive", intent);
        }
        yVar.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20202);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static d8.o k() {
        f13440g.b("onError(%d)", -11);
        return Tasks.d(new AssetPackException(-11));
    }

    public static /* bridge */ /* synthetic */ Bundle m(Map map) {
        Bundle j10 = j();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        j10.putParcelableArrayList("installed_asset_module", arrayList);
        return j10;
    }

    public static /* bridge */ /* synthetic */ ArrayList n(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o a(ArrayList arrayList, HashMap hashMap) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return k();
        }
        f13440g.d("startDownload(%s)", arrayList);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new f(this, taskCompletionSource, arrayList, hashMap, taskCompletionSource), taskCompletionSource);
        f2.t tVar = new f2.t(this, 6);
        d8.o oVar = taskCompletionSource.f11978a;
        oVar.e(tVar);
        return oVar;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void b(int i10) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var != null) {
            f13440g.d("notifySessionFailed", new Object[0]);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            i0Var.c(new l(this, taskCompletionSource, i10, taskCompletionSource), taskCompletionSource);
            return;
        }
        throw new ck("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void c(String str) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return;
        }
        f13440g.d("removePack(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new e(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void d(int i10, String str) {
        l(i10, 10, str);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void e(int i10, int i11, String str, String str2) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var != null) {
            f13440g.d("notifyChunkTransferred", new Object[0]);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            i0Var.c(new j(this, taskCompletionSource, i10, str, str2, i11, taskCompletionSource), taskCompletionSource);
            return;
        }
        throw new ck("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void f(List list) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return;
        }
        f13440g.d("cancelDownloads(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new g(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o g(int i10, int i11, String str, String str2) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return k();
        }
        f13440g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new m(this, taskCompletionSource, i10, str, str2, i11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.f11978a;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o h(List list, j2 j2Var, HashMap hashMap) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return k();
        }
        f13440g.d("getPackStates(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new i(this, taskCompletionSource, list, hashMap, taskCompletionSource, j2Var), taskCompletionSource);
        return taskCompletionSource.f11978a;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o i(HashMap hashMap) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var == null) {
            return k();
        }
        f13440g.d("syncPacks", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i0Var.c(new h(this, taskCompletionSource, hashMap, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.f11978a;
    }

    public final void l(int i10, int i11, String str) {
        q9.i0 i0Var = this.f13444d;
        if (i0Var != null) {
            f13440g.d("notifyModuleCompleted", new Object[0]);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            i0Var.c(new k(this, taskCompletionSource, i10, str, taskCompletionSource, i11), taskCompletionSource);
            return;
        }
        throw new ck("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final synchronized void f() {
        if (this.f13445e == null) {
            f13440g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        q9.y yVar = f13440g;
        yVar.d("keepAlive", new Object[0]);
        if (!this.f13446f.compareAndSet(false, true)) {
            yVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13445e.c(new n(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
    }
}
