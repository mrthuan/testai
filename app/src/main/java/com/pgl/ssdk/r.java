package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ApkInfo.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f15838a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f15839b = null;
    private static String c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f15840d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f15841e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static long f15842f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static long f15843g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static volatile long f15844h = -1;

    public static void a(File file, boolean z10) {
        RandomAccessFile randomAccessFile;
        CertificateInfo a10;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (TextUtils.isEmpty(f15838a) && (a10 = a(file)) != null) {
                f15838a = a(a10.a());
                f15839b = a10.b();
                if (z10) {
                    a();
                    try {
                        randomAccessFile.close();
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(c)) {
                c = a(randomAccessFile);
            }
            if (f15842f == 0) {
                f15842f = randomAccessFile.length() / 1024;
            }
            if (f15843g == 0) {
                f15843g = b(file);
            }
        } catch (FileNotFoundException unused4) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                return;
            }
            randomAccessFile = randomAccessFile2;
            randomAccessFile.close();
        } catch (IOException unused5) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                return;
            }
            randomAccessFile = randomAccessFile2;
            randomAccessFile.close();
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
    }

    public static String b() {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        long j10;
        long j11;
        if (TextUtils.isEmpty(f15838a) || TextUtils.isEmpty(c) || f15841e == -1) {
            SharedPreferences a10 = L.a(PglArmorCallApi.b());
            long j12 = -1;
            if (a10 != null) {
                j12 = a10.getLong("mt", -1L);
                str2 = a10.getString("sa", null);
                str3 = a10.getString("sj", null);
                str4 = a10.getString("md5", null);
                j10 = a10.getLong("as", 0L);
                j11 = a10.getLong("ds", 0L);
                i10 = a10.getInt("cpc", -1);
                str = a10.getString("ap", null);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                i10 = 0;
                j10 = 0;
                j11 = 0;
            }
            String c10 = c();
            if (c10 == null) {
                return null;
            }
            File file = new File(c10);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(ShapeTypes.FLOW_CHART_DELAY, PglArmorCallApi.b(), c10);
            Integer num = (Integer) objArr[0];
            String str5 = (String) objArr[1];
            long lastModified = file.lastModified();
            if (lastModified == j12 && str2 != null && i10 != -1) {
                f15838a = str2;
                f15839b = str3;
                f15842f = j10;
                f15843g = j11;
                c = str4;
                f15841e = i10;
                f15840d = str;
            } else {
                f15844h = lastModified;
                if (str5 != null) {
                    f15840d = str5;
                }
                if (num != null) {
                    f15841e = num.intValue();
                }
                a(file, false);
                a();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f15838a)) {
                jSONObject.put("sign", f15838a);
            }
            if (!TextUtils.isEmpty(f15839b)) {
                jSONObject.put("subject", f15839b);
            }
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("md5", c);
            }
            if (!TextUtils.isEmpty(f15840d)) {
                jSONObject.put("path", f15840d);
            }
            long j13 = f15842f;
            if (j13 != 0) {
                jSONObject.put("apkSize", j13);
            }
            long j14 = f15843g;
            if (j14 != 0) {
                jSONObject.put("dexSize", j14);
            }
            int i11 = f15841e;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c() {
        if (PglArmorCallApi.b() == null) {
            return null;
        }
        String packageCodePath = PglArmorCallApi.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        return packageCodePath;
    }

    public static String d() {
        String str;
        if (!TextUtils.isEmpty(f15838a)) {
            return f15838a;
        }
        SharedPreferences a10 = L.a(PglArmorCallApi.b());
        long j10 = -1;
        if (a10 != null) {
            j10 = a10.getLong("mt", -1L);
            str = a10.getString("sa", null);
        } else {
            str = null;
        }
        String c10 = c();
        if (TextUtils.isEmpty(c10)) {
            return null;
        }
        File file = new File(c10);
        long lastModified = file.lastModified();
        if (lastModified == j10 && str != null) {
            f15838a = str;
            return str;
        }
        f15844h = lastModified;
        a(file, true);
        a();
        return f15838a;
    }

    public static void a() {
        SharedPreferences a10 = L.a(PglArmorCallApi.b());
        if (a10 != null) {
            if (!TextUtils.isEmpty(f15838a)) {
                a10.edit().putString("sa", f15838a).apply();
            }
            if (!TextUtils.isEmpty(c)) {
                a10.edit().putString("md5", c).apply();
            }
            if (!TextUtils.isEmpty(f15839b)) {
                a10.edit().putString("sj", f15839b).apply();
            }
            if (f15842f != 0) {
                a10.edit().putLong("as", f15842f).apply();
            }
            if (f15843g != 0) {
                a10.edit().putLong("ds", f15843g).apply();
            }
            if (f15844h != -1) {
                a10.edit().putLong("mt", f15844h).apply();
            }
            if (f15841e != -1) {
                a10.edit().putInt("cpc", f15841e).apply();
            }
            if (TextUtils.isEmpty(f15840d)) {
                return;
            }
            a10.edit().putString("ap", f15840d).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        if (r4 == null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.CertificateInfo a(java.io.File r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.r.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    ZipEntry entry = zipFile2.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    try {
                        i11 = (int) (i11 + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            zipFile.close();
                            return 0L;
                        }
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            zipFile.close();
                            return 0L;
                        }
                        return 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = i11 / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.concat(bigInteger);
            }
            return bigInteger;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
