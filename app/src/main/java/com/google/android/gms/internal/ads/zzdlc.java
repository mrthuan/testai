package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdlc implements zzdjj {
    private final zzbpb zza;
    private final zzcxi zzb;
    private final zzcwo zzc;
    private final zzdeo zzd;
    private final Context zze;
    private final zzfel zzf;
    private final VersionInfoParcel zzg;
    private final zzffg zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbox zzl;
    private final zzboy zzm;

    public zzdlc(zzbox zzboxVar, zzboy zzboyVar, zzbpb zzbpbVar, zzcxi zzcxiVar, zzcwo zzcwoVar, zzdeo zzdeoVar, Context context, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzffg zzffgVar) {
        this.zzl = zzboxVar;
        this.zzm = zzboyVar;
        this.zza = zzbpbVar;
        this.zzb = zzcxiVar;
        this.zzc = zzcwoVar;
        this.zzd = zzdeoVar;
        this.zze = context;
        this.zzf = zzfelVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzffgVar;
    }

    private final void zzb(View view) {
        try {
            zzbpb zzbpbVar = this.zza;
            if (zzbpbVar != null && !zzbpbVar.zzA()) {
                this.zza.zzw(new ObjectWrapper(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbox zzboxVar = this.zzl;
            if (zzboxVar != null && !zzboxVar.zzx()) {
                this.zzl.zzs(new ObjectWrapper(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzboy zzboyVar = this.zzm;
            if (zzboyVar != null && !zzboyVar.zzv()) {
                this.zzm.zzq(new ObjectWrapper(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
                    this.zzd.zzdG();
                }
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzB() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.e("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzL) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.B.f10563m.i(this.zze, this.zzg.f10345a, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpb zzbpbVar = this.zza;
                if (zzbpbVar != null && !zzbpbVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbox zzboxVar = this.zzl;
                if (zzboxVar != null && !zzboxVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzboy zzboyVar = this.zzm;
                if (zzboyVar != null && !zzboyVar.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.e("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        boolean z10;
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            JSONObject jSONObject = this.zzf.zzaj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbn)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        z10 = false;
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbo)).booleanValue() && next.equals("3010")) {
                                zzbpb zzbpbVar = this.zza;
                                Object obj2 = null;
                                if (zzbpbVar != null) {
                                    try {
                                        zzn = zzbpbVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbox zzboxVar = this.zzl;
                                    if (zzboxVar != null) {
                                        zzn = zzboxVar.zzk();
                                    } else {
                                        zzboy zzboyVar = this.zzm;
                                        if (zzboyVar != null) {
                                            zzn = zzboyVar.zzj();
                                        } else {
                                            zzn = null;
                                        }
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.L0(zzn);
                                }
                                if (obj2 == null) {
                                    break;
                                }
                                cls = obj2.getClass();
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.b(arrayList, optJSONArray);
                                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                                break loop0;
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                    }
                }
            }
            z10 = true;
            this.zzk = z10;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpb zzbpbVar2 = this.zza;
            if (zzbpbVar2 != null) {
                zzbpbVar2.zzy(objectWrapper, new ObjectWrapper(zzc), new ObjectWrapper(zzc2));
                return;
            }
            zzbox zzboxVar2 = this.zzl;
            if (zzboxVar2 != null) {
                zzboxVar2.zzv(objectWrapper, new ObjectWrapper(zzc), new ObjectWrapper(zzc2));
                this.zzl.zzu(objectWrapper);
                return;
            }
            zzboy zzboyVar2 = this.zzm;
            if (zzboyVar2 != null) {
                zzboyVar2.zzt(objectWrapper, new ObjectWrapper(zzc), new ObjectWrapper(zzc2));
                this.zzm.zzs(objectWrapper);
            }
        } catch (RemoteException unused3) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzz(View view, Map map) {
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            zzbpb zzbpbVar = this.zza;
            if (zzbpbVar != null) {
                zzbpbVar.zzz(objectWrapper);
                return;
            }
            zzbox zzboxVar = this.zzl;
            if (zzboxVar != null) {
                zzboxVar.zzw(objectWrapper);
                return;
            }
            zzboy zzboyVar = this.zzm;
            if (zzboyVar != null) {
                zzboyVar.zzu(objectWrapper);
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzx(zzbgx zzbgxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }
}
