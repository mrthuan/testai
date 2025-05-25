package com.bytedance.sdk.component.ROR.ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.activity.f;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.ROR.CJ.WAv;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TNCManager.java */
/* loaded from: classes.dex */
public class ROR {
    private boolean CJ;
    private Context ROR;
    private Tgh Sf;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f8007ac;

    /* renamed from: fl  reason: collision with root package name */
    private cJ f8008fl;
    private int tP;
    private long cJ = 0;
    private boolean Tgh = false;

    /* renamed from: hm  reason: collision with root package name */
    private int f8009hm = 0;
    private long WAv = 19700101000L;
    private int Gm = 0;

    /* renamed from: zc  reason: collision with root package name */
    private HashMap<String, Integer> f8010zc = new HashMap<>();
    private HashMap<String, Integer> ABk = new HashMap<>();
    private int iMK = 0;
    private HashMap<String, Integer> pA = new HashMap<>();
    private HashMap<String, Integer> hpZ = new HashMap<>();
    private boolean HzH = true;
    private Map<String, Integer> kYc = new HashMap();
    Handler Qhi = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.ROR.ac.ROR.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z10;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ROR.this.cJ(z10);
            }
        }
    };

    private ROR() {
    }

    private boolean Qhi(int i10) {
        return i10 >= 200 && i10 < 400;
    }

    private void WAv() {
        this.Gm = 0;
        this.f8010zc.clear();
        this.ABk.clear();
        this.iMK = 0;
        this.pA.clear();
        this.hpZ.clear();
    }

    private void hm() {
        SharedPreferences sharedPreferences = this.ROR.getSharedPreferences(Qhi(), 0);
        this.f8009hm = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.WAv = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    public cJ CJ() {
        return this.f8008fl;
    }

    public Map<String, String> ROR() {
        fl Tgh = Tgh();
        if (Tgh != null) {
            return Tgh.CJ;
        }
        return null;
    }

    public Tgh Sf() {
        return this.Sf;
    }

    public fl Tgh() {
        Tgh tgh = this.Sf;
        if (tgh != null) {
            return tgh.ac();
        }
        return null;
    }

    public boolean ac() {
        return this.CJ;
    }

    public Qhi cJ() {
        return this.f8007ac;
    }

    public void fl() {
        this.kYc.clear();
    }

    private boolean CJ(String str) {
        Map<String, String> ROR = ROR();
        if (ROR == null) {
            return false;
        }
        String str2 = ROR.get(str);
        return (TextUtils.isEmpty(str2) || this.kYc.get(str2) == null || this.kYc.get(str2).intValue() < 3) ? false : true;
    }

    private void ac(String str) {
        if (!TextUtils.isEmpty(str) && this.kYc.containsKey(str)) {
            this.kYc.put(str, 0);
        }
    }

    private void cJ(String str) {
        Map<String, String> ROR;
        if (TextUtils.isEmpty(str) || (ROR = ROR()) == null || !ROR.containsValue(str)) {
            return;
        }
        if (this.kYc.get(str) == null) {
            this.kYc.put(str, 1);
        } else {
            this.kYc.put(str, Integer.valueOf(this.kYc.get(str).intValue() + 1));
        }
    }

    public String Qhi() {
        return "ttnet_tnc_config" + this.tP;
    }

    public void Qhi(boolean z10) {
        this.CJ = z10;
    }

    public void Qhi(cJ cJVar) {
        this.f8008fl = cJVar;
    }

    public synchronized void Qhi(Context context, boolean z10) {
        if (!this.Tgh) {
            this.ROR = context;
            this.HzH = z10;
            this.Sf = new Tgh(context, z10, this.tP);
            if (z10) {
                hm();
            }
            this.f8007ac = hm.Qhi().Qhi(this.tP, this.ROR);
            this.Tgh = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10) {
        fl Tgh = Tgh();
        if (Tgh == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z10) {
            if ((Tgh.Gm * 1000) + this.cJ > elapsedRealtime) {
                return;
            }
        }
        this.cJ = elapsedRealtime;
        hm.Qhi().Qhi(this.tP, this.ROR).ac();
    }

    private boolean cJ(int i10) {
        if (i10 < 100 || i10 >= 1000) {
            return true;
        }
        fl Tgh = Tgh();
        return (Tgh == null || TextUtils.isEmpty(Tgh.ABk) || !Tgh.ABk.contains(String.valueOf(i10))) ? false : true;
    }

    public String Qhi(String str) {
        String str2;
        Map<String, String> ROR;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
            str2 = str3;
            str3 = protocol;
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        if ((!"http".equals(str3) && !Constants.SCHEME.equals(str3)) || TextUtils.isEmpty(str2) || CJ(str2) || (ROR = ROR()) == null || !ROR.containsKey(str2)) {
            return str;
        }
        String str4 = ROR.get(str2);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        String m10 = f.m(str3, "://", str2);
        return str.startsWith(m10) ? str.replaceFirst(m10, f.m(str3, "://", str4)) : str;
    }

    public ROR(int i10) {
        this.tP = i10;
    }

    public synchronized void Qhi(iMK imk, hpZ hpz) {
        URL url;
        if (imk == null || hpz == null) {
            return;
        }
        if (this.HzH) {
            if (WAv.Qhi(this.ROR)) {
                try {
                    url = imk.cJ().Qhi();
                } catch (Exception unused) {
                    url = null;
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String Qhi = Qhi(imk);
                int ac2 = hpz.ac();
                if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                    if (TextUtils.isEmpty(Qhi)) {
                        return;
                    }
                    fl Tgh = Tgh();
                    if (Tgh != null && Tgh.cJ) {
                        Qhi(hpz, host);
                    }
                    if (Tgh == null) {
                        return;
                    }
                    this.f8010zc.size();
                    this.ABk.size();
                    this.pA.size();
                    this.hpZ.size();
                    if (ac2 > 0) {
                        if (Qhi(ac2)) {
                            if (this.Gm > 0 || this.iMK > 0) {
                                WAv();
                            }
                            ac(host);
                        } else if (!cJ(ac2)) {
                            this.iMK++;
                            this.pA.put(path, 0);
                            this.hpZ.put(Qhi, 0);
                            if (this.iMK >= Tgh.Sf && this.pA.size() >= Tgh.f8015hm && this.hpZ.size() >= Tgh.WAv) {
                                Qhi(false, 0L);
                                WAv();
                            }
                            cJ(host);
                        }
                    }
                }
            }
        }
    }

    private String Qhi(iMK imk) {
        if (imk == null || imk.cJ() == null) {
            return "";
        }
        if (imk.cJ().Qhi() != null) {
            try {
            } catch (Exception unused) {
                return "";
            }
        }
        return InetAddress.getByName(imk.cJ().Qhi().getHost()).getHostAddress();
    }

    public synchronized void Qhi(iMK imk, Exception exc) {
        URL url;
        if (imk != null) {
            if (imk.cJ() != null && exc != null) {
                if (this.HzH) {
                    if (WAv.Qhi(this.ROR)) {
                        try {
                            url = imk.cJ().Qhi();
                        } catch (Exception unused) {
                            url = null;
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String Qhi = Qhi(imk);
                        if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                            fl Tgh = Tgh();
                            if (Tgh == null) {
                                return;
                            }
                            this.f8010zc.size();
                            this.ABk.size();
                            this.pA.size();
                            this.hpZ.size();
                            this.Gm++;
                            this.f8010zc.put(path, 0);
                            this.ABk.put(Qhi, 0);
                            if (this.Gm >= Tgh.f8014fl && this.f8010zc.size() >= Tgh.Tgh && this.ABk.size() >= Tgh.ROR) {
                                Qhi(false, 0L);
                                WAv();
                            }
                            cJ(host);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(com.bytedance.sdk.component.cJ.Qhi.hpZ r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r10 = r8.HzH
            if (r10 != 0) goto L8
            return
        L8:
            java.lang.String r10 = "tnc-cmd"
            r0 = 0
            java.lang.String r9 = r9.Qhi(r10, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L16
            return
        L16:
            java.lang.String r10 = "@"
            java.lang.String[] r9 = r9.split(r10)
            if (r9 == 0) goto L83
            int r10 = r9.length
            r0 = 2
            if (r10 == r0) goto L23
            goto L83
        L23:
            r10 = 1
            r0 = 0
            r2 = 0
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L34
            r9 = r9[r10]     // Catch: java.lang.Throwable -> L35
            long r4 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L35
            goto L36
        L34:
            r3 = r2
        L35:
            r4 = r0
        L36:
            long r6 = r8.WAv
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L3d
            return
        L3d:
            r8.f8009hm = r3
            r8.WAv = r4
            android.content.Context r9 = r8.ROR
            java.lang.String r6 = r8.Qhi()
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.f8009hm
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L83
            com.bytedance.sdk.component.ROR.ac.fl r9 = r8.Tgh()
            if (r9 != 0) goto L6b
            return
        L6b:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r9 = r9.f8016zc
            if (r9 <= 0) goto L80
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L80:
            r8.Qhi(r10, r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ROR.ac.ROR.Qhi(com.bytedance.sdk.component.cJ.Qhi.hpZ, java.lang.String):void");
    }

    private void Qhi(boolean z10, long j10) {
        if (this.Qhi.hasMessages(lib.zj.office.fc.hpsf.Constants.CP_MAC_ROMAN)) {
            return;
        }
        Message obtainMessage = this.Qhi.obtainMessage();
        obtainMessage.what = lib.zj.office.fc.hpsf.Constants.CP_MAC_ROMAN;
        obtainMessage.arg1 = z10 ? 1 : 0;
        if (j10 > 0) {
            this.Qhi.sendMessageDelayed(obtainMessage, j10);
        } else {
            this.Qhi.sendMessage(obtainMessage);
        }
    }
}
