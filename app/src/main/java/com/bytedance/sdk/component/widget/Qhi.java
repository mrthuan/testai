package com.bytedance.sdk.component.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.Sf;
import com.bytedance.sdk.component.utils.pM;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ArbitrageOnTouchListener.java */
/* loaded from: classes.dex */
public class Qhi implements View.OnTouchListener, CQU.Qhi {
    private int ABk;
    private final List<Integer> CJ;
    private long Gm;
    private float HzH;
    private View.OnTouchListener MQ;
    private volatile float ROR;
    private volatile float Sf;
    private final Context Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final int f8434ac;
    private final int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final int f8435fl;
    private boolean hpZ;
    private float kYc;
    private ViewConfiguration qMt;
    private String tP;

    /* renamed from: zc  reason: collision with root package name */
    private long f8437zc;

    /* renamed from: hm  reason: collision with root package name */
    private float f8436hm = -1.0f;
    private float WAv = -1.0f;
    private final Handler pA = new CQU(Sf.Qhi().getLooper(), this);
    InterfaceC0099Qhi Qhi = new InterfaceC0099Qhi() { // from class: com.bytedance.sdk.component.widget.Qhi.1
        @Override // com.bytedance.sdk.component.widget.Qhi.InterfaceC0099Qhi
        public void Qhi() {
            if (Qhi.this.f8436hm == -1.0f && Qhi.this.WAv == -1.0f && Qhi.this.f8437zc == -1) {
                float unused = Qhi.this.f8436hm;
                float unused2 = Qhi.this.WAv;
                Qhi qhi = Qhi.this;
                qhi.f8436hm = qhi.ROR;
                Qhi qhi2 = Qhi.this;
                qhi2.WAv = qhi2.Sf;
                Qhi qhi3 = Qhi.this;
                qhi3.f8437zc = qhi3.Gm;
                Qhi.this.hpZ = true;
            }
            float unused3 = Qhi.this.f8436hm;
            float unused4 = Qhi.this.WAv;
        }

        @Override // com.bytedance.sdk.component.widget.Qhi.InterfaceC0099Qhi
        public void Qhi(int i10) {
            Qhi.this.ABk = i10;
            Qhi.this.cJ();
        }
    };
    private int EBS = -1;
    private final List<Integer> iMK = new ArrayList();

    /* compiled from: ArbitrageOnTouchListener.java */
    /* renamed from: com.bytedance.sdk.component.widget.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0099Qhi {
        void Qhi();

        void Qhi(int i10);
    }

    public Qhi(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.Tgh = context;
        if (i10 == -1) {
            this.cJ = pM.Qhi(context);
        } else {
            this.cJ = pM.Qhi(context, i10);
        }
        this.f8434ac = pM.Qhi(context, i11);
        this.CJ = list;
        this.f8435fl = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.Gm = SystemClock.elapsedRealtime();
        this.ROR = x4;
        this.Sf = y10;
        if (action != 0) {
            if (action == 1 && Qhi(x4, y10)) {
                int Qhi = Qhi(this.ROR, this.Sf, this.Gm);
                boolean z10 = !this.iMK.contains(Integer.valueOf(this.ABk));
                Qhi(view, motionEvent, Qhi, z10);
                if (z10) {
                    this.iMK.add(Integer.valueOf(this.ABk));
                }
                if (Qhi == 0) {
                    motionEvent.setAction(3);
                }
            }
        } else {
            this.HzH = x4;
            this.kYc = y10;
        }
        View.OnTouchListener onTouchListener = this.MQ;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        this.f8436hm = -1.0f;
        this.WAv = -1.0f;
        this.f8437zc = -1L;
    }

    public void Qhi(View.OnTouchListener onTouchListener) {
        this.MQ = onTouchListener;
    }

    public InterfaceC0099Qhi Qhi() {
        return this.Qhi;
    }

    private void Qhi(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i11 = 1;
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        if (!z10) {
            i11 = 0;
        }
        jSONObject.put("is_first_click", i11);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.ABk);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.pA.sendMessageDelayed(obtain, 200L);
    }

    private boolean Qhi(float f10, float f11) {
        if (this.qMt == null) {
            this.qMt = ViewConfiguration.get(this.Tgh);
        }
        if (this.EBS == -1) {
            this.EBS = this.qMt.getScaledTouchSlop();
        }
        return Math.abs(f10 - this.HzH) <= ((float) this.EBS) && Math.abs(f11 - this.kYc) <= ((float) this.EBS);
    }

    public void Qhi(String str) {
        this.tP = str;
    }

    private int Qhi(float f10, float f11, long j10) {
        if (this.f8436hm == -1.0f && this.WAv == -1.0f && this.f8437zc == -1) {
            return 1;
        }
        if (this.CJ.contains(Integer.valueOf(this.ABk))) {
            if (j10 - this.f8437zc > this.f8435fl) {
                cJ();
                return 3;
            }
            float abs = Math.abs(f10 - this.f8436hm);
            float abs2 = Math.abs(f11 - this.WAv);
            if (abs > this.cJ / 2.0f || abs2 > this.f8434ac / 2.0f) {
                cJ();
                return 4;
            }
            return 0;
        }
        return 2;
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.hpZ ? 1 : 0);
                    this.hpZ = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.widget.Qhi.Qhi.Qhi().cJ() != null) {
                com.bytedance.sdk.component.widget.Qhi.Qhi.Qhi().cJ().Qhi(this.tP, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
