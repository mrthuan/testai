package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.net.URISyntaxException;
import java.net.URLDecoder;

/* renamed from: com.inmobi.media.a2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1551a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14930a = 0;

    public static boolean a(Context context, String str) {
        if (str != null) {
            if (context != null) {
                try {
                    if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else {
                Uri parse = Uri.parse(str);
                kotlin.jvm.internal.g.d(parse, "parse(...)");
                return a(parse);
            }
        }
        return false;
    }

    public static Intent b(String url) {
        kotlin.jvm.internal.g.e(url, "url");
        Uri parse = Uri.parse(url);
        if (kotlin.text.j.G(parse.getScheme(), "intent", false)) {
            Intent parseUri = Intent.parseUri(url, 1);
            kotlin.jvm.internal.g.b(parseUri);
            return parseUri;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(parse);
        return intent;
    }

    public static int a(Context context, String url, ResolveInfo resolveInfo, A9 redirectionValidator, String api) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        Intent b10 = b(url);
        String str = null;
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            if (((resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName) != null) {
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                    str = activityInfo.name;
                }
                if (str != null) {
                    ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                    b10.setClassName(activityInfo3.packageName, activityInfo3.name);
                }
            }
        }
        b10.setFlags(268435456);
        context.startActivity(b10);
        return 0;
    }

    public static int a(Context context, String url, A9 redirectionValidator, String api) {
        String str;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        try {
            Intent parseUri = Intent.parseUri(url, 0);
            parseUri.setFlags(268435456);
            context.startActivity(parseUri);
            return 0;
        } catch (ActivityNotFoundException e10) {
            Uri parse = Uri.parse(url);
            try {
                str = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                str = null;
            }
            if (kotlin.jvm.internal.g.a("intent", parse.getScheme()) && AbstractC1579c2.a(str)) {
                kotlin.jvm.internal.g.b(str);
                return a(context, str, redirectionValidator, api);
            }
            throw e10;
        }
    }

    public static String a(Context context, String url, String str, K6 redirectionValidator) {
        Intent parseUri;
        String str2;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        if (context == null) {
            return null;
        }
        try {
            parseUri = Intent.parseUri(url, 0);
        } catch (Exception unused) {
        }
        if (parseUri.resolveActivity(context.getPackageManager()) != null) {
            parseUri.setFlags(268435456);
            context.startActivity(parseUri);
            return url;
        } else if (AbstractC1579c2.a(str)) {
            kotlin.jvm.internal.g.b(str);
            return a(context, str, (String) null, redirectionValidator);
        } else {
            Uri parse = Uri.parse(url);
            try {
                str2 = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused2) {
                str2 = null;
            }
            if (kotlin.jvm.internal.g.a("intent", parse.getScheme()) && AbstractC1579c2.a(str2)) {
                String decode = URLDecoder.decode(str2, "UTF-8");
                kotlin.jvm.internal.g.d(decode, "decode(...)");
                return a(context, decode, (String) null, redirectionValidator);
            }
            return null;
        }
    }

    public static boolean a(Uri uri) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return kotlin.jvm.internal.g.a("http", uri.getScheme()) || kotlin.jvm.internal.g.a(Constants.SCHEME, uri.getScheme());
    }

    public static boolean a(String url) {
        kotlin.jvm.internal.g.e(url, "url");
        Uri parse = Uri.parse(url);
        kotlin.jvm.internal.g.b(parse);
        return (!a(parse) || kotlin.jvm.internal.g.a("play.google.com", parse.getHost()) || kotlin.jvm.internal.g.a("market.android.com", parse.getHost()) || kotlin.jvm.internal.g.a("market", parse.getScheme())) ? false : true;
    }
}
