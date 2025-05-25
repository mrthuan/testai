package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final k f7063a;

        /* renamed from: b  reason: collision with root package name */
        public final w3.b f7064b;
        public final List<ImageHeaderParser> c;

        public a(w3.b bVar, InputStream inputStream, List list) {
            com.google.android.play.core.assetpacks.c.l(bVar);
            this.f7064b = bVar;
            com.google.android.play.core.assetpacks.c.l(list);
            this.c = list;
            this.f7063a = new k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7063a.f6888a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.a(this.f7064b, recyclableBufferedInputStream, this.c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final Bitmap b(BitmapFactory.Options options) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7063a.f6888a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7063a.f6888a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.c = recyclableBufferedInputStream.f7047a.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7063a.f6888a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.b(this.f7064b, recyclableBufferedInputStream, this.c);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();

    /* compiled from: ImageReader.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0056b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final w3.b f7065a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f7066b;
        public final ParcelFileDescriptorRewinder c;

        public C0056b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, w3.b bVar) {
            com.google.android.play.core.assetpacks.c.l(bVar);
            this.f7065a = bVar;
            com.google.android.play.core.assetpacks.c.l(list);
            this.f7066b = list;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            w3.b bVar = this.f7065a;
            List<ImageHeaderParser> list = this.f7066b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = null;
                }
                try {
                    int b10 = imageHeaderParser.b(recyclableBufferedInputStream, bVar);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.a();
                    if (b10 != -1) {
                        return b10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            w3.b bVar = this.f7065a;
            List<ImageHeaderParser> list = this.f7066b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = null;
                }
                try {
                    ImageHeaderParser.ImageType c = imageHeaderParser.c(recyclableBufferedInputStream);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.a();
                    if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                        return c;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void c() {
        }
    }
}
