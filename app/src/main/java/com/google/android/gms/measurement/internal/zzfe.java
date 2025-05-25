package com.google.android.gms.measurement.internal;

import a8.v;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfe {

    /* renamed from: a  reason: collision with root package name */
    public final String f11728a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f11729b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f11730d;

    public zzfe(v vVar) {
        this.f11730d = vVar;
        Preconditions.f("default_event_parameters");
        this.f11728a = "default_event_parameters";
        this.f11729b = new Bundle();
    }

    public final Bundle a() {
        char c;
        if (this.c == null) {
            v vVar = this.f11730d;
            String string = vVar.q().getString(this.f11728a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c = 0;
                                    }
                                    c = 65535;
                                } else {
                                    if (string3.equals(OperatorName.LINE_TO)) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        zzeu zzeuVar = ((zzge) vVar.f3529a).f11780i;
                                        zzge.f(zzeuVar);
                                        zzeuVar.f11712f.b(string3, "Unrecognized persisted bundle type. Type");
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            zzeu zzeuVar2 = ((zzge) vVar.f3529a).f11780i;
                            zzge.f(zzeuVar2);
                            zzeuVar2.f11712f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    zzeu zzeuVar3 = ((zzge) vVar.f3529a).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.f11729b;
            }
        }
        return this.c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        v vVar = this.f11730d;
        SharedPreferences.Editor edit = vVar.q().edit();
        int size = bundle.size();
        String str = this.f11728a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", OperatorName.LINE_TO);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            zzeu zzeuVar = ((zzge) vVar.f3529a).f11780i;
                            zzge.f(zzeuVar);
                            zzeuVar.f11712f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        zzeu zzeuVar2 = ((zzge) vVar.f3529a).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11712f.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle;
    }
}
