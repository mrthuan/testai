package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class m1 implements t2 {

    /* renamed from: i  reason: collision with root package name */
    public static final q9.y f13305i = new q9.y("FakeAssetPackService");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f13306j = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f13307a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f13308b;
    public final y0 c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f13309d;

    /* renamed from: e  reason: collision with root package name */
    public final w1 f13310e;

    /* renamed from: f  reason: collision with root package name */
    public final v1 f13311f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f13312g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public final q9.k f13313h;

    public m1(File file, a0 a0Var, y0 y0Var, Context context, w1 w1Var, q9.k kVar, v1 v1Var) {
        this.f13307a = file.getAbsolutePath();
        this.f13308b = a0Var;
        this.c = y0Var;
        this.f13309d = context;
        this.f13310e = w1Var;
        this.f13313h = kVar;
        this.f13311f = v1Var;
    }

    public static long j(int i10, long j10) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return 0L;
            }
            return j10;
        }
        return j10 / 2;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o a(ArrayList arrayList, HashMap hashMap) {
        f13305i.d("startDownload(%s)", arrayList);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f13313h.a()).execute(new com.google.android.gms.common.api.internal.r0(this, arrayList, taskCompletionSource));
        return taskCompletionSource.f11978a;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void b(int i10) {
        f13305i.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void c(String str) {
        f13305i.d("removePack(%s)", str);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void d(final int i10, final String str) {
        f13305i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f13313h.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.l1
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                String str2 = str;
                m1 m1Var = m1.this;
                m1Var.getClass();
                try {
                    m1Var.k(i11, 4, str2);
                } catch (LocalTestingException e10) {
                    m1.f13305i.e("notifyModuleCompleted failed", e10);
                }
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void e(int i10, int i11, String str, String str2) {
        f13305i.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void f(List list) {
        f13305i.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o g(int i10, int i11, String str, String str2) {
        File[] m10;
        int i12;
        Object[] objArr = {Integer.valueOf(i10), str, str2, Integer.valueOf(i11)};
        q9.y yVar = f13305i;
        yVar.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
        } catch (LocalTestingException e10) {
            yVar.e("getChunkFileDescriptor failed", e10);
            taskCompletionSource.a(e10);
        } catch (FileNotFoundException e11) {
            yVar.e("getChunkFileDescriptor failed", e11);
            taskCompletionSource.a(new LocalTestingException("Asset Slice file not found.", e11));
        }
        for (File file : m(str)) {
            if (pdf.pdfreader.viewer.editor.free.utils.t0.b(file).equals(str2)) {
                taskCompletionSource.b(ParcelFileDescriptor.open(file, 268435456));
                return taskCompletionSource.f11978a;
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o h(List list, j2 j2Var, HashMap hashMap) {
        f13305i.d("getPackStates(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f13313h.a()).execute(new a8.f2(this, list, j2Var, taskCompletionSource));
        return taskCompletionSource.f11978a;
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final d8.o i(HashMap hashMap) {
        f13305i.d("syncPacks()", new Object[0]);
        return Tasks.e(new ArrayList());
    }

    public final void k(int i10, int i11, String str) {
        w1 w1Var;
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f13310e.a());
        bundle.putInt("session_id", i10);
        File[] m10 = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        int length = m10.length;
        long j10 = 0;
        int i12 = 0;
        while (i12 < length) {
            File file = m10[i12];
            j10 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (i11 == 3) {
                intent = new Intent().setData(Uri.EMPTY);
            } else {
                intent = null;
            }
            arrayList2.add(intent);
            String b10 = pdf.pdfreader.viewer.editor.free.utils.t0.b(file);
            bundle.putParcelableArrayList(r9.b.b("chunk_intents", str, b10), arrayList2);
            File[] fileArr = m10;
            try {
                bundle.putString(r9.b.b("uncompressed_hash_sha256", str, b10), b.b.e(Arrays.asList(file)));
                bundle.putLong(r9.b.b("uncompressed_size", str, b10), file.length());
                arrayList.add(b10);
                i12++;
                m10 = fileArr;
            } catch (IOException e10) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e10);
            } catch (NoSuchAlgorithmException e11) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e11);
            }
        }
        bundle.putStringArrayList(r9.b.a("slice_ids", str), arrayList);
        bundle.putLong(r9.b.a("pack_version", str), w1Var.a());
        bundle.putInt(r9.b.a("status", str), i11);
        bundle.putInt(r9.b.a("error_code", str), 0);
        bundle.putLong(r9.b.a("bytes_downloaded", str), j(i11, j10));
        bundle.putLong(r9.b.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", j(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        this.f13312g.post(new a8.r0(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    public final i0 l(int i10, String str) {
        double doubleValue;
        long j10 = 0;
        for (File file : m(str)) {
            j10 += file.length();
        }
        long j11 = j(i10, j10);
        y0 y0Var = this.c;
        synchronized (y0Var) {
            Double d10 = (Double) y0Var.f13447a.get(str);
            if (d10 == null) {
                doubleValue = 0.0d;
            } else {
                doubleValue = d10.doubleValue();
            }
        }
        return AssetPackState.a(str, i10, 0, j11, j10, doubleValue, 1, String.valueOf(this.f13310e.a()), this.f13311f.a(str));
    }

    public final File[] m(final String str) {
        File file = new File(this.f13307a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.k1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    if (str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk")) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (pdf.pdfreader.viewer.editor.free.utils.t0.b(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.t2
    public final void f() {
        f13305i.d("keepAlive", new Object[0]);
    }
}
