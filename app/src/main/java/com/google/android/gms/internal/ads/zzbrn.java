package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrn extends zzbrq {
    private final Map zza;
    private final Context zzb;

    public zzbrn(zzcej zzcejVar, Map map) {
        super(zzcejVar, "storePicture");
        this.zza = map;
        this.zzb = zzcejVar.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        if (!new zzbbe(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzh("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.util.zzt zztVar2 = zzuVar.c;
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = zzuVar.f10557g.zze();
                com.google.android.gms.ads.internal.util.zzt zztVar3 = zzuVar.c;
                AlertDialog.Builder i10 = com.google.android.gms.ads.internal.util.zzt.i(this.zzb);
                if (zze != null) {
                    str = zze.getString(R.string.arg_res_0x7f130439);
                } else {
                    str = "Save image";
                }
                i10.setTitle(str);
                if (zze != null) {
                    str2 = zze.getString(R.string.arg_res_0x7f13043a);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                i10.setMessage(str2);
                if (zze != null) {
                    str3 = zze.getString(R.string.arg_res_0x7f13043b);
                } else {
                    str3 = "Accept";
                }
                i10.setPositiveButton(str3, new zzbrl(this, str5, lastPathSegment));
                if (zze != null) {
                    str4 = zze.getString(R.string.arg_res_0x7f13043c);
                } else {
                    str4 = "Decline";
                }
                i10.setNegativeButton(str4, new zzbrm(this));
                i10.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzh("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
