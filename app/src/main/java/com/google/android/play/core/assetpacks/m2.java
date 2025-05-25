package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class m2 implements b {

    /* renamed from: k  reason: collision with root package name */
    public static final q9.y f13314k = new q9.y("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13315a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f13316b;
    public final q9.d c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f13317d;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f13318e;

    /* renamed from: f  reason: collision with root package name */
    public final v1 f13319f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f13320g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public boolean f13321h;

    /* renamed from: i  reason: collision with root package name */
    public final q9.k f13322i;

    /* renamed from: j  reason: collision with root package name */
    public final q9.k f13323j;

    public m2(d0 d0Var, q9.k kVar, a0 a0Var, q9.d dVar, y0 y0Var, p0 p0Var, q9.k kVar2, v1 v1Var) {
        this.f13315a = d0Var;
        this.f13322i = kVar;
        this.f13316b = a0Var;
        this.c = dVar;
        this.f13317d = y0Var;
        this.f13318e = p0Var;
        this.f13323j = kVar2;
        this.f13319f = v1Var;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final Task<d> a(List<String> list) {
        HashMap q5 = this.f13315a.q();
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putInt("error_code", 0);
            for (String str : list) {
                bundle.putInt(r9.b.a("status", str), 4);
                bundle.putInt(r9.b.a("error_code", str), 0);
                bundle.putLong(r9.b.a("total_bytes_to_download", str), 0L);
                bundle.putLong(r9.b.a("bytes_downloaded", str), 0L);
            }
            bundle.putStringArrayList("pack_names", new ArrayList<>(list));
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putLong("bytes_downloaded", 0L);
            return Tasks.e(d.a(bundle, this.f13317d, this.f13319f, new kotlinx.coroutines.y(0)));
        }
        return ((t2) this.f13322i.a()).a(arrayList, q5);
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final Task<d> b(List<String> list) {
        return ((t2) this.f13322i.a()).h(list, new j2(this), this.f13315a.q());
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final d8.o c(Activity activity) {
        if (activity == null) {
            return Tasks.d(new AssetPackException(-3));
        }
        p0 p0Var = this.f13318e;
        if (p0Var.f13349a == null) {
            return Tasks.d(new AssetPackException(-14));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", p0Var.f13349a);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new l2(this, this.f13320g, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.f11978a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.play.core.assetpacks.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.h0 d(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.m2.d(java.lang.String):com.google.android.play.core.assetpacks.h0");
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final synchronized void e(NativeSoLoaderHelper.Companion.a aVar) {
        a0 a0Var = this.f13316b;
        boolean d10 = a0Var.d();
        a0Var.c(aVar);
        if (!d10) {
            ((Executor) this.f13323j.a()).execute(new com.android.billingclient.api.u(this, 4));
        }
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final d8.o f(final String str) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f13323j.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.k2
            @Override // java.lang.Runnable
            public final void run() {
                boolean h10;
                m2 m2Var = m2.this;
                d0 d0Var = m2Var.f13315a;
                String str2 = str;
                if (!d0Var.c(str2).exists()) {
                    h10 = true;
                } else {
                    h10 = d0.h(d0Var.c(str2));
                }
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (h10) {
                    taskCompletionSource2.b(null);
                    ((t2) m2Var.f13322i.a()).c(str2);
                    return;
                }
                taskCompletionSource2.a(new IOException(String.format("Failed to remove pack %s.", str2)));
            }
        });
        return taskCompletionSource.f11978a;
    }

    public final void g(boolean z10) {
        a0 a0Var = this.f13316b;
        boolean d10 = a0Var.d();
        synchronized (a0Var) {
            a0Var.f29137f = z10;
            a0Var.a();
        }
        if (z10 && !d10) {
            ((Executor) this.f13323j.a()).execute(new com.android.billingclient.api.u(this, 4));
        }
    }
}
