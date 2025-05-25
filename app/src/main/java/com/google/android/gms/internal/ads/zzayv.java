package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzayv extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzaym zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzayv() {
        zzaym zzaymVar = new zzaym();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzaymVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbdj.zzd.zze()).intValue();
        this.zzg = ((Long) zzbdj.zza.zze()).intValue();
        this.zzh = ((Long) zzbdj.zze.zze()).intValue();
        this.zzi = ((Long) zzbdj.zzc.zze()).intValue();
        zzbbn zzbbnVar = zzbbw.zzL;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.zzj = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        this.zzk = ((Integer) zzbaVar.c.zza(zzbbw.zzM)).intValue();
        this.zzl = ((Integer) zzbaVar.c.zza(zzbbw.zzN)).intValue();
        this.zze = ((Long) zzbdj.zzf.zze()).intValue();
        this.zzm = (String) zzbaVar.c.zza(zzbbw.zzP);
        this.zzn = ((Boolean) zzbaVar.c.zza(zzbbw.zzQ)).booleanValue();
        this.zzo = ((Boolean) zzbaVar.c.zza(zzbbw.zzR)).booleanValue();
        this.zzp = ((Boolean) zzbaVar.c.zza(zzbbw.zzS)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r4.importance != 100) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3.inKeyguardRestrictedInputMode() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1 = (android.os.PowerManager) r1.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r1.isScreenOn() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r1 = com.google.android.gms.ads.internal.zzu.B.f10556f.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.b("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r1.getWindow() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r1.getWindow().getDecorView() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        r2 = r1.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(r1, "ContentFetchTask.extractContent");
        com.google.android.gms.ads.internal.util.client.zzm.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(r1, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[EXC_TOP_SPLITTER, LOOP:1: B:62:0x00d9->B:71:0x00d9, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayv.run():void");
    }

    public final zzayl zza() {
        return this.zzd.zza(this.zzp);
    }

    public final zzayu zzb(View view, zzayl zzaylVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzaylVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzayu(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcej)) {
                WebView webView = (WebView) view;
                zzaylVar.zzh();
                webView.post(new zzayt(this, zzaylVar, webView, globalVisibleRect));
                return new zzayu(this, 0, 1);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    zzayu zzb = zzb(viewGroup.getChildAt(i12), zzaylVar);
                    i10 += zzb.zza;
                    i11 += zzb.zzb;
                }
                return new zzayu(this, i10, i11);
            }
        }
        return new zzayu(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r11 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzayl r9 = new com.google.android.gms.internal.ads.zzayl     // Catch: java.lang.Exception -> L53
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L53
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L53
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L53
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L53
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L53
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L53
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L53
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L53
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L53
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzayq r0 = r0.f10556f     // Catch: java.lang.Exception -> L53
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L55
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzO     // Catch: java.lang.Exception -> L53
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbbu r3 = r3.c     // Catch: java.lang.Exception -> L53
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L53
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L7a
            goto L55
        L53:
            r11 = move-exception
            goto L81
        L55:
            com.google.android.gms.internal.ads.zzayu r11 = r10.zzb(r11, r9)     // Catch: java.lang.Exception -> L53
            r9.zzm()     // Catch: java.lang.Exception -> L53
            int r0 = r11.zza     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L64
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L7a
        L64:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L6f
            int r11 = r9.zzc()     // Catch: java.lang.Exception -> L53
            if (r11 == 0) goto L7a
            goto L71
        L6f:
            if (r11 != 0) goto L7b
        L71:
            com.google.android.gms.internal.ads.zzaym r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            boolean r11 = r11.zzd(r9)     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            com.google.android.gms.internal.ads.zzaym r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            r11.zzb(r9)     // Catch: java.lang.Exception -> L53
            return
        L81:
            r0 = 6
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.internal.ads.zzbze r0 = r0.f10557g
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.zzw(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayv.zzc(android.view.View):void");
    }

    public final void zzd(zzayl zzaylVar, WebView webView, String str, boolean z10) {
        zzaylVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzaylVar.zzl(title + "\n" + optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzaylVar.zzl(optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzaylVar.zzo()) {
                this.zzd.zzc(zzaylVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Json string may be malformed.");
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzm.b("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            com.google.android.gms.ads.internal.util.client.zzm.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
