package com.bytedance.sdk.component.adexpress.fl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.Qhi.pM;
import com.bytedance.sdk.component.adexpress.CJ.EBS;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewPool.java */
/* loaded from: classes.dex */
public class Tgh {
    private static int Sf = 10;
    private static int Tgh = 10;

    /* renamed from: fl  reason: collision with root package name */
    private static final byte[] f8256fl = new byte[0];

    /* renamed from: hm  reason: collision with root package name */
    private static volatile Tgh f8257hm;
    private final AtomicBoolean ROR = new AtomicBoolean(false);
    private List<SSWebView> Qhi = new ArrayList();
    private List<SSWebView> cJ = new ArrayList();

    /* renamed from: ac  reason: collision with root package name */
    private Map<Integer, ac> f8258ac = new HashMap();
    private Map<Integer, fl> CJ = new HashMap();

    private Tgh() {
        com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac ac2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().ac();
        if (ac2 != null) {
            Tgh = ac2.WAv();
            Sf = ac2.Gm();
        }
    }

    public static Tgh Qhi() {
        if (f8257hm == null) {
            synchronized (Tgh.class) {
                if (f8257hm == null) {
                    f8257hm = new Tgh();
                }
            }
        }
        return f8257hm;
    }

    private void ROR(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.ac();
        sSWebView.setWebChromeClient(null);
        sSWebView.setWebViewClient(null);
        sSWebView.setDownloadListener(null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    public void CJ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.Qhi.size() >= Tgh) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.zc();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        } else if (this.Qhi.contains(sSWebView)) {
        } else {
            try {
                Context context2 = sSWebView.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    sSWebView.setRecycler(true);
                    this.Qhi.add(sSWebView);
                    ac();
                }
            } catch (Throwable th3) {
                ac();
                th3.getMessage();
            }
        }
    }

    public void Tgh(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        ac acVar = this.f8258ac.get(Integer.valueOf(sSWebView.hashCode()));
        if (acVar != null) {
            acVar.Qhi(null);
        }
        sSWebView.b_("SDK_INJECT_GLOBAL");
    }

    @UiThread
    public void ac(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        ROR(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        Tgh(sSWebView);
        CJ(sSWebView);
    }

    @UiThread
    public void cJ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        ROR(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        Tgh(sSWebView);
        Qhi(sSWebView);
    }

    public boolean fl(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        try {
            Context context = sSWebView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            sSWebView.zc();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public int ac() {
        return this.Qhi.size();
    }

    public SSWebView cJ(Context context, String str) {
        if (ac() <= 0) {
            return null;
        }
        if (EBS.Qhi(str) && ac() <= 1) {
            ac();
            return null;
        }
        SSWebView remove = this.Qhi.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                ac();
            }
            return remove;
        } catch (Throwable unused) {
            ac();
            return null;
        }
    }

    public SSWebView Qhi(Context context, String str) {
        if (CJ() <= 0) {
            return null;
        }
        if (EBS.Qhi(str) && CJ() <= 1) {
            CJ();
            return null;
        }
        SSWebView remove = this.cJ.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                CJ();
            }
            return remove;
        } catch (Throwable unused) {
            CJ();
            return null;
        }
    }

    public int CJ() {
        return this.cJ.size();
    }

    public void cJ() {
        for (SSWebView sSWebView : this.Qhi) {
            if (sSWebView != null) {
                try {
                    Context context = sSWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    sSWebView.zc();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.Qhi.clear();
        for (SSWebView sSWebView2 : this.cJ) {
            if (sSWebView2 != null) {
                try {
                    Context context2 = sSWebView2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    sSWebView2.zc();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.cJ.clear();
    }

    public void Qhi(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.cJ.size() >= Sf) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.zc();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        } else if (this.cJ.contains(sSWebView)) {
        } else {
            try {
                Context context2 = sSWebView.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    sSWebView.setRecycler(true);
                    this.cJ.add(sSWebView);
                    CJ();
                }
            } catch (Throwable th3) {
                CJ();
                th3.getMessage();
            }
        }
    }

    public void cJ(int i10) {
        synchronized (f8256fl) {
            Sf = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void Qhi(SSWebView sSWebView, cJ cJVar) {
        if (sSWebView == null || cJVar == null) {
            return;
        }
        ac acVar = this.f8258ac.get(Integer.valueOf(sSWebView.hashCode()));
        if (acVar != null) {
            acVar.Qhi(cJVar);
        } else {
            acVar = new ac(cJVar);
            this.f8258ac.put(Integer.valueOf(sSWebView.hashCode()), acVar);
        }
        sSWebView.Qhi(acVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void Qhi(WebView webView, pM pMVar, String str) {
        if (webView == null || pMVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        fl flVar = this.CJ.get(Integer.valueOf(webView.hashCode()));
        if (flVar != null) {
            flVar.Qhi(pMVar);
        } else {
            flVar = new fl(pMVar);
            this.CJ.put(Integer.valueOf(webView.hashCode()), flVar);
        }
        webView.addJavascriptInterface(flVar, str);
    }

    public void Qhi(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        fl flVar = this.CJ.get(Integer.valueOf(webView.hashCode()));
        if (flVar != null) {
            flVar.Qhi(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void Qhi(int i10) {
        synchronized (f8256fl) {
            Tgh = i10;
        }
    }
}
