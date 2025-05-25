package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f6890a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f6891b;
    public T c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f6891b = contentResolver;
        this.f6890a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t4 = this.c;
        if (t4 != null) {
            try {
                c(t4);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t4);

    @Override // com.bumptech.glide.load.data.d
    public final DataSource d() {
        return DataSource.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f6891b, this.f6890a);
            this.c = r32;
            aVar.f(r32);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
