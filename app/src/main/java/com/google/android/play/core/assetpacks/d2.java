package com.google.android.play.core.assetpacks;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: h  reason: collision with root package name */
    public static final q9.y f13211h = new q9.y("SliceMetadataManager");

    /* renamed from: b  reason: collision with root package name */
    public final d0 f13213b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13214d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13215e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13216f;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13212a = new byte[8192];

    /* renamed from: g  reason: collision with root package name */
    public int f13217g = -1;

    public d2(d0 d0Var, String str, int i10, long j10, String str2) {
        this.f13213b = d0Var;
        this.c = str;
        this.f13214d = i10;
        this.f13215e = j10;
        this.f13216f = str2;
    }

    public final int a() {
        d0 d0Var = this.f13213b;
        d0Var.getClass();
        File file = new File(new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new ck("Slice checkpoint file corrupt.");
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final k0 b() {
        d0 d0Var = this.f13213b;
        d0Var.getClass();
        File file = new File(new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null && properties.getProperty("previousChunk") != null) {
                    try {
                        int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                        long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                        this.f13217g = Integer.parseInt(properties.getProperty("metadataFileCounter", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES));
                        return new k0(parseInt, parseInt2, parseLong, parseLong2, property);
                    } catch (NumberFormatException e10) {
                        throw new ck("Slice checkpoint file corrupt.", e10);
                    }
                }
                throw new ck("Slice checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw new ck("Slice checkpoint file does not exist.");
    }

    public final File c() {
        d0 d0Var = this.f13213b;
        d0Var.getClass();
        File file = new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", Integer.valueOf(this.f13217g)));
    }

    public final void d(long j10, byte[] bArr, int i10, int i11) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void e(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13217g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f(String str, long j10, long j11, int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13217g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i10, byte[] bArr) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13217g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            d0 d0Var = this.f13213b;
            d0Var.getClass();
            File file = new File(new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void h(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13217g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(byte[] bArr) {
        this.f13217g++;
        d0 d0Var = this.f13213b;
        d0Var.getClass();
        File file = new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, String.format("%s-LFH.dat", Integer.valueOf(this.f13217g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e10) {
            throw new ck("Could not write metadata file.", e10);
        }
    }

    public final void j(InputStream inputStream, byte[] bArr) {
        byte[] bArr2 = this.f13212a;
        this.f13217g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(bArr2);
            while (read > 0) {
                fileOutputStream.write(bArr2, 0, read);
                read = inputStream.read(bArr2);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10, byte[] bArr) {
        this.f13217g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i10);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final File l() {
        d0 d0Var = this.f13213b;
        d0Var.getClass();
        File file = new File(new File(new File(new File(d0Var.d(this.f13214d, this.f13215e, this.c), "_slices"), "_metadata"), this.f13216f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
