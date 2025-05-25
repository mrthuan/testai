package q9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final y f29109a = new y("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        String str;
        y yVar = f29109a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                yVar.e("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            byte[] byteArray = signature.toByteArray();
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA256);
                                messageDigest.update(byteArray);
                                str = Base64.encodeToString(messageDigest.digest(), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                str = "";
                            }
                            arrayList.add(str);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                                return true;
                            }
                        }
                        Object[] objArr = new Object[1];
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append((CharSequence) ", ");
                            }
                        }
                        objArr[0] = sb2.toString();
                        yVar.e(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    } else {
                        yVar.e("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    yVar.e("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            yVar.e("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
