package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public abstract class L1 {
    public static HashMap a() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        String sb2;
        HashMap hashMap = new HashMap();
        Context d10 = Ha.d();
        if (d10 == null) {
            return hashMap;
        }
        int cellOperatorFlag = Na.a(Ha.b()).getCellOperatorFlag();
        boolean z10 = (cellOperatorFlag & 2) == 2;
        boolean z11 = (cellOperatorFlag & 1) == 1;
        Object systemService = d10.getSystemService("phone");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String str2 = null;
        if (z10) {
            str = null;
            i10 = -1;
            i11 = -1;
        } else {
            int[] a10 = a(telephonyManager.getNetworkOperator());
            i11 = a10[0];
            i10 = a10[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale locale = Locale.ENGLISH;
                str = a0.d.e(locale, "ENGLISH", networkCountryIso, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
        }
        if (z11) {
            i12 = -1;
            i13 = -1;
        } else {
            int[] a11 = a(telephonyManager.getSimOperator());
            i13 = a11[0];
            i12 = a11[1];
        }
        if (i13 == -1 && i12 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i13);
            sb3.append('_');
            sb3.append(i12);
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            hashMap.put("s-ho", sb2);
        }
        if (i11 != -1 || i10 != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i11);
            sb4.append('_');
            sb4.append(i10);
            str2 = sb4.toString();
        }
        if (str2 != null) {
            hashMap.put("s-co", str2);
        }
        if (str != null) {
            hashMap.put("s-iso", str);
        }
        hashMap.put("s-cn", C1566b3.f14952a.a(d10));
        return hashMap;
    }

    public static HashMap b() {
        Context d10;
        int networkType;
        int networkType2;
        int networkType3;
        String h10 = Ha.f14324a.h();
        K1 k12 = null;
        if ((h10 == null || Na.a(h10).isConnectedCellTowerEnabled()) && d() && e() && (d10 = Ha.d()) != null) {
            Object systemService = d10.getSystemService("phone");
            kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] a10 = a(telephonyManager.getNetworkOperator());
            String mcc = String.valueOf(a10[0]);
            String valueOf = String.valueOf(a10[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i10 = 0; i10 < size; i10++) {
                    cellInfo = allCellInfo.get(i10);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        networkType3 = telephonyManager.getDataNetworkType();
                    } else {
                        networkType3 = telephonyManager.getNetworkType();
                    }
                    k12 = new K1(cellInfo, mcc, valueOf, networkType3);
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && a10[0] != -1) {
                k12 = new K1();
                if (cellLocation instanceof CdmaCellLocation) {
                    k12.f14386b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if (Build.VERSION.SDK_INT >= 30) {
                        networkType2 = telephonyManager.getDataNetworkType();
                    } else {
                        networkType2 = telephonyManager.getNetworkType();
                    }
                    k12.c = networkType2;
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    int systemId = cdmaCellLocation.getSystemId();
                    int networkId = cdmaCellLocation.getNetworkId();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    kotlin.jvm.internal.g.e(mcc, "mcc");
                    k12.f14385a = mcc + '#' + systemId + '#' + networkId + '#' + baseStationId;
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    k12.f14386b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if (Build.VERSION.SDK_INT >= 30) {
                        networkType = telephonyManager.getDataNetworkType();
                    } else {
                        networkType = telephonyManager.getNetworkType();
                    }
                    k12.c = networkType;
                    k12.f14385a = K1.a(mcc, valueOf, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (k12 != null) {
            String jSONObject = k12.a().toString();
            kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
            hashMap.put("c-sc", jSONObject);
        }
        return hashMap;
    }

    public static HashMap c() {
        ArrayList arrayList;
        String h10;
        int networkType;
        if (Ha.q() && d() && e() && ((h10 = Ha.f14324a.h()) == null || Na.a(h10).isVisibleCellTowerEnabled())) {
            Context d10 = Ha.d();
            if (d10 == null) {
                arrayList = new ArrayList();
            } else {
                Object systemService = d10.getSystemService("phone");
                kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ArrayList arrayList2 = new ArrayList();
                int[] a10 = a(telephonyManager.getNetworkOperator());
                String valueOf = String.valueOf(a10[0]);
                String valueOf2 = String.valueOf(a10[1]);
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered()) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType = telephonyManager.getDataNetworkType();
                            } else {
                                networkType = telephonyManager.getNetworkType();
                            }
                            arrayList2.add(new K1(cellInfo, valueOf, valueOf2, networkType));
                        }
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(((K1) arrayList.get(arrayList.size() - 1)).a());
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.g.d(jSONArray2, "toString(...)");
            hashMap.put("v-sc", jSONArray2);
        }
        return hashMap;
    }

    public static boolean d() {
        if (!Ha.q()) {
            return false;
        }
        boolean a10 = AbstractC1684j9.a(Ha.d(), "android.permission.READ_PHONE_STATE");
        boolean a11 = AbstractC1684j9.a(Ha.d(), "android.permission.ACCESS_FINE_LOCATION");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            return a11;
        }
        if (i10 >= 30) {
            if (!a11 || !a10) {
                return false;
            }
            return true;
        } else if (!AbstractC1684j9.a(Ha.d(), "android.permission.ACCESS_COARSE_LOCATION") && !a11) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e() {
        Object obj;
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context d10 = Ha.d();
        LocationManager locationManager = null;
        if (d10 != null) {
            obj = d10.getSystemService("location");
        } else {
            obj = null;
        }
        if (obj instanceof LocationManager) {
            locationManager = (LocationManager) obj;
        }
        if (locationManager != null) {
            isLocationEnabled = locationManager.isLocationEnabled();
            if (isLocationEnabled) {
                return true;
            }
        }
        return false;
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !kotlin.jvm.internal.g.a("", str)) {
            try {
                String substring = str.substring(0, 3);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                String substring2 = str.substring(3);
                kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                int parseInt2 = Integer.parseInt(substring2);
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
