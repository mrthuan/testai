package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f6873a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f6874b;
    public T c;

    public b(AssetManager assetManager, String str) {
        this.f6874b = assetManager;
        this.f6873a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t4 = this.c;
        if (t4 == null) {
            return;
        }
        try {
            c(t4);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t4);

    @Override // com.bumptech.glide.load.data.d
    public final DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f6874b, this.f6873a);
            this.c = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
