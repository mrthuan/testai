package com.bytedance.sdk.openadsdk.core.widget.Qhi;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: WebArbitrageBehavior.java */
/* loaded from: classes.dex */
public class ROR implements CQU.Qhi {
    float ABk;
    WebView CJ;
    float Gm;
    boolean HzH;
    private long NFd;
    Context Qhi;
    boolean ROR;
    boolean Sf;
    int WAv;
    tP cJ;

    /* renamed from: hm  reason: collision with root package name */
    String f9267hm;
    long hpZ;
    float iMK;
    boolean kYc;
    float pA;
    private boolean sDy;
    long tP;

    /* renamed from: zc  reason: collision with root package name */
    float f9268zc;
    private final Handler pM = new CQU(iMK.cJ().getLooper(), this);

    /* renamed from: ac  reason: collision with root package name */
    String f9265ac = "landingpage";
    int Tgh = 0;
    private final String Eh = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String aP = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    Qhi Dww = new Qhi() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR.Qhi
        public void Qhi() {
            ROR ror = ROR.this;
            ror.Sf = true;
            ror.Tgh();
            ROR ror2 = ROR.this;
            ror2.Qhi(2, ror2.f9267hm, ror2.WAv);
        }
    };
    GestureDetector CQU = new GestureDetector(HzH.Qhi(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ROR.this.HzH = true;
            return false;
        }
    });

    /* renamed from: fl  reason: collision with root package name */
    int f9266fl = HzH.CJ().rB();
    Map<Integer, Long> MQ = new HashMap();
    Map<Integer, Float> qMt = new HashMap();
    Map<Integer, Long> EBS = new HashMap();
    List<Integer> bxS = new ArrayList();

    /* compiled from: WebArbitrageBehavior.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();
    }

    public ROR(WebView webView, tP tPVar, Context context) {
        this.cJ = tPVar;
        this.CJ = webView;
        this.Qhi = context;
    }

    private void CJ(String str) {
        if (ROR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.cJ, new Qhi.C0102Qhi().Qhi(this.f9267hm).cJ(Uri.decode(str)).Qhi(), this.f9265ac);
    }

    private boolean ROR() {
        int i10 = this.Tgh + 1;
        this.Tgh = i10;
        if (i10 > this.f9266fl) {
            return true;
        }
        if (!"landingpage".equals(this.f9265ac) && !"landingpage_endcard".equals(this.f9265ac) && !"landingpage_split_screen".equals(this.f9265ac) && !"landingpage_direct".equals(this.f9265ac)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sf() {
        WebBackForwardList copyBackForwardList = this.CJ.copyBackForwardList();
        if (copyBackForwardList != null) {
            this.WAv = copyBackForwardList.getCurrentIndex() + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        if (this.qMt.get(Integer.valueOf(this.WAv)) != null) {
            return;
        }
        float height = this.CJ.getHeight() / zn.cJ(this.Qhi, this.CJ.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.qMt.put(Integer.valueOf(this.WAv), Float.valueOf(height));
    }

    private boolean fl() {
        try {
            int i10 = this.WAv;
            if (i10 == 2 || i10 == 3) {
                if (!Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.f9267hm)) {
                    if (Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.f9267hm)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            ABk.Qhi("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    public void ac(String str) {
        if (this.ROR) {
            this.kYc = true;
        }
        if (this.WAv == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int indexOf = str.indexOf("query=") + 6;
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf < 0 || indexOf2 >= str.length() || indexOf2 <= indexOf) {
                return;
            }
            CJ(str.substring(indexOf, indexOf2));
        }
    }

    public void cJ(String str) {
        this.f9267hm = str;
        Sf();
        this.MQ.put(Integer.valueOf(this.WAv), Long.valueOf(SystemClock.elapsedRealtime()));
        this.EBS.put(Integer.valueOf(this.WAv), Long.valueOf(SystemClock.elapsedRealtime()));
        this.sDy = fl();
    }

    public void Qhi(String str) {
        this.f9265ac = str;
    }

    public void Qhi() {
        cJ(this.WAv);
    }

    public void Qhi(int i10) {
        float height = (this.CJ.getHeight() + i10) / zn.cJ(this.Qhi, this.CJ.getContentHeight());
        Float f10 = this.qMt.get(Integer.valueOf(this.WAv));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.qMt.put(Integer.valueOf(this.WAv), Float.valueOf(height));
        }
    }

    public void cJ() {
        this.CJ.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    ROR ror = ROR.this;
                    if (!ror.Sf) {
                        ror.Tgh();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - ROR.this.NFd >= 50) {
                            ROR ror2 = ROR.this;
                            ror2.Qhi(3, ror2.f9267hm, ror2.WAv);
                            ROR.this.NFd = elapsedRealtime;
                            return;
                        }
                        return;
                    }
                    ror.Sf = false;
                }
                if (z10) {
                    ROR.this.Sf();
                    ROR ror3 = ROR.this;
                    ror3.MQ.put(Integer.valueOf(ror3.WAv), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void CJ() {
        if (ROR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi Qhi2 = new Qhi.C0102Qhi().Qhi(this.f9267hm).Qhi(this.WAv).CJ(this.Gm).fl(this.f9268zc).Tgh(this.pA).ROR((float) this.tP).Qhi();
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = Qhi2;
        this.pM.sendMessageDelayed(obtain, 20L);
    }

    private void cJ(int i10) {
        if (ROR() || this.bxS.contains(Integer.valueOf(i10))) {
            return;
        }
        this.bxS.add(Integer.valueOf(i10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.EBS.get(Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.cJ, new Qhi.C0102Qhi().Qhi(this.f9267hm).Qhi(this.WAv).WAv((float) (elapsedRealtime - (l10 != null ? l10.longValue() : elapsedRealtime))).Qhi(), this.f9265ac);
    }

    public Qhi ac() {
        return this.Dww;
    }

    private void ac(int i10) {
        if (ROR()) {
            return;
        }
        Tgh();
        this.ROR = true;
        com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi Qhi2 = new Qhi.C0102Qhi().Qhi(this.f9267hm).Qhi(this.WAv).Qhi(this.Gm).cJ(this.f9268zc).ac((float) this.tP).ac(i10).Qhi();
        try {
            if (this.sDy) {
                WebView.HitTestResult hitTestResult = this.CJ.getHitTestResult();
                Qhi2.Qhi(hitTestResult.getExtra());
                Qhi2.Qhi(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = 200;
        obtain.obj = Qhi2;
        this.pM.sendMessageDelayed(obtain, 100L);
    }

    public void Qhi(MotionEvent motionEvent) {
        this.CQU.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Gm = motionEvent.getX();
            this.f9268zc = motionEvent.getY();
            this.hpZ = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            ac(2);
        } else {
            this.tP = SystemClock.elapsedRealtime() - this.hpZ;
            if (cJ(motionEvent)) {
                CJ();
            } else {
                ac(1);
            }
        }
    }

    private boolean cJ(MotionEvent motionEvent) {
        this.ABk = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.iMK = y10;
        float f10 = this.f9268zc;
        if (y10 - f10 != 0.0f) {
            this.pA = y10 - f10;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10, String str, int i11) {
        if (ROR()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.MQ.get(Integer.valueOf(i11));
        long longValue = l10 != null ? l10.longValue() : elapsedRealtime;
        Float f10 = this.qMt.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.cJ.ac.ac(this.cJ, new Qhi.C0102Qhi().Qhi(str).Qhi(i11).Sf((float) (elapsedRealtime - longValue)).hm(f10 == null ? 0.0f : f10.floatValue()).cJ(i10).Qhi(), this.f9265ac);
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi qhi = (com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi) message.obj;
        if (i10 == 100) {
            qhi.CJ(this.HzH ? 2 : 1);
            com.bytedance.sdk.openadsdk.cJ.ac.CJ(this.cJ, qhi, this.f9265ac);
            this.HzH = false;
        } else if (i10 == 200) {
            if (this.kYc) {
                Qhi(1, qhi.ac(), qhi.CJ());
            }
            qhi.ac(this.kYc ? 1 : 0);
            com.bytedance.sdk.openadsdk.cJ.ac.fl(this.cJ, qhi, this.f9265ac);
            this.ROR = false;
            this.kYc = false;
        }
    }
}
