package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.Qhi.cJ.Sf;
import com.facebook.ads.AdError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ProxyServer.java */
/* loaded from: classes.dex */
public class ROR {
    private static volatile ROR CJ;
    private final AtomicBoolean ABk;
    private volatile ac Gm;
    private volatile ServerSocket Qhi;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.cJ ROR;
    private final SparseArray<Set<Sf>> Sf;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac Tgh;
    private volatile ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final AtomicInteger f7137ac = new AtomicInteger(0);
    private volatile int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac f7138fl;

    /* renamed from: hm  reason: collision with root package name */
    private final Sf.ac f7139hm;

    /* renamed from: zc  reason: collision with root package name */
    private final Runnable f7140zc;

    /* compiled from: ProxyServer.java */
    /* loaded from: classes.dex */
    public static final class Qhi implements Callable<Boolean> {
        private final String Qhi;
        private final int cJ;

        public Qhi(String str, int i10) {
            this.Qhi = str;
            this.cJ = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: Qhi */
        public Boolean call() {
            Socket socket;
            Throwable th2;
            try {
                socket = new Socket(this.Qhi, this.cJ);
            } catch (Throwable th3) {
                socket = null;
                th2 = th3;
            }
            try {
                socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi));
                outputStream.flush();
                if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    return Boolean.TRUE;
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    th2.getMessage();
                    ROR.Qhi("ping error", Log.getStackTraceString(th2));
                    com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(socket);
                    return Boolean.FALSE;
                } finally {
                    com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(socket);
                }
            }
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(socket);
            return Boolean.FALSE;
        }
    }

    private ROR() {
        SparseArray<Set<Sf>> sparseArray = new SparseArray<>(2);
        this.Sf = sparseArray;
        this.f7139hm = new Sf.ac() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.ROR.1
            @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.ac
            public void Qhi(Sf sf2) {
                synchronized (ROR.this.Sf) {
                    Set set = (Set) ROR.this.Sf.get(sf2.Tgh());
                    if (set != null) {
                        set.add(sf2);
                    }
                }
            }

            @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.ac
            public void cJ(Sf sf2) {
                if (Tgh.f7143ac) {
                    "afterExecute, ProxyTask: ".concat(String.valueOf(sf2));
                }
                int Tgh = sf2.Tgh();
                synchronized (ROR.this.Sf) {
                    Set set = (Set) ROR.this.Sf.get(Tgh);
                    if (set != null) {
                        set.remove(sf2);
                    }
                }
            }
        };
        this.f7140zc = new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.ROR.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i10 = 0;
                    ROR.this.Qhi = new ServerSocket(0, 50, InetAddress.getByName(ROR.this.hm()));
                    ROR ror = ROR.this;
                    ror.cJ = ror.Qhi.getLocalPort();
                    if (ROR.this.cJ == -1) {
                        ROR.Qhi("socket not bound", "");
                        ROR.this.fl();
                        return;
                    }
                    Gm.Qhi(ROR.this.hm(), ROR.this.cJ);
                    if (ROR.this.ROR()) {
                        AtomicInteger unused = ROR.this.f7137ac;
                        if (ROR.this.f7137ac.compareAndSet(0, 1)) {
                            AtomicInteger unused2 = ROR.this.f7137ac;
                            boolean z10 = Tgh.f7143ac;
                            while (ROR.this.f7137ac.get() == 1) {
                                try {
                                    try {
                                        Socket accept = ROR.this.Qhi.accept();
                                        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar = ROR.this.f7138fl;
                                        if (acVar != null) {
                                            final Sf Qhi2 = new Sf.Qhi().Qhi(acVar).Qhi(accept).Qhi(ROR.this.f7139hm).Qhi();
                                            com.bytedance.sdk.component.Sf.ROR.ac().execute(new com.bytedance.sdk.component.Sf.hm("ProxyTask", 10) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.ROR.2.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    Qhi2.run();
                                                }
                                            });
                                        } else {
                                            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(accept);
                                        }
                                    } catch (IOException e10) {
                                        ROR.Qhi("accept error", Log.getStackTraceString(e10));
                                        i10++;
                                        if (i10 > 3) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    String stackTraceString = Log.getStackTraceString(th2);
                                    "proxy server crashed!  ".concat(String.valueOf(stackTraceString));
                                    ROR.Qhi("error", stackTraceString);
                                }
                            }
                            boolean z11 = Tgh.f7143ac;
                            ROR.this.fl();
                        }
                    }
                } catch (IOException e11) {
                    if (Tgh.f7143ac) {
                        Log.getStackTraceString(e11);
                    }
                    ROR.Qhi("create ServerSocket error", Log.getStackTraceString(e11));
                    ROR.this.fl();
                }
            }
        };
        this.ABk = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static /* synthetic */ void Qhi(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ROR() {
        com.bytedance.sdk.component.Sf.Sf sf2 = new com.bytedance.sdk.component.Sf.Sf(new Qhi(hm(), this.cJ), 5, 1);
        com.bytedance.sdk.component.Sf.ROR.ac().submit(sf2);
        Sf();
        try {
            if (!((Boolean) sf2.get()).booleanValue()) {
                fl();
                return false;
            }
            boolean z10 = Tgh.f7143ac;
            return true;
        } catch (Throwable th2) {
            Log.getStackTraceString(th2);
            fl();
            return false;
        }
    }

    private void Sf() {
        Socket socket = null;
        try {
            socket = this.Qhi.accept();
            socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi));
                outputStream.flush();
            }
        } catch (IOException e10) {
            Log.getStackTraceString(e10);
        } finally {
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(socket);
        }
    }

    private void Tgh() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.Sf) {
            int size = this.Sf.size();
            for (int i10 = 0; i10 < size; i10++) {
                SparseArray<Set<Sf>> sparseArray = this.Sf;
                Set<Sf> set = sparseArray.get(sparseArray.keyAt(i10));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Sf) it.next()).Qhi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fl() {
        if (this.f7137ac.compareAndSet(1, 2) || this.f7137ac.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(this.Qhi);
            Tgh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String hm() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    public void CJ() {
        if (this.ABk.compareAndSet(false, true)) {
            Thread thread = new Thread(this.f7140zc);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    public ac ac() {
        return this.Gm;
    }

    public ac cJ() {
        return this.WAv;
    }

    public boolean Qhi(int i10, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.Sf) {
            Set<Sf> set = this.Sf.get(i10);
            if (set != null) {
                for (Sf sf2 : set) {
                    if (sf2 != null && str.equals(sf2.Sf)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static ROR Qhi() {
        if (CJ == null) {
            synchronized (ROR.class) {
                if (CJ == null) {
                    CJ = new ROR();
                }
            }
        }
        return CJ;
    }

    public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar) {
        this.f7138fl = acVar;
    }

    public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac acVar) {
        this.Tgh = acVar;
    }

    public String Qhi(boolean z10, boolean z11, String str, String... strArr) {
        String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.f7138fl == null) {
            return strArr[0];
        }
        if ((z10 ? this.ROR : this.Tgh) == null) {
            return strArr[0];
        }
        if (this.f7137ac.get() != 1) {
            return strArr[0];
        }
        List<String> Qhi2 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(strArr);
        if (Qhi2 == null) {
            return strArr[0];
        }
        String Qhi3 = WAv.Qhi(str, z11 ? str : com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(str), Qhi2);
        if (Qhi3 == null) {
            return strArr[0];
        }
        if (z10) {
            str2 = "https://" + hm() + ":" + this.cJ + "?f=1&" + Qhi3;
        } else {
            str2 = "https://" + hm() + ":" + this.cJ + "?" + Qhi3;
        }
        return str2.replaceFirst("s", "");
    }
}
