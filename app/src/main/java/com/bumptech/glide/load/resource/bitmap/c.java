package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.resource.bitmap.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p4.d;
import p4.h;
import t3.e;
import t3.f;
import v3.l;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public final class c implements f<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f7067a;

    /* renamed from: b  reason: collision with root package name */
    public final w3.b f7068b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclableBufferedInputStream f7069a;

        /* renamed from: b  reason: collision with root package name */
        public final d f7070b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, d dVar) {
            this.f7069a = recyclableBufferedInputStream;
            this.f7070b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7069a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.c = recyclableBufferedInputStream.f7047a.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b(Bitmap bitmap, w3.c cVar) {
            IOException iOException = this.f7070b.f23693b;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.d(bitmap);
                }
                throw iOException;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, w3.b bVar) {
        this.f7067a = aVar;
        this.f7068b = bVar;
    }

    @Override // t3.f
    public final boolean a(InputStream inputStream, e eVar) {
        this.f7067a.getClass();
        return true;
    }

    @Override // t3.f
    public final l<Bitmap> b(InputStream inputStream, int i10, int i11, e eVar) {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f7068b);
        }
        ArrayDeque arrayDeque = d.c;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f23692a = recyclableBufferedInputStream;
        h hVar = new h(dVar);
        a aVar = new a(recyclableBufferedInputStream, dVar);
        try {
            com.bumptech.glide.load.resource.bitmap.a aVar2 = this.f7067a;
            return aVar2.a(new b.a(aVar2.c, hVar, aVar2.f7061d), i10, i11, eVar, aVar);
        } finally {
            dVar.a();
            if (z10) {
                recyclableBufferedInputStream.b();
            }
        }
    }
}
