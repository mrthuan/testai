package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class LS {
    public static byte[] A00;
    public static String[] A01 = {"vwTjKM0sMKHrg1", "rT3dIxX1cJOfHLOh601I7", "6gtDSP7kuR3urnlcGAm4dnNrQ88tf5I3", "HXXwTRj6bJf1bG0zDaxpRECxzp3Q6VJi", "5gPmqGPvlXv7pbXlGLxdXg0ShI2YXaWc", "l5BwluSxJuw8doEnI5c7AOAYyEU0FpAA", "K3e4", "ngYnOZ76nQjBV4gTeojK7oznEArHOg66"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A01(C7j c7j, String str) {
        LinkedBlockingQueue linkedBlockingQueue;
        Object obj;
        try {
            Class<?> cls = Class.forName(A00(4729, 27, ShapeTypes.VERTICAL_SCROLL));
            linkedBlockingQueue = new LinkedBlockingQueue();
            obj = cls.getField(A00(4710, 14, 97)).get(null);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                CertificateFactory certificateFactory = CertificateFactory.getInstance(A00(4724, 5, 80));
                ArrayList arrayList = new ArrayList();
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(A07(A00(28, 2190, 99)))));
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(A07(A00(2218, 2392, 41)))));
                Class<?> cls2 = Class.forName(A00(4756, 58, 67));
                PackageManager.class.getMethod(A00(4848, 16, 121), String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2).invoke(c7j.getPackageManager(), str, false, Integer.valueOf(intValue), arrayList, Proxy.newProxyInstance(LS.class.getClassLoader(), new Class[]{cls2}, new LR(intValue, linkedBlockingQueue, c7j)));
                byte[] bArr = (byte[]) linkedBlockingQueue.poll(3L, TimeUnit.SECONDS);
                if (bArr != null) {
                    return A05(bArr);
                }
                return null;
            }
            throw new RuntimeException(A00(4610, 33, 47));
        } catch (Throwable th3) {
            th = th3;
            c7j.A07().AA0(A00(4841, 7, 41), C8E.A1G, new C8F(th));
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A02(File file) throws Exception {
        FileInputStream fileInputStream;
        int read;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(A00(4689, 3, 20));
                    byte[] bArr = new byte[1024];
                    do {
                        read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        }
                    } while (read != -1);
                    return A05(messageDigest.digest());
                } catch (IOException unused) {
                    throw new Exception(A00(4676, 13, 124));
                } catch (NoSuchAlgorithmException unused2) {
                    throw new Exception(A00(4692, 18, 3));
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (FileNotFoundException unused4) {
            throw new Exception(A00(4643, 33, 70));
        }
    }

    public static void A06() {
        A00 = new byte[]{-60, 7, 19, 18, 24, 5, 13, 18, 23, -60, 18, 19, 18, -47, 12, 9, Field.NUMCHARS, -60, 7, 12, 5, 22, 5, 7, 24, 9, 22, 23, 3, 0, 8, 2, 0, 4, 4, 3, 3, 0, 8, 2, 0, 3, 2, Field.GOTOBUTTON, Field.EQ, 0, 0, 3, 0, 2, 0, 1, 0, 2, 0, 2, 0, 9, 0, 0, Field.MACROBUTTON, 2, Field.AUTONUMLGL, 0, 8, 7, 4, 6, 6, 4, 4, Field.EQ, 3, 0, 8, Field.AUTONUMOUT, 3, 0, 0, Field.AUTONUMOUT, 0, 6, 0, 9, 2, Field.EQ, 8, 6, 4, 8, 8, 6, Field.AUTONUM, 7, 0, Field.AUTONUMOUT, 0, 1, 0, 1, 0, 4, 0, 5, 0, 0, 3, 0, 7, 4, 3, 1, 0, Field.GOTOBUTTON, 3, 0, 0, 9, 0, 6, 0, 3, 5, 5, 0, 4, 0, 6, 1, 3, 0, 2, 5, 5, 5, 3, 3, 1, 1, 3, 3, 0, 1, 1, 0, 6, 0, 3, 5, 5, 0, 4, 0, 8, 1, 3, 0, Field.EQ, 4, 3, 6, 1, 6, Field.MACROBUTTON, 6, 9, 6, 6, 6, Field.AUTONUM, 7, 2, 6, Field.AUTONUMLGL, 6, 9, 6, 1, 3, 1, 1, 6, 3, 0, 1, 4, 0, 6, 0, 3, 5, 5, 0, 4, 0, 7, 1, 3, 0, Field.AUTONUMOUT, 4, Field.AUTONUMOUT, 6, Field.AUTONUM, 7, 5, 6, Field.AUTONUMLGL, 7, 4, 6, 1, 6, 9, 6, Field.AUTONUMLGL, 2, 0, 5, 6, 6, 9, 6, 5, 7, 7, 3, 1, 1, 4, 3, 0, 1, 2, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.EQ, 1, 3, 0, Field.GOTOBUTTON, 4, 7, 6, Field.AUTONUM, 6, Field.AUTONUM, 6, 7, 6, Field.MACROBUTTON, 6, 5, 2, 0, 4, 9, 6, Field.AUTONUMLGL, 6, 3, 2, Field.AUTONUMLGL, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.GOTOBUTTON, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, 3, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 3, 0, 1, Field.AUTONUMLGL, 1, 7, 0, Field.AUTONUMOUT, 3, 0, 3, 8, 3, 0, 3, 8, 3, 2, 3, 1, 3, 2, 3, 3, 3, 1, 3, 3, 3, 3, 3, 4, 5, Field.EQ, 1, 7, 0, Field.AUTONUMOUT, 3, 3, 3, 6, 3, 0, 3, 1, 3, 0, 3, 7, 3, 2, 3, 3, 3, 1, 3, 3, 3, 3, 3, 4, 5, Field.EQ, 3, 0, 7, 4, 3, 1, 0, Field.GOTOBUTTON, 3, 0, 0, 9, 0, 6, 0, 3, 5, 5, 0, 4, 0, 6, 1, 3, 0, 2, 5, 5, 5, 3, 3, 1, 1, 3, 3, 0, 1, 1, 0, 6, 0, 3, 5, 5, 0, 4, 0, 8, 1, 3, 0, Field.EQ, 4, 3, 6, 1, 6, Field.MACROBUTTON, 6, 9, 6, 6, 6, Field.AUTONUM, 7, 2, 6, Field.AUTONUMLGL, 6, 9, 6, 1, 3, 1, 1, 6, 3, 0, 1, 4, 0, 6, 0, 3, 5, 5, 0, 4, 0, 7, 1, 3, 0, Field.AUTONUMOUT, 4, Field.AUTONUMOUT, 6, Field.AUTONUM, 7, 5, 6, Field.AUTONUMLGL, 7, 4, 6, 1, 6, 9, 6, Field.AUTONUMLGL, 2, 0, 5, 6, 6, 9, 6, 5, 7, 7, 3, 1, 1, 4, 3, 0, 1, 2, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.EQ, 1, 3, 0, Field.GOTOBUTTON, 4, 7, 6, Field.AUTONUM, 6, Field.AUTONUM, 6, 7, 6, Field.MACROBUTTON, 6, 5, 2, 0, 4, 9, 6, Field.AUTONUMLGL, 6, 3, 2, Field.AUTONUMLGL, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.GOTOBUTTON, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, 3, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 3, 0, 8, 2, 0, 1, 2, 0, 3, 0, 0, Field.AUTONUMOUT, 0, 6, 0, 9, 2, Field.EQ, 8, 6, 4, 8, 8, 6, Field.AUTONUM, 7, 0, Field.AUTONUMOUT, 0, 1, 0, 1, 0, 1, 0, 5, 0, 0, 0, 3, 8, 2, 0, 1, 0, Field.AUTONUMOUT, 0, 0, 3, 0, 8, 2, 0, 1, 0, 8, 0, 2, 8, 2, 0, 1, 0, 1, 0, 0, Field.EQ, Field.GOTOBUTTON, 5, 6, 2, Field.AUTONUMLGL, 0, 0, Field.AUTONUMOUT, 8, 3, Field.GOTOBUTTON, Field.EQ, 2, 0, 8, Field.EQ, Field.AUTONUMLGL, 0, Field.EQ, 9, 6, 6, Field.AUTONUM, 1, 2, 4, Field.AUTONUMLGL, 2, 9, Field.AUTONUMOUT, Field.EQ, 1, 1, Field.AUTONUM, 2, Field.EQ, Field.GOTOBUTTON, 5, 6, Field.AUTONUMOUT, 0, 8, Field.AUTONUM, 5, 8, Field.AUTONUMLGL, 2, Field.MACROBUTTON, Field.MACROBUTTON, Field.EQ, 9, 1, 3, 0, 3, Field.AUTONUMLGL, 9, Field.GOTOBUTTON, 7, 5, 4, Field.AUTONUMOUT, 3, 7, 2, Field.AUTONUM, 6, 4, 0, Field.EQ, 7, 1, Field.GOTOBUTTON, 1, Field.AUTONUMOUT, Field.MACROBUTTON, Field.GOTOBUTTON, 1, 3, 0, 9, 6, 7, 6, 2, 4, Field.AUTONUMLGL, 4, 6, 5, 6, Field.EQ, 7, 7, 7, 6, Field.EQ, 9, 2, 1, 9, 3, Field.AUTONUMOUT, Field.GOTOBUTTON, 2, Field.AUTONUMLGL, 5, Field.GOTOBUTTON, Field.AUTONUM, Field.GOTOBUTTON, 7, 2, 4, Field.EQ, 9, 1, Field.AUTONUMLGL, 7, 7, 1, 8, 8, Field.GOTOBUTTON, 0, Field.AUTONUMLGL, 6, Field.EQ, 4, 7, Field.EQ, 4, 3, Field.GOTOBUTTON, 3, 3, Field.AUTONUMOUT, 9, 6, 0, 9, Field.GOTOBUTTON, 7, 7, 1, 8, 3, 1, 4, 5, Field.MACROBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUM, 7, Field.GOTOBUTTON, 2, Field.AUTONUMLGL, 5, 8, 6, 6, 7, 4, Field.MACROBUTTON, 9, Field.AUTONUMLGL, 1, 5, 6, 5, Field.GOTOBUTTON, 1, Field.AUTONUM, 4, Field.MACROBUTTON, 6, Field.EQ, 5, 9, 5, 5, Field.GOTOBUTTON, Field.AUTONUM, Field.AUTONUM, 2, 5, 1, Field.EQ, 6, 3, Field.AUTONUMOUT, Field.EQ, Field.GOTOBUTTON, Field.AUTONUM, 9, Field.MACROBUTTON, 5, 5, Field.MACROBUTTON, 2, 7, 2, 2, 2, 2, 5, 2, Field.AUTONUMLGL, 8, 7, 5, Field.AUTONUMLGL, 4, Field.AUTONUM, 8, 1, 5, 4, Field.EQ, 6, 4, 5, Field.AUTONUM, 8, 9, 7, 1, 6, 8, Field.MACROBUTTON, 0, Field.GOTOBUTTON, 1, Field.GOTOBUTTON, Field.AUTONUM, Field.MACROBUTTON, 6, 1, 2, Field.AUTONUMLGL, Field.EQ, Field.GOTOBUTTON, Field.AUTONUM, 7, 8, 5, 7, 6, 9, Field.GOTOBUTTON, Field.GOTOBUTTON, 3, 4, Field.EQ, Field.EQ, 7, 9, 8, 4, Field.AUTONUMOUT, Field.MACROBUTTON, 7, Field.AUTONUMLGL, 2, Field.AUTONUMLGL, Field.EQ, 2, 7, 6, 4, Field.MACROBUTTON, Field.EQ, Field.AUTONUMLGL, 8, 3, 0, 7, Field.AUTONUMOUT, 8, Field.MACROBUTTON, 1, 7, 1, 5, 4, Field.AUTONUMOUT, 7, Field.AUTONUMLGL, Field.AUTONUMLGL, 5, Field.AUTONUM, 
        6, 4, Field.EQ, 5, 1, Field.EQ, 4, 4, Field.EQ, 6, 0, 2, Field.MACROBUTTON, 2, 4, 9, 0, 5, 4, 1, 5, 7, Field.AUTONUMOUT, Field.MACROBUTTON, 0, 2, Field.MACROBUTTON, Field.AUTONUMOUT, 5, Field.AUTONUM, 5, Field.MACROBUTTON, 0, Field.AUTONUMLGL, 5, 5, Field.AUTONUM, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.AUTONUM, 8, 5, 1, 9, Field.AUTONUM, Field.GOTOBUTTON, Field.AUTONUMLGL, 3, 2, 7, Field.AUTONUM, 0, Field.GOTOBUTTON, 1, 5, 1, 1, 6, 9, 2, Field.MACROBUTTON, 5, Field.EQ, 0, 6, Field.AUTONUM, 1, 9, Field.AUTONUMOUT, 1, 8, 3, 8, 5, Field.AUTONUM, 5, Field.MACROBUTTON, 4, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.MACROBUTTON, 2, Field.AUTONUMOUT, 6, Field.GOTOBUTTON, 9, 3, Field.AUTONUM, 6, 8, Field.MACROBUTTON, Field.MACROBUTTON, 2, 9, 7, 9, Field.MACROBUTTON, 7, 0, Field.AUTONUMLGL, 1, 8, Field.EQ, Field.GOTOBUTTON, 9, 3, 8, 6, 6, Field.GOTOBUTTON, 3, Field.GOTOBUTTON, Field.AUTONUMOUT, 5, Field.AUTONUMOUT, Field.GOTOBUTTON, 8, 9, 9, 9, 5, 5, 2, Field.EQ, 0, Field.AUTONUMLGL, 3, Field.GOTOBUTTON, 4, Field.MACROBUTTON, 9, 9, Field.AUTONUMOUT, Field.AUTONUM, 5, 8, Field.AUTONUM, Field.GOTOBUTTON, 9, 1, 8, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.MACROBUTTON, 1, 8, 2, Field.GOTOBUTTON, Field.EQ, 3, 5, Field.AUTONUMLGL, 0, 0, 3, Field.MACROBUTTON, 1, Field.GOTOBUTTON, 4, Field.GOTOBUTTON, 1, 0, Field.AUTONUMOUT, Field.AUTONUMOUT, 2, 4, 4, Field.EQ, 8, Field.AUTONUMLGL, Field.AUTONUMLGL, 2, 4, Field.AUTONUM, Field.AUTONUM, Field.AUTONUM, Field.AUTONUMOUT, 3, 3, 3, 8, 7, 2, Field.EQ, Field.GOTOBUTTON, 5, 2, 2, 1, 9, 8, 5, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.EQ, Field.GOTOBUTTON, 0, Field.AUTONUM, Field.MACROBUTTON, 0, Field.AUTONUMOUT, 0, Field.GOTOBUTTON, 1, 4, 5, Field.GOTOBUTTON, 6, Field.EQ, Field.EQ, 1, 9, 2, 8, 5, 8, Field.AUTONUMLGL, 7, 9, 0, 2, 0, 1, 0, 3, Field.EQ, 3, 8, 1, Field.AUTONUMOUT, 9, 3, 0, 8, 1, Field.AUTONUMOUT, 6, 3, 0, 1, Field.AUTONUMOUT, 0, 6, 0, 3, 5, 5, 1, Field.AUTONUMOUT, 0, Field.AUTONUMLGL, 0, 4, 1, 6, 0, 4, 1, 4, Field.MACROBUTTON, 7, 7, Field.AUTONUMOUT, 8, Field.MACROBUTTON, Field.MACROBUTTON, 2, 2, 1, 1, 7, 5, 6, 2, 5, 9, Field.EQ, 7, Field.AUTONUM, Field.AUTONUMOUT, 3, 8, 2, Field.AUTONUMOUT, Field.AUTONUM, 6, Field.GOTOBUTTON, Field.AUTONUMLGL, 3, 9, 8, Field.AUTONUMLGL, 4, Field.AUTONUMOUT, 7, 8, 6, Field.EQ, 5, 3, 0, 8, 1, Field.EQ, 6, 0, 6, 0, 3, 5, 5, 1, Field.AUTONUMOUT, 2, 3, 0, 4, 8, 1, 9, Field.AUTONUMLGL, 3, 0, 8, 1, 9, Field.GOTOBUTTON, 8, 0, 1, 4, Field.MACROBUTTON, 7, 7, Field.AUTONUMOUT, 8, Field.MACROBUTTON, Field.MACROBUTTON, 2, 2, 1, 1, 7, 5, 6, 2, 5, 9, Field.EQ, 7, Field.AUTONUM, Field.AUTONUMOUT, 3, 8, 2, Field.AUTONUMOUT, Field.AUTONUM, 6, Field.GOTOBUTTON, Field.AUTONUMLGL, 3, 9, 8, Field.AUTONUMLGL, 4, Field.AUTONUMOUT, 7, 8, 6, Field.EQ, 5, Field.EQ, 1, 7, 8, Field.EQ, 4, 7, 6, 3, 0, 7, 4, 3, 1, 0, Field.GOTOBUTTON, 3, 0, 0, 9, 0, 6, 0, 3, 5, 5, 0, 4, 0, 6, 1, 3, 0, 2, 5, 5, 5, 3, 3, 1, 1, 3, 3, 0, 1, 1, 0, 6, 0, 3, 5, 5, 0, 4, 0, 8, 1, 3, 0, Field.EQ, 4, 3, 6, 1, 6, Field.MACROBUTTON, 6, 9, 6, 6, 6, Field.AUTONUM, 7, 2, 6, Field.AUTONUMLGL, 6, 9, 6, 1, 3, 1, 1, 6, 3, 0, 1, 4, 0, 6, 0, 3, 5, 5, 0, 4, 0, 7, 1, 3, 0, Field.AUTONUMOUT, 4, Field.AUTONUMOUT, 6, Field.AUTONUM, 7, 5, 6, Field.AUTONUMLGL, 7, 4, 6, 1, 6, 9, 6, Field.AUTONUMLGL, 2, 0, 5, 6, 6, 9, 6, 5, 7, 7, 3, 1, 1, 4, 3, 0, 1, 2, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.EQ, 1, 3, 0, Field.GOTOBUTTON, 4, 7, 6, Field.AUTONUM, 6, Field.AUTONUM, 6, 7, 6, Field.MACROBUTTON, 6, 5, 2, 0, 4, 9, 6, Field.AUTONUMLGL, 6, 3, 2, Field.AUTONUMLGL, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, Field.GOTOBUTTON, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 3, 1, 1, 0, 3, 0, 0, Field.AUTONUMLGL, 0, 6, 0, 3, 5, 5, 0, 4, 0, 3, 1, 3, 0, 7, 4, 1, 6, Field.AUTONUMLGL, 6, 4, 7, 2, 6, Field.AUTONUM, 6, 9, 6, 4, 8, 2, 0, 9, 0, 0, Field.MACROBUTTON, 2, Field.AUTONUMLGL, 0, 8, 7, 4, 6, 6, 4, 4, Field.EQ, 3, 0, 8, Field.AUTONUMOUT, 3, 0, 0, Field.MACROBUTTON, 0, 6, 0, 3, 5, 5, 1, Field.AUTONUMOUT, 1, 3, 0, 4, 0, 5, 3, 0, 0, 3, 0, 1, 0, 1, Field.AUTONUM, Field.AUTONUM, 3, 0, 0, Field.AUTONUMOUT, 0, 6, 0, 9, 2, Field.EQ, 8, 6, 4, 8, 8, 6, Field.AUTONUM, 7, 0, Field.AUTONUMOUT, 0, 1, 0, 1, 0, 4, 0, 5, 0, 0, 0, 3, 8, 2, 0, 1, 0, 1, 0, 0, 6, Field.AUTONUMOUT, Field.AUTONUMOUT, 2, 5, 2, Field.MACROBUTTON, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.AUTONUM, 8, 5, 3, 0, 2, Field.MACROBUTTON, 3, 6, 0, Field.EQ, Field.EQ, Field.EQ, Field.MACROBUTTON, Field.AUTONUMLGL, 9, 3, 9, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUM, Field.AUTONUM, 2, Field.MACROBUTTON, Field.MACROBUTTON, Field.EQ, 9, 0, 4, Field.GOTOBUTTON, Field.GOTOBUTTON, 5, Field.AUTONUMOUT, 7, Field.EQ, 1, 6, 6, 1, Field.AUTONUM, 8, Field.EQ, Field.AUTONUMLGL, 4, 6, Field.GOTOBUTTON, 2, 9, 9, 4, 2, 0, 4, Field.AUTONUMOUT, 0, Field.AUTONUM, Field.AUTONUM, 4, Field.EQ, 6, 8, Field.MACROBUTTON, 7, Field.AUTONUMLGL, Field.AUTONUMOUT, 1, Field.EQ, 5, 3, 1, Field.AUTONUMLGL, Field.MACROBUTTON, 4, 5, 9, 5, Field.EQ, 6, 2, 3, Field.MACROBUTTON, Field.AUTONUMLGL, 6, 0, 7, 6, 3, Field.GOTOBUTTON, 1, 6, 7, 2, 9, 7, Field.EQ, 7, Field.EQ, Field.AUTONUMLGL, 3, 5, 7, 1, 2, Field.MACROBUTTON, 4, 0, 7, Field.AUTONUM, 2, 0, 8, Field.AUTONUM, 0, Field.MACROBUTTON, Field.GOTOBUTTON, 1, 0, 9, 4, 2, 9, 1, 2, 4, Field.AUTONUMOUT, 7, Field.GOTOBUTTON, 1, 0, 6, 2, 1, 9, Field.MACROBUTTON, 0, 8, 4, Field.MACROBUTTON, Field.EQ, 3, Field.AUTONUMLGL, Field.GOTOBUTTON, 3, Field.AUTONUM, 9, Field.EQ, Field.AUTONUMOUT, 5, Field.AUTONUM, Field.GOTOBUTTON, 8, 7, 1, Field.AUTONUMLGL, Field.AUTONUM, 9, 2, 2, 6, 9, Field.EQ, 8, Field.GOTOBUTTON, Field.AUTONUMLGL, 2, 8, Field.GOTOBUTTON, Field.AUTONUM, 1, 6, Field.AUTONUMOUT, 4, 4, Field.MACROBUTTON, 8, Field.AUTONUMOUT, 9, Field.EQ, 0, 8, Field.AUTONUMLGL, 6, Field.MACROBUTTON, Field.GOTOBUTTON, 2, Field.AUTONUM, 0, 0, 5, Field.GOTOBUTTON, Field.GOTOBUTTON, 3, Field.AUTONUM, Field.AUTONUMLGL, 2, Field.MACROBUTTON, Field.GOTOBUTTON, 9, 6, 4, 4, 7, Field.AUTONUMLGL, 8, 6, 8, Field.AUTONUMLGL, 7, 3, 1, 0, 7, 6, Field.EQ, Field.AUTONUMOUT, 4, 5, Field.GOTOBUTTON, 3, 3, Field.AUTONUM, 6, 0, 0, 9, Field.AUTONUMLGL, Field.EQ, 1, 9, Field.MACROBUTTON, 1, 6, 1, Field.AUTONUMLGL, 6, 2, 6, 4, 1, Field.EQ, Field.EQ, 9, 9, 2, 7, 1, Field.AUTONUMOUT, Field.AUTONUM, Field.AUTONUMOUT, 5, 2, 2, 8, Field.MACROBUTTON, 5, Field.MACROBUTTON, 5, 8, 7, 8, 7, 5, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.GOTOBUTTON, 7, Field.AUTONUM, 4, 5, 2, 7, 5, 8, Field.AUTONUMOUT, 6, 6, 1, Field.AUTONUM, 6, Field.MACROBUTTON, Field.MACROBUTTON, 0, Field.MACROBUTTON, Field.MACROBUTTON, Field.MACROBUTTON, 
        Field.GOTOBUTTON, 7, 3, 5, 2, Field.AUTONUMLGL, 4, 2, 4, Field.MACROBUTTON, Field.MACROBUTTON, 4, 3, 6, 5, Field.MACROBUTTON, 5, 2, 3, 5, 3, 2, Field.AUTONUM, 7, 3, 2, 5, 1, 3, 7, 5, 9, 3, Field.MACROBUTTON, 4, Field.EQ, Field.AUTONUMLGL, 3, 4, 1, Field.AUTONUM, 4, Field.AUTONUMOUT, Field.GOTOBUTTON, 4, 1, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.EQ, 0, Field.AUTONUMOUT, 0, Field.GOTOBUTTON, 1, 0, 7, 1, Field.EQ, 7, Field.MACROBUTTON, 4, 4, 0, Field.AUTONUM, 0, Field.AUTONUM, Field.AUTONUMLGL, 9, Field.AUTONUMLGL, Field.EQ, 0, 1, Field.MACROBUTTON, Field.GOTOBUTTON, 6, 2, 7, Field.MACROBUTTON, Field.EQ, 6, 7, 4, 3, 6, 9, Field.AUTONUMOUT, 0, 8, 4, Field.GOTOBUTTON, Field.AUTONUMOUT, 2, Field.AUTONUM, Field.AUTONUMOUT, 9, 1, 1, Field.AUTONUM, Field.AUTONUM, 0, 6, Field.MACROBUTTON, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.AUTONUM, 2, Field.MACROBUTTON, Field.AUTONUM, Field.EQ, 1, 0, Field.AUTONUMOUT, Field.MACROBUTTON, 0, Field.AUTONUM, 8, 9, 3, Field.EQ, Field.AUTONUMLGL, 3, 5, 7, 6, 2, 9, 1, 9, 0, 4, 8, Field.MACROBUTTON, 7, Field.AUTONUMLGL, Field.AUTONUM, Field.MACROBUTTON, 6, 4, Field.MACROBUTTON, 7, 1, 4, 4, 1, 7, 8, 3, 4, 2, Field.AUTONUM, 7, 0, 5, 8, 1, Field.MACROBUTTON, 9, Field.AUTONUMOUT, Field.AUTONUMLGL, 5, 7, 3, Field.EQ, Field.AUTONUM, 5, 5, Field.GOTOBUTTON, 3, 9, 0, Field.AUTONUMOUT, Field.AUTONUMOUT, 7, Field.AUTONUM, Field.AUTONUMOUT, Field.GOTOBUTTON, 9, 4, 1, 8, 6, 3, 1, 8, 9, 5, Field.AUTONUMOUT, 5, Field.AUTONUM, 7, 5, 9, Field.AUTONUM, 3, 0, 1, 1, 2, 6, 8, 7, Field.AUTONUM, Field.AUTONUM, 6, 2, 1, 4, 1, 0, Field.MACROBUTTON, 0, 6, 9, 3, 0, 8, Field.EQ, -55, -58, -50, -56, -58, -54, -9, -50, -55, -58, -50, -56, -58, -55, -49, -58, -9, -58, -58, -55, -58, -56, -58, -57, -58, -56, -58, -56, -58, -49, -58, -58, -6, -53, -50, -53, -8, -50, -52, -7, -51, -6, -6, -55, -54, -5, -4, -53, -55, -58, -58, -6, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -57, -58, -54, -58, -53, -58, -58, -55, -58, -50, -57, -49, -54, -55, -57, -58, -8, -55, -58, -58, -49, -58, -52, -58, -55, -53, -53, -58, -54, -58, -52, -57, -55, -58, -56, -53, -53, -53, -55, -55, -57, -57, -55, -55, -58, -57, -57, -58, -52, -58, -55, -53, -53, -58, -54, -58, -50, -57, -55, -58, -9, -54, -55, -52, -57, -52, -7, -52, -49, -52, -52, -52, -4, -51, -56, -52, -5, -52, -49, -52, -57, -55, -57, -57, -52, -55, -58, -57, -54, -58, -52, -58, -55, -53, -53, -58, -54, -58, -51, -57, -55, -58, -6, -54, -6, -52, -4, -51, -53, -52, -5, -51, -54, -52, -57, -52, -49, -52, -5, -56, -58, -53, -52, -52, -49, -52, -53, -51, -51, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -9, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -8, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -55, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -56, -56, -55, -58, -56, -58, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -49, -58, -57, -57, -52, -57, -55, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -54, -58, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -56, -5, -52, -55, -52, -4, -52, -6, -55, -58, -57, -5, -57, -51, -58, -6, -55, -58, -55, -50, -55, -58, -55, -54, -55, -57, -55, -53, -55, -56, -55, -55, -55, -55, -55, -52, -55, -53, -55, -52, -53, -9, -57, -51, -58, -6, -55, -55, -55, -53, -55, -58, -55, -49, -55, -58, -55, -57, -55, -56, -55, -55, -55, -55, -55, -52, -55, -53, -55, -52, -53, -9, -55, -58, -50, -57, -49, -54, -55, -57, -58, -8, -55, -58, -58, -49, -58, -52, -58, -55, -53, -53, -58, -54, -58, -52, -57, -55, -58, -56, -53, -53, -53, -55, -55, -57, -57, -55, -55, -58, -57, -57, -58, -52, -58, -55, -53, -53, -58, -54, -58, -50, -57, -55, -58, -9, -54, -55, -52, -57, -52, -7, -52, -49, -52, -52, -52, -4, -51, -56, -52, -5, -52, -49, -52, -57, -55, -57, -57, -52, -55, -58, -57, -54, -58, -52, -58, -55, -53, -53, -58, -54, -58, -51, -57, -55, -58, -6, -54, -6, -52, -4, -51, -53, -52, -5, -51, -54, -52, -57, -52, -49, -52, -5, -56, -58, -53, -52, -52, -49, -52, -53, -51, -51, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -9, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -8, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -55, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -56, -56, -55, -58, -56, -58, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -49, -58, -57, -57, -52, -57, -55, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -54, -58, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -56, -5, -52, -55, -52, -4, -52, -6, -55, -58, -50, -56, -58, -57, -56, -58, -55, -58, -58, -6, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -57, -58, -57, -58, -53, 
        -58, -58, -58, -55, -50, -56, -58, -57, -58, -6, -58, -58, -55, -58, -50, -56, -58, -57, -58, -50, -58, -56, -50, -56, -58, -57, -58, -57, -58, -58, -6, -52, -7, -5, -56, -5, -58, -50, -58, -9, -8, -4, -5, -56, -55, -57, -54, -6, -6, -57, -50, -6, -8, -55, -7, -4, -6, -55, -57, -50, -53, -7, -8, -54, -55, -6, -55, -55, -4, -9, -58, -7, -51, -54, -5, -57, -8, -6, -8, -52, -6, -57, -6, -8, -50, -49, -57, -55, -4, -52, -56, -7, -53, -7, -55, -49, -6, -4, -53, -52, -4, -50, -54, -52, -50, -57, -55, -6, -52, -53, -8, -5, -7, -58, -4, -55, -7, -9, -54, -56, -52, -8, -58, -51, -7, -53, -9, -50, -5, -6, -53, -9, -55, -49, -49, -58, -7, -57, -52, -51, -5, -51, -52, -8, -7, -49, -49, -49, -8, -49, -56, -51, -50, -49, -54, -8, -50, -4, -58, -8, -56, -56, -58, -58, -57, -49, -49, -54, -9, -49, -56, -49, -57, -53, -5, -53, -51, -56, -7, -53, -52, -6, -56, -9, -55, -58, -57, -8, -9, -55, -52, -4, -7, -53, -4, -7, -57, -57, -55, -9, -6, -52, -7, -8, -49, -5, -51, -54, -55, -53, -9, -57, -52, -6, -56, -55, -9, -8, -51, -6, -4, -9, -5, -5, -5, -57, -52, -53, -5, -54, -6, -4, -57, -4, -58, -9, -50, -6, -8, -6, -9, -51, -58, -9, -50, -52, -49, -6, -53, -57, -52, -7, -54, -5, -49, -6, -58, -53, -57, -57, -49, -52, -7, -9, -51, -7, -58, -7, -53, -53, -51, -4, -57, -51, -53, -8, -7, -55, -51, -53, -4, -49, -54, -50, -7, -53, -52, -9, -9, -5, -50, -52, -58, -50, -49, -8, -9, -54, -54, -4, -50, -9, -9, -52, -9, -54, -6, -6, -49, -9, -51, -6, -8, -4, -56, -7, -58, -9, -55, -53, -56, -56, -50, -56, -9, -6, -58, -52, -8, -50, -7, -7, -57, -50, -53, -5, -8, -57, -53, -53, -51, -49, -5, -5, -4, -50, -52, -6, -58, -50, -58, -8, -57, -6, -52, -57, -50, -49, -7, -58, -4, -49, -9, -4, -49, -50, -8, -57, -7, -56, -5, -8, -6, -57, -58, -51, -5, -9, -54, -53, -9, -8, -6, -8, -52, -50, -9, -55, -7, -51, -50, -55, -50, -9, -53, -5, -53, -54, -50, -50, -7, -51, -52, -7, -53, -55, -6, -54, -58, -8, -57, -56, -57, -6, -5, -51, -8, -8, -6, -55, -58, -5, -52, -56, -58, -7, -57, -50, -50, -9, -5, -57, -9, -9, -52, -57, -6, -8, -8, -7, -50, -51, -6, -6, -55, -7, -52, -54, -53, -4, -56, -4, -53, -53, -4, -55, -6, -54, -7, -55, -51, -53, -5, -7, -54, -58, -51, -58, -9, -49, -55, -4, -51, -57, -53, -57, -6, -50, -55, -52, -51, -58, -7, -57, -52, -9, -49, -51, -57, -9, -8, -5, -53, -5, -4, -56, -6, -57, -57, -50, -49, -58, -5, -57, -8, -50, -9, -5, -4, -55, -56, -49, -50, -7, -4, -58, -52, -52, -8, -4, -49, -5, -52, -7, -5, -57, -54, -54, -9, -7, -49, -9, -5, -50, -52, -6, -57, -7, -57, -8, -58, -4, -58, -56, -58, -57, -58, -55, -9, -55, -50, -57, -4, -7, -55, -58, -50, -57, -4, -49, -55, -58, -57, -6, -58, -52, -58, -55, -53, -53, -57, -6, -58, -5, -58, -54, -57, -52, -58, -54, -57, -54, -50, -6, -57, -7, -7, -53, -8, -5, -49, -53, -54, -7, -54, -55, -55, -7, -52, -57, -50, -52, -55, -9, -57, -53, -8, -58, -54, -7, -8, -7, -58, -55, -4, -56, -54, -4, -5, -58, -8, -56, -55, -58, -50, -57, -7, -49, -58, -52, -58, -55, -53, -53, -57, -6, -56, -55, -58, -54, -50, -57, -7, -57, -55, -58, -50, -57, -8, -5, -50, -58, -57, -54, -50, -6, -57, -7, -7, -53, -8, -5, -49, -53, -54, -7, -54, -55, -55, -7, -52, -57, -50, -52, -55, -9, -57, -53, -8, -58, -54, -7, -8, -7, -58, -55, -4, -56, -54, -4, -5, -58, -8, -56, -9, -57, -50, -57, -49, -9, -9, -54, -50, -57, -49, -51, -55, -58, -50, -57, -49, -54, -55, -57, -58, -8, -55, -58, -58, -49, -58, -52, -58, -55, -53, -53, -58, -54, -58, -52, -57, -55, -58, -56, -53, -53, -53, -55, -55, -57, -57, -55, -55, -58, -57, -57, -58, -52, -58, -55, -53, -53, -58, -54, -58, -50, -57, -55, -58, -9, -54, -55, -52, -57, -52, -7, -52, -49, -52, -52, -52, -4, -51, -56, -52, -5, -52, -49, -52, -57, -55, -57, -57, -52, -55, -58, -57, -54, -58, -52, -58, -55, -53, -53, -58, -54, -58, -51, -57, -55, -58, -6, -54, -6, -52, -4, -51, -53, -52, -5, -51, -54, -52, -57, -52, -49, -52, -5, -56, -58, -53, -52, -52, -49, -52, -53, -51, -51, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -9, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -8, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -57, -58, -55, -58, -58, -5, -58, -52, -58, -55, -53, -53, -58, -54, -58, -55, -57, -55, -58, -51, -54, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -55, -57, -56, -56, -55, -58, -56, -58, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -49, -58, -57, -57, -52, -57, -55, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, -54, -58, -52, -57, -52, -5, -52, -54, -51, -56, -52, -4, -52, -49, -52, -54, 
        -56, -5, -52, -55, -52, -4, -52, -6, -50, -56, -58, -49, -58, -58, -6, -53, -50, -53, -8, -50, -52, -7, -51, -6, -6, -55, -54, -5, -4, -53, -55, -58, -58, -7, -58, -52, -58, -55, -53, -53, -57, -6, -57, -55, -58, -54, -58, -53, -55, -58, -58, -55, -58, -57, -58, -57, -4, -4, -55, -58, -58, -6, -58, -52, -58, -49, -56, -9, -50, -52, -54, -50, -50, -52, -4, -51, -58, -6, -58, -57, -58, -57, -58, -54, -58, -53, -58, -58, -58, -55, -50, -56, -58, -57, -58, -57, -58, -58, -57, -49, -6, -55, -58, -7, -4, -57, -58, -53, -4, -8, -51, -50, -49, -56, -55, -4, -54, -7, -58, -6, -51, -6, -6, -56, -56, -55, -56, -55, -55, -6, -54, -58, -49, -52, -51, -9, -7, -4, -7, -5, -58, -58, -58, -50, -57, -6, -53, -8, -6, -51, -7, -52, -5, -49, -6, -52, -5, -6, -56, -58, -52, -8, -58, -5, -57, -57, -56, -58, -49, -53, -58, -52, -54, -57, -52, -7, -9, -56, -54, -54, -49, -55, -49, -49, -57, -55, -6, -56, -52, -8, -54, -9, -9, -58, -5, -58, -4, -53, -56, -54, -7, -9, -6, -56, -8, -8, -53, -7, -52, -5, -54, -7, -9, -57, -58, -57, -52, -9, -57, -53, -49, -57, -52, -5, -9, -57, -5, -7, -53, -6, -7, -49, -53, -9, -53, -5, -55, -9, -58, -57, -58, -58, -55, -52, -4, -54, -49, -56, -54, -50, -6, -53, -57, -58, -49, -8, -8, -4, -56, -5, -57, -5, -52, -57, -50, -57, -50, -52, -52, -51, -55, -9, -55, -8, -5, -53, -52, -6, -9, -4, -58, -8, -51, -51, -8, -57, -7, -56, -56, -49, -5, -55, -7, -56, -53, -53, -5, -55, -5, -50, -54, -7, -49, -58, -53, -6, -56, -55, -50, -51, -5, -4, -8, -9, -58, -49, -7, -8, -4, -57, -55, -8, -56, -58, -56, -8, -54, -5, -53, -9, -56, -56, -7, -49, -55, -56, -52, -55, -54, -50, -54, -9, -56, -55, -6, -56, -4, -7, -56, -49, -4, -9, -49, -4, -57, -49, -55, -49, -51, -53, -49, -51, -55, -55, -9, -4, -6, -50, -9, -9, -57, -52, -58, -4, -54, -56, -49, -52, -7, -56, -6, -58, -57, -52, -55, -5, -50, -57, -50, -56, -50, -53, -49, -7, -52, -52, -54, -55, -5, -49, -7, -57, -49, -52, -56, -4, -9, -58, -7, -57, -50, -55, -55, -55, -55, -55, -53, -8, -7, -58, -49, -58, -4, -4, -49, -9, -52, -8, -56, -56, -6, -5, -6, -57, -9, -6, -54, -54, -54, -56, -56, -49, -9, -53, -55, -49, -9, -49, -54, -5, -5, -4, -9, -6, -9, -8, -6, -58, -52, -53, -7, -5, -6, -56, -54, -8, -55, -5, -53, -57, -5, -53, -6, -6, -51, -8, -52, -52, -51, -50, -51, -8, -5, -4, -57, -56, -4, -5, -49, -51, -4, -8, -9, -54, -50, -54, -7, -54, -56, -55, -4, -8, -54, -4, -4, -50, -7, -7, -54, -49, -54, -7, -58, -56, -4, -58, -4, -53, -58, -53, -57, -52, -57, -56, -4, -4, -52, -53, -56, -49, -55, -49, -55, -5, -50, -5, -54, -52, -5, -9, -7, -53, -8, -8, -56, -57, -4, -56, -51, -51, -7, -57, -53, -57, -9, -9, -53, -4, -56, -9, -9, -52, -56, -51, -6, -57, -5, -50, -49, -6, -9, -51, -58, -9, -8, -52, -58, -55, -55, -53, -52, -49, -6, -5, -55, -8, -49, -50, -49, -51, -8, -4, -4, -4, -51, -7, -9, -49, -6, -9, -55, -5, -57, -56, -54, -55, -4, -52, -58, -8, -33, -3, 10, -61, 16, -68, 2, 1, 16, -1, 4, -68, -16, -11, -20, -31, -5, -13, -28, -21, -24, -31, -5, -23, -32, -47, -68, 2, 5, 1, 8, 0, -54, -7, Field.NUMCHARS, 31, 24, -45, 33, 34, Field.FILLIN, -45, 25, 34, Field.DATA, 33, 23, -45, 34, Field.PAGEREF, -45, 33, 34, Field.FILLIN, -45, 20, 22, 22, 24, Field.ASK, Field.ASK, Field.NUMCHARS, 21, 31, 24, -31, Field.GOTOBUTTON, 56, 9, 78, 97, 76, 78, Field.AUTOTEXTLIST, Field.ADDRESSBLOCK, 82, Field.HYPERLINK, Field.CONTROL, 23, -50, -59, -74, -66, -33, -112, -29, -27, -45, -40, -112, -47, -36, -41, -33, -30, -39, -28, -40, -35, -98, 34, Field.FILLIN, 30, 19, Field.DDE, Field.PAGEREF, 22, 29, 26, 19, Field.DDE, Field.NUMWORDS, 18, 3, 21, -21, -14, -19, -10, 77, Field.LISTNUM, 80, Field.GREETINGLINE, Field.HTMLCONTROL, Field.DOCPROPERTY, 80, 26, Field.AUTOTEXT, Field.HTMLCONTROL, Field.LISTNUM, 96, Field.ADDIN, Field.LISTNUM, 96, 26, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, 26, Field.GLOSSARY, Field.ADVANCE, Field.ADDIN, Field.AUTOTEXT, Field.CONTROL, Field.SHAPE, 97, Field.AUTOTEXTLIST, 17, 30, 20, 34, 31, 25, 20, -34, 19, 31, 30, 36, 21, 30, 36, -34, 32, 29, -34, 0, 17, 19, Field.NUMWORDS, 17, 23, 21, -3, 17, 30, 17, 23, 21, 34, -44, -1, 30, -13, 24, 21, 19, Field.NUMWORDS, Field.QUOTE, Field.PAGEREF, 29, Field.QUOTE, 2, 21, 17, 20, 41, -4, 25, Field.QUOTE, 36, 21, 30, 21, 34, 16, 32, -51, 26, 34, 32, 33, -51, 21, 14, Field.QUOTE, 18, -51, 14, Field.NUMWORDS, -51, 18, Field.QUOTE, 18, Field.NUMWORDS, -51, 25, 18, Field.NUMWORDS, 20, 33, 21, -3, -5, 4, -5, 8, -1, -7, Field.HYPERLINK, Field.MERGESEQ, Field.CONTROL, Field.HTMLCONTROL, Field.MERGESEQ, Field.AUTOTEXTLIST, Field.LISTNUM, 41, 78, Field.MERGESEQ, Field.TOA, Field.ADDIN, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.FORMDROPDOWN, Field.AUTOTEXTLIST};
    }

    static {
        A06();
    }

    public static String A03(String str) throws Exception {
        return A02(new File(str));
    }

    public static String A04(byte[] bArr) {
        char c;
        StringBuilder sb2 = new StringBuilder();
        for (int halfbyte : bArr) {
            int i10 = (halfbyte >>> 4) & 15;
            int i11 = 0;
            while (true) {
                if (i10 >= 0 && i10 <= 9) {
                    c = (char) (i10 + 48);
                } else {
                    c = (char) ((i10 - 10) + 97);
                }
                sb2.append(c);
                i10 = halfbyte & 15;
                int i12 = i11 + 1;
                if (i11 >= 1) {
                    break;
                }
                i11 = i12;
            }
        }
        return sb2.toString();
    }

    public static String A05(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    public static byte[] A07(CharSequence charSequence) {
        int length = charSequence.length();
        int numCh = length & 1;
        if (numCh == 0) {
            int numCh2 = length >> 1;
            byte[] bArr = new byte[numCh2];
            for (int lo2 = 0; lo2 < length; lo2 += 2) {
                int p10 = Character.digit(charSequence.charAt(lo2), 16);
                int numCh3 = lo2 + 1;
                int digit = Character.digit(charSequence.charAt(numCh3), 16);
                int numCh4 = p10 | digit;
                if (numCh4 >= 0) {
                    int i10 = lo2 >> 1;
                    int numCh5 = p10 << 4;
                    byte b10 = (byte) (numCh5 | digit);
                    String[] strArr = A01;
                    String str = strArr[6];
                    String str2 = strArr[1];
                    int length2 = str.length();
                    int numCh6 = str2.length();
                    if (length2 == numCh6) {
                        throw new RuntimeException();
                    }
                    A01[4] = "WhFO3tLIupYZHxNvDfilzdcLkcQDfxWw";
                    bArr[i10] = b10;
                } else {
                    throw new IllegalArgumentException(((Object) charSequence) + A00(0, 28, 55));
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException(A00(4814, 27, 64));
    }
}
