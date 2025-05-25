package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    private static volatile PglCryptUtils Qhi = null;
    private static volatile boolean cJ = true;

    private PglCryptUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #4 {Exception -> 0x0057, blocks: (B:35:0x0053, B:39:0x005b), top: B:47:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] Qhi(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L66
            int r1 = r4.length()
            if (r1 != 0) goto Lb
            goto L66
        Lb:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r3 = "utf-8"
            byte[] r4 = r4.getBytes(r3)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L4f
            r2.write(r4)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Exception -> L3f
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Exception -> L3f
            r1.close()     // Catch: java.lang.Exception -> L3f
            goto L4e
        L29:
            r4 = move-exception
            goto L36
        L2b:
            r4 = move-exception
            goto L51
        L2d:
            r4 = move-exception
            r2 = r0
            goto L36
        L30:
            r4 = move-exception
            r1 = r0
            goto L51
        L33:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L36:
            r4.toString()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L41
            r2.close()     // Catch: java.lang.Exception -> L3f
            goto L41
        L3f:
            r4 = move-exception
            goto L4b
        L41:
            if (r1 == 0) goto L4e
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Exception -> L3f
            r1.close()     // Catch: java.lang.Exception -> L3f
            goto L4e
        L4b:
            r4.toString()
        L4e:
            return r0
        L4f:
            r4 = move-exception
            r0 = r2
        L51:
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.lang.Exception -> L57
            goto L59
        L57:
            r0 = move-exception
            goto L62
        L59:
            if (r1 == 0) goto L65
            r1.toByteArray()     // Catch: java.lang.Exception -> L57
            r1.close()     // Catch: java.lang.Exception -> L57
            goto L65
        L62:
            r0.toString()
        L65:
            throw r4
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.pglcrypt.PglCryptUtils.Qhi(java.lang.String):byte[]");
    }

    public static native byte[] bc(int i10, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (Qhi == null) {
            synchronized (PglCryptUtils.class) {
                if (Qhi == null) {
                    System.loadLibrary("pglarmor");
                    Qhi = new PglCryptUtils();
                }
            }
        }
        return Qhi;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) {
        byte[] bArr;
        if (!cJ) {
            return new Pair<>(Integer.valueOf((int) LOAD_SO_FAILED), null);
        }
        if (str != null && str.length() != 0) {
            byte[] decode = Base64.decode(str, 0);
            if (decode != null && decode.length != 0) {
                try {
                    bArr = bc(1011, decode);
                } catch (Throwable th2) {
                    th2.toString();
                    bArr = null;
                }
                if (bArr != null && bArr.length != 0) {
                    String Qhi2 = Qhi(bArr);
                    if (TextUtils.isEmpty(Qhi2)) {
                        return new Pair<>(Integer.valueOf((int) COMPRESS_FAILED), null);
                    }
                    return new Pair<>(0, Qhi2);
                }
                return new Pair<>(Integer.valueOf((int) DECRYPT_FAILED), null);
            }
            return new Pair<>(Integer.valueOf((int) BASE64_FAILED), null);
        }
        return new Pair<>(Integer.valueOf((int) INPUT_INVALID), null);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) {
        byte[] bArr;
        if (cJ) {
            if (jSONObject == null) {
                return new Pair<>(Integer.valueOf((int) INPUT_INVALID), null);
            }
            byte[] Qhi2 = Qhi(jSONObject.toString());
            if (Qhi2 != null && Qhi2.length != 0) {
                try {
                    bArr = bc(1010, Qhi2);
                } catch (Throwable th2) {
                    th2.toString();
                    bArr = null;
                }
                if (bArr != null && bArr.length != 0) {
                    String encodeToString = Base64.encodeToString(bArr, 0);
                    JSONObject jSONObject2 = new JSONObject();
                    if (TextUtils.isEmpty(encodeToString)) {
                        return new Pair<>(Integer.valueOf((int) BASE64_FAILED), null);
                    }
                    jSONObject2.put(KEY_MESSAGE, encodeToString);
                    jSONObject2.put("cypher", 4);
                    return new Pair<>(0, jSONObject2);
                }
                return new Pair<>(Integer.valueOf((int) ENCRYPT_FAILED), null);
            }
            return new Pair<>(Integer.valueOf((int) COMPRESS_FAILED), null);
        }
        return new Pair<>(Integer.valueOf((int) LOAD_SO_FAILED), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.Exception] */
    private static String Qhi(byte[] e10) {
        GZIPInputStream gZIPInputStream;
        Throwable th2;
        Exception exc;
        String str;
        String str2 = null;
        String str3 = null;
        r0 = null;
        GZIPInputStream gZIPInputStream2 = null;
        if (e10 != 0) {
            try {
                if (e10.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                        e10 = new ByteArrayOutputStream();
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read != -1) {
                                        e10.write(bArr, 0, read);
                                    } else {
                                        str3 = e10.toString("utf-8");
                                        byteArrayInputStream.close();
                                        try {
                                            gZIPInputStream.close();
                                            e10.close();
                                            return str3;
                                        } catch (Exception e11) {
                                            e11.toString();
                                            return str3;
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                str = str3;
                                gZIPInputStream2 = gZIPInputStream;
                                exc = e12;
                                e10 = e10;
                                exc.toString();
                                if (gZIPInputStream2 != null) {
                                    try {
                                        gZIPInputStream2.close();
                                    } catch (Exception e13) {
                                        e10 = e13;
                                        e10.toString();
                                        str2 = str;
                                        return str2;
                                    }
                                }
                                if (e10 != 0) {
                                    e10.close();
                                }
                                str2 = str;
                                return str2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (Exception e14) {
                                        e14.toString();
                                        throw th2;
                                    }
                                }
                                if (e10 != 0) {
                                    e10.close();
                                }
                                throw th2;
                            }
                        } catch (Exception e15) {
                            exc = e15;
                            str = null;
                            e10 = e10;
                        }
                    } catch (Exception e16) {
                        e10 = 0;
                        exc = e16;
                        str = null;
                    } catch (Throwable th4) {
                        gZIPInputStream = null;
                        th2 = th4;
                        e10 = 0;
                    }
                }
            } catch (Throwable th5) {
                gZIPInputStream = str2;
                th2 = th5;
            }
        }
        return null;
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArr2;
        if (!cJ) {
            return new Pair<>(Integer.valueOf((int) LOAD_SO_FAILED), null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArr2 = bc(1010, bArr);
            } catch (Throwable th2) {
                th2.toString();
                bArr2 = null;
            }
            if (bArr2 != null && bArr2.length != 0) {
                return new Pair<>(0, bArr2);
            }
            return new Pair<>(Integer.valueOf((int) ENCRYPT_FAILED), null);
        }
        return new Pair<>(Integer.valueOf((int) INPUT_INVALID), null);
    }
}
