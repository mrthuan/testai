package j7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzfgi;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzt f19046a;

    public a(zzt zztVar) {
        this.f19046a = zztVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzt zztVar = this.f19046a;
        zzbh zzbhVar = zztVar.f10549g;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzf(zzfgi.zzd(1, null, null));
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
        zzbh zzbhVar2 = zztVar.f10549g;
        if (zzbhVar2 != null) {
            try {
                zzbhVar2.zze(0);
            } catch (RemoteException e11) {
                zzm.f("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzt zztVar = this.f19046a;
        int i10 = 0;
        if (str.startsWith(zztVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbh zzbhVar = zztVar.f10549g;
            if (zzbhVar != null) {
                try {
                    zzbhVar.zzf(zzfgi.zzd(3, null, null));
                } catch (RemoteException e10) {
                    zzm.f("#007 Could not call remote method.", e10);
                }
            }
            zzbh zzbhVar2 = zztVar.f10549g;
            if (zzbhVar2 != null) {
                try {
                    zzbhVar2.zze(3);
                } catch (RemoteException e11) {
                    zzm.f("#007 Could not call remote method.", e11);
                }
            }
            zztVar.K(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbh zzbhVar3 = zztVar.f10549g;
            if (zzbhVar3 != null) {
                try {
                    zzbhVar3.zzf(zzfgi.zzd(1, null, null));
                } catch (RemoteException e12) {
                    zzm.f("#007 Could not call remote method.", e12);
                }
            }
            zzbh zzbhVar4 = zztVar.f10549g;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar4.zze(0);
                } catch (RemoteException e13) {
                    zzm.f("#007 Could not call remote method.", e13);
                }
            }
            zztVar.K(0);
            return true;
        } else {
            boolean startsWith = str.startsWith("gmsg://adResized");
            Context context = zztVar.f10546d;
            if (startsWith) {
                zzbh zzbhVar5 = zztVar.f10549g;
                if (zzbhVar5 != null) {
                    try {
                        zzbhVar5.zzi();
                    } catch (RemoteException e14) {
                        zzm.f("#007 Could not call remote method.", e14);
                    }
                }
                String queryParameter = Uri.parse(str).getQueryParameter(InMobiNetworkValues.HEIGHT);
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        zzf zzfVar = zzay.f10107f.f10108a;
                        i10 = zzf.o(context, Integer.parseInt(queryParameter));
                    } catch (NumberFormatException unused) {
                    }
                }
                zztVar.K(i10);
                return true;
            } else if (str.startsWith("gmsg://")) {
                return true;
            } else {
                zzbh zzbhVar6 = zztVar.f10549g;
                if (zzbhVar6 != null) {
                    try {
                        zzbhVar6.zzc();
                        zztVar.f10549g.zzh();
                    } catch (RemoteException e15) {
                        zzm.f("#007 Could not call remote method.", e15);
                    }
                }
                if (zztVar.f10550h != null) {
                    Uri parse = Uri.parse(str);
                    try {
                        parse = zztVar.f10550h.zza(parse, context, null, null);
                    } catch (zzaup unused2) {
                        zzm.g(5);
                    }
                    str = parse.toString();
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context.startActivity(intent);
                return true;
            }
        }
    }
}
