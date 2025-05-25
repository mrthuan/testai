package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrh extends zzbrq {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrh(zzcej zzcejVar, Map map) {
        super(zzcejVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcejVar.zzi();
        this.zzc = zze(InMobiNetworkValues.DESCRIPTION);
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        if (TextUtils.isEmpty((CharSequence) this.zza.get(str))) {
            return "";
        }
        return (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(InMobiNetworkValues.TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra(InMobiNetworkValues.DESCRIPTION, this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        if (!new zzbbe(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzt zztVar2 = zzuVar.c;
        AlertDialog.Builder i10 = com.google.android.gms.ads.internal.util.zzt.i(this.zzb);
        Resources zze = zzuVar.f10557g.zze();
        if (zze != null) {
            str = zze.getString(R.string.arg_res_0x7f13043d);
        } else {
            str = "Create calendar event";
        }
        i10.setTitle(str);
        if (zze != null) {
            str2 = zze.getString(R.string.arg_res_0x7f13043e);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        i10.setMessage(str2);
        if (zze != null) {
            str3 = zze.getString(R.string.arg_res_0x7f13043b);
        } else {
            str3 = "Accept";
        }
        i10.setPositiveButton(str3, new zzbrf(this));
        if (zze != null) {
            str4 = zze.getString(R.string.arg_res_0x7f13043c);
        } else {
            str4 = "Decline";
        }
        i10.setNegativeButton(str4, new zzbrg(this));
        i10.create().show();
    }
}
