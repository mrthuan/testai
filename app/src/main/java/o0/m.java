package o0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: TypefaceCompatUtil.java */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: TypefaceCompatUtil.java */
    /* loaded from: classes.dex */
    public static class a {
        public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean c = c(file, inputStream);
            a(inputStream);
            return c;
        } catch (Throwable th3) {
            th = th3;
            a(inputStream);
            throw th;
        }
    }

    public static boolean c(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            a(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    a(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static File d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer e(Context context, Uri uri) {
        try {
            ParcelFileDescriptor a10 = a.a(context.getContentResolver(), uri, "r", null);
            if (a10 == null) {
                if (a10 != null) {
                    a10.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a10.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                a10.close();
                return map;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
