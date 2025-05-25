package q7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzc;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.regex.Matcher;
import y.i;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class a extends zzf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rpc f29085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Rpc rpc, Looper looper) {
        super(looper);
        this.f29085a = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc rpc = this.f29085a;
        int i10 = Rpc.f10835h;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.f10844g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.f10843f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                        "Received InstanceID error ".concat(stringExtra2);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && OperatorName.BEGIN_INLINE_IMAGE_DATA.equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.d(intent2.putExtra("error", str2).getExtras(), str);
                            return;
                        } else if (stringExtra2.length() != 0) {
                            "Unexpected structured response ".concat(stringExtra2);
                            return;
                        } else {
                            return;
                        }
                    }
                    synchronized (rpc.f10839a) {
                        int i11 = 0;
                        while (true) {
                            i<String, TaskCompletionSource<Bundle>> iVar = rpc.f10839a;
                            if (i11 < iVar.c) {
                                rpc.d(intent2.getExtras(), iVar.h(i11));
                                i11++;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = Rpc.f10838k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    rpc.d(extras, group);
                }
            }
        }
    }
}
