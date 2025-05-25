package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zac {

    /* renamed from: a  reason: collision with root package name */
    public static final y.i f11266a = new y.i();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f11267b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return d(context, "common_google_play_services_api_unavailable_text", a10);
                                        case 17:
                                            return d(context, "common_google_play_services_sign_in_failed_text", a10);
                                        case 18:
                                            return resources.getString(R.string.arg_res_0x7f1300c3, a10);
                                        default:
                                            return resources.getString(R.string.arg_res_0x7f1300be, a10);
                                    }
                                }
                                return d(context, "common_google_play_services_restricted_profile_text", a10);
                            }
                            return resources.getString(R.string.arg_res_0x7f1300bf, a10);
                        }
                        return d(context, "common_google_play_services_network_error_text", a10);
                    }
                    return d(context, "common_google_play_services_invalid_account_text", a10);
                }
                return resources.getString(R.string.arg_res_0x7f1300b7, a10);
            } else if (DeviceProperties.c(context)) {
                return resources.getString(R.string.arg_res_0x7f1300c4);
            } else {
                return resources.getString(R.string.arg_res_0x7f1300c1, a10);
            }
        }
        return resources.getString(R.string.arg_res_0x7f1300ba, a10);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 17) {
                                if (i10 != 20) {
                                    return null;
                                }
                                return e(context, "common_google_play_services_restricted_profile_title");
                            }
                            return e(context, "common_google_play_services_sign_in_failed_title");
                        }
                        return e(context, "common_google_play_services_network_error_title");
                    }
                    return e(context, "common_google_play_services_invalid_account_title");
                }
                return resources.getString(R.string.arg_res_0x7f1300b8);
            }
            return resources.getString(R.string.arg_res_0x7f1300c2);
        }
        return resources.getString(R.string.arg_res_0x7f1300bb);
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.arg_res_0x7f1300be);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        y.i iVar = f11266a;
        synchronized (iVar) {
            Locale c = s0.e.a(context.getResources().getConfiguration()).c(0);
            if (!c.equals(f11267b)) {
                iVar.clear();
                f11267b = c;
            }
            String str2 = (String) iVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            int i10 = GooglePlayServicesUtil.f10885e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            f11266a.put(str, string);
            return string;
        }
    }
}
