package com.bytedance.sdk.openadsdk.fl;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.cJ.Qhi.ROR;
import com.bytedance.sdk.component.cJ.Qhi.Tgh;
import com.bytedance.sdk.component.cJ.Qhi.WAv;
import com.bytedance.sdk.component.cJ.Qhi.ac;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.pA;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultNetWork.java */
/* loaded from: classes.dex */
public class Qhi implements INetWork {
    protected zc Qhi;
    protected zc cJ;

    public Qhi() {
        zc.Qhi qhi = new zc.Qhi();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.Qhi = qhi.Qhi(10L, timeUnit).cJ(10L, timeUnit).ac(10L, timeUnit).Qhi();
        this.cJ = new zc.Qhi().Qhi(10L, timeUnit).cJ(30L, timeUnit).ac(30L, timeUnit).Qhi();
    }

    private Map<String, String> Qhi(ROR ror) {
        if (ror == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < ror.Qhi(); i10++) {
            hashMap.put(ror.Qhi(i10), ror.cJ(i10));
        }
        return hashMap;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) {
        String str2;
        hpZ Qhi = this.Qhi.Qhi(new iMK.Qhi().Qhi().cJ(str).cJ()).Qhi();
        Map<String, String> Qhi2 = Qhi(Qhi.ROR());
        if (Qhi.ac() == 200) {
            str2 = Qhi.Tgh().cJ();
        } else {
            str2 = null;
        }
        return new Response(Qhi2, str2, Qhi.ac(), Qhi.fl());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) {
        Tgh.Qhi qhi = new Tgh.Qhi();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                qhi.Qhi((String) pair.first, (String) pair.second);
            }
        }
        hpZ Qhi = this.Qhi.Qhi(new iMK.Qhi().cJ(str).Qhi((pA) qhi.Qhi()).cJ()).Qhi();
        return new Response(Qhi(Qhi.ROR()), Qhi.ac() == 200 ? Qhi.Tgh().cJ() : null, Qhi.ac(), Qhi.fl());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0076: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x0076 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) {
        Exception e10;
        Closeable closeable;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    hpZ Qhi = this.cJ.Qhi(new iMK.Qhi().Qhi().cJ(str).cJ()).Qhi();
                    int ac2 = Qhi.ac();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(Qhi.Tgh().ac());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 2048);
                                if (read != -1) {
                                    bufferOutputStream.write(bArr, 0, read);
                                } else {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            i10 = ac2;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.Qhi.Qhi(new iMK.Qhi().Qhi().cJ(str).cJ()).Qhi(new ac() { // from class: com.bytedance.sdk.openadsdk.fl.Qhi.1
            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, hpZ hpz) {
            }

            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) {
        hpZ Qhi = this.Qhi.Qhi(new iMK.Qhi().cJ(str).Qhi(pA.Qhi(WAv.Qhi("application/json; charset=utf-8"), str2)).cJ()).Qhi();
        return new Response(Qhi(Qhi.ROR()), Qhi.ac() == 200 ? Qhi.Tgh().cJ() : null, Qhi.ac(), Qhi.fl());
    }
}
