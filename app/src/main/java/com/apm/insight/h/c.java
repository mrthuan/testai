package com.apm.insight.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.apm.insight.l.h;
import com.apm.insight.l.j;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f6524a = new ArrayList();

    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a10 = a(applicationInfo.sourceDir, str, file);
        if (a10 == null) {
            return null;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a10 = a(str2, str, file);
            if (a10 == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (classLoader instanceof BaseDexClassLoader) {
                Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(classLoader);
                Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
                declaredField2.setAccessible(true);
                for (String str3 : (String[]) declaredField2.get(obj)) {
                    File file2 = new File(str3, System.mapLibraryName(str));
                    if (file2.exists()) {
                        h.a(file2, file);
                        j.a(file.getAbsolutePath(), 493);
                        return null;
                    }
                }
                return "not_found";
            }
            return a10;
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static String a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str3;
        ZipEntry entry;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb2 = new StringBuilder("lib/");
                str3 = Build.CPU_ABI;
                sb2.append(str3);
                sb2.append(PackagingURIHelper.FORWARD_SLASH_STRING);
                sb2.append(System.mapLibraryName(str2));
                entry = zipFile.getEntry(sb2.toString());
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str3.indexOf(45);
            StringBuilder sb3 = new StringBuilder("lib/");
            if (indexOf <= 0) {
                indexOf = str3.length();
            }
            sb3.append(str3.substring(0, indexOf));
            sb3.append(PackagingURIHelper.FORWARD_SLASH_STRING);
            sb3.append(System.mapLibraryName(str2));
            String sb4 = sb3.toString();
            ZipEntry entry2 = zipFile.getEntry(sb4);
            if (entry2 == null) {
                message = "Library entry not found:" + sb4;
                j.a((Closeable) null);
                j.a((Closeable) null);
                j.a(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th4) {
            inputStream = inputStream2;
            th = th4;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read <= 0) {
                    j.a(file.getAbsolutePath(), 493);
                    j.a(fileOutputStream);
                    j.a(inputStream2);
                    j.a(zipFile);
                    return null;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th5) {
            fileOutputStream2 = fileOutputStream;
            inputStream = inputStream2;
            th = th5;
            try {
                message = th.getMessage();
                j.a(fileOutputStream2);
                j.a(inputStream);
                j.a(zipFile);
                return message;
            } catch (Throwable th6) {
                j.a(fileOutputStream2);
                j.a(inputStream);
                j.a(zipFile);
                throw th6;
            }
        }
    }
}
