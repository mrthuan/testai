package com.bytedance.sdk.component.ROR.cJ;

import a6.h;
import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import com.inmobi.unification.sdk.InitializationStatus;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: DownloadExecutor.java */
/* loaded from: classes.dex */
public class Qhi extends ac {
    public File Qhi;
    public File cJ;

    public Qhi(zc zcVar) {
        super(zcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ROR(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long Tgh(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else if (map.containsKey("Content-Length")) {
            str = map.get("Content-Length");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fl(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        if (str != null && str.startsWith("bytes")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        try {
            this.Qhi.delete();
        } catch (Throwable unused) {
        }
        try {
            this.cJ.delete();
        } catch (Throwable unused2) {
        }
    }

    public void Qhi(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.Qhi = new File(str, str2);
        this.cJ = new File(str, h.c(str2, ".temp"));
    }

    public void Qhi(final com.bytedance.sdk.component.ROR.Qhi.Qhi qhi) {
        File file = this.Qhi;
        if (file == null || this.cJ == null) {
            if (qhi != null) {
                qhi.Qhi(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.Qhi.length() != 0 && qhi != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.ROR.cJ cJVar = new com.bytedance.sdk.component.ROR.cJ(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            cJVar.Qhi(this.Qhi);
            qhi.Qhi(this, cJVar);
            return;
        }
        long length = this.cJ.length();
        final long j10 = length >= 0 ? length : 0L;
        iMK.Qhi qhi2 = new iMK.Qhi();
        qhi2.Qhi((Object) cJ());
        cJ("Range", "bytes=" + j10 + "-");
        if (TextUtils.isEmpty(this.Sf)) {
            qhi.Qhi(this, new IOException("Url is Empty"));
            return;
        }
        try {
            qhi2.cJ(this.Sf);
            if (!TextUtils.isEmpty(this.f8023fl)) {
                qhi2.Qhi(this.f8023fl);
            }
            int i10 = this.Tgh;
            if (i10 > 0) {
                qhi2.Qhi(i10);
            }
            Qhi(qhi2);
            this.f8022ac.Qhi(qhi2.Qhi().cJ()).Qhi(new com.bytedance.sdk.component.cJ.Qhi.ac() { // from class: com.bytedance.sdk.component.ROR.cJ.Qhi.1
                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar2, IOException iOException) {
                    com.bytedance.sdk.component.ROR.Qhi.Qhi qhi3 = qhi;
                    if (qhi3 != null) {
                        qhi3.Qhi(Qhi.this, iOException);
                    }
                    Qhi.this.ac();
                }

                /* JADX WARN: Removed duplicated region for block: B:130:0x0175 A[EDGE_INSN: B:130:0x0175->B:64:0x0175 ?: BREAK  , SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:132:0x016f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0165 A[Catch: all -> 0x0183, TryCatch #3 {all -> 0x0183, blocks: (B:54:0x014f, B:56:0x0157, B:62:0x0165, B:66:0x017a, B:71:0x018c, B:73:0x0196, B:75:0x01a2, B:77:0x01ae, B:78:0x01bd, B:79:0x01ca, B:82:0x01e4), top: B:114:0x014f }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[Catch: all -> 0x0183, TryCatch #3 {all -> 0x0183, blocks: (B:54:0x014f, B:56:0x0157, B:62:0x0165, B:66:0x017a, B:71:0x018c, B:73:0x0196, B:75:0x01a2, B:77:0x01ae, B:78:0x01bd, B:79:0x01ca, B:82:0x01e4), top: B:114:0x014f }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01e3  */
                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ r18, com.bytedance.sdk.component.cJ.Qhi.hpZ r19) {
                    /*
                        Method dump skipped, instructions count: 557
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ROR.cJ.Qhi.AnonymousClass1.Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ, com.bytedance.sdk.component.cJ.Qhi.hpZ):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            qhi.Qhi(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x01c4 A[EDGE_INSN: B:169:0x01c4->B:82:0x01c4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197 A[Catch: all -> 0x0223, TryCatch #1 {all -> 0x0223, blocks: (B:63:0x0178, B:65:0x017e, B:67:0x0182, B:68:0x0188, B:69:0x018f, B:71:0x0197, B:73:0x01a7, B:79:0x01b3, B:84:0x01c9, B:92:0x01e1, B:94:0x01e9, B:96:0x01f3, B:98:0x01fd, B:106:0x0213, B:89:0x01d7), top: B:145:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3 A[Catch: all -> 0x0223, TryCatch #1 {all -> 0x0223, blocks: (B:63:0x0178, B:65:0x017e, B:67:0x0182, B:68:0x0188, B:69:0x018f, B:71:0x0197, B:73:0x01a7, B:79:0x01b3, B:84:0x01c9, B:92:0x01e1, B:94:0x01e9, B:96:0x01f3, B:98:0x01fd, B:106:0x0213, B:89:0x01d7), top: B:145:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9 A[Catch: all -> 0x0223, TryCatch #1 {all -> 0x0223, blocks: (B:63:0x0178, B:65:0x017e, B:67:0x0182, B:68:0x0188, B:69:0x018f, B:71:0x0197, B:73:0x01a7, B:79:0x01b3, B:84:0x01c9, B:92:0x01e1, B:94:0x01e9, B:96:0x01f3, B:98:0x01fd, B:106:0x0213, B:89:0x01d7), top: B:145:0x0178 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.ROR.cJ Qhi() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ROR.cJ.Qhi.Qhi():com.bytedance.sdk.component.ROR.cJ");
    }
}
