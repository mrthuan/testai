package com.bytedance.sdk.component.fl.ac.Qhi.Qhi;

import com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: LruCountDiskCache.java */
/* loaded from: classes.dex */
public class cJ implements com.bytedance.sdk.component.fl.ac {
    private long Qhi;
    private Qhi cJ;

    public cJ(File file, long j10, ExecutorService executorService) {
        this.Qhi = j10;
        try {
            this.cJ = Qhi.Qhi(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            e10.toString();
        }
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    /* renamed from: ac */
    public boolean cJ(String str) {
        boolean z10 = false;
        try {
            try {
                Qhi.ac Qhi = this.cJ.Qhi(str);
                if (Qhi != null) {
                    z10 = true;
                }
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(Qhi);
                return z10;
            } catch (IOException e10) {
                e10.getMessage();
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(null);
                return false;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    @Override // com.bytedance.sdk.component.fl.Qhi
    /* renamed from: cJ  reason: avoid collision after fix types in other method */
    public byte[] Qhi(String str) {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        Qhi qhi = this.cJ;
        Closeable closeable2 = null;
        if (qhi != null) {
            try {
                if (str != 0) {
                    try {
                        Qhi.ac Qhi = qhi.Qhi((String) str);
                        if (Qhi == null) {
                            com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(null);
                            com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(null);
                            return null;
                        }
                        str = Qhi.Qhi(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e10) {
                                e = e10;
                                byteArrayOutputStream = null;
                                e.toString();
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(str);
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = null;
                                closeable2 = str;
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable);
                                throw th;
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = str.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            } catch (IOException e11) {
                                e = e11;
                                e.toString();
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(str);
                                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(byteArrayOutputStream);
                                return null;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(str);
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        str = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fl.ac
    public InputStream Qhi(String str) {
        Qhi qhi = this.cJ;
        if (qhi == null) {
            return null;
        }
        try {
            Qhi.ac Qhi = qhi.Qhi(str);
            if (Qhi != null) {
                return Qhi.Qhi(0);
            }
        } catch (IOException e10) {
            e10.getMessage();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public boolean Qhi(String str, byte[] bArr) {
        OutputStream outputStream;
        Qhi qhi = this.cJ;
        if (qhi == null || bArr == null || str == null) {
            return false;
        }
        OutputStream outputStream2 = null;
        outputStream2 = null;
        Qhi.C0096Qhi c0096Qhi = null;
        try {
            try {
                Qhi.C0096Qhi cJ = qhi.cJ(str);
                if (cJ == null) {
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(null);
                    return false;
                }
                try {
                    outputStream2 = cJ.Qhi(0);
                    if (outputStream2 == Qhi.f8377ac) {
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(outputStream2);
                        return false;
                    }
                    outputStream2.write(bArr);
                    cJ.Qhi();
                    this.cJ.Qhi();
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(outputStream2);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    OutputStream outputStream3 = outputStream2;
                    c0096Qhi = cJ;
                    outputStream = outputStream3;
                    try {
                        e.toString();
                        if (c0096Qhi != null) {
                            try {
                                c0096Qhi.cJ();
                            } catch (IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(outputStream);
                        return false;
                    } catch (Throwable th2) {
                        outputStream2 = outputStream;
                        th = th2;
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(outputStream2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(outputStream2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            outputStream = null;
        }
    }
}
