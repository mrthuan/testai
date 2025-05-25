package cl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;

/* compiled from: NetworkUtil.java */
/* loaded from: classes3.dex */
public final class b {
    static {
        ea.a.p("AWVFVxZyXFQ1byZz", "Dgob4RbK");
    }

    public static NetworkType a(Context context) {
        int type;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ea.a.p("UG8lbhZjFmkEaUB5", "3Om75kOn"));
        if (connectivityManager == null) {
            return NetworkType.NETWORK_NULL;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return NetworkType.NETWORK_NULL;
        }
        try {
            type = activeNetworkInfo.getType();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (type == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (type == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkType.NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return NetworkType.NETWORK_3G;
                case 13:
                    return NetworkType.NETWORK_4G;
                default:
                    return NetworkType.NETWORK_UNKNOWN;
            }
        }
        return NetworkType.NETWORK_NULL;
    }

    public static boolean b(Context context) {
        if (a(context) != NetworkType.NETWORK_NULL) {
            return true;
        }
        return false;
    }
}
