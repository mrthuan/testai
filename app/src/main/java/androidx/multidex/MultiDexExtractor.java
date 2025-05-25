package androidx.multidex;

import a0.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import r1.b;
import r1.c;

/* loaded from: classes.dex */
public final class MultiDexExtractor implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f4145a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4146b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final RandomAccessFile f4147d;

    /* renamed from: e  reason: collision with root package name */
    public final FileChannel f4148e;

    /* renamed from: f  reason: collision with root package name */
    public final FileLock f4149f;

    /* loaded from: classes.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) {
        file.getPath();
        file2.getPath();
        this.f4145a = file;
        this.c = file2;
        this.f4146b = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f4147d = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f4148e = channel;
                try {
                    file3.getPath();
                    this.f4149f = channel.lock();
                    file3.getPath();
                } catch (IOException e10) {
                    e = e10;
                    try {
                        this.f4148e.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e11) {
                    e = e11;
                    this.f4148e.close();
                    throw e;
                } catch (RuntimeException e12) {
                    e = e12;
                    this.f4148e.close();
                    throw e;
                }
            } catch (Error e13) {
                e = e13;
                try {
                    this.f4147d.close();
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e14) {
                e = e14;
                this.f4147d.close();
                throw e;
            }
        } catch (IOException e15) {
            e = e15;
            this.f4147d.close();
            throw e;
        }
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(a.h("tmp-", str), ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            createTempFile.delete();
        }
    }

    public static long b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            c.a a10 = c.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = a10.f29434b;
            randomAccessFile.seek(a10.f29433a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j10 -= read;
                if (j10 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void h(Context context, long j10, long j11, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j10);
        edit.putLong("crc", j11);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            edit.putLong(b.a.c("dex.crc.", i10), extractedDex.crc);
            edit.putLong("dex.time." + i10, extractedDex.lastModified());
            i10++;
        }
        edit.commit();
    }

    public final ArrayList c(Context context, boolean z10) {
        ArrayList f10;
        ArrayList arrayList;
        boolean z11;
        File file = this.f4145a;
        file.getPath();
        if (this.f4149f.isValid()) {
            if (!z10) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                long j10 = sharedPreferences.getLong("timestamp", -1L);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (j10 == lastModified && sharedPreferences.getLong("crc", -1L) == this.f4146b) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    try {
                        arrayList = d(context);
                    } catch (IOException unused) {
                        f10 = f();
                        long lastModified2 = file.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        h(context, lastModified2, this.f4146b, f10);
                    }
                    arrayList.size();
                    return arrayList;
                }
            }
            f10 = f();
            long lastModified3 = file.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            h(context, lastModified3, this.f4146b, f10);
            arrayList = f10;
            arrayList.size();
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4149f.release();
        this.f4148e.close();
        this.f4147d.close();
    }

    public final ArrayList d(Context context) {
        String str = this.f4145a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            ExtractedDex extractedDex = new ExtractedDex(this.c, str + i11 + ".zip");
            if (extractedDex.isFile()) {
                extractedDex.crc = b(extractedDex);
                long j10 = sharedPreferences.getLong("dex.crc." + i11, -1L);
                long j11 = sharedPreferences.getLong("dex.time." + i11, -1L);
                long lastModified = extractedDex.lastModified();
                if (j11 == lastModified && j10 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                } else {
                    throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + extractedDex.crc);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + OperatorName.SHOW_TEXT_LINE);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        StringBuilder sb2 = new StringBuilder();
        File file = this.f4145a;
        sb2.append(file.getName());
        sb2.append(".classes");
        String sb3 = sb2.toString();
        b bVar = new b();
        File file2 = this.c;
        File[] listFiles = file2.listFiles(bVar);
        if (listFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : listFiles) {
                file3.getPath();
                file3.length();
                if (!file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("classes");
            int i10 = 2;
            sb4.append(2);
            sb4.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb4.toString());
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(file2, sb3 + i10 + ".zip");
                arrayList.add(extractedDex);
                extractedDex.toString();
                int i11 = 0;
                boolean z10 = false;
                while (i11 < 3 && !z10) {
                    i11++;
                    a(zipFile, entry, extractedDex, sb3);
                    try {
                        extractedDex.crc = b(extractedDex);
                        z10 = true;
                    } catch (IOException unused) {
                        extractedDex.getAbsolutePath();
                        z10 = false;
                    }
                    extractedDex.getAbsolutePath();
                    extractedDex.length();
                    if (!z10) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            extractedDex.getPath();
                        }
                    }
                }
                if (z10) {
                    i10++;
                    entry = zipFile.getEntry("classes" + i10 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }
}
