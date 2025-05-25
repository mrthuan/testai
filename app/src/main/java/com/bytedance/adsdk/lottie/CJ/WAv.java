package com.bytedance.adsdk.lottie.CJ;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class WAv {
    private final Sf Qhi;

    public WAv(Sf sf2) {
        this.Qhi = sf2;
    }

    private File cJ(String str) {
        File file = new File(Qhi(), Qhi(str, Tgh.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(Qhi(), Qhi(str, Tgh.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    @WorkerThread
    public Pair<Tgh, InputStream> Qhi(String str) {
        Tgh tgh;
        try {
            File cJ = cJ(str);
            if (cJ == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(cJ);
            if (cJ.getAbsolutePath().endsWith(".zip")) {
                tgh = Tgh.ZIP;
            } else {
                tgh = Tgh.JSON;
            }
            cJ.getAbsolutePath();
            return new Pair<>(tgh, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File Qhi(String str, InputStream inputStream, Tgh tgh) {
        File file = new File(Qhi(), Qhi(str, tgh, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public void Qhi(String str, Tgh tgh) {
        File file = new File(Qhi(), Qhi(str, tgh, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File Qhi() {
        File Qhi = this.Qhi.Qhi();
        if (Qhi.isFile()) {
            Qhi.delete();
        }
        if (!Qhi.exists()) {
            Qhi.mkdirs();
        }
        return Qhi;
    }

    private static String Qhi(String str, Tgh tgh, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? tgh.Qhi() : tgh.f7689ac);
        return sb2.toString();
    }
}
